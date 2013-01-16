package it.unitn.disi.zanshin.simulation.cases.znn;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;

import java.io.IOException;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractZnnSimulation extends AbstractSimulation {
	/** The logger. */
	private static final Logger log = new Logger(AbstractZnnSimulation.class);

	/** TODO: document this field. */
	protected static final String BASE_PATH = AbstractZnnSimulation.class.getPackage().getName().replace('.', '/') + '/';

	/** TODO: document this field. */
	protected static final String META_MODEL_FILE_PATH = BASE_PATH + "znn.ecore"; //$NON-NLS-1$

	/** TODO: document this field. */
	protected static final String MODEL_FILE_PATH = BASE_PATH + "model.znn"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static final String S_COST_EFFICIENCY = "S_CostEfficiency"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static final String S_HI_FI = "S_HiFi"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static final String S_HIGH_PERFORMANCE = "S_HighPerformance"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static Object lock = new Object();

	/** The target system ID assigned by Zanshin. */
	protected String targetSystemId;

	/** TODO: document this field. */
	protected Long sessionId;

	/**
	 * TODO: document this method.
	 * 
	 * @throws IOException
	 */
	protected void registerTargetSystem() throws IOException {
		// Registers the A-CAD as target system in Zanshin, if not already registered.
		log.info("Registering ZNN.com as a target system in Zanshin..."); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new ZnnSimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
	@Override
	public Object getLock() {
		return lock;
	}
}
