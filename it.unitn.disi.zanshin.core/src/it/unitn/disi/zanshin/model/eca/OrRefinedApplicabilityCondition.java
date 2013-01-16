/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Or Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrRefinedApplicabilityCondition()
 * @model
 * @generated
 */
public interface OrRefinedApplicabilityCondition extends RefinedApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// The problem is solved if any child evaluates to true.\nfor (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())\n\tif (condition.evaluate(session)) return true;\n\n// If none of them were true, then the problem is not solved.\nreturn false;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // OrRefinedApplicabilityCondition
