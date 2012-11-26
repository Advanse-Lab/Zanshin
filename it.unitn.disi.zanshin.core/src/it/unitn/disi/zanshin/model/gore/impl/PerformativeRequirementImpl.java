/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Performative Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.PerformativeRequirementImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PerformativeRequirementImpl extends DefinableRequirementImpl implements PerformativeRequirement {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PerformativeRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.PERFORMATIVE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PERFORMATIVE_REQUIREMENT__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void cancel() {
		// Only process the cancellation if the requirement has not yet been canceled.
		if (getState() != it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED) {
			it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement canceled: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED);

			// If the monitoring service is active, warn it that this requirement has been canceled.
			it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
			if (monitoringService != null)
				monitoringService.monitorMethodCall(this, MonitorableMethod.CANCEL);

			// If the requirement is canceled, then it has also ended.
			end();

			// Propagate the cancellation to the parent, depending if its definable/performative, and/or-refined.
			it.unitn.disi.zanshin.model.gore.Requirement parent = getParent();
			if ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.DefinableRequirement)) {
				if (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR)
					((it.unitn.disi.zanshin.model.gore.DefinableRequirement) parent).checkState();
				else if (parent instanceof PerformativeRequirement)
					((PerformativeRequirement) parent).cancel();
				else ((it.unitn.disi.zanshin.model.gore.DefinableRequirement) parent).fail();
			}

			// Also propagate the cancellation to the children if and-refined and the children are performative.
			if (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND)
				for (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren())
					if (child instanceof PerformativeRequirement)
						((PerformativeRequirement) child).cancel();
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

		// For OR-refined requirements, checks if all children have FAILED or have been CANCELED.
		else {
			if (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) == defChildrenCount)
				fail();
			else if (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED_VALUE) == defChildrenCount)
				cancel();
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
		case GorePackage.PERFORMATIVE_REQUIREMENT__START_TIME:
			return getStartTime();
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
		case GorePackage.PERFORMATIVE_REQUIREMENT__START_TIME:
			setStartTime((Date) newValue);
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
		case GorePackage.PERFORMATIVE_REQUIREMENT__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
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
		case GorePackage.PERFORMATIVE_REQUIREMENT__START_TIME:
			return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
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
		result.append(" (startTime: "); //$NON-NLS-1$
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} // PerformativeRequirementImpl
