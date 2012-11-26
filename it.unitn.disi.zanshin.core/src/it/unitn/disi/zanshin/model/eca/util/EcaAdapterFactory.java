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
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ParameterChange;
import it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage
 * @generated
 */
public class EcaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EcaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This implementation
	 * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
	 * end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) { return true; }
		if (object instanceof EObject) { return ((EObject) object).eClass().getEPackage() == modelPackage; }
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EcaSwitch<Adapter> modelSwitch = new EcaSwitch<Adapter>() {
		@Override
		public Adapter caseEcaAwReq(EcaAwReq object) {
			return createEcaAwReqAdapter();
		}

		@Override
		public Adapter caseResolutionCondition(ResolutionCondition object) {
			return createResolutionConditionAdapter();
		}

		@Override
		public Adapter caseAdaptationStrategy(AdaptationStrategy object) {
			return createAdaptationStrategyAdapter();
		}

		@Override
		public Adapter caseApplicabilityCondition(ApplicabilityCondition object) {
			return createApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseAdaptationSession(AdaptationSession object) {
			return createAdaptationSessionAdapter();
		}

		@Override
		public Adapter caseSimpleResolutionCondition(SimpleResolutionCondition object) {
			return createSimpleResolutionConditionAdapter();
		}

		@Override
		public Adapter caseAndRefinedResolutionCondition(AndRefinedResolutionCondition object) {
			return createAndRefinedResolutionConditionAdapter();
		}

		@Override
		public Adapter caseOrRefinedResolutionCondition(OrRefinedResolutionCondition object) {
			return createOrRefinedResolutionConditionAdapter();
		}

		@Override
		public Adapter caseSimpleApplicabilityCondition(SimpleApplicabilityCondition object) {
			return createSimpleApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseMaxExecutionsPerSessionApplicabilityCondition(MaxExecutionsPerSessionApplicabilityCondition object) {
			return createMaxExecutionsPerSessionApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseAndRefinedApplicabilityCondition(AndRefinedApplicabilityCondition object) {
			return createAndRefinedApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseOrRefinedApplicabilityCondition(OrRefinedApplicabilityCondition object) {
			return createOrRefinedApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseAbortStrategy(AbortStrategy object) {
			return createAbortStrategyAdapter();
		}

		@Override
		public Adapter caseDelegateStrategy(DelegateStrategy object) {
			return createDelegateStrategyAdapter();
		}

		@Override
		public Adapter caseRelaxDisableChildStrategy(RelaxDisableChildStrategy object) {
			return createRelaxDisableChildStrategyAdapter();
		}

		@Override
		public Adapter caseRelaxReplace(RelaxReplace object) {
			return createRelaxReplaceAdapter();
		}

		@Override
		public Adapter caseRetryStrategy(RetryStrategy object) {
			return createRetryStrategyAdapter();
		}

		@Override
		public Adapter caseStrengthenEnableChildStrategy(StrengthenEnableChildStrategy object) {
			return createStrengthenEnableChildStrategyAdapter();
		}

		@Override
		public Adapter caseStrengthenReplace(StrengthenReplace object) {
			return createStrengthenReplaceAdapter();
		}

		@Override
		public Adapter caseWarningStrategy(WarningStrategy object) {
			return createWarningStrategyAdapter();
		}

		@Override
		public Adapter caseReconfigurationApplicabilityCondition(ReconfigurationApplicabilityCondition object) {
			return createReconfigurationApplicabilityConditionAdapter();
		}

		@Override
		public Adapter caseReconfigurationResolutionCondition(ReconfigurationResolutionCondition object) {
			return createReconfigurationResolutionConditionAdapter();
		}

		@Override
		public Adapter caseReconfigurationStrategy(ReconfigurationStrategy object) {
			return createReconfigurationStrategyAdapter();
		}

		@Override
		public Adapter caseChangeParameterStrategy(ChangeParameterStrategy object) {
			return createChangeParameterStrategyAdapter();
		}

		@Override
		public Adapter caseParameterChange(ParameterChange object) {
			return createParameterChangeAdapter();
		}

		@Override
		public Adapter caseOclAny(OclAny object) {
			return createOclAnyAdapter();
		}

		@Override
		public Adapter caseRequirement(Requirement object) {
			return createRequirementAdapter();
		}

		@Override
		public Adapter caseDefinableRequirement(DefinableRequirement object) {
			return createDefinableRequirementAdapter();
		}

		@Override
		public Adapter caseAwReq(AwReq object) {
			return createAwReqAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq
	 * @generated
	 */
	public Adapter createEcaAwReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition
	 * <em>Resolution Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition
	 * @generated
	 */
	public Adapter createResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy
	 * <em>Adaptation Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy
	 * @generated
	 */
	public Adapter createAdaptationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition
	 * <em>Applicability Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition
	 * @generated
	 */
	public Adapter createApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.Event <em>Event</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession
	 * <em>Adaptation Session</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession
	 * @generated
	 */
	public Adapter createAdaptationSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition
	 * <em>Simple Resolution Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition
	 * @generated
	 */
	public Adapter createSimpleResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition
	 * <em>And Refined Resolution Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition
	 * @generated
	 */
	public Adapter createAndRefinedResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition
	 * <em>Or Refined Resolution Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition
	 * @generated
	 */
	public Adapter createOrRefinedResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition
	 * <em>Simple Applicability Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition
	 * @generated
	 */
	public Adapter createSimpleApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition
	 * <em>Max Executions Per Session Applicability Condition</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition
	 * @generated
	 */
	public Adapter createMaxExecutionsPerSessionApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition
	 * <em>And Refined Applicability Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition
	 * @generated
	 */
	public Adapter createAndRefinedApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition <em>Or Refined Applicability Condition</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition
	 * @generated
	 */
	public Adapter createOrRefinedApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy
	 * <em>Retry Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy
	 * @generated
	 */
	public Adapter createRetryStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy
	 * <em>Strengthen Enable Child Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy
	 * @generated
	 */
	public Adapter createStrengthenEnableChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace
	 * <em>Strengthen Replace</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace
	 * @generated
	 */
	public Adapter createStrengthenReplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.WarningStrategy
	 * <em>Warning Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.WarningStrategy
	 * @generated
	 */
	public Adapter createWarningStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition
	 * <em>Reconfiguration Resolution Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition
	 * @generated
	 */
	public Adapter createReconfigurationResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy
	 * <em>Reconfiguration Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy
	 * @generated
	 */
	public Adapter createReconfigurationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy
	 * <em>Change Parameter Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy
	 * @generated
	 */
	public Adapter createChangeParameterStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.ParameterChange
	 * <em>Parameter Change</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ParameterChange
	 * @generated
	 */
	public Adapter createParameterChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition
	 * <em>Reconfiguration Applicability Condition</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition
	 * @generated
	 */
	public Adapter createReconfigurationApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.AbortStrategy
	 * <em>Abort Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.AbortStrategy
	 * @generated
	 */
	public Adapter createAbortStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.DelegateStrategy
	 * <em>Delegate Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.DelegateStrategy
	 * @generated
	 */
	public Adapter createDelegateStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy
	 * <em>Relax Disable Child Strategy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy
	 * @generated
	 */
	public Adapter createRelaxDisableChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace
	 * <em>Relax Replace</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace
	 * @generated
	 */
	public Adapter createRelaxReplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.OclAny <em>Ocl Any</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.OclAny
	 * @generated
	 */
	public Adapter createOclAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Requirement
	 * <em>Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement
	 * <em>Definable Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirement
	 * @generated
	 */
	public Adapter createDefinableRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.AwReq <em>Aw Req</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq
	 * @generated
	 */
	public Adapter createAwReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // EcaAdapterFactory
