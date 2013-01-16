/**
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AwReq;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Not Concurrent With Applicability Condition</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.NotConcurrentWithApplicabilityCondition#getAwreqs <em>Awreqs</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getNotConcurrentWithApplicabilityCondition()
 * @model
 * @generated
 */
public interface NotConcurrentWithApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Awreqs</b></em>' reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.AwReq}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Awreqs</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Awreqs</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getNotConcurrentWithApplicabilityCondition_Awreqs()
	 * @model
	 * @generated
	 */
	EList<AwReq> getAwreqs();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String conditionName = eClass().getName();\n\n// Obtains a reference to the adaptation service and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.IAdaptationService adaptationService = it.unitn.disi.zanshin.core.Activator.getAdaptationService();\nif (adaptationService == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to evaluate {0}, but the adaptation service has not yet been registered!\", conditionName); //$NON-NLS-1$\n\treturn false;\n}\n\n// Obtains the map of active sessions.\nMap<EClass, AdaptationSession> activeSessions = adaptationService.getActiveSessions();\n\n// If no specific AwReq was specified, the strategy is applicable only when there are no current active sessions.\nif ((awreqs == null) || (awreqs.isEmpty()))\n\treturn activeSessions.isEmpty();\n\n// If specific AwReq(s) have been given, check if there are any active sessions associated to them. If there are,\n// the strategy is not applicable.\nfor (AwReq awreq : awreqs) {\n\tif (activeSessions.containsKey(awreq.eClass()))\n\t\treturn false;\n}\n\n// If none of the specified AwReqs have an active session, the strategy is applicable.\nreturn true;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // NotConcurrentWithApplicabilityCondition
