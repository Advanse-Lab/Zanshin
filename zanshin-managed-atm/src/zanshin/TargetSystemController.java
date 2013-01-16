package zanshin;

import it.unitn.disi.zanshin.remote.ITargetSystem;
import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.remote.ZanshinRemote;

import java.awt.Frame;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import banking.Money;

import atm.ATM;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class TargetSystemController implements ITargetSystem {
	/** TODO: document this field. */
	private static final Logger log = new Logger(TargetSystemController.class);

	/** TODO: document this field. */
	private static final String REMOTE_SERVER_ADDRESS = "127.0.0.1";

	/** TODO: document this field. */
	private static final String META_MODEL_FILE_PATH = "zanshin/atm.ecore";

	/** TODO: document this field. */
	private static final String MODEL_FILE_PATH = "zanshin/model.atm";

	/** TODO: document this field. */
	private static TargetSystemController singleton;

	/** TODO: document this field. */
	private ZanshinRemote zanshin;

	/** TODO: document this field. */
	private String targetSystemId;

	/** TODO: document this field. */
	private Long userSessionId;
	
	/** TODO: document this field. */
	private boolean defectiveATM;
	
	/** TODO: document this field. */
	private boolean inAbortState;
	
	/** TODO: document this field. */
	private Money lastAmount;
	
	/** TODO: document this field. */
	private BlockingQueue<AdaptationAction> actionQueue = new ArrayBlockingQueue<AdaptationAction>(100);
	
	/** TODO: document this field. */
	private AdaptationThread adaptationThread = new AdaptationThread(this, actionQueue);

	/** Constructor. */
	private TargetSystemController() {}

	/**
	 * TODO: document this method.
	 * 
	 * @return
	 */
	public static TargetSystemController getInstance() {
		if (singleton == null) {
			singleton = new TargetSystemController();
			singleton.init();
		}
		return singleton;
	}

	/**
	 * TODO: document this method.
	 */
	private void init() {
		log.info("Initializing the ATM Zanshin Contoller...");
		
		try {
			zanshin = new ZanshinRemote(REMOTE_SERVER_ADDRESS, IZanshinServer.RMI_PORT);
			
			// Starts the adaptaiton thread.
			adaptationThread.start();

			// Loads the requirements meta-model and model files.
			StringBuilder metaModelBuilder = ZanshinUtil.readLocalFile(META_MODEL_FILE_PATH);
			StringBuilder modelBuilder = ZanshinUtil.readLocalFile(MODEL_FILE_PATH);

			// Creates a stub for the simulated target system in order to
			// receive adaptation instructions from Zanshin.
			ITargetSystem targetSystemStub = (ITargetSystem) UnicastRemoteObject.exportObject(this, 0);

			// Sends the requirements to Zanshin in order to register itself as
			// a new target system managed by the framework.
			targetSystemId = singleton.zanshin.registerTargetSystem(targetSystemStub, metaModelBuilder.toString(), modelBuilder.toString());
		}
		catch (Exception e) {
			log.error("There was an error during the initialization of the ATM Zanshin Controller", e);
			e.printStackTrace();
		}
	}

	/** Setter for deffectiveATM. */
	public void setDefectiveATM(boolean defectiveATM) {
		log.info("From now on, the ATM will behave as: {0}", defectiveATM ? "defective" : "normal");
		this.defectiveATM = defectiveATM;
	}
	
	/** Getter for inAbortState. */
	public boolean isInAbortState() {
		return inAbortState;
	}

	/** Setter for inAbortState. */
	public void setInAbortState(boolean inAbortState) {
		this.inAbortState = inAbortState;
	}

	/** Setter for adaptationThread.atm. */
	public void setAtm(ATM atm) {
		log.info("ATM Zanshin Controller storing a reference to the ATM: {0}", atm);
		adaptationThread.setAtm(atm);
	}

	/** Setter for adaptationThread.frame. */
	public void setFrame(Frame frame) {
		log.info("ATM Zanshin Controller storing a reference to the frame: {0}", frame);
		adaptationThread.setFrame(frame);
	}
	
	/** Getter for lastAmount. */
	public Money getLastAmount() {
		return lastAmount;
	}

	/**
	 * TODO: document this method.
	 */
	public void simulateErrorIfDefective() {
		if (defectiveATM) throw new SimulatedATMDefect();
	}
	
	/**
	 * TODO: document this method.
	 */
	public void simulateNoCashError(Money amount) {
		lastAmount = amount;
		throw new NoCashException();
	}

	// -----------------------------------------------------------------------------------------------------------
	// Zanshin Server Methods
	// ======================
	//
	// Methods that allow the ATM to communicate with Zanshin.
	//
	// The controller simply delegates the methods to the instance of ZanshinRemote created during initialization,
	// which actually communicates with Zanshin via RMI.
	// -----------------------------------------------------------------------------------------------------------

	/**
	 * TODO: document this method.
	 */
	public void startSession() {
		try {
			userSessionId = zanshin.createUserSession(targetSystemId);
			log.info("ATM Zanshin Controller created a new user session: {0}", userSessionId);
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to create a new user session", e);
			e.printStackTrace();
		}
	}

	/**
	 * TODO: document this method.
	 */
	public void endSession() {
		try {
			zanshin.disposeUserSession(targetSystemId, userSessionId);
			log.info("ATM Zanshin Controller disposed the user session: {0}", userSessionId);
			userSessionId = null;
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to dispose the current user session: {0}", e, userSessionId);
			e.printStackTrace();
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param requirement
	 */
	public void logRequirementStart(AtmRequirement requirement) {
		try {
			log.info("ATM Zanshin Controller loggin a requirement start: {0}", requirement);
			zanshin.logRequirementStart(targetSystemId, userSessionId, requirement.getName());
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to log a requirement start: {0}", e, requirement);
			e.printStackTrace();
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param requirement
	 */
	public void logRequirementSuccess(AtmRequirement requirement) {
		try {
			log.info("ATM Zanshin Controller loggin a requirement success: {0}", requirement);
			zanshin.logRequirementSuccess(targetSystemId, userSessionId, requirement.getName());
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to log a requirement success: {0}", e, requirement);
			e.printStackTrace();
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param requirement
	 */
	public void logRequirementFailure(AtmRequirement requirement) {
		try {
			log.info("ATM Zanshin Controller loggin a requirement failure: {0}", requirement);
			zanshin.logRequirementFailure(targetSystemId, userSessionId, requirement.getName());
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to log a requirement failure: {0}", e, requirement);
			e.printStackTrace();
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param requirement
	 */
	public void logRequirementCancellation(AtmRequirement requirement) {
		try {
			log.info("ATM Zanshin Controller loggin a requirement cancellation: {0}", requirement);
			zanshin.logRequirementCancellation(targetSystemId, userSessionId, requirement.getName());
		}
		catch (RemoteException e) {
			log.error("There was an error while attempting to log a requirement cancellation: {0}", e, requirement);
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Target System Methods
	// ======================
	//
	// Methods that allow the Zanshin to communicate with the ATM.
	//
	// ...
	// -----------------------------------------------------------------------------------------------------------

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#abort(java.lang.Long, java.lang.String)
	 */
	@Override
	public void abort(Long sessionId, String awreqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: abort({0}) [session: {1}]", awreqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.ABORT, sessionId, awreqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#applyConfig(java.lang.Long, java.util.Map)
	 */
	@Override
	public void applyConfig(Long sessionId, Map<String, String> newConfig) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: apply-config({0}) [session: {1}]", newConfig, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.APPLY_CONFIG, sessionId, newConfig));
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#applyConfig(java.util.Map) */
	@Override
	public void applyConfig(Map<String, String> newConfig) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: apply-config({0}) [from now on]", newConfig);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.APPLY_CONFIG, newConfig));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#changeParameter(java.lang.Long, java.lang.String, java.lang.String)
	 */
	@Override
	public void changeParameter(Long sessionId, String paramName, String value) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: change-parameter({0}, {1}) [session: {2}]", paramName, value, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.CHANGE_PARAMETER, sessionId, paramName, value));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#changeParameter(java.lang.String, java.lang.String)
	 */
	@Override
	public void changeParameter(String paramName, String value) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: change-parameter({0}, {1}) [from now on]", paramName, value);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.CHANGE_PARAMETER, paramName, value));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#copyData(java.lang.Long, java.lang.String, java.lang.String)
	 */
	@Override
	public void copyData(Long sessionId, String srcReqName, String dstReqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: copy-data({0}, {1}) [session: {2}]", srcReqName, dstReqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.COPY_DATA, sessionId, srcReqName, dstReqName));
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#disable(java.lang.String) */
	@Override
	public void disable(String reqClassName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: disable({0}) [from now on]", reqClassName);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.DISABLE, reqClassName));
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#doNothing(java.lang.Long) */
	public void doNothing(Long sessionId) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: do-nothing() [session: {0}]", sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.DO_NOTHING, sessionId));
	}

	/** @see it.unitn.disi.zanshin.remote.ITargetSystem#enable(java.lang.String) */
	@Override
	public void enable(String reqClassName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: enable({0}) [from now on]", reqClassName);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.ENABLE, reqClassName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#initiate(java.lang.Long, java.lang.String)
	 */
	@Override
	public void initiate(Long sessionId, String reqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: initiate({0}) [session: {1}]", reqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.INITIATE, sessionId, reqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#resume(java.lang.Long, java.lang.String)
	 */
	@Override
	public void resume(Long sessionId, String reqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: resume({0}) [session: {1}]", reqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.RESUME, sessionId, reqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#rollback(java.lang.Long, java.lang.String)
	 */
	@Override
	public void rollback(Long sessionId, String reqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: rollback({0}) [session: {1}]", reqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.ROLLBACK, sessionId, reqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#sendWarning(java.lang.Long, java.lang.String, java.lang.String)
	 */
	@Override
	public void sendWarning(Long sessionId, String actorName, String awreqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: send-warning({0}, {1}) [session: {2}]", actorName, awreqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.SEND_WARNING, sessionId, actorName, awreqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#suspend(java.lang.Long, java.lang.String)
	 */
	@Override
	public void suspend(Long sessionId, String reqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: suspend({0}) [session: {1}]", reqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.SUSPEND, sessionId, reqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#terminate(java.lang.Long, java.lang.String)
	 */
	@Override
	public void terminate(Long sessionId, String reqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: terminate({0}) [session: {1}]", reqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.TERMINATE, sessionId, reqName));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#waitFor(java.lang.Long, java.lang.Long)
	 */
	@Override
	public void waitFor(Long sessionId, Long timeInMillis) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: wait({0}) [session: {1}]", timeInMillis, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.WAIT, sessionId, timeInMillis));
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.ITargetSystem#waitForFix(java.lang.Long, java.lang.String)
	 */
	@Override
	public void waitForFix(Long sessionId, String awreqName) {
		log.info("ATM Zanshin Controller received EvoReq operation from Zanshin: wait-for-fix({0}) [session: {1}]", awreqName, sessionId);
		enqueueAdaptationAction(new AdaptationAction(AdaptationInstruction.WAIT_FOR_FIX, sessionId, awreqName));
	}
	
	/**
	 * TODO: document this method.
	 * @param action
	 */
	private void enqueueAdaptationAction(AdaptationAction action) {
		// Tries to send the command to the thread that handles the adaptation.
		try {
			actionQueue.put(action);
		}
		catch (InterruptedException e) {
			log.error("ATM Zanshin Controller could not enqueue an adaptation action: {0}", e, action);
			e.printStackTrace();
		}
	}
}
