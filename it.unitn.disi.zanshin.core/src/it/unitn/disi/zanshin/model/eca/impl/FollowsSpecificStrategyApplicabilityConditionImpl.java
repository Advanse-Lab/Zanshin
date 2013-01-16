/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Follows Specific Strategy Applicability Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link it.unitn.disi.zanshin.model.eca.impl.FollowsSpecificStrategyApplicabilityConditionImpl#getStrategyToFollow
 * <em>Strategy To Follow</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.FollowsSpecificStrategyApplicabilityConditionImpl#getMinDelay <em>Min
 * Delay</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.FollowsSpecificStrategyApplicabilityConditionImpl#getMaxDelay <em>Max
 * Delay</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FollowsSpecificStrategyApplicabilityConditionImpl extends ApplicabilityConditionImpl implements FollowsSpecificStrategyApplicabilityCondition {
	/**
	 * The cached value of the '{@link #getStrategyToFollow() <em>Strategy To Follow</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getStrategyToFollow()
	 * @generated
	 * @ordered
	 */
	protected AdaptationStrategy strategyToFollow;

	/**
	 * The default value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_DELAY_EDEFAULT = -1L;

	/**
	 * The cached value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected long minDelay = MIN_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_DELAY_EDEFAULT = -1L;

	/**
	 * The cached value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected long maxDelay = MAX_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FollowsSpecificStrategyApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdaptationStrategy getStrategyToFollow() {
		if (strategyToFollow != null && strategyToFollow.eIsProxy()) {
			InternalEObject oldStrategyToFollow = (InternalEObject) strategyToFollow;
			strategyToFollow = (AdaptationStrategy) eResolveProxy(oldStrategyToFollow);
			if (strategyToFollow != oldStrategyToFollow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW, oldStrategyToFollow, strategyToFollow));
			}
		}
		return strategyToFollow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdaptationStrategy basicGetStrategyToFollow() {
		return strategyToFollow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStrategyToFollow(AdaptationStrategy newStrategyToFollow) {
		AdaptationStrategy oldStrategyToFollow = strategyToFollow;
		strategyToFollow = newStrategyToFollow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW, oldStrategyToFollow, strategyToFollow));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getMinDelay() {
		return minDelay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinDelay(long newMinDelay) {
		long oldMinDelay = minDelay;
		minDelay = newMinDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MIN_DELAY, oldMinDelay, minDelay));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getMaxDelay() {
		return maxDelay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxDelay(long newMaxDelay) {
		long oldMaxDelay = maxDelay;
		maxDelay = newMaxDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MAX_DELAY, oldMaxDelay, maxDelay));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		String conditionName = eClass().getName();
		EClass strategyClass = findStrategy().eClass();
		
		// If the list of events with usefult strategies is empty, then the strategy is not applicable.
		org.eclipse.emf.common.util.EList<it.unitn.disi.zanshin.model.eca.Event> eventList = session.getEventsWithUsefulStrategies();
		if (eventList.isEmpty()) {
			it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Strategy {1} is not applicable, as it is the first useful strategy applied.", session.getId(), strategyClass.getName()); //$NON-NLS-1$
			return false;
		}
		
		// Either minDelay or maxDelay have to be specified.
		if ((minDelay < 0) && (maxDelay < 0)) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Applicability Condition {0} should have either \"minDelay\" or \"maxDelay\" or both specified. Since it doesn't, it will be evaluated to false.", conditionName); //$NON-NLS-1$
			return false;
		}
		
		// Checks if the last strategy applied was of the type specified.
		it.unitn.disi.zanshin.model.eca.Event awreqEvent = eventList.get(eventList.size() - 1);
		it.unitn.disi.zanshin.model.eca.AdaptationStrategy lastAppliedStrategy = awreqEvent.getAwReq().getSelectedStrategy();
		org.eclipse.emf.ecore.EClass followClazz = strategyToFollow.eClass();
		org.eclipse.emf.ecore.EClass lastClazz = lastAppliedStrategy.eClass();
		if (!followClazz.equals(lastClazz)) {
			it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Strategy {1} is not applicable: should follow {2}, but last useful strategy was {3}.", session.getId(), strategyClass.getName(), followClazz.getName(), lastClazz.getName()); //$NON-NLS-1$
			return false;
		}
		
		// Checks if the strategy was applied within the specified minimum and maximum delay.
		long timestamp = awreqEvent.getTime().getTime();
		long diff = System.currentTimeMillis() - timestamp;
		boolean result = ((minDelay == -1) || (diff >= minDelay)) && ((maxDelay == -1) || (diff <= maxDelay));
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Strategy {1} follows {2}, delay is {3}, should be within [{4}, {5}]. Applicable? {6}", session.getId(), strategyClass.getName(), lastClazz.getName(), diff, minDelay, maxDelay, result); //$NON-NLS-1$
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
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW:
			if (resolve)
				return getStrategyToFollow();
			return basicGetStrategyToFollow();
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MIN_DELAY:
			return getMinDelay();
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MAX_DELAY:
			return getMaxDelay();
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
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW:
			setStrategyToFollow((AdaptationStrategy) newValue);
			return;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MIN_DELAY:
			setMinDelay((Long) newValue);
			return;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MAX_DELAY:
			setMaxDelay((Long) newValue);
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
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW:
			setStrategyToFollow((AdaptationStrategy) null);
			return;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MIN_DELAY:
			setMinDelay(MIN_DELAY_EDEFAULT);
			return;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MAX_DELAY:
			setMaxDelay(MAX_DELAY_EDEFAULT);
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
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__STRATEGY_TO_FOLLOW:
			return strategyToFollow != null;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MIN_DELAY:
			return minDelay != MIN_DELAY_EDEFAULT;
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION__MAX_DELAY:
			return maxDelay != MAX_DELAY_EDEFAULT;
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
		result.append(" (minDelay: "); //$NON-NLS-1$
		result.append(minDelay);
		result.append(", maxDelay: "); //$NON-NLS-1$
		result.append(maxDelay);
		result.append(')');
		return result.toString();
	}

} // FollowsSpecificStrategyApplicabilityConditionImpl
