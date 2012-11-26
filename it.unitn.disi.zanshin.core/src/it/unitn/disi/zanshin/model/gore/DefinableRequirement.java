/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Definable Requirement</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getTime <em>Time</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDefinableRequirement()
 * @model
 * @generated
 */
public interface DefinableRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDefinableRequirement_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getTime <em>Time</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The default value is <code>"undefined"</code>. The
	 * literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.DefinableRequirementState}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirementState
	 * @see #setState(DefinableRequirementState)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDefinableRequirement_State()
	 * @model default="undefined"
	 * @generated
	 */
	DefinableRequirementState getState();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getState <em>State</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>State</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirementState
	 * @see #getState()
	 * @generated
	 */
	void setState(DefinableRequirementState value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement started: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\nsetState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.STARTED);\n\n// If the monitoring service is active, warn it that this requirement has been started.\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\nif (monitoringService != null)\n\tmonitoringService.monitorMethodCall(this, MonitorableMethod.START);\n\n// Propagate the start to the parent.\nit.unitn.disi.zanshin.model.gore.Requirement parent = getParent();\nif ((parent != null) && (parent instanceof DefinableRequirement) && (((DefinableRequirement) parent).getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.UNDEFINED))\n\t((DefinableRequirement) parent).start();'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement ended: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\n\n// If the monitoring service is active, warn it that this requirement has ended.\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\nif (monitoringService != null)\n\tmonitoringService.monitorMethodCall(this, MonitorableMethod.END);\n'"
	 * @generated
	 */
	void end();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement succeeded: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\nsetState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED);\n\n// If the monitoring service is active, warn it that this requirement has been successful.\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\nif (monitoringService != null)\n\tmonitoringService.monitorMethodCall(this, MonitorableMethod.SUCCESS);\n\n// If the requirement is successful, then it has also ended.\nend();\n\n// Propagate the success to the parent, depending on the type of refinement.\nit.unitn.disi.zanshin.model.gore.Requirement parent = getParent();\nif ((parent != null) && (parent instanceof DefinableRequirement)) {\n\tif (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) ((DefinableRequirement) parent).success();\n\telse ((DefinableRequirement)parent).checkState();\n}'"
	 * @generated
	 */
	void success();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement failed: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\nsetState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED);\n\n// If the monitoring service is active, warn it that this requirement has failed.\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\nif (monitoringService != null)\n\tmonitoringService.monitorMethodCall(this, MonitorableMethod.FAIL);\n\t\n// If the requirement failed, then it has also ended.\nend();\n\n// Propagate the failure to the parent, depending on the type of refinement.\nit.unitn.disi.zanshin.model.gore.Requirement parent = getParent();\nif ((parent != null) && (parent instanceof DefinableRequirement)) {\n\tif (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) ((DefinableRequirement) parent).fail();\n\telse ((DefinableRequirement)parent).checkState();\n}'"
	 * @generated
	 */
	void fail();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of definable children.\norg.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();\nint defChildrenCount = stateCount.get(stateCount.size() - 1);\n\n// For AND-refined requirements, checks if all children have SUCCEEDED.\nif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED_VALUE) == defChildrenCount) success();\n}\n\n// For OR-refined requirements, checks if all children have FAILED.\nelse {\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) == defChildrenCount) fail();\n}'"
	 * @generated
	 */
	void checkState();

} // DefinableRequirement
