/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage
 * @generated
 */
public interface EcaFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EcaFactory eINSTANCE = it.unitn.disi.zanshin.model.eca.impl.EcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aw Req</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Aw Req</em>'.
	 * @generated
	 */
	EcaAwReq createEcaAwReq();

	/**
	 * Returns a new object of class '<em>Event</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Adaptation Session</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Adaptation Session</em>'.
	 * @generated
	 */
	AdaptationSession createAdaptationSession();

	/**
	 * Returns a new object of class '<em>Simple Resolution Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Simple Resolution Condition</em>'.
	 * @generated
	 */
	SimpleResolutionCondition createSimpleResolutionCondition();

	/**
	 * Returns a new object of class '<em>And Refined Resolution Condition</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>And Refined Resolution Condition</em>'.
	 * @generated
	 */
	AndRefinedResolutionCondition createAndRefinedResolutionCondition();

	/**
	 * Returns a new object of class '<em>Or Refined Resolution Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Or Refined Resolution Condition</em>'.
	 * @generated
	 */
	OrRefinedResolutionCondition createOrRefinedResolutionCondition();

	/**
	 * Returns a new object of class '<em>Simple Applicability Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Simple Applicability Condition</em>'.
	 * @generated
	 */
	SimpleApplicabilityCondition createSimpleApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Max Executions Per Session Applicability Condition</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Max Executions Per Session Applicability Condition</em>'.
	 * @generated
	 */
	MaxExecutionsPerSessionApplicabilityCondition createMaxExecutionsPerSessionApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>And Refined Applicability Condition</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>And Refined Applicability Condition</em>'.
	 * @generated
	 */
	AndRefinedApplicabilityCondition createAndRefinedApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Or Refined Applicability Condition</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Or Refined Applicability Condition</em>'.
	 * @generated
	 */
	OrRefinedApplicabilityCondition createOrRefinedApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Retry Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Retry Strategy</em>'.
	 * @generated
	 */
	RetryStrategy createRetryStrategy();

	/**
	 * Returns a new object of class '<em>Strengthen Enable Child Strategy</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Strengthen Enable Child Strategy</em>'.
	 * @generated
	 */
	StrengthenEnableChildStrategy createStrengthenEnableChildStrategy();

	/**
	 * Returns a new object of class '<em>Strengthen Replace</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Strengthen Replace</em>'.
	 * @generated
	 */
	StrengthenReplace createStrengthenReplace();

	/**
	 * Returns a new object of class '<em>Warning Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Warning Strategy</em>'.
	 * @generated
	 */
	WarningStrategy createWarningStrategy();

	/**
	 * Returns a new object of class '<em>Reconfiguration Resolution Condition</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reconfiguration Resolution Condition</em>'.
	 * @generated
	 */
	ReconfigurationResolutionCondition createReconfigurationResolutionCondition();

	/**
	 * Returns a new object of class '<em>Reconfiguration Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reconfiguration Strategy</em>'.
	 * @generated
	 */
	ReconfigurationStrategy createReconfigurationStrategy();

	/**
	 * Returns a new object of class '<em>Change Parameter Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Change Parameter Strategy</em>'.
	 * @generated
	 */
	ChangeParameterStrategy createChangeParameterStrategy();

	/**
	 * Returns a new object of class '<em>Parameter Change</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter Change</em>'.
	 * @generated
	 */
	ParameterChange createParameterChange();

	/**
	 * Returns a new object of class '<em>Reconfiguration Applicability Condition</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reconfiguration Applicability Condition</em>'.
	 * @generated
	 */
	ReconfigurationApplicabilityCondition createReconfigurationApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Abort Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Abort Strategy</em>'.
	 * @generated
	 */
	AbortStrategy createAbortStrategy();

	/**
	 * Returns a new object of class '<em>Delegate Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Delegate Strategy</em>'.
	 * @generated
	 */
	DelegateStrategy createDelegateStrategy();

	/**
	 * Returns a new object of class '<em>Relax Disable Child Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Relax Disable Child Strategy</em>'.
	 * @generated
	 */
	RelaxDisableChildStrategy createRelaxDisableChildStrategy();

	/**
	 * Returns a new object of class '<em>Relax Replace</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Relax Replace</em>'.
	 * @generated
	 */
	RelaxReplace createRelaxReplace();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcaPackage getEcaPackage();

} // EcaFactory
