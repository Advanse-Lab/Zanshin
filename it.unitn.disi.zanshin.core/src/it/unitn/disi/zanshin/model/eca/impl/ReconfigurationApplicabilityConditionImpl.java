/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Reconfiguration Applicability Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ReconfigurationApplicabilityConditionImpl extends RefinedApplicabilityConditionImpl implements ReconfigurationApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReconfigurationApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// Retrieves the reconfiguration strategy.
		it.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = findStrategy();
		String strategyName = strategy.eClass().getName();
		if (!(strategy instanceof it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy)) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("The Reconfiguration Applicability Condition was used with a {0}, but it can only be used with a Reconfiguration Strategy.", strategyName); //$NON-NLS-1$
			return false;
		}

		// Attribute algorithmId is mandatory.
		it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy reconfigStrategy = (it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy;
		String algorithmId = reconfigStrategy.getAlgorithmId();
		if (algorithmId == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"algorithmId\" and cannot have its applicability evaluated.", strategyName); //$NON-NLS-1$
			return false;
		}

		// Obtains a reference to the reconfiguration service and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);
		if (reconfigService == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to evaluate the applicability of {0}, but an algorithm with id \"{1}\" is not registered!", strategyName, algorithmId); //$NON-NLS-1$
			return false;
		}

		// If all is well so far, delegate the applicability evaluation to the reconfiguration service.
		return reconfigService.checkApplicability(reconfigStrategy.getProcedureIds(), reconfigStrategy.getAwReq(), session, getChildren());
	}

} // ReconfigurationApplicabilityConditionImpl
