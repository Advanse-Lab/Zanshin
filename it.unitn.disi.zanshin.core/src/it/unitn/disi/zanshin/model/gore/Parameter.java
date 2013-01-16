/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getType <em>Type</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getUnit <em>Unit</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getValue <em>Value</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference. It is bidirectional and its opposite
	 * is '{@link it.unitn.disi.zanshin.model.gore.Configuration#getParameters <em>Parameters</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Configuration()
	 * @see it.unitn.disi.zanshin.model.gore.Configuration#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The default value is <code>"vp"</code>. The literals are
	 * from the enumeration {@link it.unitn.disi.zanshin.model.gore.ParameterType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @see #setType(ParameterType)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Type()
	 * @model default="vp" required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getType <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getUnit <em>Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getValue <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute. The default value is <code>"enumerated"</code>. The
	 * literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.ParameterMetric}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @see #setMetric(ParameterMetric)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Metric()
	 * @model default="enumerated" required="true"
	 * @generated
	 */
	ParameterMetric getMetric();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Metric</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ParameterMetric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='Boolean result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and compare as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.compareTo(b) > 0;\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	Boolean greaterThan(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='Boolean result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and compare as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.compareTo(b) < 0;\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	Boolean fewerThan(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='Boolean result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and compare as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.compareTo(b) == 0;\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	Boolean equalTo(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and add as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.add(b).toPlainString();\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	String addedTo(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and multiply as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.multiply(b).toPlainString();\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	String multipliedBy(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String result = null;\n\n// Checks the metric of the parameter to know how to compare.\ntry {\n\tswitch (metric) {\n\t// FIXME: implement enumerated parameters.\n\tcase ENUMERATED:\n\t\tbreak;\n\t\t\n\t// If the parameter is numeric, parses it and add as numbers.\n\tcase INTEGER:\n\tcase REAL:\n\t\tjava.math.BigDecimal a = new java.math.BigDecimal(this.value);\n\t\tjava.math.BigDecimal b = new java.math.BigDecimal(value);\n\t\treturn a.subtract(b).toPlainString();\n\t}\n}\n\n// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.\ncatch (NumberFormatException e) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.\", e, this.value, value); //$NON-NLS-1$\n}\n\nreturn result;'"
	 * @generated
	 */
	String subtractedFrom(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String lowerBound = relation.getLowerBound();\nString upperBound = relation.getUpperBound();\n\n// Checks for null comparisons.\nBoolean lowerCmp = greaterThan(lowerBound);\nBoolean upperCmp = fewerThan(upperBound);\nBoolean lowerEqual = equalTo(lowerBound);\nBoolean upperEqual = equalTo(upperBound);\nif ((lowerBound != null) && ((lowerCmp == null) || (lowerEqual == null))) return null;\nif ((upperBound != null) && ((upperCmp == null) || (upperEqual == null))) return null;\n\n// Does the comparisons, but only if needed. When the bounds are null, they mean infinity.\nreturn (((lowerBound == null) || (lowerCmp || lowerEqual)) && ((upperBound == null) || (upperCmp || upperEqual)));'"
	 * @generated
	 */
	Boolean withinBoundsOf(DifferentialRelation relation);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Creates a fake parameter and increments it by a unit.\nParameter param = createCopy();\nparam.increment(relation, unit);\n\n// Checks if the fake param, i.e., the param incremented by a unit, is still within boundaries.\nreturn param.withinBoundsOf(relation);'"
	 * @generated
	 */
	Boolean incrementableIn(DifferentialRelation relation);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return (Parameter) org.eclipse.emf.ecore.util.EcoreUtil.copy(this);'"
	 * @generated
	 */
	Parameter createCopy();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Obtains the operator from the differential relation to check the increment direction.\nString newValue = null;\nswitch (relation.getOperator()) {\ncase FEWER_THAN:\n\tnewValue = subtractedFrom(value);\n\tbreak;\ncase GREATER_THAN:\n\tnewValue = addedTo(value);\n\tbreak;\n}\n\n// Changes the parameter\'s value to the new value.\nif (newValue != null)\n\tsetValue(newValue);'"
	 * @generated
	 */
	void increment(DifferentialRelation relation, String value);

} // Parameter
