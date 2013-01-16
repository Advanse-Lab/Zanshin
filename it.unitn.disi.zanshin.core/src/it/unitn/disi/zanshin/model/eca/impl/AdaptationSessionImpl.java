/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Adaptation Session</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl#getEvents <em>Events</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl#isActive <em>Active</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AdaptationSessionImpl extends EObjectImpl implements AdaptationSession {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getEventsWithUsefulStrategies() <em>Events With Useful Strategies</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEventsWithUsefulStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> eventsWithUsefulStrategies;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdaptationSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.ADAPTATION_SESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentWithInverseEList<Event>(Event.class, this, EcaPackage.ADAPTATION_SESSION__EVENTS, EcaPackage.EVENT__SESSION);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Event> getEventsWithUsefulStrategies() {
		if (eventsWithUsefulStrategies == null) {
			eventsWithUsefulStrategies = new EObjectResolvingEList<Event>(Event.class, this, EcaPackage.ADAPTATION_SESSION__EVENTS_WITH_USEFUL_STRATEGIES);
		}
		return eventsWithUsefulStrategies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_SESSION__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_SESSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Event addEvent(EcaAwReq awreq) {
		// Creates a new event with the current date/time, associated with the given AwReq, and adds it to the timeline.
		it.unitn.disi.zanshin.model.eca.Event event = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createEvent();
		event.setTime(new java.util.Date(System.currentTimeMillis()));
		event.setAwReq(awreq);
		getEvents().add(event);

		// If this is the first event of the session, produce its id.
		if (getEvents().size() == 1) {
			StringBuilder builder = new StringBuilder();
			java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); //$NON-NLS-1$
			builder.append("(Session: ").append(awreq.eClass().getName()); //$NON-NLS-1$
			builder.append(" / ").append(dateFormat.format(event.getTime())).append(")"); //$NON-NLS-1$ //$NON-NLS-2$
			setId(builder.toString());
		}

		return event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void terminate() {
		setActive(false);
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEvents()).basicAdd(otherEnd, msgs);
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			return getEvents();
		case EcaPackage.ADAPTATION_SESSION__EVENTS_WITH_USEFUL_STRATEGIES:
			return getEventsWithUsefulStrategies();
		case EcaPackage.ADAPTATION_SESSION__ACTIVE:
			return isActive();
		case EcaPackage.ADAPTATION_SESSION__ID:
			return getId();
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case EcaPackage.ADAPTATION_SESSION__EVENTS_WITH_USEFUL_STRATEGIES:
			getEventsWithUsefulStrategies().clear();
			getEventsWithUsefulStrategies().addAll((Collection<? extends Event>) newValue);
			return;
		case EcaPackage.ADAPTATION_SESSION__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case EcaPackage.ADAPTATION_SESSION__ID:
			setId((String) newValue);
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			getEvents().clear();
			return;
		case EcaPackage.ADAPTATION_SESSION__EVENTS_WITH_USEFUL_STRATEGIES:
			getEventsWithUsefulStrategies().clear();
			return;
		case EcaPackage.ADAPTATION_SESSION__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case EcaPackage.ADAPTATION_SESSION__ID:
			setId(ID_EDEFAULT);
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
		case EcaPackage.ADAPTATION_SESSION__EVENTS:
			return events != null && !events.isEmpty();
		case EcaPackage.ADAPTATION_SESSION__EVENTS_WITH_USEFUL_STRATEGIES:
			return eventsWithUsefulStrategies != null && !eventsWithUsefulStrategies.isEmpty();
		case EcaPackage.ADAPTATION_SESSION__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case EcaPackage.ADAPTATION_SESSION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (active: "); //$NON-NLS-1$
		result.append(active);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // AdaptationSessionImpl
