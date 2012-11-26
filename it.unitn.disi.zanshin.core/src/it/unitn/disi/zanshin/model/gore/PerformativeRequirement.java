/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Performative Requirement</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getPerformativeRequirement()
 * @model
 * @generated
 */
public interface PerformativeRequirement extends DefinableRequirement {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getPerformativeRequirement_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime
	 * <em>Start Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Only process the cancellation if the requirement has not yet been canceled.\nif (getState() != it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement canceled: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\n\tsetState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED);\n\t\t\t\n\t// If the monitoring service is active, warn it that this requirement has been canceled.\n\tit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\n\tif (monitoringService != null)\n\t\tmonitoringService.monitorMethodCall(this, MonitorableMethod.CANCEL);\n\t\n\t// If the requirement is canceled, then it has also ended.\n\tend();\n\t\n\t// Propagate the cancellation to the parent, depending if its definable/performative, and/or-refined.\n\tit.unitn.disi.zanshin.model.gore.Requirement parent = getParent();\n\tif ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.DefinableRequirement)) {\n\t\tif (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) ((it.unitn.disi.zanshin.model.gore.DefinableRequirement)parent).checkState();\n\t\telse if (parent instanceof PerformativeRequirement) ((PerformativeRequirement) parent).cancel();\n\t\telse ((it.unitn.disi.zanshin.model.gore.DefinableRequirement)parent).fail();\n\t}\n\t\n\t// Also propagate the cancellation to the children if and-refined and the children are performative.\n\tif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND)\n\t\tfor (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren())\n\t\t\tif (child instanceof PerformativeRequirement) ((PerformativeRequirement) child).cancel();\n}'"
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of definable children.\norg.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();\nint defChildrenCount = stateCount.get(stateCount.size() - 1);\n\n// For AND-refined requirements, checks if all children have SUCCEEDED.\nif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED_VALUE) == defChildrenCount) success();\n}\n\n// For OR-refined requirements, checks if all children have FAILED or have been CANCELED.\nelse {\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) == defChildrenCount) fail();\n\telse if (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED_VALUE) == defChildrenCount) cancel();\n}'"
	 * @generated
	 */
	void checkState();

} // PerformativeRequirement
