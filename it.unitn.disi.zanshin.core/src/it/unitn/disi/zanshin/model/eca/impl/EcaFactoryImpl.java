/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AbortStrategy;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy;
import it.unitn.disi.zanshin.model.eca.DelegateStrategy;
import it.unitn.disi.zanshin.model.eca.DoNothingStrategy;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
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
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;
import it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy;
import it.unitn.disi.zanshin.model.eca.StrengthenReplace;
import it.unitn.disi.zanshin.model.eca.WarningStrategy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcaFactoryImpl extends EFactoryImpl implements EcaFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EcaFactory init() {
		try {
			EcaFactory theEcaFactory = (EcaFactory) EPackage.Registry.INSTANCE.getEFactory("http://disi.unitn.it/zanshin/1.0/eca"); //$NON-NLS-1$
			if (theEcaFactory != null) { return theEcaFactory; }
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EcaPackage.ECA_AW_REQ:
			return createEcaAwReq();
		case EcaPackage.EVENT:
			return createEvent();
		case EcaPackage.ADAPTATION_SESSION:
			return createAdaptationSession();
		case EcaPackage.SIMPLE_RESOLUTION_CONDITION:
			return createSimpleResolutionCondition();
		case EcaPackage.AND_REFINED_RESOLUTION_CONDITION:
			return createAndRefinedResolutionCondition();
		case EcaPackage.OR_REFINED_RESOLUTION_CONDITION:
			return createOrRefinedResolutionCondition();
		case EcaPackage.SIMPLE_APPLICABILITY_CONDITION:
			return createSimpleApplicabilityCondition();
		case EcaPackage.MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION:
			return createMaxExecutionsPerSessionApplicabilityCondition();
		case EcaPackage.REFINED_APPLICABILITY_CONDITION:
			return createRefinedApplicabilityCondition();
		case EcaPackage.AND_REFINED_APPLICABILITY_CONDITION:
			return createAndRefinedApplicabilityCondition();
		case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION:
			return createOrRefinedApplicabilityCondition();
		case EcaPackage.NOT_CONCURRENT_WITH_APPLICABILITY_CONDITION:
			return createNotConcurrentWithApplicabilityCondition();
		case EcaPackage.ORDER_IN_RANGE_APPLICABILITY_CONDITION:
			return createOrderInRangeApplicabilityCondition();
		case EcaPackage.FOLLOWS_SPECIFIC_STRATEGY_APPLICABILITY_CONDITION:
			return createFollowsSpecificStrategyApplicabilityCondition();
		case EcaPackage.ABORT_STRATEGY:
			return createAbortStrategy();
		case EcaPackage.DELEGATE_STRATEGY:
			return createDelegateStrategy();
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY:
			return createRelaxDisableChildStrategy();
		case EcaPackage.RELAX_REPLACE:
			return createRelaxReplace();
		case EcaPackage.RETRY_STRATEGY:
			return createRetryStrategy();
		case EcaPackage.STRENGTHEN_ENABLE_CHILD_STRATEGY:
			return createStrengthenEnableChildStrategy();
		case EcaPackage.STRENGTHEN_REPLACE:
			return createStrengthenReplace();
		case EcaPackage.WARNING_STRATEGY:
			return createWarningStrategy();
		case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION:
			return createReconfigurationApplicabilityCondition();
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION:
			return createReconfigurationResolutionCondition();
		case EcaPackage.RECONFIGURATION_STRATEGY:
			return createReconfigurationStrategy();
		case EcaPackage.CHANGE_PARAMETER_STRATEGY:
			return createChangeParameterStrategy();
		case EcaPackage.PARAMETER_CHANGE:
			return createParameterChange();
		case EcaPackage.DO_NOTHING_STRATEGY:
			return createDoNothingStrategy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaAwReq createEcaAwReq() {
		EcaAwReqImpl ecaAwReq = new EcaAwReqImpl();
		return ecaAwReq;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdaptationSession createAdaptationSession() {
		AdaptationSessionImpl adaptationSession = new AdaptationSessionImpl();
		return adaptationSession;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SimpleResolutionCondition createSimpleResolutionCondition() {
		SimpleResolutionConditionImpl simpleResolutionCondition = new SimpleResolutionConditionImpl();
		return simpleResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AndRefinedResolutionCondition createAndRefinedResolutionCondition() {
		AndRefinedResolutionConditionImpl andRefinedResolutionCondition = new AndRefinedResolutionConditionImpl();
		return andRefinedResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrRefinedResolutionCondition createOrRefinedResolutionCondition() {
		OrRefinedResolutionConditionImpl orRefinedResolutionCondition = new OrRefinedResolutionConditionImpl();
		return orRefinedResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SimpleApplicabilityCondition createSimpleApplicabilityCondition() {
		SimpleApplicabilityConditionImpl simpleApplicabilityCondition = new SimpleApplicabilityConditionImpl();
		return simpleApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MaxExecutionsPerSessionApplicabilityCondition createMaxExecutionsPerSessionApplicabilityCondition() {
		MaxExecutionsPerSessionApplicabilityConditionImpl maxExecutionsPerSessionApplicabilityCondition = new MaxExecutionsPerSessionApplicabilityConditionImpl();
		return maxExecutionsPerSessionApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RefinedApplicabilityCondition createRefinedApplicabilityCondition() {
		RefinedApplicabilityConditionImpl refinedApplicabilityCondition = new RefinedApplicabilityConditionImpl();
		return refinedApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AndRefinedApplicabilityCondition createAndRefinedApplicabilityCondition() {
		AndRefinedApplicabilityConditionImpl andRefinedApplicabilityCondition = new AndRefinedApplicabilityConditionImpl();
		return andRefinedApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrRefinedApplicabilityCondition createOrRefinedApplicabilityCondition() {
		OrRefinedApplicabilityConditionImpl orRefinedApplicabilityCondition = new OrRefinedApplicabilityConditionImpl();
		return orRefinedApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotConcurrentWithApplicabilityCondition createNotConcurrentWithApplicabilityCondition() {
		NotConcurrentWithApplicabilityConditionImpl notConcurrentWithApplicabilityCondition = new NotConcurrentWithApplicabilityConditionImpl();
		return notConcurrentWithApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrderInRangeApplicabilityCondition createOrderInRangeApplicabilityCondition() {
		OrderInRangeApplicabilityConditionImpl orderInRangeApplicabilityCondition = new OrderInRangeApplicabilityConditionImpl();
		return orderInRangeApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FollowsSpecificStrategyApplicabilityCondition createFollowsSpecificStrategyApplicabilityCondition() {
		FollowsSpecificStrategyApplicabilityConditionImpl followsSpecificStrategyApplicabilityCondition = new FollowsSpecificStrategyApplicabilityConditionImpl();
		return followsSpecificStrategyApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RetryStrategy createRetryStrategy() {
		RetryStrategyImpl retryStrategy = new RetryStrategyImpl();
		return retryStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StrengthenEnableChildStrategy createStrengthenEnableChildStrategy() {
		StrengthenEnableChildStrategyImpl strengthenEnableChildStrategy = new StrengthenEnableChildStrategyImpl();
		return strengthenEnableChildStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StrengthenReplace createStrengthenReplace() {
		StrengthenReplaceImpl strengthenReplace = new StrengthenReplaceImpl();
		return strengthenReplace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WarningStrategy createWarningStrategy() {
		WarningStrategyImpl warningStrategy = new WarningStrategyImpl();
		return warningStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReconfigurationResolutionCondition createReconfigurationResolutionCondition() {
		ReconfigurationResolutionConditionImpl reconfigurationResolutionCondition = new ReconfigurationResolutionConditionImpl();
		return reconfigurationResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReconfigurationStrategy createReconfigurationStrategy() {
		ReconfigurationStrategyImpl reconfigurationStrategy = new ReconfigurationStrategyImpl();
		return reconfigurationStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeParameterStrategy createChangeParameterStrategy() {
		ChangeParameterStrategyImpl changeParameterStrategy = new ChangeParameterStrategyImpl();
		return changeParameterStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterChange createParameterChange() {
		ParameterChangeImpl parameterChange = new ParameterChangeImpl();
		return parameterChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoNothingStrategy createDoNothingStrategy() {
		DoNothingStrategyImpl doNothingStrategy = new DoNothingStrategyImpl();
		return doNothingStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReconfigurationApplicabilityCondition createReconfigurationApplicabilityCondition() {
		ReconfigurationApplicabilityConditionImpl reconfigurationApplicabilityCondition = new ReconfigurationApplicabilityConditionImpl();
		return reconfigurationApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbortStrategy createAbortStrategy() {
		AbortStrategyImpl abortStrategy = new AbortStrategyImpl();
		return abortStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DelegateStrategy createDelegateStrategy() {
		DelegateStrategyImpl delegateStrategy = new DelegateStrategyImpl();
		return delegateStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RelaxDisableChildStrategy createRelaxDisableChildStrategy() {
		RelaxDisableChildStrategyImpl relaxDisableChildStrategy = new RelaxDisableChildStrategyImpl();
		return relaxDisableChildStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RelaxReplace createRelaxReplace() {
		RelaxReplaceImpl relaxReplace = new RelaxReplaceImpl();
		return relaxReplace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EcaPackage getEcaPackage() {
		return (EcaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcaPackage getPackage() {
		return EcaPackage.eINSTANCE;
	}

} // EcaFactoryImpl
