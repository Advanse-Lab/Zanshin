package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.ecore.EClass;

/**
 * Interface that defines the Target System Controller Service. This service is called during the execution of
 * adaptation strategies to instruct the target system on how to adapt to AwReq failures.
 * 
 * Implementations of this service should have some way of communicating with the target system and applying the
 * appropriate application-specific actions to adapt.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ITargetSystemControllerService {
	/**
	 * The target system should "fail gracefully", which could range from just showing an error message to shutting the
	 * entire system down, depending on the system and the AwReq that failed.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param awreq
	 *          The failing AwReq instance.
	 */
	void abort(GoalModel model, AwReq awreq);

	/**
	 * The target system should change from its current configuration to the specified configuration. The specified level
	 * indicates if the change should occur at the class level (for future executions) and/or at the instance level (for
	 * the current execution).
	 * 
	 * @param model
	 *          The goal model to which the new configuration should be applied.
	 * @param newConfig
	 *          The new configuration to be applied.
	 * @param level
	 *          The aggregation level to use when applying the new configuration (instance-only, class-only or both).
	 */
	void applyConfig(GoalModel model, Configuration newConfig, AggregationLevel level);

	/**
	 * The target system should change the specified parameter to the specified value for the specified requirement
	 * instance currently being executed.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param param
	 *          The parameter to be changed.
	 * @param value
	 *          The new value of the parameter.
	 */
	void changeParameter(GoalModel model, Parameter param, String value);

	/**
	 * The target system should change the specified parameter to the specified value for all future executions of the
	 * specified requirement.
	 * 
	 * @param param
	 *          The parameter to be changed.
	 * @param value
	 *          The new value of the parameter.
	 */
	void changeParameter(Parameter param, String value);

	/**
	 * The target system should copy the data associated with the source performative requirement instance (e.g., data
	 * provided by the user) to the destination requirements instance.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param srcReq
	 *          The source requirement instance.
	 * @param dstReq
	 *          The destination requirement instance.
	 */
	void copyData(GoalModel model, PerformativeRequirement srcReq, PerformativeRequirement dstReq);

	/**
	 * From now on, the target system should stop trying to satisfy the specified requirement. If it is an AwReq, the
	 * adaptation framework should stop evaluating it. To do this at the instance level, use suspend().
	 * 
	 * @param reqClass
	 *          The requirement class to disable.
	 */
	void disable(EClass reqClass);

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 */
	void doNothing(GoalModel model);

	/**
	 * From now on, the target system should resume trying to satisfy the specified requirement. If it is an AwReq, the
	 * adaptation framework should resume evaluating it. To do this at the instance level, use resume().
	 * 
	 * @param reqClass
	 *          The requirement class to enable.
	 */
	void enable(EClass reqClass);

	/**
	 * The target system should initialize the components related to the specified requirements instance and start
	 * pursuing its satisfaction. If the specified requirement is an AwReq instance, the adaptation frameowrk should
	 * immediately evaluate it.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param req
	 *          The requirement instance to initiate.
	 */
	void initiate(GoalModel model, Requirement req);

	/**
	 * If the specified requirement instance has been previously suspended, the target system should resume pursuing the
	 * its satisfaction.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param req
	 *          The requirement instance to be resumed.
	 * @param parent
	 *          The former parent of the requirement instance to be resumed.
	 */
	void resume(GoalModel model, Requirement req, Requirement parent);

	/**
	 * The target system should undo any partial changes that might have been effected while the satisfaction of the
	 * specified performative requirement instance was being pursued and which would leave the system in an inconsistent
	 * state.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param req
	 *          The requirement instance that should be rolled back.
	 */
	void rollback(GoalModel model, PerformativeRequirement req);

	/**
	 * The target system should warn the specified actor about the failure of the specified AwReq instance.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param actor
	 *          The actor (human or system) to be warned.
	 * @param awreq
	 *          The AwReq instance that failed.
	 */
	void sendWarning(GoalModel model, Actor actor, AwReq awreq);

	/**
	 * The target system should stop pursuing the satisfaction of the specified requirement instance until further notice.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param req
	 *          The requirement instance to suspend.
	 */
	void suspend(GoalModel model, Requirement req);

	/**
	 * The target system should terminate any component related to the specified requirement instance and stop pursuing
	 * its satisfaction. If the specified requirement is an AwReq instance, the adaptation framework should no longer
	 * consider its evaluation.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param req
	 *          The requirement instance to terminate.
	 */
	void terminate(GoalModel model, Requirement req);

	/**
	 * The adaptation framework should wait for the specified amount of time before continuing with the next instruction.
	 * The target system is also informed of the wait in case changes in the user interface are in order during the
	 * waiting time.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param timeInMillis
	 *          Time to wait, in milliseconds.
	 */
	void waitFor(GoalModel model, long timeInMillis);

	/**
	 * The target system should wait for a certain condition that indicates that the problem causing the failure of the
	 * AwReq has been fixed.
	 * 
	 * @param model
	 *          The goal model that represents the user session in which adaptation is taking place.
	 * @param awreq
	 *          The AwReq instance that failed.
	 */
	void waitForFix(GoalModel model, AwReq awreq);
}
