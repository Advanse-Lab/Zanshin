/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.ParameterMetric;
import it.unitn.disi.zanshin.model.gore.ParameterType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl#getConfiguration <em>Configuration</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl#getType <em>Type</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl#getValue <em>Value</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.VARIATION_POINT;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterMetric METRIC_EDEFAULT = ParameterMetric.ENUMERATED;
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected ParameterMetric metric = METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (eContainerFeatureID() != GorePackage.PARAMETER__CONFIGURATION)
			return null;
		return (Configuration) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConfiguration, GorePackage.PARAMETER__CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != eInternalContainer() || (eContainerFeatureID() != GorePackage.PARAMETER__CONFIGURATION && newConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this, GorePackage.CONFIGURATION__PARAMETERS, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMetric(ParameterMetric newMetric) {
		ParameterMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean greaterThan(String value) {
		Boolean result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and compare as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.compareTo(b) > 0;
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean fewerThan(String value) {
		Boolean result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and compare as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.compareTo(b) < 0;
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean equalTo(String value) {
		Boolean result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and compare as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.compareTo(b) == 0;
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String addedTo(String value) {
		String result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and add as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.add(b).toPlainString();
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String multipliedBy(String value) {
		String result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and multiply as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.multiply(b).toPlainString();
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String subtractedFrom(String value) {
		String result = null;

		// Checks the metric of the parameter to know how to compare.
		try {
			switch (metric) {
			// FIXME: implement enumerated parameters.
			case ENUMERATED:
				break;

			// If the parameter is numeric, parses it and add as numbers.
			case INTEGER:
			case REAL:
				java.math.BigDecimal a = new java.math.BigDecimal(this.value);
				java.math.BigDecimal b = new java.math.BigDecimal(value);
				return a.subtract(b).toPlainString();
			}
		}

		// In case there are parsing errors (badly formatted numbers in the model), logs an error and returns null.
		catch (NumberFormatException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Error during string->number conversion, either the parameter value ({0}) or the value to compare ({1}) are not numbers.", e, this.value, value); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean withinBoundsOf(DifferentialRelation relation) {
		String lowerBound = relation.getLowerBound();
		String upperBound = relation.getUpperBound();
		
		// Checks for null comparisons.
		Boolean lowerCmp = greaterThan(lowerBound);
		Boolean upperCmp = fewerThan(upperBound);
		Boolean lowerEqual = equalTo(lowerBound);
		Boolean upperEqual = equalTo(upperBound);
		if ((lowerBound != null) && ((lowerCmp == null) || (lowerEqual == null))) return null;
		if ((upperBound != null) && ((upperCmp == null) || (upperEqual == null))) return null;
		
		// Does the comparisons, but only if needed. When the bounds are null, they mean infinity.
		return (((lowerBound == null) || (lowerCmp || lowerEqual)) && ((upperBound == null) || (upperCmp || upperEqual)));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean incrementableIn(DifferentialRelation relation) {
		// Creates a fake parameter and increments it by a unit.
		Parameter param = createCopy();
		param.increment(relation, unit);

		// Checks if the fake param, i.e., the param incremented by a unit, is still within boundaries.
		return param.withinBoundsOf(relation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createCopy() {
		return (Parameter) org.eclipse.emf.ecore.util.EcoreUtil.copy(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void increment(DifferentialRelation relation, String value) {
		// Obtains the operator from the differential relation to check the increment direction.
		String newValue = null;
		switch (relation.getOperator()) {
		case FEWER_THAN:
			newValue = subtractedFrom(value);
			break;
		case GREATER_THAN:
			newValue = addedTo(value);
			break;
		}

		// Changes the parameter's value to the new value.
		if (newValue != null)
			setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConfiguration((Configuration) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GorePackage.PARAMETER__CONFIGURATION:
			return eInternalContainer().eInverseRemove(this, GorePackage.CONFIGURATION__PARAMETERS, Configuration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			return getConfiguration();
		case GorePackage.PARAMETER__TYPE:
			return getType();
		case GorePackage.PARAMETER__UNIT:
			return getUnit();
		case GorePackage.PARAMETER__VALUE:
			return getValue();
		case GorePackage.PARAMETER__METRIC:
			return getMetric();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case GorePackage.PARAMETER__TYPE:
			setType((ParameterType) newValue);
			return;
		case GorePackage.PARAMETER__UNIT:
			setUnit((String) newValue);
			return;
		case GorePackage.PARAMETER__VALUE:
			setValue((String) newValue);
			return;
		case GorePackage.PARAMETER__METRIC:
			setMetric((ParameterMetric) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case GorePackage.PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GorePackage.PARAMETER__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case GorePackage.PARAMETER__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case GorePackage.PARAMETER__METRIC:
			setMetric(METRIC_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GorePackage.PARAMETER__CONFIGURATION:
			return getConfiguration() != null;
		case GorePackage.PARAMETER__TYPE:
			return type != TYPE_EDEFAULT;
		case GorePackage.PARAMETER__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case GorePackage.PARAMETER__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case GorePackage.PARAMETER__METRIC:
			return metric != METRIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", unit: "); //$NON-NLS-1$
		result.append(unit);
		result.append(", value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", metric: "); //$NON-NLS-1$
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} // ParameterImpl
