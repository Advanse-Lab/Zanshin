package it.unitn.disi.zanshin.simulation;

import java.util.Map;

import it.unitn.disi.zanshin.remote.ITargetSystem;

/**
 * A class that simulates what the target system does when it receives adaptation actions from Zanshin.
 * 
 * This class performs nothing but printing the received command in the log. Some simulations, however, have to simulate
 * the fact that the target system is waiting for Zanshin to tell it what to do. In these cases, certain commands
 * received by Zanshin should "wake up" the simulation thread that is waiting. The commands that wake up the threads
 * depend on what is simulated.
 * 
 * Therefore, this class should be extended for each different simulated system (but usually one simulated target system
 * should be able to handle all simulations related to the same system).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimulatedTargetSystem implements ITargetSystem {
	/** The logger. */
	private static final Logger log = new Logger(SimulationManager.class);

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#abort(java.lang.Long, java.lang.String) */
	@Override
	public void abort(Long sessionId, String awreqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: abort({0}) [session: {1}]", awreqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#applyConfig(java.lang.Long, java.util.Map) */
	@Override
	public void applyConfig(Long sessionId, Map<String, String> newConfig) {
		log.info("Simulated target system received EvoReq operation from Zanshin: apply-config({0}) [session: {1}]", newConfig, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#applyConfig(java.util.Map) */
	@Override
	public void applyConfig(Map<String, String> newConfig) {
		log.info("Simulated target system received EvoReq operation from Zanshin: apply-config({0}) [from now on]", newConfig); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#changeParameter(java.lang.Long, java.lang.String, java.lang.String) */
	@Override
	public void changeParameter(Long sessionId, String paramName, String value) {
		log.info("Simulated target system received EvoReq operation from Zanshin: change-parameter({0}, {1}) [session: {2}]", paramName, value, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#changeParameter(java.lang.String, java.lang.String) */
	@Override
	public void changeParameter(String paramName, String value) {
		log.info("Simulated target system received EvoReq operation from Zanshin: change-parameter({0}, {1}) [from now on]", paramName, value); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#copyData(java.lang.Long, java.lang.String, java.lang.String) */
	@Override
	public void copyData(Long sessionId, String srcReqName, String dstReqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: copy-data({0}, {1}) [session: {2}]", srcReqName, dstReqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#disable(java.lang.String) */
	@Override
	public void disable(String reqClassName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: disable({0}) [from now on]", reqClassName); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#doNothing(java.lang.Long) */
	@Override
	public void doNothing(Long sessionId) {
		log.info("Simulated target system received EvoReq operation from Zanshin: do-nothing() [session: {0}]", sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#enable(java.lang.String) */
	@Override
	public void enable(String reqClassName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: enable({0}) [from now on]", reqClassName); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#initiate(java.lang.Long, java.lang.String) */
	@Override
	public void initiate(Long sessionId, String reqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: initiate({0}) [session: {1}]", reqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#resume(java.lang.Long, java.lang.String) */
	@Override
	public void resume(Long sessionId, String reqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: resume({0}) [session: {1}]", reqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#rollback(java.lang.Long, java.lang.String) */
	@Override
	public void rollback(Long sessionId, String reqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: rollback({0}) [session: {1}]", reqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#sendWarning(java.lang.Long, java.lang.String, java.lang.String) */
	@Override
	public void sendWarning(Long sessionId, String actorName, String awreqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: send-warning({0}, {1}) [session: {2}]", actorName, awreqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#suspend(java.lang.Long, java.lang.String) */
	@Override
	public void suspend(Long sessionId, String reqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: suspend({0}) [session: {1}]", reqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#terminate(java.lang.Long, java.lang.String) */
	@Override
	public void terminate(Long sessionId, String reqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: terminate({0}) [session: {1}]", reqName, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#waitFor(java.lang.Long, java.lang.Long) */
	@Override
	public void waitFor(Long sessionId, Long timeInMillis) {
		log.info("Simulated target system received EvoReq operation from Zanshin: wait({0}) [session: {1}]", timeInMillis, sessionId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#waitForFix(java.lang.Long, java.lang.String) */
	@Override
	public void waitForFix(Long sessionId, String awreqName) {
		log.info("Simulated target system received EvoReq operation from Zanshin: wait-for-fix({0}) [session: {1}]", awreqName, sessionId); //$NON-NLS-1$
	}
}
