/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Or Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class OrRefinedApplicabilityConditionImpl extends RefinedApplicabilityConditionImpl implements OrRefinedApplicabilityCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OrRefinedApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.OR_REFINED_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// The problem is solved if any child evaluates to true.
		for (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())
			if (condition.evaluate(session))
				return true;

		// If none of them were true, then the problem is not solved.
		return false;
	}

} // OrRefinedApplicabilityConditionImpl
