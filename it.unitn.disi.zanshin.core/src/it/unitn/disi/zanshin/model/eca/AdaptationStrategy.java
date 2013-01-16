/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Adaptation Strategy</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy()
 * @model abstract="true"
 * @generated
 */
public interface AdaptationStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Aw Req</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies <em>Strategies</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aw Req</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aw Req</em>' container reference.
	 * @see #setAwReq(EcaAwReq)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy_AwReq()
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies
	 * @model opposite="strategies" transient="false"
	 * @generated
	 */
	EcaAwReq getAwReq();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Aw Req</em>' container reference.
	 * @see #getAwReq()
	 * @generated
	 */
	void setAwReq(EcaAwReq value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference. It is bidirectional and its opposite is
	 * '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ApplicabilityCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy_Condition()
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy
	 * @model opposite="strategy" containment="true"
	 * @generated
	 */
	ApplicabilityCondition getCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ApplicabilityCondition value);

	/**
	 * Returns the value of the '<em><b>Useful</b></em>' attribute. The default value is <code>"true"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useful</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Useful</em>' attribute.
	 * @see #setUseful(boolean)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy_Useful()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseful();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#isUseful <em>Useful</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Useful</em>' attribute.
	 * @see #isUseful()
	 * @generated
	 */
	void setUseful(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// This method is not supposed to be called.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method AdaptationStrategyImpl.execute() has been called, but this method is not meant to be called!\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	void execute(AdaptationSession session);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// This method is not supposed to be called.\nit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Method AdaptationStrategyImpl.updateReferences() has been called, indicating it has not been overridden by the subclass {0}. Make sure this is on purpose...\", eClass().getName()); //$NON-NLS-1$'"
	 * @generated
	 */
	void updateReferences();

} // AdaptationStrategy
