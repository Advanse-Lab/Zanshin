/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Definable Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl#getTime <em>Time</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DefinableRequirementImpl extends RequirementImpl implements DefinableRequirement {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final DefinableRequirementState STATE_EDEFAULT = DefinableRequirementState.UNDEFINED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DefinableRequirementState state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DefinableRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.DEFINABLE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DEFINABLE_REQUIREMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinableRequirementState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setState(DefinableRequirementState newState) {
		DefinableRequirementState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DEFINABLE_REQUIREMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void start() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement started: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.STARTED);

		// If the monitoring service is active, warn it that this requirement has been started.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, MonitorableMethod.START);

		// Propagate the start to the parent.
		it.unitn.disi.zanshin.model.gore.Requirement parent = getParent();
		if ((parent != null) && (parent instanceof DefinableRequirement) && (((DefinableRequirement) parent).getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.UNDEFINED))
			((DefinableRequirement) parent).start();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void end() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement ended: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		// If the monitoring service is active, warn it that this requirement has ended.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, MonitorableMethod.END);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void success() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement succeeded: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED);

		// If the monitoring service is active, warn it that this requirement has been successful.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, MonitorableMethod.SUCCESS);

		// If the requirement is successful, then it has also ended.
		end();

		// Propagate the success to the parent, depending on the type of refinement.
		it.unitn.disi.zanshin.model.gore.Requirement parent = getParent();
		if ((parent != null) && (parent instanceof DefinableRequirement)) {
			if (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR)
				((DefinableRequirement) parent).success();
			else ((DefinableRequirement) parent).checkState();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void fail() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement failed: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED);

		// If the monitoring service is active, warn it that this requirement has failed.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, MonitorableMethod.FAIL);

		// If the requirement failed, then it has also ended.
		end();

		// Propagate the failure to the parent, depending on the type of refinement.
		it.unitn.disi.zanshin.model.gore.Requirement parent = getParent();
		if ((parent != null) && (parent instanceof DefinableRequirement)) {
			if (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND)
				((DefinableRequirement) parent).fail();
			else ((DefinableRequirement) parent).checkState();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void checkState() {
		// Counts the number of children in each state and the number of definable children.
		org.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();
		int defChildrenCount = stateCount.get(stateCount.size() - 1);

		// For AND-refined requirements, checks if all children have SUCCEEDED.
		if (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {
			if (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED_VALUE) == defChildrenCount)
				success();
		}

		// For OR-refined requirements, checks if all children have FAILED.
		else {
			if (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) == defChildrenCount)
				fail();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.DEFINABLE_REQUIREMENT__TIME:
			return getTime();
		case GorePackage.DEFINABLE_REQUIREMENT__STATE:
			return getState();
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
		case GorePackage.DEFINABLE_REQUIREMENT__TIME:
			setTime((Date) newValue);
			return;
		case GorePackage.DEFINABLE_REQUIREMENT__STATE:
			setState((DefinableRequirementState) newValue);
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
		case GorePackage.DEFINABLE_REQUIREMENT__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case GorePackage.DEFINABLE_REQUIREMENT__STATE:
			setState(STATE_EDEFAULT);
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
		case GorePackage.DEFINABLE_REQUIREMENT__TIME:
			return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
		case GorePackage.DEFINABLE_REQUIREMENT__STATE:
			return state != STATE_EDEFAULT;
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
		result.append(" (time: "); //$NON-NLS-1$
		result.append(time);
		result.append(", state: "); //$NON-NLS-1$
		result.append(state);
		result.append(')');
		return result.toString();
	}

} // DefinableRequirementImpl
