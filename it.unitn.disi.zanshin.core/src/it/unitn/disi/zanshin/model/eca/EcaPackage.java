/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.GorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaFactory
 * @model kind="package"
 * @generated
 */
public interface EcaPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "eca"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://disi.unitn.it/zanshin/1.0/eca"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "it.unitn.disi.zanshin.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EcaPackage eINSTANCE = it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl <em>Aw Req</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEcaAwReq()
	 * @generated
	 */
	int ECA_AW_REQ = 0;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__REFINEMENT_TYPE = GorePackage.AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__CHILDREN = GorePackage.AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__PARENT = GorePackage.AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__TIME = GorePackage.AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__STATE = GorePackage.AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__OTHER_TARGETS = GorePackage.AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__TARGET = GorePackage.AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Increment Coefficient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__INCREMENT_COEFFICIENT = GorePackage.AW_REQ__INCREMENT_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__CONDITION = GorePackage.AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__STRATEGIES = GorePackage.AW_REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__SELECTED_STRATEGY = GorePackage.AW_REQ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aw Req</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ_FEATURE_COUNT = GorePackage.AW_REQ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
	 * <em>Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getResolutionCondition()
	 * @generated
	 */
	int RESOLUTION_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION__AW_REQ = 0;

	/**
	 * The number of structural features of the '<em>Resolution Condition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
	 * <em>Adaptation Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationStrategy()
	 * @generated
	 */
	int ADAPTATION_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__AW_REQ = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Adaptation Strategy</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
	 * <em>Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getApplicabilityCondition()
	 * @generated
	 */
	int APPLICABILITY_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Applicability Condition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.EventImpl <em>Event</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.EventImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Session</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT__AW_REQ = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
	 * <em>Adaptation Session</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationSession()
	 * @generated
	 */
	int ADAPTATION_SESSION = 5;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION__ID = 2;

	/**
	 * The number of structural features of the '<em>Adaptation Session</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
	 * <em>Simple Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
	 * @generated
	 */
	int SIMPLE_RESOLUTION_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION__AW_REQ = RESOLUTION_CONDITION__AW_REQ;

	/**
	 * The number of structural features of the '<em>Simple Resolution Condition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AndRefinedResolutionConditionImpl
	 * <em>And Refined Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.AndRefinedResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAndRefinedResolutionCondition()
	 * @generated
	 */
	int AND_REFINED_RESOLUTION_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__AW_REQ = RESOLUTION_CONDITION__AW_REQ;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__CHILDREN = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Refined Resolution Condition</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.OrRefinedResolutionConditionImpl
	 * <em>Or Refined Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.OrRefinedResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getOrRefinedResolutionCondition()
	 * @generated
	 */
	int OR_REFINED_RESOLUTION_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__AW_REQ = RESOLUTION_CONDITION__AW_REQ;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__CHILDREN = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Refined Resolution Condition</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
	 * <em>Simple Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
	 * @generated
	 */
	int SIMPLE_APPLICABILITY_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The number of structural features of the '<em>Simple Applicability Condition</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link it.unitn.disi.zanshin.model.eca.impl.MaxExecutionsPerSessionApplicabilityConditionImpl
	 * <em>Max Executions Per Session Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.MaxExecutionsPerSessionApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getMaxExecutionsPerSessionApplicabilityCondition()
	 * @generated
	 */
	int MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Max Executions</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Executions Per Session Applicability Condition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AndRefinedApplicabilityConditionImpl
	 * <em>And Refined Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.AndRefinedApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAndRefinedApplicabilityCondition()
	 * @generated
	 */
	int AND_REFINED_APPLICABILITY_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__CHILDREN = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Refined Applicability Condition</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.OrRefinedApplicabilityConditionImpl
	 * <em>Or Refined Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.OrRefinedApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getOrRefinedApplicabilityCondition()
	 * @generated
	 */
	int OR_REFINED_APPLICABILITY_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__CHILDREN = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Refined Applicability Condition</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl <em>Retry Strategy</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRetryStrategy()
	 * @generated
	 */
	int RETRY_STRATEGY = 17;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenEnableChildStrategyImpl
	 * <em>Strengthen Enable Child Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.StrengthenEnableChildStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getStrengthenEnableChildStrategy()
	 * @generated
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY = 18;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl
	 * <em>Strengthen Replace</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getStrengthenReplace()
	 * @generated
	 */
	int STRENGTHEN_REPLACE = 19;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.WarningStrategyImpl
	 * <em>Warning Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.WarningStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getWarningStrategy()
	 * @generated
	 */
	int WARNING_STRATEGY = 20;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AbortStrategyImpl <em>Abort Strategy</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.AbortStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAbortStrategy()
	 * @generated
	 */
	int ABORT_STRATEGY = 13;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The number of structural features of the '<em>Abort Strategy</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.DelegateStrategyImpl
	 * <em>Delegate Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.DelegateStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getDelegateStrategy()
	 * @generated
	 */
	int DELEGATE_STRATEGY = 14;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__ACTOR = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegate Strategy</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl
	 * <em>Relax Disable Child Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRelaxDisableChildStrategy()
	 * @generated
	 */
	int RELAX_DISABLE_CHILD_STRATEGY = 15;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__CHILD = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relax Disable Child Strategy</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.RelaxReplaceImpl <em>Relax Replace</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.RelaxReplaceImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRelaxReplace()
	 * @generated
	 */
	int RELAX_REPLACE = 16;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE__NEW_REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relax Replace</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__TIME = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Retry Strategy</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strengthen Enable Child Strategy</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Requirement</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE__NEW_REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strengthen Replace</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__ACTOR = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Warning Strategy</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl
	 * <em>Reconfiguration Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationResolutionCondition()
	 * @generated
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION = 22;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl
	 * <em>Reconfiguration Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationStrategy()
	 * @generated
	 */
	int RECONFIGURATION_STRATEGY = 23;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationApplicabilityConditionImpl
	 * <em>Reconfiguration Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationApplicabilityCondition()
	 * @generated
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Wrapped Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconfiguration Applicability Condition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION__AW_REQ = RESOLUTION_CONDITION__AW_REQ;

	/**
	 * The feature id for the '<em><b>Wrapped Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconfiguration Resolution Condition</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Algorithm Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__ALGORITHM_ID = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedure Ids</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__PROCEDURE_IDS = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reconfiguration Strategy</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl
	 * <em>Change Parameter Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getChangeParameterStrategy()
	 * @generated
	 */
	int CHANGE_PARAMETER_STRATEGY = 24;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_STRATEGY__CHANGES = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Parameter Strategy</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ParameterChangeImpl
	 * <em>Parameter Change</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see it.unitn.disi.zanshin.model.eca.impl.ParameterChangeImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getParameterChange()
	 * @generated
	 */
	int PARAMETER_CHANGE = 25;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Change</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq <em>Aw Req</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq
	 * @generated
	 */
	EClass getEcaAwReq();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition <em>Condition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_Condition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies <em>Strategies</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_Strategies();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy
	 * <em>Selected Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Selected Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_SelectedStrategy();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition
	 * <em>Resolution Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition
	 * @generated
	 */
	EClass getResolutionCondition();

	/**
	 * Returns the meta object for the container reference '
	 * {@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq <em>Aw Req</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq()
	 * @see #getResolutionCondition()
	 * @generated
	 */
	EReference getResolutionCondition_AwReq();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy
	 * <em>Adaptation Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Adaptation Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy
	 * @generated
	 */
	EClass getAdaptationStrategy();

	/**
	 * Returns the meta object for the container reference '
	 * {@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_AwReq();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_Condition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition
	 * <em>Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition
	 * @generated
	 */
	EClass getApplicabilityCondition();

	/**
	 * Returns the meta object for the container reference '
	 * {@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy()
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	EReference getApplicabilityCondition_Strategy();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.Event <em>Event</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.eca.Event#getSession
	 * <em>Session</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Session</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getSession()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Session();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.Event#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getAwReq()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_AwReq();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession
	 * <em>Adaptation Session</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Adaptation Session</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession
	 * @generated
	 */
	EClass getAdaptationSession();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents <em>Events</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents()
	 * @see #getAdaptationSession()
	 * @generated
	 */
	EReference getAdaptationSession_Events();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive
	 * <em>Active</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive()
	 * @see #getAdaptationSession()
	 * @generated
	 */
	EAttribute getAdaptationSession_Active();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#getId
	 * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#getId()
	 * @see #getAdaptationSession()
	 * @generated
	 */
	EAttribute getAdaptationSession_Id();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition
	 * <em>Simple Resolution Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Simple Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition
	 * @generated
	 */
	EClass getSimpleResolutionCondition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition
	 * <em>And Refined Resolution Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>And Refined Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition
	 * @generated
	 */
	EClass getAndRefinedResolutionCondition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition#getChildren <em>Children</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition#getChildren()
	 * @see #getAndRefinedResolutionCondition()
	 * @generated
	 */
	EReference getAndRefinedResolutionCondition_Children();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition
	 * <em>Or Refined Resolution Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Or Refined Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition
	 * @generated
	 */
	EClass getOrRefinedResolutionCondition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition#getChildren <em>Children</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition#getChildren()
	 * @see #getOrRefinedResolutionCondition()
	 * @generated
	 */
	EReference getOrRefinedResolutionCondition_Children();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition
	 * <em>Simple Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Simple Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition
	 * @generated
	 */
	EClass getSimpleApplicabilityCondition();

	/**
	 * Returns the meta object for class '
	 * {@link it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition
	 * <em>Max Executions Per Session Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Max Executions Per Session Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition
	 * @generated
	 */
	EClass getMaxExecutionsPerSessionApplicabilityCondition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition#getMaxExecutions
	 * <em>Max Executions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Executions</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition#getMaxExecutions()
	 * @see #getMaxExecutionsPerSessionApplicabilityCondition()
	 * @generated
	 */
	EAttribute getMaxExecutionsPerSessionApplicabilityCondition_MaxExecutions();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition
	 * <em>And Refined Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>And Refined Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition
	 * @generated
	 */
	EClass getAndRefinedApplicabilityCondition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition#getChildren <em>Children</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition#getChildren()
	 * @see #getAndRefinedApplicabilityCondition()
	 * @generated
	 */
	EReference getAndRefinedApplicabilityCondition_Children();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition
	 * <em>Or Refined Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Or Refined Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition
	 * @generated
	 */
	EClass getOrRefinedApplicabilityCondition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition#getChildren <em>Children</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition#getChildren()
	 * @see #getOrRefinedApplicabilityCondition()
	 * @generated
	 */
	EReference getOrRefinedApplicabilityCondition_Children();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy <em>Retry Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Retry Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy
	 * @generated
	 */
	EClass getRetryStrategy();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getCopy
	 * <em>Copy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy#getCopy()
	 * @see #getRetryStrategy()
	 * @generated
	 */
	EAttribute getRetryStrategy_Copy();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#getTime
	 * <em>Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy#getTime()
	 * @see #getRetryStrategy()
	 * @generated
	 */
	EAttribute getRetryStrategy_Time();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy
	 * <em>Strengthen Enable Child Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Strengthen Enable Child Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy
	 * @generated
	 */
	EClass getStrengthenEnableChildStrategy();

	/**
	 * Returns the meta object for the reference '
	 * {@link it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getRequirement <em>Requirement</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getRequirement()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EReference getStrengthenEnableChildStrategy_Requirement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getLevel <em>Level</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getLevel()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EAttribute getStrengthenEnableChildStrategy_Level();

	/**
	 * Returns the meta object for the reference '
	 * {@link it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getChild <em>Child</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy#getChild()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EReference getStrengthenEnableChildStrategy_Child();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace
	 * <em>Strengthen Replace</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Strengthen Replace</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace
	 * @generated
	 */
	EClass getStrengthenReplace();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getRequirement
	 * <em>Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace#getRequirement()
	 * @see #getStrengthenReplace()
	 * @generated
	 */
	EReference getStrengthenReplace_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getCopy
	 * <em>Copy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace#getCopy()
	 * @see #getStrengthenReplace()
	 * @generated
	 */
	EAttribute getStrengthenReplace_Copy();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getLevel
	 * <em>Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace#getLevel()
	 * @see #getStrengthenReplace()
	 * @generated
	 */
	EAttribute getStrengthenReplace_Level();

	/**
	 * Returns the meta object for the reference '
	 * {@link it.unitn.disi.zanshin.model.eca.StrengthenReplace#getNewRequirement <em>New Requirement</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>New Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.StrengthenReplace#getNewRequirement()
	 * @see #getStrengthenReplace()
	 * @generated
	 */
	EReference getStrengthenReplace_NewRequirement();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.WarningStrategy
	 * <em>Warning Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Warning Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.WarningStrategy
	 * @generated
	 */
	EClass getWarningStrategy();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.WarningStrategy#getActor
	 * <em>Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.WarningStrategy#getActor()
	 * @see #getWarningStrategy()
	 * @generated
	 */
	EReference getWarningStrategy_Actor();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition
	 * <em>Reconfiguration Resolution Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reconfiguration Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition
	 * @generated
	 */
	EClass getReconfigurationResolutionCondition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getWrappedCondition
	 * <em>Wrapped Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Wrapped Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getWrappedCondition()
	 * @see #getReconfigurationResolutionCondition()
	 * @generated
	 */
	EReference getReconfigurationResolutionCondition_WrappedCondition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy
	 * <em>Reconfiguration Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reconfiguration Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy
	 * @generated
	 */
	EClass getReconfigurationStrategy();

	/**
	 * Returns the meta object for the attribute '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Algorithm Id</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_AlgorithmId();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getLevel
	 * <em>Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getLevel()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_Level();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getProcedureIds <em>Procedure Ids</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Procedure Ids</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getProcedureIds()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_ProcedureIds();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy
	 * <em>Change Parameter Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Change Parameter Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy
	 * @generated
	 */
	EClass getChangeParameterStrategy();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getLevel
	 * <em>Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getLevel()
	 * @see #getChangeParameterStrategy()
	 * @generated
	 */
	EAttribute getChangeParameterStrategy_Level();

	/**
	 * Returns the meta object for the reference list '
	 * {@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getChanges <em>Changes</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getChanges()
	 * @see #getChangeParameterStrategy()
	 * @generated
	 */
	EReference getChangeParameterStrategy_Changes();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ParameterChange
	 * <em>Parameter Change</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Change</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ParameterChange
	 * @generated
	 */
	EClass getParameterChange();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getParam
	 * <em>Param</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ParameterChange#getParam()
	 * @see #getParameterChange()
	 * @generated
	 */
	EReference getParameterChange_Param();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ParameterChange#getValue()
	 * @see #getParameterChange()
	 * @generated
	 */
	EAttribute getParameterChange_Value();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition
	 * <em>Reconfiguration Applicability Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reconfiguration Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition
	 * @generated
	 */
	EClass getReconfigurationApplicabilityCondition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition
	 * <em>Wrapped Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Wrapped Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition()
	 * @see #getReconfigurationApplicabilityCondition()
	 * @generated
	 */
	EReference getReconfigurationApplicabilityCondition_WrappedCondition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AbortStrategy <em>Abort Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abort Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AbortStrategy
	 * @generated
	 */
	EClass getAbortStrategy();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.DelegateStrategy
	 * <em>Delegate Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Delegate Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.DelegateStrategy
	 * @generated
	 */
	EClass getDelegateStrategy();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.DelegateStrategy#getActor
	 * <em>Actor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.DelegateStrategy#getActor()
	 * @see #getDelegateStrategy()
	 * @generated
	 */
	EReference getDelegateStrategy_Actor();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy
	 * <em>Relax Disable Child Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Relax Disable Child Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy
	 * @generated
	 */
	EClass getRelaxDisableChildStrategy();

	/**
	 * Returns the meta object for the reference '
	 * {@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getRequirement <em>Requirement</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getRequirement()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EReference getRelaxDisableChildStrategy_Requirement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getLevel <em>Level</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getLevel()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EAttribute getRelaxDisableChildStrategy_Level();

	/**
	 * Returns the meta object for the reference '
	 * {@link it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getChild <em>Child</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy#getChild()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EReference getRelaxDisableChildStrategy_Child();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace <em>Relax Replace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Relax Replace</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace
	 * @generated
	 */
	EClass getRelaxReplace();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getRequirement
	 * <em>Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace#getRequirement()
	 * @see #getRelaxReplace()
	 * @generated
	 */
	EReference getRelaxReplace_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getCopy
	 * <em>Copy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace#getCopy()
	 * @see #getRelaxReplace()
	 * @generated
	 */
	EAttribute getRelaxReplace_Copy();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getLevel
	 * <em>Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace#getLevel()
	 * @see #getRelaxReplace()
	 * @generated
	 */
	EAttribute getRelaxReplace_Level();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getNewRequirement
	 * <em>New Requirement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>New Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RelaxReplace#getNewRequirement()
	 * @see #getRelaxReplace()
	 * @generated
	 */
	EReference getRelaxReplace_NewRequirement();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcaFactory getEcaFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl <em>Aw Req</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEcaAwReq()
		 * @generated
		 */
		EClass ECA_AW_REQ = eINSTANCE.getEcaAwReq();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ECA_AW_REQ__CONDITION = eINSTANCE.getEcaAwReq_Condition();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ECA_AW_REQ__STRATEGIES = eINSTANCE.getEcaAwReq_Strategies();

		/**
		 * The meta object literal for the '<em><b>Selected Strategy</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ECA_AW_REQ__SELECTED_STRATEGY = eINSTANCE.getEcaAwReq_SelectedStrategy();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
		 * <em>Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getResolutionCondition()
		 * @generated
		 */
		EClass RESOLUTION_CONDITION = eINSTANCE.getResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLUTION_CONDITION__AW_REQ = eINSTANCE.getResolutionCondition_AwReq();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
		 * <em>Adaptation Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationStrategy()
		 * @generated
		 */
		EClass ADAPTATION_STRATEGY = eINSTANCE.getAdaptationStrategy();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__AW_REQ = eINSTANCE.getAdaptationStrategy_AwReq();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__CONDITION = eINSTANCE.getAdaptationStrategy_Condition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
		 * <em>Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getApplicabilityCondition()
		 * @generated
		 */
		EClass APPLICABILITY_CONDITION = eINSTANCE.getApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APPLICABILITY_CONDITION__STRATEGY = eINSTANCE.getApplicabilityCondition_Strategy();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.EventImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT__SESSION = eINSTANCE.getEvent_Session();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT__AW_REQ = eINSTANCE.getEvent_AwReq();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
		 * <em>Adaptation Session</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationSession()
		 * @generated
		 */
		EClass ADAPTATION_SESSION = eINSTANCE.getAdaptationSession();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ADAPTATION_SESSION__EVENTS = eINSTANCE.getAdaptationSession_Events();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADAPTATION_SESSION__ACTIVE = eINSTANCE.getAdaptationSession_Active();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EAttribute ADAPTATION_SESSION__ID = eINSTANCE.getAdaptationSession_Id();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
		 * <em>Simple Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
		 * @generated
		 */
		EClass SIMPLE_RESOLUTION_CONDITION = eINSTANCE.getSimpleResolutionCondition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AndRefinedResolutionConditionImpl
		 * <em>And Refined Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.AndRefinedResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAndRefinedResolutionCondition()
		 * @generated
		 */
		EClass AND_REFINED_RESOLUTION_CONDITION = eINSTANCE.getAndRefinedResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AND_REFINED_RESOLUTION_CONDITION__CHILDREN = eINSTANCE.getAndRefinedResolutionCondition_Children();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.OrRefinedResolutionConditionImpl
		 * <em>Or Refined Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.OrRefinedResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getOrRefinedResolutionCondition()
		 * @generated
		 */
		EClass OR_REFINED_RESOLUTION_CONDITION = eINSTANCE.getOrRefinedResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OR_REFINED_RESOLUTION_CONDITION__CHILDREN = eINSTANCE.getOrRefinedResolutionCondition_Children();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
		 * <em>Simple Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
		 * @generated
		 */
		EClass SIMPLE_APPLICABILITY_CONDITION = eINSTANCE.getSimpleApplicabilityCondition();

		/**
		 * The meta object literal for the '
		 * {@link it.unitn.disi.zanshin.model.eca.impl.MaxExecutionsPerSessionApplicabilityConditionImpl
		 * <em>Max Executions Per Session Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.MaxExecutionsPerSessionApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getMaxExecutionsPerSessionApplicabilityCondition()
		 * @generated
		 */
		EClass MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION = eINSTANCE.getMaxExecutionsPerSessionApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Max Executions</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS = eINSTANCE.getMaxExecutionsPerSessionApplicabilityCondition_MaxExecutions();

		/**
		 * The meta object literal for the '
		 * {@link it.unitn.disi.zanshin.model.eca.impl.AndRefinedApplicabilityConditionImpl
		 * <em>And Refined Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.AndRefinedApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAndRefinedApplicabilityCondition()
		 * @generated
		 */
		EClass AND_REFINED_APPLICABILITY_CONDITION = eINSTANCE.getAndRefinedApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AND_REFINED_APPLICABILITY_CONDITION__CHILDREN = eINSTANCE.getAndRefinedApplicabilityCondition_Children();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.OrRefinedApplicabilityConditionImpl
		 * <em>Or Refined Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.OrRefinedApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getOrRefinedApplicabilityCondition()
		 * @generated
		 */
		EClass OR_REFINED_APPLICABILITY_CONDITION = eINSTANCE.getOrRefinedApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OR_REFINED_APPLICABILITY_CONDITION__CHILDREN = eINSTANCE.getOrRefinedApplicabilityCondition_Children();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl
		 * <em>Retry Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRetryStrategy()
		 * @generated
		 */
		EClass RETRY_STRATEGY = eINSTANCE.getRetryStrategy();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RETRY_STRATEGY__COPY = eINSTANCE.getRetryStrategy_Copy();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RETRY_STRATEGY__TIME = eINSTANCE.getRetryStrategy_Time();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenEnableChildStrategyImpl
		 * <em>Strengthen Enable Child Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.StrengthenEnableChildStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getStrengthenEnableChildStrategy()
		 * @generated
		 */
		EClass STRENGTHEN_ENABLE_CHILD_STRATEGY = eINSTANCE.getStrengthenEnableChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getStrengthenEnableChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL = eINSTANCE.getStrengthenEnableChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD = eINSTANCE.getStrengthenEnableChildStrategy_Child();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl
		 * <em>Strengthen Replace</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getStrengthenReplace()
		 * @generated
		 */
		EClass STRENGTHEN_REPLACE = eINSTANCE.getStrengthenReplace();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRENGTHEN_REPLACE__REQUIREMENT = eINSTANCE.getStrengthenReplace_Requirement();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STRENGTHEN_REPLACE__COPY = eINSTANCE.getStrengthenReplace_Copy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STRENGTHEN_REPLACE__LEVEL = eINSTANCE.getStrengthenReplace_Level();

		/**
		 * The meta object literal for the '<em><b>New Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRENGTHEN_REPLACE__NEW_REQUIREMENT = eINSTANCE.getStrengthenReplace_NewRequirement();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.WarningStrategyImpl
		 * <em>Warning Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.WarningStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getWarningStrategy()
		 * @generated
		 */
		EClass WARNING_STRATEGY = eINSTANCE.getWarningStrategy();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WARNING_STRATEGY__ACTOR = eINSTANCE.getWarningStrategy_Actor();

		/**
		 * The meta object literal for the '
		 * {@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl
		 * <em>Reconfiguration Resolution Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationResolutionCondition()
		 * @generated
		 */
		EClass RECONFIGURATION_RESOLUTION_CONDITION = eINSTANCE.getReconfigurationResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Wrapped Condition</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION = eINSTANCE.getReconfigurationResolutionCondition_WrappedCondition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl
		 * <em>Reconfiguration Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationStrategy()
		 * @generated
		 */
		EClass RECONFIGURATION_STRATEGY = eINSTANCE.getReconfigurationStrategy();

		/**
		 * The meta object literal for the '<em><b>Algorithm Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__ALGORITHM_ID = eINSTANCE.getReconfigurationStrategy_AlgorithmId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__LEVEL = eINSTANCE.getReconfigurationStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Procedure Ids</b></em>' attribute list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__PROCEDURE_IDS = eINSTANCE.getReconfigurationStrategy_ProcedureIds();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl
		 * <em>Change Parameter Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getChangeParameterStrategy()
		 * @generated
		 */
		EClass CHANGE_PARAMETER_STRATEGY = eINSTANCE.getChangeParameterStrategy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_PARAMETER_STRATEGY__LEVEL = eINSTANCE.getChangeParameterStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_PARAMETER_STRATEGY__CHANGES = eINSTANCE.getChangeParameterStrategy_Changes();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ParameterChangeImpl
		 * <em>Parameter Change</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ParameterChangeImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getParameterChange()
		 * @generated
		 */
		EClass PARAMETER_CHANGE = eINSTANCE.getParameterChange();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER_CHANGE__PARAM = eINSTANCE.getParameterChange_Param();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_CHANGE__VALUE = eINSTANCE.getParameterChange_Value();

		/**
		 * The meta object literal for the '
		 * {@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationApplicabilityConditionImpl
		 * <em>Reconfiguration Applicability Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.ReconfigurationApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getReconfigurationApplicabilityCondition()
		 * @generated
		 */
		EClass RECONFIGURATION_APPLICABILITY_CONDITION = eINSTANCE.getReconfigurationApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Wrapped Condition</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION = eINSTANCE.getReconfigurationApplicabilityCondition_WrappedCondition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AbortStrategyImpl
		 * <em>Abort Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.AbortStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAbortStrategy()
		 * @generated
		 */
		EClass ABORT_STRATEGY = eINSTANCE.getAbortStrategy();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.DelegateStrategyImpl
		 * <em>Delegate Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.DelegateStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getDelegateStrategy()
		 * @generated
		 */
		EClass DELEGATE_STRATEGY = eINSTANCE.getDelegateStrategy();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DELEGATE_STRATEGY__ACTOR = eINSTANCE.getDelegateStrategy_Actor();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl
		 * <em>Relax Disable Child Strategy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRelaxDisableChildStrategy()
		 * @generated
		 */
		EClass RELAX_DISABLE_CHILD_STRATEGY = eINSTANCE.getRelaxDisableChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getRelaxDisableChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RELAX_DISABLE_CHILD_STRATEGY__LEVEL = eINSTANCE.getRelaxDisableChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELAX_DISABLE_CHILD_STRATEGY__CHILD = eINSTANCE.getRelaxDisableChildStrategy_Child();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.RelaxReplaceImpl
		 * <em>Relax Replace</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see it.unitn.disi.zanshin.model.eca.impl.RelaxReplaceImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRelaxReplace()
		 * @generated
		 */
		EClass RELAX_REPLACE = eINSTANCE.getRelaxReplace();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELAX_REPLACE__REQUIREMENT = eINSTANCE.getRelaxReplace_Requirement();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RELAX_REPLACE__COPY = eINSTANCE.getRelaxReplace_Copy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RELAX_REPLACE__LEVEL = eINSTANCE.getRelaxReplace_Level();

		/**
		 * The meta object literal for the '<em><b>New Requirement</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELAX_REPLACE__NEW_REQUIREMENT = eINSTANCE.getRelaxReplace_NewRequirement();

	}

} // EcaPackage
