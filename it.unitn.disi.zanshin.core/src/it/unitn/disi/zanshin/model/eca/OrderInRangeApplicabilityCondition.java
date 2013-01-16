/**
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Order In Range Applicability Condition</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition#getLowerBound <em>Lower Bound</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrderInRangeApplicabilityCondition()
 * @model
 * @generated
 */
public interface OrderInRangeApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrderInRangeApplicabilityCondition_LowerBound()
	 * @model
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition#getLowerBound
	 * <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrderInRangeApplicabilityCondition_UpperBound()
	 * @model
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition#getUpperBound
	 * <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='EClass strategyClass = findStrategy().eClass();\n\n// Finds out the order of the strategy that will be applied.\nint order = session.getEventsWithUsefulStrategies().size() + 1;\n\n// Checks that this number is within bounds, inclusive.\nboolean result = (lowerBound <= order) && (upperBound >= order);\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Strategy {1} is {2,choice,1#1st|2#2nd|2<3rd} useful strategy. Bounds are [{3}, {4}]. Applicable? {5}\", session.getId(), strategyClass.getName(), order, lowerBound, upperBound, result); //$NON-NLS-1$\nreturn result;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // OrderInRangeApplicabilityCondition
