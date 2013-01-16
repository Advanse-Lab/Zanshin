/**
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Follows Specific Strategy Applicability Condition</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getStrategyToFollow <em>
 * Strategy To Follow</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getMinDelay <em>Min Delay
 * </em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getMaxDelay <em>Max Delay
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getFollowsSpecificStrategyApplicabilityCondition()
 * @model
 * @generated
 */
public interface FollowsSpecificStrategyApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Strategy To Follow</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy To Follow</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strategy To Follow</em>' reference.
	 * @see #setStrategyToFollow(AdaptationStrategy)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getFollowsSpecificStrategyApplicabilityCondition_StrategyToFollow()
	 * @model required="true"
	 * @generated
	 */
	AdaptationStrategy getStrategyToFollow();

	/**
	 * Sets the value of the '
	 * {@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getStrategyToFollow
	 * <em>Strategy To Follow</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Strategy To Follow</em>' reference.
	 * @see #getStrategyToFollow()
	 * @generated
	 */
	void setStrategyToFollow(AdaptationStrategy value);

	/**
	 * Returns the value of the '<em><b>Min Delay</b></em>' attribute. The default value is <code>"-1"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Delay</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Delay</em>' attribute.
	 * @see #setMinDelay(long)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getFollowsSpecificStrategyApplicabilityCondition_MinDelay()
	 * @model default="-1"
	 * @generated
	 */
	long getMinDelay();

	/**
	 * Sets the value of the '
	 * {@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getMinDelay
	 * <em>Min Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Min Delay</em>' attribute.
	 * @see #getMinDelay()
	 * @generated
	 */
	void setMinDelay(long value);

	/**
	 * Returns the value of the '<em><b>Max Delay</b></em>' attribute. The default value is <code>"-1"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Delay</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Delay</em>' attribute.
	 * @see #setMaxDelay(long)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getFollowsSpecificStrategyApplicabilityCondition_MaxDelay()
	 * @model default="-1"
	 * @generated
	 */
	long getMaxDelay();

	/**
	 * Sets the value of the '
	 * {@link it.unitn.disi.zanshin.model.eca.FollowsSpecificStrategyApplicabilityCondition#getMaxDelay
	 * <em>Max Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Max Delay</em>' attribute.
	 * @see #getMaxDelay()
	 * @generated
	 */
	void setMaxDelay(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String conditionName = eClass().getName();\nEClass strategyClass = findStrategy().eClass();\n\n// If the list of events with usefult strategies is empty, then the strategy is not applicable.\norg.eclipse.emf.common.util.EList<it.unitn.disi.zanshin.model.eca.Event> eventList = session.getEventsWithUsefulStrategies();\nif (eventList.isEmpty()) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Strategy {1} is not applicable, as it is the first useful strategy applied.\", session.getId(), strategyClass.getName()); //$NON-NLS-1$\n\treturn false;\n}\n\n// Either minDelay or maxDelay have to be specified.\nif ((minDelay < 0) && (maxDelay < 0)) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Applicability Condition {0} should have either \\\"minDelay\\\" or \\\"maxDelay\\\" or both specified. Since it doesn\'t, it will be evaluated to false.\", conditionName); //$NON-NLS-1$\n\treturn false;\n}\n\n// Checks if the last strategy applied was of the type specified.\nit.unitn.disi.zanshin.model.eca.Event awreqEvent = eventList.get(eventList.size() - 1);\nit.unitn.disi.zanshin.model.eca.AdaptationStrategy lastAppliedStrategy = awreqEvent.getAwReq().getSelectedStrategy();\norg.eclipse.emf.ecore.EClass followClazz = strategyToFollow.eClass();\norg.eclipse.emf.ecore.EClass lastClazz = lastAppliedStrategy.eClass();\nif (!followClazz.equals(lastClazz)) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Strategy {1} is not applicable: should follow {2}, but last useful strategy was {3}.\", session.getId(), strategyClass.getName(), followClazz.getName(), lastClazz.getName()); //$NON-NLS-1$\n\treturn false;\n}\n\n// Checks if the strategy was applied within the specified minimum and maximum delay.\nlong timestamp = awreqEvent.getTime().getTime();\nlong diff = System.currentTimeMillis() - timestamp;\nboolean result = ((minDelay != -1) || (diff > minDelay)) && ((maxDelay != -1) || (diff < maxDelay));\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Strategy {1} follows {2}, delay is {3}, max delay accepted: {4}. Applicable? {5}\", session.getId(), strategyClass.getName(), lastClazz.getName(), diff, maxDelay, result); //$NON-NLS-1$\nreturn result;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // FollowsSpecificStrategyApplicabilityCondition
