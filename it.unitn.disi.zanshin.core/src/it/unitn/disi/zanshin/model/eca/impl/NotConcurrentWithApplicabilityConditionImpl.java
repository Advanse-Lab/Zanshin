/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.NotConcurrentWithApplicabilityCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Not Concurrent With Applicability Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.NotConcurrentWithApplicabilityConditionImpl#getAwreqs <em>Awreqs
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NotConcurrentWithApplicabilityConditionImpl extends ApplicabilityConditionImpl implements NotConcurrentWithApplicabilityCondition {
	/**
	 * The cached value of the '{@link #getAwreqs() <em>Awreqs</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAwreqs()
	 * @generated
	 * @ordered
	 */
	protected EList<AwReq> awreqs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NotConcurrentWithApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AwReq> getAwreqs() {
		if (awreqs == null) {
			awreqs = new EObjectResolvingEList<AwReq>(AwReq.class, this, EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION__AWREQS);
		}
		return awreqs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		String conditionName = eClass().getName();

		// Obtains a reference to the adaptation service and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.IAdaptationService adaptationService = it.unitn.disi.zanshin.core.Activator.getAdaptationService();
		if (adaptationService == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to evaluate {0}, but the adaptation service has not yet been registered!", conditionName); //$NON-NLS-1$
			return false;
		}

		// Obtains the map of active sessions.
		Map<EClass, AdaptationSession> activeSessions = adaptationService.getActiveSessions();

		// If no specific AwReq was specified, the strategy is applicable only when there are no current active sessions.
		if ((awreqs == null) || (awreqs.isEmpty()))
			return activeSessions.isEmpty();

		// If specific AwReq(s) have been given, check if there are any active sessions associated to them. If there are,
		// the strategy is not applicable.
		for (AwReq awreq : awreqs) {
			if (activeSessions.containsKey(awreq.eClass()))
				return false;
		}

		// If none of the specified AwReqs have an active session, the strategy is applicable.
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION__AWREQS:
			return getAwreqs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION__AWREQS:
			getAwreqs().clear();
			getAwreqs().addAll((Collection<? extends AwReq>) newValue);
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
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION__AWREQS:
			getAwreqs().clear();
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
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION__AWREQS:
			return awreqs != null && !awreqs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // NotConcurrentWithApplicabilityConditionImpl
