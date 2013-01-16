package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.AwReq;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * Interface that defines the Adaptation Service. This service is called when an Awareness Requirement changes its state
 * and is responsible for adapting the target system to the possible failure represented by the state change.
 * 
 * A change of state in an AwReq can represent a new failure (usually when the state changes to Failed and the framework
 * did not know about the problem), an existing failure (usually when the state changes to Failed and the framework is
 * already working on a solution for this failure) or a solution to the problem (usually when the state changes to
 * Success, which indicates that the problem has been solved).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IAdaptationService {
	/**
	 * Returns the map of active sessions related to AwReq failures.
	 * 
	 * @return The map of active sessions.
	 */
	Map<EClass, AdaptationSession> getActiveSessions();

	/**
	 * Method called by the monitoring service, indicating the given AwReq instance has changed its state.
	 * 
	 * @param awreq
	 *          The AwReq instance that changed state.
	 */
	void processStateChange(AwReq awreq);
}
