/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>And Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAndRefinedApplicabilityCondition()
 * @model
 * @generated
 */
public interface AndRefinedApplicabilityCondition extends RefinedApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// The problem is solved if all children evaluate to true, i.e., if any of them is false, it is not solved.\nfor (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())\n\tif (! condition.evaluate(session)) return false;\n\n// If none of them were false, then the problem is solved.\nreturn true;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // AndRefinedApplicabilityCondition
