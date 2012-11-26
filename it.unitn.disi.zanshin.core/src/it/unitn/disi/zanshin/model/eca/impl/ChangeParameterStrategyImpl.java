/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ParameterChange;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Change Parameter Strategy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.ChangeParameterStrategyImpl#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChangeParameterStrategyImpl extends AdaptationStrategyImpl implements ChangeParameterStrategy {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationLevel LEVEL_EDEFAULT = AggregationLevel.CLASS;
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected AggregationLevel level = LEVEL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterChange> changes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChangeParameterStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.CHANGE_PARAMETER_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregationLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLevel(AggregationLevel newLevel) {
		AggregationLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.CHANGE_PARAMETER_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ParameterChange> getChanges() {
		if (changes == null) {
			changes = new EObjectResolvingEList<ParameterChange>(ParameterChange.class, this, EcaPackage.CHANGE_PARAMETER_STRATEGY__CHANGES);
		}
		return changes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(AdaptationSession session) {
		String strategyName = eClass().getName();
		
		// Obtains a reference to the target system's controller and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();
		if (controller == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but the target system's controller has not yet been registered!", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Retrieve the strategy's attributes.
		it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();
		
		// At least one change should be given.
		if ((changes == null) || (changes.isEmpty())) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"changes\" and cannot be executed.", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Attribute level defaults to CLASS.
		if (level == null)
			level = AggregationLevel.CLASS;
		
		// Generates the name of the strategy with the changes that should be done.
		StringBuilder builder = new StringBuilder(strategyName).append('(');
		for (ParameterChange change : changes)
			builder.append(change.getParam().eClass().getName()).append(" -> ").append(change.getValue()).append(", "); //$NON-NLS-1$ //$NON-NLS-2$
		builder.delete(builder.length() - 2, builder.length()).append(')');
		strategyName = builder.toString();
		
		// Executes the ChangeParameter strategy.
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		if ((level == AggregationLevel.CLASS) || (level == AggregationLevel.BOTH)) {
			for (ParameterChange change : changes)
				controller.changeParameter(change.getParam(), change.getValue());
		}
		if ((level == AggregationLevel.INSTANCE) || (level == AggregationLevel.BOTH)) {
			it.unitn.disi.zanshin.model.gore.GoalModel model = awreq.findGoalModel();
			for (ParameterChange change : changes)
				controller.changeParameter(model, change.getParam(), change.getValue());
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__LEVEL:
			return getLevel();
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__CHANGES:
			return getChanges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__LEVEL:
			setLevel((AggregationLevel) newValue);
			return;
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__CHANGES:
			getChanges().clear();
			getChanges().addAll((Collection<? extends ParameterChange>) newValue);
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
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__CHANGES:
			getChanges().clear();
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
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__LEVEL:
			return level != LEVEL_EDEFAULT;
		case EcaPackage.CHANGE_PARAMETER_STRATEGY__CHANGES:
			return changes != null && !changes.isEmpty();
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
		result.append(" (level: "); //$NON-NLS-1$
		result.append(level);
		result.append(')');
		return result.toString();
	}

} // ChangeParameterStrategyImpl
