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

	/** A simulation part that triggers a failure of AR1. */
	private final SimulationPart ar1FailurePart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return true;
		}

		@Override
		public void run() throws Exception {
			// Creates a user session, as if someone were requesting news from ZNN.com.
			sessionId = zanshin.createUserSession(targetSystemId);
			log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

			// Simulating a failure of AR1.
			zanshin.logRequirementStart(targetSystemId, sessionId, S_COST_EFFICIENCY);
			zanshin.logRequirementFailure(targetSystemId, sessionId, S_COST_EFFICIENCY);

			// Ends the user session (request fulfilled).
			zanshin.disposeUserSession(targetSystemId, sessionId);
		}
	};

	/** A simulation part that triggers a failure of AR2. */
	private final SimulationPart ar2FailurePart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return true;
		}

		@Override
		public void run() throws Exception {
			// Creates a user session, as if someone were requesting news from ZNN.com.
			sessionId = zanshin.createUserSession(targetSystemId);
			log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

			// Simulating a failure of AR2.
			zanshin.logRequirementStart(targetSystemId, sessionId, S_HI_FI);
			zanshin.logRequirementFailure(targetSystemId, sessionId, S_HI_FI);

			// Ends the user session (request fulfilled).
			zanshin.disposeUserSession(targetSystemId, sessionId);
		}
	};

	/** A simulation part that triggers a failure of AR3. */
	private final SimulationPart ar3FailurePart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return true;
		}

		@Override
		public void run() throws Exception {
			// Creates a user session, as if someone were requesting news from ZNN.com.
			sessionId = zanshin.createUserSession(targetSystemId);
			log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

			// Simulating a failure of AR3.
			zanshin.logRequirementStart(targetSystemId, sessionId, S_HIGH_PERFORMANCE);
			zanshin.logRequirementFailure(targetSystemId, sessionId, S_HIGH_PERFORMANCE);

			// Ends the user session (request fulfilled).
			zanshin.disposeUserSession(targetSystemId, sessionId);
		}
	};

	/** A simulation part for waiting. */
	private final SimulationPart waitOneSecondPart = new SimulationPart() {
		@Override
		public boolean shouldWait() {
			return false;
		}

		@Override
		public void run() throws Exception {
			log.info("Waiting for a second..."); //$NON-NLS-1$
			Thread.sleep(1000);
		}
	};

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	protected void doInit() throws Exception {
		// Registers ZNN.com as target system in Zanshin.
		registerTargetSystem();

		// Due to a peak of requests, AR3 fails. ZNN.com should add a new server.
		parts.add(ar3FailurePart);

		// For the next 1000ms, further failures will be ignored.
		parts.add(ar3FailurePart);
		parts.add(ar3FailurePart);
		parts.add(waitOneSecondPart);
		
		// Failures of AR1 and AR2 during AR3's adaptation session should generate aborts.
		parts.add(ar1FailurePart);
		parts.add(ar2FailurePart);		

		// If AR3 keeps failing after the waiting time, ZNN.com should switch to text-only mode.
		parts.add(ar3FailurePart);

		// For the next 3000ms, further failures will be ignored.
		parts.add(ar3FailurePart);
		parts.add(ar3FailurePart);
		parts.add(ar3FailurePart);
		parts.add(waitOneSecondPart);
		parts.add(waitOneSecondPart);
		parts.add(waitOneSecondPart);

		// Simulates the satisfaction of AR3 (end of peak of requests) and waits 1s just for syncronization purposes.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}

			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were requesting news from ZNN.com.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulating the success of AR3.
				log.info("End of the peak of requests..."); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, S_HIGH_PERFORMANCE);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, S_HIGH_PERFORMANCE);

				// Ends the user session (request fulfilled).
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
		parts.add(waitOneSecondPart);
		
		// Now that the peak of requests has ended, AR1 and AR2 fail, bringing ZNN.com back to normal.
		parts.add(ar1FailurePart);
		parts.add(ar2FailurePart);		
		
		// Simulates the satisfaction of AR1 and AR2, to conclude.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}

			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were requesting news from ZNN.com.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulating the success of AR1 and AR2.
				log.info("ZNN.com is back to normal!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, S_COST_EFFICIENCY);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, S_COST_EFFICIENCY);
				zanshin.logRequirementStart(targetSystemId, sessionId, S_HI_FI);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, S_HI_FI);

				// Ends the user session (request fulfilled).
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
	}
}
