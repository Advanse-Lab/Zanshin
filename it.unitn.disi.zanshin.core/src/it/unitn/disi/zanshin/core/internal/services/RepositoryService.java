package it.unitn.disi.zanshin.core.internal.services;

import it.unitn.disi.zanshin.core.CoreUtils;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

/**
 * Implementation of the Repository Service that uses maps to index goal models by their IDs and a set of maps to index
 * goal model elements by their EMF class, allowing for efficient retrieval of goal models and its elements.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class RepositoryService implements IRepositoryService {
	/** A repository that maps model IDs to models. */
	private Map<Long, GoalModel> repository = new HashMap<Long, GoalModel>();

	/** A repository that maps model IDs to model elements. */
	private Map<Long, GoalModelElements> elementsRepository = new HashMap<Long, GoalModelElements>();

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#storeGoalModel(it.unitn.disi.zanshin.model.gore.GoalModel) */
	@Override
	public void storeGoalModel(GoalModel model) {
		// Stores the model in the repository.
		Long id = model.getId();
		repository.put(id, model);

		// Creates an element mapping object and stores it in the elements repository.
		GoalModelElements elements = new GoalModelElements(model);
		elementsRepository.put(id, elements);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#disposeGoalModel(java.lang.Long) */
	@Override
	public void disposeGoalModel(Long id) {
		// If the model is in the repository, remove it.
		if (repository.containsKey(id))
			repository.remove(id);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveGoalModel(java.lang.String) */
	@Override
	public GoalModel retrieveGoalModel(Long id) {
		// Retrieves the model from the repository, if it is there.
		return repository.get(id);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveRequirement(java.lang.Long,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public Requirement retrieveRequirement(Long modelId, EClass eClass) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);

		// Retrieve the element from the model.
		return (elements == null) ? null : elements.retrieveRequirementInstance(eClass);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveRequirement(java.lang.Long, java.lang.String) */
	@Override
	public Requirement retrieveRequirement(Long modelId, String eClassName) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);

		// Retrieve the element from the model.
		return (elements == null) ? null : elements.retrieveRequirementInstance(eClassName);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IRepositoryService#replaceRequirement(java.lang.Long,
	 *      it.unitn.disi.zanshin.model.gore.Requirement, it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public void replaceRequirement(Long modelId, Requirement oldRequirement, Requirement newRequirement) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);

		// Checks if the requirement instances are the same. Produce a warning if they aren't.
		EClass reqClass = oldRequirement.eClass();
		Requirement modelReq = elements.retrieveRequirementInstance(reqClass);
		if (!oldRequirement.equals(modelReq))
			CoreUtils.log.warn("Requirement to be replaced is not the same object as the requirement from the same class in the model. Proceeding with replacement anyways...", reqClass); //$NON-NLS-1$

		// Delegates the replacement to the elements mapping object.
		elements.replaceRequirement(modelReq, newRequirement);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveSourceAwReqs(java.lang.Long,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public Set<AwReq> retrieveSourceAwReqs(Long modelId, EClass eClass) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);

		// Returns all the AwReqs that point to the given requirement.
		return elements.retrieveSourceAwReqs(eClass);
	}
}
