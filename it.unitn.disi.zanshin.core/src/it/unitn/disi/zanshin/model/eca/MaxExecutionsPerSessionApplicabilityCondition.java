/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Max Executions Per Session Applicability Condition</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition#getMaxExecutions <em>Max
 * Executions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getMaxExecutionsPerSessionApplicabilityCondition()
 * @model
 * @generated
 */
public interface MaxExecutionsPerSessionApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Max Executions</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Executions</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Executions</em>' attribute.
	 * @see #setMaxExecutions(Integer)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getMaxExecutionsPerSessionApplicabilityCondition_MaxExecutions()
	 * @model
	 * @generated
	 */
	Integer getMaxExecutions();

	/**
	 * Sets the value of the '
	 * {@link it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition#getMaxExecutions
	 * <em>Max Executions</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Max Executions</em>' attribute.
	 * @see #getMaxExecutions()
	 * @generated
	 */
	void setMaxExecutions(Integer value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String conditionName = eClass().getName();\nEClass strategyClass = findStrategy().eClass();\n\n// Attribute maxExecutions is mandatory.\nif (maxExecutions == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Applicability Condition {0} is missing mandatory attribute \\\"maxExecutions\\\" and, thus, will be evaluated to false.\", conditionName); //$NON-NLS-1$\n\treturn false;\n}\n\n// Count the number of times this strategy has already been applied in this adaptation session.\nint count = 0;\nfor (it.unitn.disi.zanshin.model.eca.Event event : session.getEvents()) {\n\tit.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = event.getAwReq().getSelectedStrategy();\n\tif ((strategy != null) && (strategy.eClass().equals(strategyClass))) count++;\n}\n\n// If this number is equal or greater than the limit, do not apply it again.\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Strategy {1} {2,choice,0#is not applicable because it has been applied at least {3} time(s) this session|0<is applicable}.\", session.getId(), strategyClass.getName(), maxExecutions - count, maxExecutions); //$NON-NLS-1$\nreturn (count < maxExecutions);'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // MaxExecutionsPerSessionApplicabilityCondition
