/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Retry Strategy</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getCopy <em>Copy</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRetryStrategy()
 * @model
 * @generated
 */
public interface RetryStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(Boolean)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRetryStrategy_Copy()
	 * @model
	 * @generated
	 */
	Boolean getCopy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getCopy <em>Copy</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Long)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRetryStrategy_Time()
	 * @model
	 * @generated
	 */
	Long getTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getTime <em>Time</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Retrieve the strategy\'s attributes.\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\n\n// Attribute copy defaults to TRUE.\nif (copy == null) copy = Boolean.TRUE;\n\n// Attribute time is mandatory.\nif (time == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"time\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// The requirement to retry is always the AwReq\'s target.\nit.unitn.disi.zanshin.model.gore.Requirement requirement = awreq.getTarget();\nif (requirement == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} cannot be executed because the referred AwReq doesn\'t have a target set.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Executes the Retry strategy.\nstrategyName += \"(\" + copy + \"; \" + time + \")\"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\nit.unitn.disi.zanshin.model.gore.Requirement newRequirement = it.unitn.disi.zanshin.core.CoreUtils.createCopy(requirement);\nit.unitn.disi.zanshin.model.gore.GoalModel goalModel = requirement.findGoalModel();\nif ((copy) && (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement) && (newRequirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement))\n\tcontroller.copyData(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) newRequirement);\ncontroller.terminate(goalModel, requirement);\nif (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)\n\tcontroller.rollback(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement);\ncontroller.waitFor(goalModel, time);\ncontroller.initiate(goalModel, newRequirement);'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // RetryStrategy
