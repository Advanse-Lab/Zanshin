package it.unitn.disi.zanshin.adaptation.internal.services;

import it.unitn.disi.zanshin.adaptation.AdaptationUtils;
import it.unitn.disi.zanshin.model.eca.AbortStrategy;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.IAdaptationService;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * ECA-based implementation of the Adaptation Service.
 * 
 * This implementation works with the ECA EMF Package and only handles AwReqs that belong to the EcaAwReq EMF Class
 * defined in that package's meta-model. EcaAwReqs are associated with one resolution condition (which indicates when
 * the problem represented by that AwReq has been solved) and one or more adaptation strategies (to try and solve the
 * problem). Moreover, adaptation strategies should contain an applicability condition, which indicate when they can be
 * executed to try and adapt to a given situation.
 * 
 * The ECA-based implementation considers AwReq state changes as the EVENT, Resolution and Applicability conditions as
 * the CONDITION and the execution of adaptation strategies as the ACTION. More details can be found in research papers
 * published by the author of this framework (see http://disi.unitn.it/~vitorsouza/academia/).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class EcaBasedAdaptationService implements IAdaptationService {
	/** Repository for active adaptation sessions. */
	private Map<EClass, AdaptationSession> activeSessions = new HashMap<>();

	/** ECA-based model EMF factory used to create new adaptation sessions. */
	private EcaFactory ecaFactory = EcaFactory.eINSTANCE;

	/** @see it.unitn.disi.zanshin.services.IAdaptationService#getActiveSessions() */
	public Map<EClass, AdaptationSession> getActiveSessions() {
		return activeSessions;
	}

	/** @see it.unitn.disi.zanshin.services.IAdaptationService#processStateChange(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void processStateChange(AwReq awreq) {
		// Checks if the AwReq have been properly supplied.
		if (awreq == null) {
			AdaptationUtils.log.warn("The adaptation service has been called, but no AwReq has been supplied. Please check your model or file a bug."); //$NON-NLS-1$			
			return;
		}

		// Retrieves information on the AwReq.
		EClass awreqClass = awreq.eClass();
		String awreqName = awreqClass.getName();
		Requirement target = awreq.getTarget();

		// Checks if the AwReq's target has been properly set.
		if (target == null) {
			AdaptationUtils.log.warn("AwReq {0} does not have a target, therefore the adaptation cannot proceed. Please provide one in the goal model.", awreqName); //$NON-NLS-1$
			return;
		}

		// Retrieves information on the target and logs about its state change.
		String targetName = target.eClass().getName();
		AdaptationUtils.log.info("Processing state change: {0} (ref. {1}) -> {2}", awreqName, targetName, awreq.getState()); //$NON-NLS-1$

		// This process is available only for ECA-based AwReqs.
		if (awreq instanceof EcaAwReq) {
			EcaAwReq ecaAwReq = (EcaAwReq) awreq;

			// Checks if the AwReq is complete, i.e., has an resolution condition.
			ResolutionCondition awreqCondition = ecaAwReq.getCondition();
			if (awreqCondition == null) {
				// If the AwReq is not complete, log a warning and stop here.
				AdaptationUtils.log.warn("AwReq {0} does not have a resolution condition, therefore the adaptation cannot proceed. Please provide one in the goal model.", awreqName); //$NON-NLS-1$
				return;
			}

			// If there's no active sessions for this AwReq, creates one.
			AdaptationSession session = activeSessions.get(awreqClass);
			Event awreqEvent = null;
			if (session == null) {
				session = ecaFactory.createAdaptationSession();
				awreqEvent = session.addEvent(ecaAwReq);
				activeSessions.put(awreqClass, session);
				AdaptationUtils.log.info("{0} Created new session for {1}", session.getId(), awreqName); //$NON-NLS-1$
			}

			// If there is, adds the current AwReq's evaluation to the session.
			else {
				AdaptationUtils.log.info("{0} Retrieved existing session for {1}, {2,choice,0#no events|1#one event|1<{2} events} already in the timeline", session.getId(), awreqName, session.getEvents().size()); //$NON-NLS-1$
				awreqEvent = session.addEvent(ecaAwReq);
			}

			// Checks if the problem this adaptation session is dealing with has been solved. If so, stop.
			if (verifyResolution(session, awreqCondition, awreqClass))
				return;

			// Searches for an applicable adaptation strategy for this AwReq.
			AdaptationStrategy selectedStrategy = null;
			for (AdaptationStrategy strategy : ecaAwReq.getStrategies()) {
				// If the strategy has an applicability condition and is applicable, select it.
				ApplicabilityCondition strategyCondition = strategy.getCondition();
				if (strategyCondition != null) {
					if (strategyCondition.evaluate(session)) {
						selectedStrategy = strategy;
						break;
					}
				}

				// If the strategy has no applicability condition, log a warning.
				else AdaptationUtils.log.warn("AwReq {0} has an adaptation strategy ({1}) without an applicability condition. Please provide one in the goal model.", awreqName, strategy); //$NON-NLS-1$
			}

			// If no applicable strategy was found, selects the Abort strategy.
			if (selectedStrategy == null) {
				AbortStrategy abortStrategy = EcaFactory.eINSTANCE.createAbortStrategy();
				abortStrategy.setAwReq(ecaAwReq);
				abortStrategy.setCondition(EcaFactory.eINSTANCE.createSimpleApplicabilityCondition());
				selectedStrategy = abortStrategy;
			}

			// Applies the selected strategy and registers it in the event timeline.
			String strategyName = selectedStrategy.eClass().getName();
			AdaptationUtils.log.info("{0} Selected adaptation strategy: {1}", session.getId(), strategyName); //$NON-NLS-1$
			selectedStrategy.execute(session);
			ecaAwReq.setSelectedStrategy(selectedStrategy);
			
			// If the applied strategy was useful, add it to the strategies timeline.
			if (selectedStrategy.isUseful())
				session.getEventsWithUsefulStrategies().add(awreqEvent);

			// Checks the resolution again, just to terminate the session if it has.
			verifyResolution(session, awreqCondition, awreqClass);
		}

		// If AwReq is not ECA-based, log a warning.
		else AdaptationUtils.log.warn("AwReq {0} is not an ECA-based AwReq. Zanshin's adaptation bundle registered the ECA-based adaptation service.", awreqName); //$NON-NLS-1$
	}

	/**
	 * Verifies if the problem being dealt by the adaptation session has been solved.
	 * 
	 * @param session
	 *          The adaptation session which is handling the problem.
	 * @param condition
	 *          The resolution condition that establishes if the problem has been solved.
	 * @param awreqClass
	 *          The class of the AwReq that represents the problem (the failed AwReq).
	 * @return <code>true</code> if the problem has been solved, <code>false</code> otherwise.
	 */
	private boolean verifyResolution(AdaptationSession session, ResolutionCondition condition, EClass awreqClass) {
		// If the resolution condition is true, deactivate the session and remove it from the active sessions map.
		if (condition.evaluate(session)) {
			AdaptationUtils.log.info("{0} The problem has been solved or there is nothing else to try. Adaptation session will be terminated.", session.getId()); //$NON-NLS-1$
			session.terminate();
			activeSessions.remove(awreqClass);
			return true;
		}

		// Otherwise, don't do anything.
		AdaptationUtils.log.info("{0} The problem has not yet been solved...", session.getId()); //$NON-NLS-1$
		return false;
	}
}
