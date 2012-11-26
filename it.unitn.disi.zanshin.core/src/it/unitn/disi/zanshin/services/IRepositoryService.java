package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;

/**
 * Interface that defines the Repository Service. This service is responsible for storing requirements models that are
 * being handled by the other services of the platform and is called by these services when needed.
 * 
 * The requirements repository should provide ways to store, retrieve and dispose a model, to retrieve a particular
 * instance of a requirement in a model, given the requirement's EMF Class or name, and to replace one requirement
 * instance with another.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IRepositoryService {
	/**
	 * Stores a goal model in the repository.
	 * 
	 * @param model
	 *          The goal model instance to be stored.
	 */
	void storeGoalModel(GoalModel model);

	/**
	 * Disposes a goal model, given its ID, removing it from the repository.
	 * 
	 * @param id
	 *          The ID of the goal model instance to be disposed.
	 */
	void disposeGoalModel(Long id);

	/**
	 * Retrieves a goal mode instance from the repository, given its ID.
	 * 
	 * @param id
	 *          The ID of the goal model to be retrieved.
	 * @return The goal model instance that corresponds to the given ID, or null if no goal model with the given ID was
	 *         found.
	 */
	GoalModel retrieveGoalModel(Long id);

	/**
	 * Retrieves a particular requirement instance from the repository, given the goal model's ID and the requirement's
	 * EMF class.
	 * 
	 * @param modelId
	 *          The ID of the goal model in which the requirement instance should be searched.
	 * @param eClass
	 *          The EMF class of the requirement that should be retrieved.
	 * @return The instance of the specified requirement from the goal model that corresponds to the given ID. The method
	 *         returns null if there is no goal model with the given ID or if the corresponding goal model does not
	 *         contain an instance of the specified requirement.
	 */
	Requirement retrieveRequirement(Long modelId, EClass eClass);

	/**
	 * Retrieves a particular requirement instance from the repository, given the goal model's ID and the requirement's
	 * EMF class.
	 * 
	 * @param modelId
	 *          The ID of the goal model in which the requirement instance should be searched.
	 * @param eClassName
	 *          The name of the EMF class of the requirement that should be retrieved.
	 * @return The instance of the specified requirement from the goal model that corresponds to the given ID. The method
	 *         returns null if there is no goal model with the given ID or if the corresponding goal model does not
	 *         contain an instance of the specified requirement.
	 */
	Requirement retrieveRequirement(Long modelId, String eClassName);

	/**
	 * Replaces an instance of a requirement in the model with a new instance.
	 * 
	 * @param modelId
	 *          The id of the model where the replacement should take place.
	 * @param oldRequirement
	 *          The requirement to be replaced.
	 * @param newRequirement
	 *          The new requirement that should be included in the model.
	 */
	void replaceRequirement(Long modelId, Requirement oldRequirement, Requirement newRequirement);

	/**
	 * TODO: document this method.
	 * 
	 * @param modelId
	 * @param eClass
	 * @return
	 */
	Set<AwReq> retrieveSourceAwReqs(Long modelId, EClass eClass);
}
