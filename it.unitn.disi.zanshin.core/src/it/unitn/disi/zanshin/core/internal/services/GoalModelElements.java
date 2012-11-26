package it.unitn.disi.zanshin.core.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * Helper class for the Repository Service's implementation, which parses a goal model and stores their elements in maps
 * indexed by their EMF classes. This class also contains a map that indexes EMF classes by their name, in order to
 * allow for the search of a requirement instance given their name, and a map of AwReq targets, that maps requirements
 * to AwReqs that target them.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class GoalModelElements {
	/** Goal model that owns the elements contained in this. */
	private GoalModel model;

	/** The AwReq elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, AwReq> awReqsMap = new HashMap<>();

	/** The DomainAssumption elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, DomainAssumption> domainAssumptionsMap = new HashMap<>();

	/** The Goal elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Goal> goalsMap = new HashMap<>();

	/** The QualityConstraint map, mapping the elements EMF class to its implementation. */
	private Map<EClass, QualityConstraint> qualityConstraintsMap = new HashMap<>();

	/** The Softgoal map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Softgoal> softgoalsMap = new HashMap<>();

	/** The Task map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Task> tasksMap = new HashMap<>();

	/** The EMF class map, mapping the EMF Class name to its object. */
	private Map<String, EClass> eClassMap = new HashMap<>();

	/** The targets map, mapping EMF Classes to AwReqs that target them. */
	private Map<EClass, Set<AwReq>> targetsMap = new HashMap<>();

	/** The EMF package for goal-oriented RE, from which to take the definition of classes representing requirements. */
	private GorePackage gorePackage = GorePackage.eINSTANCE;

	/** Meta-class that represents Awareness Requirements. */
	private EClass eAwReq = gorePackage.getAwReq();

	/** Meta-class that represents domain assumptions. */
	private EClass eDomainAssumption = gorePackage.getDomainAssumption();

	/** Meta-class that represents (hard) goals. */
	private EClass eGoal = gorePackage.getGoal();

	/** Meta-class that represents quality constraints. */
	private EClass eQualityConstraint = gorePackage.getQualityConstraint();

	/** Meta-class that represents softgoals. */
	private EClass eSoftgoal = gorePackage.getSoftgoal();

	/** Meta-class that represents tasks. */
	private EClass eTask = gorePackage.getTask();

	/** Constructor. */
	protected GoalModelElements(GoalModel model) {
		this.model = model;
		buildCollections();
	}

	/**
	 * Builds the collections of elements of the model.
	 */
	private void buildCollections() {
		// Uses a visitor to go through every element in the tree and store them in the collections, starting from the root.
		RequirementTreeVisitor visitor = new RequirementTreeVisitor(model.getRootGoal()) {
			@Override
			protected void visit(Requirement req) {
				checkTypeAndStore(req);
			}
		};

		// Parses the tree with the visitor.
		visitor.parse();
	}

	/**
	 * Checks the type of requirement and store it in the appropriate map.
	 * 
	 * @param req
	 *          The requirement to store.
	 */
	private final void checkTypeAndStore(Requirement req) {
		// Checks the element's type and stores it in the appropriate map.
		if (eAwReq.isInstance(req))
			store((AwReq) req, awReqsMap);
		else if (eDomainAssumption.isInstance(req))
			store((DomainAssumption) req, domainAssumptionsMap);
		else if (eGoal.isInstance(req))
			store((Goal) req, goalsMap);
		else if (eQualityConstraint.isInstance(req))
			store((QualityConstraint) req, qualityConstraintsMap);
		else if (eSoftgoal.isInstance(req))
			store((Softgoal) req, softgoalsMap);
		else if (eTask.isInstance(req))
			store((Task) req, tasksMap);
	}

	/**
	 * Generic method to store a requirement in its appropriate requirement map. This method assumes the map has already
	 * been instantiated and, therefore, is only a shortcut to make the buildCollections() method less verbose.
	 * 
	 * Also, if the requirement is an AwReq, adds its target to thet target map.
	 * 
	 * @param eClass
	 *          The EMF class of the requirement that serves as key for the requirements map.
	 * @param req
	 *          The requirement instance.
	 * @param reqsMap
	 *          The requirements map.
	 */
	private <R extends Requirement> void store(R req, Map<EClass, R> reqsMap) {
		EClass eClass = req.eClass();
		reqsMap.put(eClass, req);
		eClassMap.put(eClass.getName(), eClass);

		// If the requirement is an AwReq, adds its targets to the target map.
		if (req instanceof AwReq) {
			AwReq awreq = (AwReq) req;
			DefinableRequirement target = awreq.getTarget();
			if (target != null)
				addToTargetMap(target, awreq);
			for (DefinableRequirement otherTarget : awreq.getOtherTargets())
				addToTargetMap(otherTarget, awreq);
		}
	}

	/**
	 * Adds the given AwReq to the targets map, checking if the EMF class of the target is already on the map. If it is,
	 * adds to the existing set of AwReqs, otherwise it creates a new set for that EMF class.
	 * 
	 * @param target
	 *          The target of the AwReq.
	 * @param awreq
	 *          The AwReq to be added to the targets map.
	 */
	private void addToTargetMap(DefinableRequirement target, AwReq awreq) {
		// Always creates a new AwReq set, even when one already exists, to deal with replacements.
		Set<AwReq> awreqs = new HashSet<>();

		// If there's already an AwReq set for this target in the map, add the AwReqs to the new set.
		EClass reqClass = target.eClass();
		if (targetsMap.containsKey(reqClass))
			for (AwReq mappedAwReq : awreqs)
				// Does not add AwReqs of the same EMF class as the new one in order to replace it.
				if (!mappedAwReq.eClass().equals(awreq.eClass()))
					awreqs.add(mappedAwReq);

		// Finally, adds the new AwReq to the set and places the set in the targets map.
		awreqs.add(awreq);
		targetsMap.put(reqClass, awreqs);
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its EMF class.
	 * 
	 * @param eClass
	 *          The EMF class of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	public Requirement retrieveRequirementInstance(EClass eClass) {
		// Creates a list with the IDs of all EMF classes implemented by this requirement class, including its own.
		EList<EClass> superTypes = eClass.getEAllSuperTypes();
		Set<Integer> superTypeIds = new HashSet<>();
		for (EClass superType : superTypes)
			superTypeIds.add(superType.getClassifierID());

		// FIXME: Why did I do this?
		// superTypeIds.add(eClass.getClassifierID());

		// Searches the appropriate requirement map, depending on the EMF class.
		if (superTypeIds.contains(GorePackage.AW_REQ))
			return awReqsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.DOMAIN_ASSUMPTION))
			return domainAssumptionsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.GOAL))
			return goalsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.QUALITY_CONSTRAINT))
			return qualityConstraintsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.SOFTGOAL))
			return softgoalsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.TASK))
			return tasksMap.get(eClass);

		// If not found (or unrecognized type), returns null.
		return null;
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its EMF class's name.
	 * 
	 * @param eClassName
	 *          The name of the EMF class of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	public Requirement retrieveRequirementInstance(String eClassName) {
		// Searches for the interface that represents this requirement by its name.
		EClass eClass = eClassMap.get(eClassName);

		// If not null, search for the instance using the requirement's interface.
		return (eClass == null) ? null : (Requirement) retrieveRequirementInstance(eClass);
	}

	/**
	 * Replaces an instance of a requirement with a new instance, not only in the goal model itself but also in any
	 * collections in which these instances might appear.
	 * 
	 * @param oldReq
	 *          The requirement to be replaced.
	 * @param newReq
	 *          The new requirement.
	 */
	public void replaceRequirement(Requirement oldReq, Requirement newReq) {
		// Replaces the requirement.
		oldReq.replaceWith(newReq);

		// Uses a visitor to replace the requirement and all its descendants as AwReq targets and in their respective maps.
		RequirementTreeVisitor visitor = new RequirementTreeVisitor(newReq) {
			@Override
			protected void visit(Requirement req) {
				EClass reqClass = req.eClass();

				// Replaces the old requirement in the respective map.
				checkTypeAndStore(req);

				// Checks if the requirement is target of any AwReq.
				if (targetsMap.containsKey(reqClass)) {
					// Goes through all AwReqs that target the requirement.
					for (AwReq awreq : targetsMap.get(reqClass)) {
						// If it's the primary target, replace it.
						if (reqClass.equals(awreq.getTarget().eClass()))
							awreq.setTarget((DefinableRequirement) req);

						// If it's one of the other targets, replace it.
						DefinableRequirement oldTarget = null;
						EList<DefinableRequirement> otherTargets = awreq.getOtherTargets();
						for (DefinableRequirement target : otherTargets)
							if (reqClass.equals(target.eClass()))
								oldTarget = target;
						if (oldTarget != null) {
							otherTargets.remove(oldTarget);
							otherTargets.add((DefinableRequirement) req);
						}
					}
				}
			}
		};
		visitor.parse();
	}

	/**
	 * Given the meta-class that represents a requirement, returns the set of Awareness Requirements that have this class
	 * as one of their targets.
	 * 
	 * @param eClass
	 *          The meta-class that represents a requirement from the model.
	 * @return A set containing none, one or more AwReqs that have this requirement as target.
	 */
	public Set<AwReq> retrieveSourceAwReqs(EClass eClass) {
		return targetsMap.get(eClass);
	}
}
