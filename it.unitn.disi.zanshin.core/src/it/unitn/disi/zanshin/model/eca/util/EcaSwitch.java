/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.util;

import it.unitn.disi.zanshin.model.eca.AbortStrategy;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy;
import it.unitn.disi.zanshin.model.eca.DelegateStrategy;
import it.unitn.disi.zanshin.model.eca.DoNothingStrategy;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.NotConcurrentWithApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.OrderInRangeApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ParameterChange;
import it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy;
import it.unitn.disi.zanshin.model.eca.RefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy;
import it.unitn.disi.zanshin.model.eca.RelaxReplace;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;
import it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy;
import it.unitn.disi.zanshin.model.eca.StrengthenReplace;
import it.unitn.disi.zanshin.model.eca.WarningStrategy;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage
 * @generated
 */
public class EcaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EcaPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaSwitch() {
		if (modelPackage == null) {
			modelPackage = EcaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EcaPackage.ECA_AW_REQ: {
			EcaAwReq ecaAwReq = (EcaAwReq) theEObject;
			T result = caseEcaAwReq(ecaAwReq);
			if (result == null)
				result = caseAwReq(ecaAwReq);
			if (result == null)
				result = caseDefinableRequirement(ecaAwReq);
			if (result == null)
				result = caseRequirement(ecaAwReq);
			if (result == null)
				result = caseOclAny(ecaAwReq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RESOLUTION_CONDITION: {
			ResolutionCondition resolutionCondition = (ResolutionCondition) theEObject;
			T result = caseResolutionCondition(resolutionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.ADAPTATION_STRATEGY: {
			AdaptationStrategy adaptationStrategy = (AdaptationStrategy) theEObject;
			T result = caseAdaptationStrategy(adaptationStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.APPLICABILITY_CONDITION: {
			ApplicabilityCondition applicabilityCondition = (ApplicabilityCondition) theEObject;
			T result = caseApplicabilityCondition(applicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.ADAPTATION_SESSION: {
			AdaptationSession adaptationSession = (AdaptationSession) theEObject;
			T result = caseAdaptationSession(adaptationSession);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.SIMPLE_RESOLUTION_CONDITION: {
			SimpleResolutionCondition simpleResolutionCondition = (SimpleResolutionCondition) theEObject;
			T result = caseSimpleResolutionCondition(simpleResolutionCondition);
			if (result == null)
				result = caseResolutionCondition(simpleResolutionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.AND_REFINED_RESOLUTION_CONDITION: {
			AndRefinedResolutionCondition andRefinedResolutionCondition = (AndRefinedResolutionCondition) theEObject;
			T result = caseAndRefinedResolutionCondition(andRefinedResolutionCondition);
			if (result == null)
				result = caseResolutionCondition(andRefinedResolutionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.OR_REFINED_RESOLUTION_CONDITION: {
			OrRefinedResolutionCondition orRefinedResolutionCondition = (OrRefinedResolutionCondition) theEObject;
			T result = caseOrRefinedResolutionCondition(orRefinedResolutionCondition);
			if (result == null)
				result = caseResolutionCondition(orRefinedResolutionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.SIMPLE_APPLICABILITY_CONDITION: {
			SimpleApplicabilityCondition simpleApplicabilityCondition = (SimpleApplicabilityCondition) theEObject;
			T result = caseSimpleApplicabilityCondition(simpleApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(simpleApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION: {
			MaxExecutionsPerSessionApplicabilityCondition maxExecutionsPerSessionApplicabilityCondition = (MaxExecutionsPerSessionApplicabilityCondition) theEObject;
			T result = caseMaxExecutionsPerSessionApplicabilityCondition(maxExecutionsPerSessionApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(maxExecutionsPerSessionApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.REFINED_APPLICABILITY_CONDITION: {
			RefinedApplicabilityCondition refinedApplicabilityCondition = (RefinedApplicabilityCondition) theEObject;
			T result = caseRefinedApplicabilityCondition(refinedApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(refinedApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.AND_REFINED_APPLICABILITY_CONDITION: {
			AndRefinedApplicabilityCondition andRefinedApplicabilityCondition = (AndRefinedApplicabilityCondition) theEObject;
			T result = caseAndRefinedApplicabilityCondition(andRefinedApplicabilityCondition);
			if (result == null)
				result = caseRefinedApplicabilityCondition(andRefinedApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(andRefinedApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION: {
			OrRefinedApplicabilityCondition orRefinedApplicabilityCondition = (OrRefinedApplicabilityCondition) theEObject;
			T result = caseOrRefinedApplicabilityCondition(orRefinedApplicabilityCondition);
			if (result == null)
				result = caseRefinedApplicabilityCondition(orRefinedApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(orRefinedApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION: {
			NotConcurrentWithApplicabilityCondition notConcurrentWithApplicabilityCondition = (NotConcurrentWithApplicabilityCondition) theEObject;
			T result = caseNotConcurrentWithApplicabilityCondition(notConcurrentWithApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(notConcurrentWithApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION: {
			OrderInRangeApplicabilityCondition orderInRangeApplicabilityCondition = (OrderInRangeApplicabilityCondition) theEObject;
			T result = caseOrderInRangeApplicabilityCondition(orderInRangeApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(orderInRangeApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION: {
			FollowsSpecificStrategyApplicabilityCondition followsSpecificStrategyApplicabilityCondition = (FollowsSpecificStrategyApplicabilityCondition) theEObject;
			T result = caseFollowsSpecificStrategyApplicabilityCondition(followsSpecificStrategyApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(followsSpecificStrategyApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.ABORT_STRATEGY: {
			AbortStrategy abortStrategy = (AbortStrategy) theEObject;
			T result = caseAbortStrategy(abortStrategy);
			if (result == null)
				result = caseAdaptationStrategy(abortStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.DELEGATE_STRATEGY: {
			DelegateStrategy delegateStrategy = (DelegateStrategy) theEObject;
			T result = caseDelegateStrategy(delegateStrategy);
			if (result == null)
				result = caseAdaptationStrategy(delegateStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY: {
			RelaxDisableChildStrategy relaxDisableChildStrategy = (RelaxDisableChildStrategy) theEObject;
			T result = caseRelaxDisableChildStrategy(relaxDisableChildStrategy);
			if (result == null)
				result = caseAdaptationStrategy(relaxDisableChildStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RELAX_REPLACE: {
			RelaxReplace relaxReplace = (RelaxReplace) theEObject;
			T result = caseRelaxReplace(relaxReplace);
			if (result == null)
				result = caseAdaptationStrategy(relaxReplace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RETRY_STRATEGY: {
			RetryStrategy retryStrategy = (RetryStrategy) theEObject;
			T result = caseRetryStrategy(retryStrategy);
			if (result == null)
				result = caseAdaptationStrategy(retryStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.STRENGTHEN_ENABLE_CHILD_STRATEGY: {
			StrengthenEnableChildStrategy strengthenEnableChildStrategy = (StrengthenEnableChildStrategy) theEObject;
			T result = caseStrengthenEnableChildStrategy(strengthenEnableChildStrategy);
			if (result == null)
				result = caseAdaptationStrategy(strengthenEnableChildStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.STRENGTHEN_REPLACE: {
			StrengthenReplace strengthenReplace = (StrengthenReplace) theEObject;
			T result = caseStrengthenReplace(strengthenReplace);
			if (result == null)
				result = caseAdaptationStrategy(strengthenReplace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.WARNING_STRATEGY: {
			WarningStrategy warningStrategy = (WarningStrategy) theEObject;
			T result = caseWarningStrategy(warningStrategy);
			if (result == null)
				result = caseAdaptationStrategy(warningStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION: {
			ReconfigurationApplicabilityCondition reconfigurationApplicabilityCondition = (ReconfigurationApplicabilityCondition) theEObject;
			T result = caseReconfigurationApplicabilityCondition(reconfigurationApplicabilityCondition);
			if (result == null)
				result = caseRefinedApplicabilityCondition(reconfigurationApplicabilityCondition);
			if (result == null)
				result = caseApplicabilityCondition(reconfigurationApplicabilityCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION: {
			ReconfigurationResolutionCondition reconfigurationResolutionCondition = (ReconfigurationResolutionCondition) theEObject;
			T result = caseReconfigurationResolutionCondition(reconfigurationResolutionCondition);
			if (result == null)
				result = caseResolutionCondition(reconfigurationResolutionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.RECONFIGURATION_STRATEGY: {
			ReconfigurationStrategy reconfigurationStrategy = (ReconfigurationStrategy) theEObject;
			T result = caseReconfigurationStrategy(reconfigurationStrategy);
			if (result == null)
				result = caseAdaptationStrategy(reconfigurationStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.CHANGE_PARAMETER_STRATEGY: {
			ChangeParameterStrategy changeParameterStrategy = (ChangeParameterStrategy) theEObject;
			T result = caseChangeParameterStrategy(changeParameterStrategy);
			if (result == null)
				result = caseAdaptationStrategy(changeParameterStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.PARAMETER_CHANGE: {
			ParameterChange parameterChange = (ParameterChange) theEObject;
			T result = caseParameterChange(parameterChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcaPackage.DO_NOTHING_STRATEGY: {
			DoNothingStrategy doNothingStrategy = (DoNothingStrategy) theEObject;
			T result = caseDoNothingStrategy(doNothingStrategy);
			if (result == null)
				result = caseAdaptationStrategy(doNothingStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aw Req</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcaAwReq(EcaAwReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionCondition(ResolutionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Strategy</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationStrategy(AdaptationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicability Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicabilityCondition(ApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Session</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationSession(AdaptationSession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Resolution Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Resolution Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleResolutionCondition(SimpleResolutionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Refined Resolution Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Refined Resolution Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndRefinedResolutionCondition(AndRefinedResolutionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Refined Resolution Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Refined Resolution Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRefinedResolutionCondition(OrRefinedResolutionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Applicability Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleApplicabilityCondition(SimpleApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Max Executions Per Session Applicability Condition</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Max Executions Per Session Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxExecutionsPerSessionApplicabilityCondition(MaxExecutionsPerSessionApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refined Applicability Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refined Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinedApplicabilityCondition(RefinedApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Refined Applicability Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Refined Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndRefinedApplicabilityCondition(AndRefinedApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Refined Applicability Condition</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Refined Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRefinedApplicabilityCondition(OrRefinedApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Not Concurrent With Applicability Condition</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Not Concurrent With Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotConcurrentWithApplicabilityCondition(NotConcurrentWithApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order In Range Applicability Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order In Range Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderInRangeApplicabilityCondition(OrderInRangeApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Follows Specific Strategy Applicability Condition</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Follows Specific Strategy Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFollowsSpecificStrategyApplicabilityCondition(FollowsSpecificStrategyApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Strategy</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryStrategy(RetryStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strengthen Enable Child Strategy</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strengthen Enable Child Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrengthenEnableChildStrategy(StrengthenEnableChildStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strengthen Replace</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strengthen Replace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrengthenReplace(StrengthenReplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warning Strategy</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warning Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarningStrategy(WarningStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Resolution Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Resolution Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationResolutionCondition(ReconfigurationResolutionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Strategy</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationStrategy(ReconfigurationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Parameter Strategy</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Parameter Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeParameterStrategy(ChangeParameterStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Change</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterChange(ParameterChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Nothing Strategy</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Nothing Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoNothingStrategy(DoNothingStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Applicability Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Applicability Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationApplicabilityCondition(ReconfigurationApplicabilityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Strategy</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortStrategy(AbortStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegate Strategy</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegate Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegateStrategy(DelegateStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relax Disable Child Strategy</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relax Disable Child Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaxDisableChildStrategy(RelaxDisableChildStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relax Replace</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relax Replace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaxReplace(RelaxReplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Any</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclAny(OclAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definable Requirement</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definable Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinableRequirement(DefinableRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aw Req</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwReq(AwReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // EcaSwitch
