package it.unitn.disi.zanshin.simulation.cases.znn;

import java.util.Map;

import it.unitn.disi.zanshin.simulation.SimulatedTargetSystem;

/**
 * A simulated target system for the ZNN.com simulation cases.
 * 
 * Simulated target systems receive the adaptation actions from Zanshin and, for certain commands, "wake up" the
 * simulation thread that is waiting for Zanshin to respond. The commands that wake up the threads depend on what is
 * simulated.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZnnSimulatedTargetSystem extends SimulatedTargetSystem {
	/** The object in which the simulation thread is sleeping, and therefore used to "wake it up". */
	private Object lock;

	/** Constructor. */
	public ZnnSimulatedTargetSystem(Object lock) {
		this.lock = lock;
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#abort(java.lang.Long, java.lang.String) */
	@Override
	public void abort(Long sessionId, String awreqName) {
		super.abort(sessionId, awreqName);

		// AR1 and AR2 are aborted during AR3's session, therefore would expect to receive an abort() command.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#applyConfig(java.util.Map) */
	@Override
	public void applyConfig(Map<String, String> newConfig) {
		super.applyConfig(newConfig);

		// AR1 and AR3 use reconfiguration, therefore would expect to receive an apply-config() command.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#changeParameter(java.lang.String, java.lang.String) */
	@Override
	public void changeParameter(String paramName, String value) {
		super.changeParameter(paramName, value);

		// AR2 and AR3 use ChangeParameter strategy, therefore would expect to receive an change-param() command.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#doNothing(java.lang.Long) */
	@Override
	public void doNothing(Long sessionId) {
		super.doNothing(sessionId);
		
		// AR3 uses DoNothing strategy, therefore would expect to receive an do-nothing() command.
		synchronized (lock) {
			lock.notifyAll();
		}
	}
}
