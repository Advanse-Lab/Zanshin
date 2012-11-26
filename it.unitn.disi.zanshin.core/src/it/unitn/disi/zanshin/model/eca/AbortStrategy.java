/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abort Strategy</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAbortStrategy()
 * @model
 * @generated
 */
public interface AbortStrategy extends AdaptationStrategy {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Executes the Abort strategy.\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\nit.unitn.disi.zanshin.model.gore.AwReq awreq = getAwReq();\nit.unitn.disi.zanshin.model.gore.GoalModel goalModel = awreq.findGoalModel();\ncontroller.abort(goalModel, awreq);'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // AbortStrategy
