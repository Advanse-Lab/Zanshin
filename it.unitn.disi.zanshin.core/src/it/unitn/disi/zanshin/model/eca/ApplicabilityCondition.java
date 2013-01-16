/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Applicability Condition</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getParentCondition <em>Parent Condition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getApplicabilityCondition()
 * @model abstract="true"
 * @generated
 */
public interface ApplicabilityCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(AdaptationStrategy)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getApplicabilityCondition_Strategy()
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	AdaptationStrategy getStrategy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}
	 * ' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(AdaptationStrategy value);

	/**
	 * Returns the value of the '<em><b>Parent Condition</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link it.unitn.disi.zanshin.model.eca.RefinedApplicabilityCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Condition</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent Condition</em>' container reference.
	 * @see #setParentCondition(RefinedApplicabilityCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getApplicabilityCondition_ParentCondition()
	 * @see it.unitn.disi.zanshin.model.eca.RefinedApplicabilityCondition#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	RefinedApplicabilityCondition getParentCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getParentCondition
	 * <em>Parent Condition</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Parent Condition</em>' container reference.
	 * @see #getParentCondition()
	 * @generated
	 */
	void setParentCondition(RefinedApplicabilityCondition value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// This method is not supposed to be called.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method ApplicabilityConditionImpl.evaluate() has been called, but this method is not meant to be called!\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// First, check if this condition was specified directly under the strategy.\nAdaptationStrategy strategy = getStrategy();\nif (strategy != null)\n\treturn strategy;\n\n// Checks if this condition is the child of a refined condition, delegating to the parent.\nRefinedApplicabilityCondition parentCondition = getParentCondition();\nif (parentCondition != null)\n\treturn parentCondition.findStrategy();\n\n// If none of the above worked, log a warning and return null.\nString conditionName = eClass().getName();\nit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Couldn\'t find the strategy associated with condition of class {0}.\", conditionName); //$NON-NLS-1$\nreturn null;'"
	 * @generated
	 */
	AdaptationStrategy findStrategy();

} // ApplicabilityCondition
