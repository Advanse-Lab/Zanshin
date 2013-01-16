/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Max Executions Per Session Applicability Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.MaxExecutionsPerSessionApplicabilityConditionImpl#getMaxExecutions
 * <em>Max Executions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MaxExecutionsPerSessionApplicabilityConditionImpl extends ApplicabilityConditionImpl implements MaxExecutionsPerSessionApplicabilityCondition {
	/**
	 * The default value of the '{@link #getMaxExecutions() <em>Max Executions</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxExecutions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_EXECUTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxExecutions() <em>Max Executions</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxExecutions()
	 * @generated
	 * @ordered
	 */
	protected Integer maxExecutions = MAX_EXECUTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MaxExecutionsPerSessionApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getMaxExecutions() {
		return maxExecutions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxExecutions(Integer newMaxExecutions) {
		Integer oldMaxExecutions = maxExecutions;
		maxExecutions = newMaxExecutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS, oldMaxExecutions, maxExecutions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		String conditionName = eClass().getName();
		EClass strategyClass = findStrategy().eClass();

		// Attribute maxExecutions is mandatory.
		if (maxExecutions == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Applicability Condition {0} is missing mandatory attribute \"maxExecutions\" and, thus, will be evaluated to false.", conditionName); //$NON-NLS-1$
			return false;
		}

		// Count the number of times this strategy has already been applied in this adaptation session.
		int count = 0;
		for (it.unitn.disi.zanshin.model.eca.Event event : session.getEvents()) {
			it.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = event.getAwReq().getSelectedStrategy();
			if ((strategy != null) && (strategy.eClass().equals(strategyClass)))
				count++;
		}

		// If this number is equal or greater than the limit, do not apply it again.
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Strategy {1} {2,choice,0#is not applicable because it has been applied at least {3} time(s) this session|0<is applicable}.", session.getId(), strategyClass.getName(), maxExecutions - count, maxExecutions); //$NON-NLS-1$
		return (count < maxExecutions);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
			return getMaxExecutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
			setMaxExecutions((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
			setMaxExecutions(MAX_EXECUTIONS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
			return MAX_EXECUTIONS_EDEFAULT == null ? maxExecutions != null : !MAX_EXECUTIONS_EDEFAULT.equals(maxExecutions);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxExecutions: "); //$NON-NLS-1$
		result.append(maxExecutions);
		result.append(')');
		return result.toString();
	}

} // MaxExecutionsPerSessionApplicabilityConditionImpl
