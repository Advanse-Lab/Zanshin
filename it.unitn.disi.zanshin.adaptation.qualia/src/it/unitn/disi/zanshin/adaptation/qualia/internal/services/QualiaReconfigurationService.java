package it.unitn.disi.zanshin.adaptation.qualia.internal.services;

import it.unitn.disi.zanshin.adaptation.qualia.QualiaUtils;
import it.unitn.disi.zanshin.adaptation.qualia.model.AdaptationAlgorithm;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.services.IReconfigurationService;

import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class QualiaReconfigurationService implements IReconfigurationService {
	/** This service's ID. */
	private static final String ID = "qualia"; //$NON-NLS-1$
	
	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#getId() */
	@Override
	public String getId() {
		return ID;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkApplicability(java.util.List, it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ApplicabilityCondition) */
	@Override
	public boolean checkApplicability(List<String> procedureIds, AwReq awreq, AdaptationSession session, List<ApplicabilityCondition> wrappedConditions) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// Checks if all procedures of the algorithm are applicable.
		boolean result = algorithm.checkApplicability(awreq, session);

		// If all procedures of the algorithm are applicable, check the wrapped condition and return.
		for (int i = 0; result && i < wrappedConditions.size(); i++)
			result = wrappedConditions.get(i).evaluate(session);
		return result;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#findConfiguration(java.util.List, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public Configuration findConfiguration(List<String> procedureIds, AwReq awreq) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// Retrieves the model to which the AwReq belongs.
		GoalModel model = awreq.findGoalModel();
		
		// 1 - Chooses the parameters to change.
		List<Parameter> params = algorithm.chooseParameters(model, awreq);
		QualiaUtils.log.info("Parameters chosen: {0}", QualiaUtils.convertToString(params)); //$NON-NLS-1$
		
		// 2 - Calculates how much to change in each parameter.
		List<String> values = algorithm.calculateValues(model, awreq, params);
		QualiaUtils.log.info("Values to inc/decrement in the chosen parameters: {0}", values); //$NON-NLS-1$
		
		// 3 - Changes the parameters, creating the new configuration.
		Configuration config = algorithm.changeParameters(model, awreq, params, values);
		QualiaUtils.log.info("Produced new configuration with {0} changed parameter(s)", config.getParameters().size()); //$NON-NLS-1$
		
		// Returns the new configuration.
		return config;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkResolution(java.util.List, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ResolutionCondition) */
	@Override
	public boolean checkResolution(List<String> procedureIds, AdaptationSession session, ResolutionCondition wrappedCondition) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// Obtains the last failing AwReq instance from the adaptation session.
		List<Event> events = session.getEvents();
		AwReq awreq = (events.size() > 0) ? events.get(events.size() - 1).getAwReq() : null;
		if (awreq == null) {
			QualiaUtils.log.warn("{0} Could not retrieve the last failing AwReq instance when checking the resolution of adaptation session. Therefore, Qualia is currently not applicable.", session.getId()); //$NON-NLS-1$
			return false;
		}
		
		// Retrieves the model to which the AwReq belongs.
		GoalModel model = awreq.findGoalModel();
		
		// Verifies if we have waited enough to continue with the process.
		boolean waitedEnough = algorithm.waitForEvaluation(model, awreq);
		if (! waitedEnough) {
			QualiaUtils.log.info("{0} According to the specifications, Qualia should wait longer before continuing. Therefore, Qualia is currently not applicable.", session.getId()); //$NON-NLS-1$
			return false;
		}
		
		// Evaluates the indicator.
		boolean evaluation = algorithm.evaluateIndicators(model, awreq, session, wrappedCondition);
		QualiaUtils.log.info("{0} Indicator {1} has been evaluated to {2}", session.getId(), awreq.eClass().getName(), evaluation); //$NON-NLS-1$
		
		// Learn from past executions.
		algorithm.learn(session);
		
		// Verify if the problem has been solved.
		boolean resolution = algorithm.checkResolution(evaluation);
		QualiaUtils.log.info("{0} Evaluating resolution: {1}", session.getId(), resolution); //$NON-NLS-1$
		
		// Gives the algorithm the chance to reassess itself.
		algorithm.reassessAlgorithm(model, session);
		
		// Returns the result from the resolution check.
		return resolution;
	}
}
