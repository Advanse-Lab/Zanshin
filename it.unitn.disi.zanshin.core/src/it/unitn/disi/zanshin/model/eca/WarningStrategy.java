/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.Actor;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Warning Strategy</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.WarningStrategy#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getWarningStrategy()
 * @model
 * @generated
 */
public interface WarningStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getWarningStrategy_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.WarningStrategy#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Retrieve the strategy\'s attributes.\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\n\n// Attribute actor is mandatory.\nif (actor == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"actor\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Executes the Warning strategy.\nit.unitn.disi.zanshin.model.gore.GoalModel goalModel = awreq.findGoalModel();\nstrategyName += \"(\" + actor.eClass().getName() + \")\"; //$NON-NLS-1$ //$NON-NLS-2$\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\ncontroller.sendWarning(goalModel, actor, awreq);'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // WarningStrategy
