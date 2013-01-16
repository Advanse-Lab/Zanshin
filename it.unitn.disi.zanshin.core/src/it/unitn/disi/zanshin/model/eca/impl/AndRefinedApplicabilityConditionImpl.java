/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>And Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AndRefinedApplicabilityConditionImpl extends RefinedApplicabilityConditionImpl implements AndRefinedApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AndRefinedApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.AND_REFINED_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// The problem is solved if all children evaluate to true, i.e., if any of them is false, it is not solved.
		for (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())
			if (!condition.evaluate(session))
				return false;

		// If none of them were false, then the problem is solved.
		return true;
	}

} // AndRefinedApplicabilityConditionImpl
