/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Goal Model</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getActors <em>Actors</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration <em>Configuration</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel()
 * @model features="internalId" internalIdDataType="org.eclipse.emf.ecore.ELongObject" internalIdChangeable="false"
 *        internalIdSuppressedGetVisibility="true"
 * @generated
 */
public interface GoalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Goal</b></em>' containment reference. It is bidirectional and its opposite is
	 * '{@link it.unitn.disi.zanshin.model.gore.Goal#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Goal</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Goal</em>' containment reference.
	 * @see #setRootGoal(Goal)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_RootGoal()
	 * @see it.unitn.disi.zanshin.model.gore.Goal#getGoalModel
	 * @model opposite="goalModel" containment="true" required="true"
	 * @generated
	 */
	Goal getRootGoal();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Root Goal</em>' containment reference.
	 * @see #getRootGoal()
	 * @generated
	 */
	void setRootGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Actor}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Actor#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Actors()
	 * @see it.unitn.disi.zanshin.model.gore.Actor#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference. It is bidirectional and its
	 * opposite is '{@link it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel <em>Goal Model</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Configuration()
	 * @see it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration <em>Configuration</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.DifferentialRelation}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifferentialRelation> getRelations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='if (internalId == null) internalId = System.currentTimeMillis();\nreturn internalId;'"
	 * @generated
	 */
	Long getId();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Returns a list of relations associated with the given indicator.\nEList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();\nif (indicator != null)\n\tfor (DifferentialRelation relation : relations) {\n\t\tAwReq relationIndicator = relation.getIndicator(); \n\t\tif ((relationIndicator != null) && (relationIndicator.eClass().equals(indicator.eClass())))\n\t\t\tfilteredRelations.add(relation);\n\t}\nreturn filteredRelations;'"
	 * @generated
	 */
	EList<DifferentialRelation> filterRelations(AwReq indicator);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Returns a list of relations associated with the given parameter.\nEList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();\nif (parameter != null)\n\tfor (DifferentialRelation relation : relations) {\n\t\tParameter relationParameter = relation.getParameter(); \n\t\tif ((relationParameter != null) && (relationParameter.eClass().equals(parameter.eClass())))\n\t\t\tfilteredRelations.add(relation);\n\t}\nreturn filteredRelations;'"
	 * @generated
	 */
	EList<DifferentialRelation> filterRelations(Parameter parameter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Returns a list of relations associated with the given indicator and the given parameter.\nEList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();\nif ((indicator != null) && (parameter != null))\n\tfor (DifferentialRelation relation : relations) {\n\t\tAwReq relationIndicator = relation.getIndicator();\n\t\tParameter relationParameter = relation.getParameter();\n\t\tif ((relationIndicator != null) && (relationIndicator.eClass().equals(indicator.eClass())) && (relationParameter != null) && (relationParameter.eClass().equals(parameter.eClass())))\n\t\t\tfilteredRelations.add(relation);\n\t}\nreturn filteredRelations;'"
	 * @generated
	 */
	EList<DifferentialRelation> filterRelations(AwReq indicator, Parameter parameter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Filters the relations by indicator and parameter.\nEList<DifferentialRelation> filteredRelations = filterRelations(indicator, parameter);\n\n// Creates a fake parameter for the value comparison.\nit.unitn.disi.zanshin.model.gore.Parameter param = parameter.createCopy();\nparam.setValue(value);\n\n// Looks for a relation in which a param with this value is incrementable. Returns the first one found.\nfor (DifferentialRelation relation : filteredRelations)\n\tif (param.incrementableIn(relation))\n\t\treturn relation;\n\n// If not found, return null.\nreturn null;'"
	 * @generated
	 */
	DifferentialRelation filterRelations(AwReq indicator, Parameter parameter, String value);

} // GoalModel
