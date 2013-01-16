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
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Adaptation Strategy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl#getAwReq <em>Aw Req</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl#getCondition <em>Condition</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl#isUseful <em>Useful</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AdaptationStrategyImpl extends EObjectImpl implements AdaptationStrategy {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ApplicabilityCondition condition;

	/**
	 * The default value of the '{@link #isUseful() <em>Useful</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isUseful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USEFUL_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isUseful() <em>Useful</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isUseful()
	 * @generated
	 * @ordered
	 */
	protected boolean useful = USEFUL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdaptationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.ADAPTATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaAwReq getAwReq() {
		if (eContainerFeatureID() != EcaPackage.ADAPTATION_STRATEGY__AW_REQ)
			return null;
		return (EcaAwReq) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAwReq(EcaAwReq newAwReq, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAwReq, EcaPackage.ADAPTATION_STRATEGY__AW_REQ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAwReq(EcaAwReq newAwReq) {
		if (newAwReq != eInternalContainer() || (eContainerFeatureID() != EcaPackage.ADAPTATION_STRATEGY__AW_REQ && newAwReq != null)) {
			if (EcoreUtil.isAncestor(this, newAwReq))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAwReq != null)
				msgs = ((InternalEObject) newAwReq).eInverseAdd(this, EcaPackage.ECA_AW_REQ__STRATEGIES, EcaAwReq.class, msgs);
			msgs = basicSetAwReq(newAwReq, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__AW_REQ, newAwReq, newAwReq));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApplicabilityCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCondition(ApplicabilityCondition newCondition, NotificationChain msgs) {
		ApplicabilityCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCondition(ApplicabilityCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this, EcaPackage.APPLICABILITY_CONDITION__STRATEGY, ApplicabilityCondition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this, EcaPackage.APPLICABILITY_CONDITION__STRATEGY, ApplicabilityCondition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isUseful() {
		return useful;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUseful(boolean newUseful) {
		boolean oldUseful = useful;
		useful = newUseful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__USEFUL, oldUseful, useful));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(AdaptationSession session) {
		// This method is not supposed to be called.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method AdaptationStrategyImpl.execute() has been called, but this method is not meant to be called!"); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void updateReferences() {
		// This method is not supposed to be called.
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Method AdaptationStrategyImpl.updateReferences() has been called, indicating it has not been overridden by the subclass {0}. Make sure this is on purpose...", eClass().getName()); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAwReq((EcaAwReq) otherEnd, msgs);
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcaPackage.ADAPTATION_STRATEGY__CONDITION, null, msgs);
			return basicSetCondition((ApplicabilityCondition) otherEnd, msgs);
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			return basicSetAwReq(null, msgs);
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			return basicSetCondition(null, msgs);
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			return eInternalContainer().eInverseRemove(this, EcaPackage.ECA_AW_REQ__STRATEGIES, EcaAwReq.class, msgs);
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			return getAwReq();
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			return getCondition();
		case EcaPackage.ADAPTATION_STRATEGY__USEFUL:
			return isUseful();
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			setAwReq((EcaAwReq) newValue);
			return;
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			setCondition((ApplicabilityCondition) newValue);
			return;
		case EcaPackage.ADAPTATION_STRATEGY__USEFUL:
			setUseful((Boolean) newValue);
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			setAwReq((EcaAwReq) null);
			return;
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			setCondition((ApplicabilityCondition) null);
			return;
		case EcaPackage.ADAPTATION_STRATEGY__USEFUL:
			setUseful(USEFUL_EDEFAULT);
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
		case EcaPackage.ADAPTATION_STRATEGY__AW_REQ:
			return getAwReq() != null;
		case EcaPackage.ADAPTATION_STRATEGY__CONDITION:
			return condition != null;
		case EcaPackage.ADAPTATION_STRATEGY__USEFUL:
			return useful != USEFUL_EDEFAULT;
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
		result.append(" (useful: "); //$NON-NLS-1$
		result.append(useful);
		result.append(')');
		return result.toString();
	}

} // AdaptationStrategyImpl
