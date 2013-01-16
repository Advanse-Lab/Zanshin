/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.RefinedApplicabilityCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Applicability Condition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl#getStrategy <em>Strategy</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl#getParentCondition <em>Parent Condition
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ApplicabilityConditionImpl extends EObjectImpl implements ApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdaptationStrategy getStrategy() {
		if (eContainerFeatureID() != EcaPackage.APPLICABILITY_CONDITION__STRATEGY)
			return null;
		return (AdaptationStrategy) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStrategy(AdaptationStrategy newStrategy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStrategy, EcaPackage.APPLICABILITY_CONDITION__STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStrategy(AdaptationStrategy newStrategy) {
		if (newStrategy != eInternalContainer() || (eContainerFeatureID() != EcaPackage.APPLICABILITY_CONDITION__STRATEGY && newStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject) newStrategy).eInverseAdd(this, EcaPackage.ADAPTATION_STRATEGY__CONDITION, AdaptationStrategy.class, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.APPLICABILITY_CONDITION__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RefinedApplicabilityCondition getParentCondition() {
		if (eContainerFeatureID() != EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION)
			return null;
		return (RefinedApplicabilityCondition) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParentCondition(RefinedApplicabilityCondition newParentCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentCondition, EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentCondition(RefinedApplicabilityCondition newParentCondition) {
		if (newParentCondition != eInternalContainer() || (eContainerFeatureID() != EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION && newParentCondition != null)) {
			if (EcoreUtil.isAncestor(this, newParentCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCondition != null)
				msgs = ((InternalEObject) newParentCondition).eInverseAdd(this, EcaPackage.REFINED_APPLICABILITY_CONDITION__CHILDREN, RefinedApplicabilityCondition.class, msgs);
			msgs = basicSetParentCondition(newParentCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION, newParentCondition, newParentCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// This method is not supposed to be called.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method ApplicabilityConditionImpl.evaluate() has been called, but this method is not meant to be called!"); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdaptationStrategy findStrategy() {
		// First, check if this condition was specified directly under the strategy.
		AdaptationStrategy strategy = getStrategy();
		if (strategy != null)
			return strategy;

		// Checks if this condition is the child of a refined condition, delegating to the parent.
		RefinedApplicabilityCondition parentCondition = getParentCondition();
		if (parentCondition != null)
			return parentCondition.findStrategy();

		// If none of the above worked, log a warning and return null.
		String conditionName = eClass().getName();
		it.unitn.disi.zanshin.core.CoreUtils.log.warn("Couldn't find the strategy associated with condition of class {0}.", conditionName); //$NON-NLS-1$
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStrategy((AdaptationStrategy) otherEnd, msgs);
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentCondition((RefinedApplicabilityCondition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			return basicSetStrategy(null, msgs);
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			return basicSetParentCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			return eInternalContainer().eInverseRemove(this, EcaPackage.ADAPTATION_STRATEGY__CONDITION, AdaptationStrategy.class, msgs);
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			return eInternalContainer().eInverseRemove(this, EcaPackage.REFINED_APPLICABILITY_CONDITION__CHILDREN, RefinedApplicabilityCondition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			return getStrategy();
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			return getParentCondition();
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
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			setStrategy((AdaptationStrategy) newValue);
			return;
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			setParentCondition((RefinedApplicabilityCondition) newValue);
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
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			setStrategy((AdaptationStrategy) null);
			return;
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			setParentCondition((RefinedApplicabilityCondition) null);
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
		case EcaPackage.APPLICABILITY_CONDITION__STRATEGY:
			return getStrategy() != null;
		case EcaPackage.APPLICABILITY_CONDITION__PARENT_CONDITION:
			return getParentCondition() != null;
		}
		return super.eIsSet(featureID);
	}

} // ApplicabilityConditionImpl
