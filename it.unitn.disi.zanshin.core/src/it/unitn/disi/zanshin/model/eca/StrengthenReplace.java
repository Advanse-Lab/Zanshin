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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Strengthen Replace</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getRequirement <em>Requirement</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getCopy <em>Copy</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getNewRequirement <em>New Requirement</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getStrengthenReplace()
 * @model
 * @generated
 */
public interface StrengthenReplace extends AdaptationStrategy {
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
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getStrengthenReplace_Requirement()
	 * @model
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getRequirement
	 * <em>Requirement</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(Boolean)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getStrengthenReplace_Copy()
	 * @model
	 * @generated
	 */
	Boolean getCopy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(Boolean value);

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
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getStrengthenReplace_Level()
	 * @model
	 * @generated
	 */
	AggregationLevel getLevel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getLevel <em>Level</em>}'
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
	 * Returns the value of the '<em><b>New Requirement</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Requirement</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>New Requirement</em>' reference.
	 * @see #setNewRequirement(Requirement)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getStrengthenReplace_NewRequirement()
	 * @model
	 * @generated
	 */
	Requirement getNewRequirement();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getNewRequirement
	 * <em>New Requirement</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>New Requirement</em>' reference.
	 * @see #getNewRequirement()
	 * @generated
	 */
	void setNewRequirement(Requirement value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Retrieve the strategy\'s attributes.\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\n\n// Attribute requirement defaults to the AwReq\'s target.\nif (requirement == null) {\n\tsetRequirement(awreq.getTarget());\n\tif (requirement == null) {\n\t\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"requirement\\\" and cannot be executed. Cannot use the default value because the referred AwReq doesn\'t have a target set.\", strategyName); //$NON-NLS-1$\n\t\treturn;\n\t}\n}\n\n// Attribute copy defaults to TRUE.\nif (copy == null) copy = Boolean.TRUE;\n\n// Attribute level defaults to INSTANCE.\nif (level == null) level = it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE;\n\n// Attribute newRequirement is mandatory.\nif (newRequirement == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"newRequirement\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Executes the Strengthen by Replacing strategy.\nit.unitn.disi.zanshin.model.gore.GoalModel goalModel = requirement.findGoalModel();\nstrategyName += \"(\" + requirement.eClass().getName() + \"; \" + copy + \"; \" + level + \"; \" + newRequirement.eClass().getName() + \")\"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {\n\tcontroller.disable(requirement.eClass());\n\tcontroller.enable(newRequirement.eClass());\n}\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {\n\tif ((copy) && (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement) && (newRequirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement))\n\t\tcontroller.copyData(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) newRequirement);\n\tcontroller.terminate(goalModel, requirement);\n\tif (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)\n\t\tcontroller.rollback(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement);\n\tcontroller.initiate(goalModel, newRequirement);\n}'"
	 * @generated
	 */
	void execute(AdaptationSession session);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Retrieves the model id and continues only if this requirement is part of a model.\nit.unitn.disi.zanshin.model.gore.GoalModel model = getAwReq().findGoalModel();\nif (model != null) {\n\tLong modelId = model.getId();\n\t\n\t// Retrieves the repository service from the platform to be able to update the references.\n\tit.unitn.disi.zanshin.services.IRepositoryService repositoryService = it.unitn.disi.zanshin.core.Activator.getRepositoryService();\n\t\n\t// Updates references to requirement and newRequirement.\n\tif (requirement != null)\n\t\tsetRequirement(repositoryService.retrieveRequirement(modelId, requirement.eClass()));\n\tif (newRequirement != null)\n\t\tsetNewRequirement(repositoryService.retrieveRequirement(modelId, newRequirement.eClass()));\n}'"
	 * @generated
	 */
	void updateReferences();

} // StrengthenReplace
