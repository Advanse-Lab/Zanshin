/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.DoNothingStrategy;
import it.unitn.disi.zanshin.model.eca.EcaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Do Nothing Strategy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class DoNothingStrategyImpl extends AdaptationStrategyImpl implements DoNothingStrategy {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DoNothingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.DO_NOTHING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(AdaptationSession session) {
		String strategyName = eClass().getName();

		// Obtains a reference to the target system's controller and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();
		if (controller == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but the target system's controller has not yet been registered!", strategyName); //$NON-NLS-1$
			return;
		}

		// Executes the DoNothing strategy.
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		it.unitn.disi.zanshin.model.gore.AwReq awreq = getAwReq();
		it.unitn.disi.zanshin.model.gore.GoalModel goalModel = awreq.findGoalModel();
		controller.doNothing(goalModel);

		// Sets itself as a useless strategy, so the adaptation component doesn't count it.
		setUseful(false);
	}

} // DoNothingStrategyImpl
