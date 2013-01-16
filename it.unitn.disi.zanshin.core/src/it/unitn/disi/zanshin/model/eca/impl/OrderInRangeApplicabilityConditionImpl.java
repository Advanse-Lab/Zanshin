/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Order In Range Applicability Condition</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.OrderInRangeApplicabilityConditionImpl#getLowerBound <em>Lower Bound
 * </em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.OrderInRangeApplicabilityConditionImpl#getUpperBound <em>Upper Bound
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OrderInRangeApplicabilityConditionImpl extends ApplicabilityConditionImpl implements OrderInRangeApplicabilityCondition {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OrderInRangeApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.ORDER_IN_RANGE_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		EClass strategyClass = findStrategy().eClass();

		// Finds out the order of the strategy that will be applied.
		int order = session.getEventsWithUsefulStrategies().size() + 1;

		// Checks that this number is within bounds, inclusive.
		boolean result = (lowerBound <= order) && (upperBound >= order);
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Strategy {1} is {2,choice,1#1st|2#2nd|2<3rd} useful strategy. Bounds are [{3}, {4}]. Applicable? {5}", session.getId(), strategyClass.getName(), order, lowerBound, upperBound, result); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__LOWER_BOUND:
			return getLowerBound();
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__UPPER_BOUND:
			return getUpperBound();
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
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__LOWER_BOUND:
			setLowerBound((Integer) newValue);
			return;
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__UPPER_BOUND:
			setUpperBound((Integer) newValue);
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
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
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
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__LOWER_BOUND:
			return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION__UPPER_BOUND:
			return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
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
		result.append(" (lowerBound: "); //$NON-NLS-1$
		result.append(lowerBound);
		result.append(", upperBound: "); //$NON-NLS-1$
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} // OrderInRangeApplicabilityConditionImpl
