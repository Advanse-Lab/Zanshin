/**
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Change</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getParam <em>Param</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getParameterChange()
 * @model
 * @generated
 */
public interface ParameterChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(Parameter)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getParameterChange_Param()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParam();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getParameterChange_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ParameterChange#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ParameterChange
