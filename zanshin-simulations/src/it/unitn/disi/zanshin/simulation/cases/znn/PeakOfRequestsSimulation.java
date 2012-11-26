package it.unitn.disi.zanshin.simulation.cases.znn;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class PeakOfRequestsSimulation extends AbstractZnnSimulation {
	/** The logger. */
	private static final Logger log = new Logger(PeakOfRequestsSimulation.class);

	/**
	 * The maximum number of servers, so we repeat the peak of requests simulation. Should be the same as the upperBound
	 * parameter of the differential relations of CV_NoS.
	 */
	private static final int MAX_SERVERS = 3;

	/** A simulation part that is repeated to increase the number of servers to the maximum. */
	private final SimulationPart peakPart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return true;
		}

		@Override
		public void run() throws Exception {
			// Creates a user session, as if someone were requesting news from ZNN.com.
			sessionId = zanshin.createUserSession(targetSystemId);
			log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

			// Simulating a peak of requests that makes AR2 fail.
			zanshin.logRequirementStart(targetSystemId, sessionId, Q_RESP_TIME_UNDER_MAX);
			zanshin.logRequirementFailure(targetSystemId, sessionId, Q_RESP_TIME_UNDER_MAX);
			
			// Ends the user session (request fulfilled).
			zanshin.disposeUserSession(targetSystemId, sessionId);
		}
	};
	
	/** A simulation part that is repeated to decrease the number of servers to the minimum. */
	private final SimulationPart offPeakPart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return true;
		}

		@Override
		public void run() throws Exception {
			// Creates a user session, as if someone were requesting news from ZNN.com.
			sessionId = zanshin.createUserSession(targetSystemId);
			log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

			// Simulating a peak of requests that makes AR1 fail.
			zanshin.logRequirementStart(targetSystemId, sessionId, Q_SINGLE_SERVER);
			zanshin.logRequirementFailure(targetSystemId, sessionId, Q_SINGLE_SERVER);
			
			// Ends the user session (request fulfilled).
			zanshin.disposeUserSession(targetSystemId, sessionId);
		}
	};

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	protected void doInit() throws Exception {
		// Registers ZNN.com as target system in Zanshin.
		registerTargetSystem();

		// Adds the parts that simulate the peak of requests, to increase the number of servers and change the fidelity.
		for (int i = 0; i < MAX_SERVERS; i++)
			parts.add(peakPart);
		
		// Adds the part that simulate the text-only version not being necessary anymore, switching back to multimedia.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return true;
			}
			
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were requesting news from ZNN.com.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulating a peak of requests that makes AR1 fail.
				zanshin.logRequirementStart(targetSystemId, sessionId, Q_MULTIMEDIA);
				zanshin.logRequirementFailure(targetSystemId, sessionId, Q_MULTIMEDIA);
				
				// Ends the user session (request fulfilled).
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
		
		// Adds the parts that simulate the number of requests diminishing, to decrease the number of servers.
		for (int i = 1; i < MAX_SERVERS; i++)
			parts.add(offPeakPart);
	}
}
