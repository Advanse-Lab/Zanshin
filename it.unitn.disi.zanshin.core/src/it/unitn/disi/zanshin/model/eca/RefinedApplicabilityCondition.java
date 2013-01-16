/**
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Refined Applicability Condition</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.RefinedApplicabilityCondition#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRefinedApplicabilityCondition()
 * @model
 * @generated
 */
public interface RefinedApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getParentCondition <em>Parent Condition</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRefinedApplicabilityCondition_Children()
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getParentCondition
	 * @model opposite="parentCondition" containment="true"
	 * @generated
	 */
	EList<ApplicabilityCondition> getChildren();

} // RefinedApplicabilityCondition
