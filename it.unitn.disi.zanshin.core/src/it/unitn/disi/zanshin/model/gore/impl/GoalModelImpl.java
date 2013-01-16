/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Goal Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getRootGoal <em>Root Goal</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getActors <em>Actors</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getInternalId <em>Internal Id</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getConfiguration <em>Configuration</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GoalModelImpl extends EObjectImpl implements GoalModel {
	/**
	 * The cached value of the '{@link #getRootGoal() <em>Root Goal</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRootGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal rootGoal;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The default value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected Long internalId = INTERNAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferentialRelation> relations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GoalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Goal getRootGoal() {
		return rootGoal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRootGoal(Goal newRootGoal, NotificationChain msgs) {
		Goal oldRootGoal = rootGoal;
		rootGoal = newRootGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, oldRootGoal, newRootGoal);
			if (msgs == null)
				msgs = notification;
			else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRootGoal(Goal newRootGoal) {
		if (newRootGoal != rootGoal) {
			NotificationChain msgs = null;
			if (rootGoal != null)
				msgs = ((InternalEObject) rootGoal).eInverseRemove(this, GorePackage.GOAL__GOAL_MODEL, Goal.class, msgs);
			if (newRootGoal != null)
				msgs = ((InternalEObject) newRootGoal).eInverseAdd(this, GorePackage.GOAL__GOAL_MODEL, Goal.class, msgs);
			msgs = basicSetRootGoal(newRootGoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, newRootGoal, newRootGoal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, GorePackage.GOAL_MODEL__ACTORS, GorePackage.ACTOR__GOAL_MODEL);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Long getInternalId() {
		return internalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null)
				msgs = notification;
			else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this, GorePackage.CONFIGURATION__GOAL_MODEL, Configuration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this, GorePackage.CONFIGURATION__GOAL_MODEL, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DifferentialRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<DifferentialRelation>(DifferentialRelation.class, this, GorePackage.GOAL_MODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Long getId() {
		if (internalId == null)
			internalId = System.currentTimeMillis();
		return internalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DifferentialRelation> filterRelations(AwReq indicator) {
		// Returns a list of relations associated with the given indicator.
		EList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();
		if (indicator != null)
			for (DifferentialRelation relation : relations) {
				AwReq relationIndicator = relation.getIndicator();
				if ((relationIndicator != null) && (relationIndicator.eClass().equals(indicator.eClass())))
					filteredRelations.add(relation);
			}
		return filteredRelations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DifferentialRelation> filterRelations(Parameter parameter) {
		// Returns a list of relations associated with the given parameter.
		EList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();
		if (parameter != null)
			for (DifferentialRelation relation : relations) {
				Parameter relationParameter = relation.getParameter();
				if ((relationParameter != null) && (relationParameter.eClass().equals(parameter.eClass())))
					filteredRelations.add(relation);
			}
		return filteredRelations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DifferentialRelation> filterRelations(AwReq indicator, Parameter parameter) {
		// Returns a list of relations associated with the given indicator and the given parameter.
		EList<DifferentialRelation> filteredRelations = new org.eclipse.emf.common.util.BasicEList<>();
		if ((indicator != null) && (parameter != null))
			for (DifferentialRelation relation : relations) {
				AwReq relationIndicator = relation.getIndicator();
				Parameter relationParameter = relation.getParameter();
				if ((relationIndicator != null) && (relationIndicator.eClass().equals(indicator.eClass())) && (relationParameter != null) && (relationParameter.eClass().equals(parameter.eClass())))
					filteredRelations.add(relation);
			}
		return filteredRelations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DifferentialRelation filterRelations(AwReq indicator, Parameter parameter, String value) {
		// Filters the relations by indicator and parameter.
		EList<DifferentialRelation> filteredRelations = filterRelations(indicator, parameter);

		// Creates a fake parameter for the value comparison.
		it.unitn.disi.zanshin.model.gore.Parameter param = parameter.createCopy();
		param.setValue(value);

		// Looks for a relation in which a param with this value is incrementable. Returns the first one found.
		for (DifferentialRelation relation : filteredRelations)
			if (param.incrementableIn(relation))
				return relation;

		// If not found, return null.
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			if (rootGoal != null)
				msgs = ((InternalEObject) rootGoal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GorePackage.GOAL_MODEL__ROOT_GOAL, null, msgs);
			return basicSetRootGoal((Goal) otherEnd, msgs);
		case GorePackage.GOAL_MODEL__ACTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActors()).basicAdd(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GorePackage.GOAL_MODEL__CONFIGURATION, null, msgs);
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return basicSetRootGoal(null, msgs);
		case GorePackage.GOAL_MODEL__ACTORS:
			return ((InternalEList<?>) getActors()).basicRemove(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case GorePackage.GOAL_MODEL__RELATIONS:
			return ((InternalEList<?>) getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return getRootGoal();
		case GorePackage.GOAL_MODEL__ACTORS:
			return getActors();
		case GorePackage.GOAL_MODEL__INTERNAL_ID:
			return getInternalId();
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			return getConfiguration();
		case GorePackage.GOAL_MODEL__RELATIONS:
			return getRelations();
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			setRootGoal((Goal) newValue);
			return;
		case GorePackage.GOAL_MODEL__ACTORS:
			getActors().clear();
			getActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case GorePackage.GOAL_MODEL__RELATIONS:
			getRelations().clear();
			getRelations().addAll((Collection<? extends DifferentialRelation>) newValue);
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			setRootGoal((Goal) null);
			return;
		case GorePackage.GOAL_MODEL__ACTORS:
			getActors().clear();
			return;
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case GorePackage.GOAL_MODEL__RELATIONS:
			getRelations().clear();
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return rootGoal != null;
		case GorePackage.GOAL_MODEL__ACTORS:
			return actors != null && !actors.isEmpty();
		case GorePackage.GOAL_MODEL__INTERNAL_ID:
			return INTERNAL_ID_EDEFAULT == null ? internalId != null : !INTERNAL_ID_EDEFAULT.equals(internalId);
		case GorePackage.GOAL_MODEL__CONFIGURATION:
			return configuration != null;
		case GorePackage.GOAL_MODEL__RELATIONS:
			return relations != null && !relations.isEmpty();
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
		result.append(" (internalId: "); //$NON-NLS-1$
		result.append(internalId);
		result.append(')');
		return result.toString();
	}

} // GoalModelImpl
