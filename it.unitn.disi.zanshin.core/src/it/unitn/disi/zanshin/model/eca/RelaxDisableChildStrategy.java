/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.Requirement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Relax Disable Child Strategy</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getRequirement <em>Requirement</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxDisableChildStrategy()
 * @model
 * @generated
 */
public interface RelaxDisableChildStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxDisableChildStrategy_Requirement()
	 * @model
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getRequirement
	 * <em>Requirement</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute. The literals are from the enumeration
	 * {@link it.unitn.disi.zanshin.model.gore.AggregationLevel}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #setLevel(AggregationLevel)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxDisableChildStrategy_Level()
	 * @model
	 * @generated
	 */
	AggregationLevel getLevel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getLevel <em>Level</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AggregationLevel value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Requirement)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxDisableChildStrategy_Child()
	 * @model
	 * @generated
	 */
	Requirement getChild();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getChild <em>Child</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Requirement value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Retrieve the strategy\'s attributes.\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\n\n// Attribute requirement defaults to the AwReq\'s target.\nif (requirement == null) {\n\tsetRequirement(awreq.getTarget());\n\tif (requirement == null) {\n\t\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"requirement\\\" and cannot be executed. Cannot use the default value because the referred AwReq doesn\'t have a target set.\", strategyName); //$NON-NLS-1$\n\t\treturn;\n\t}\n}\n\n// Attribute level defaults to INSTANCE.\nif (level == null) level = it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE;\n\n// Attribute child is mandatory.\nif (child == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"child\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Executes the Relax by Disabling Child strategy.\nstrategyName += \"(\" + requirement.eClass().getName() + \"; \" + level + \"; \" + child.eClass().getName() + \")\"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH))\n\tcontroller.disable(child.eClass());\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {\n\tit.unitn.disi.zanshin.model.gore.GoalModel goalModel = requirement.findGoalModel();\n\tRequirement parent = requirement.getParent();\n\tcontroller.suspend(goalModel, requirement);\n\tcontroller.terminate(goalModel, child);\n\tif (child instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)\n\t\tcontroller.rollback(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) child);\n\tcontroller.suspend(goalModel, child);\n\tcontroller.resume(goalModel, requirement, parent);\n}'"
	 * @generated
	 */
	void execute(AdaptationSession session);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Retrieves the model id and continues only if this requirement is part of a model.\nit.unitn.disi.zanshin.model.gore.GoalModel model = getAwReq().findGoalModel();\nif (model != null) {\n\tLong modelId = model.getId();\n\t\n\t// Retrieves the repository service from the platform to be able to update the references.\n\tit.unitn.disi.zanshin.services.IRepositoryService repositoryService = it.unitn.disi.zanshin.core.Activator.getRepositoryService();\n\t\n\t// Updates references to requirement and child.\n\tif (requirement != null)\n\t\tsetRequirement(repositoryService.retrieveRequirement(modelId, requirement.eClass()));\n\tif (child != null)\n\t\tsetChild(repositoryService.retrieveRequirement(modelId, child.eClass()));\n}'"
	 * @generated
	 */
	void updateReferences();

} // RelaxDisableChildStrategy
