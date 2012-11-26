package it.unitn.disi.zanshin.controller.internal.service;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import it.unitn.disi.zanshin.controller.ControllerUtils;
import it.unitn.disi.zanshin.controller.internal.server.ZanshinRMIServer;
import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.remote.ITargetSystem;
import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import org.eclipse.emf.ecore.EClass;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class RMITargetSystemControllerService implements ITargetSystemControllerService {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The Zanshin server. */
	private ZanshinRMIServer zanshinServer;

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
		ControllerUtils.log.info("Repository Service injected in the RMI Target System Controller Service"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = null;
		ControllerUtils.log.info("Repository Service disposed from the RMI Target System Controller Service"); //$NON-NLS-1$
	}

	/** Setter for zanshinServer. */
	public void setZanshinServer(IZanshinServer zanshinServer) {
		if (zanshinServer instanceof ZanshinRMIServer) {
			this.zanshinServer = (ZanshinRMIServer) zanshinServer;
			ControllerUtils.log.info("Zanshin Server injected in the RMI Target System Controller Service"); //$NON-NLS-1$
		}
		else ControllerUtils.log.warn("A Zanshin Server was injected in the RMI Target System Controller Service, but it was not an RMI Server: ", zanshinServer); //$NON-NLS-1$
	}

	/** Un-setter for zanshinServer (required by OSGi Declarative Services). */
	public void unsetZanshinServer(IZanshinServer zanshinServer) {
		this.zanshinServer = null;
		ControllerUtils.log.info("Zanshin Server disposed from the RMI Target System Controller Service"); //$NON-NLS-1$
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param awreq
	 * @return
	 */
	private ITargetSystem retrieveTargetSystem(EClass eClass) {
		// Finds the name of the package that contains the requirement.
		String pkgName = eClass.getEPackage().getName();

		// Retrieves the target system reference from the server using the package name.
		return zanshinServer.retrieveTargetSystem(pkgName);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(GoalModel model, AwReq awreq) {
		String awreqName = awreq.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: abort(i{0})", awreqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.abort(sessionId, awreqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#applyConfig(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.Configuration, it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(GoalModel model, Configuration newConfig, AggregationLevel level) {
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: apply-config({0}, {1}, {2})", model.eClass().getName(), newConfig, level); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Creates a map to associate parameter names with their values.
		Map<String, String> configMap = new HashMap<>();
		for (Parameter param : newConfig.getParameters()) {
			configMap.put(param.eClass().getName(), param.getValue());
		}
		
		try {
			// Updates the model at the appropriate level so future executions will be based on the new value.
			String targetSystemId = model.eClass().getEPackage().getName();
			zanshinServer.updateModel(targetSystemId, sessionId, newConfig, level);
		}
		catch (Exception e) {
			ControllerUtils.log.error("Error updating the model with the new configuration: {0}.", e, configMap); //$NON-NLS-1$
		}

		// Sends the instruction to the target system.
		try {
			switch (level) {
			case INSTANCE:
				targetSystem.applyConfig(sessionId, configMap);
				break;
			case CLASS:
				targetSystem.applyConfig(configMap);
				break;
			case BOTH:
				targetSystem.applyConfig(sessionId, configMap);
				targetSystem.applyConfig(configMap);
				break;
			}
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Requirement, it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String) */
	@Override
	public void changeParameter(GoalModel model, Parameter param, String value) {
		String paramName = param.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: change-parameter({0}, {1})", paramName, value); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.changeParameter(sessionId, paramName, value);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String) */
	@Override
	public void changeParameter(Parameter param, String value) {
		String paramName = param.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: change-parameter({0}, {1})", paramName, value); //$NON-NLS-1$

		// Retrieves a reference to the target system responsible for this requirement instance.
		ITargetSystem targetSystem = retrieveTargetSystem(param.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.changeParameter(paramName, value);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#copyData(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.PerformativeRequirement, it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public final void copyData(GoalModel model, PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		String srcReqName = srcReq.eClass().getName();
		String dstReqName = dstReq.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: copy-data(i{0}, i{1})", srcReqName, dstReqName); //$NON-NLS-1$

		// Replaces the source requirement with the destination requirement in its goal model.
		Long modelId = srcReq.findGoalModel().getId();
		repositoryService.replaceRequirement(modelId, srcReq, dstReq);

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = modelId;
		ITargetSystem targetSystem = retrieveTargetSystem(srcReq.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.copyData(sessionId, srcReqName, dstReqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void disable(EClass reqClass) {
		String reqClassName = reqClass.getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: disable({0})", reqClassName); //$NON-NLS-1$

		// Retrieves a reference to the target system responsible for this requirement instance.
		ITargetSystem targetSystem = retrieveTargetSystem(reqClass);

		// Sends the instruction to the target system.
		try {
			targetSystem.disable(reqClassName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void enable(EClass reqClass) {
		String reqClassName = reqClass.getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: enable({0})", reqClassName); //$NON-NLS-1$

		// Retrieves a reference to the target system responsible for this requirement instance.
		ITargetSystem targetSystem = retrieveTargetSystem(reqClass);

		// Sends the instruction to the target system.
		try {
			targetSystem.enable(reqClassName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(GoalModel model, Requirement req) {
		String reqName = req.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: initiate(i{0})", reqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.initiate(sessionId, reqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Requirement, it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public final void resume(GoalModel model, Requirement req, Requirement parent) {
		String reqName = req.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: resume(i{0}, i{1})", reqName, parent.eClass().getName()); //$NON-NLS-1$

		// Resuming a requirement instance means attaching it back to its parent.
		// Note: the parent-child or model-element association is bidirectional and EMF takes care of the opposite side.
		req.setParent(parent);

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.resume(sessionId, reqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(GoalModel model, PerformativeRequirement req) {
		String reqName = req.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: rollback(i{0})", reqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.rollback(sessionId, reqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Actor, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void sendWarning(GoalModel model, Actor actor, AwReq awreq) {
		String actorName = actor.eClass().getName();
		String awreqName = awreq.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: send-warning({0}, i{1})", actorName, awreqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.sendWarning(sessionId, actorName, awreqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public final void suspend(GoalModel model, Requirement req) {
		String reqName = req.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: suspend(i{0})", reqName); //$NON-NLS-1$

		// Suspending a requirement instance means removing it from its parent.
		// Note: the parent-child or model-element association is bidirectional and EMF takes care of the opposite side.
		Requirement parent = req.getParent();
		if (parent != null) {
			req.setParent(null);

			// Re-evaluates the parent, because the remaining children might all be successful.
			if (parent instanceof DefinableRequirement)
				((DefinableRequirement) parent).checkState();
		}

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.suspend(sessionId, reqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(GoalModel model, Requirement req) {
		String reqName = req.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: terminate(i{0})", reqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.terminate(sessionId, reqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(it.unitn.disi.zanshin.model.gore.GoalModel, long) */
	@Override
	public void waitFor(GoalModel model, long timeInMillis) {
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: wait({0})", timeInMillis); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());
		
		// Sends the instruction to the target system.
		try {
			targetSystem.waitFor(sessionId, timeInMillis);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(GoalModel model, AwReq awreq) {
		String awreqName = awreq.eClass().getName();
		ControllerUtils.log.debug("RMI Target System Controller forwarding instruction: wait-for-fix(i{0})", awreqName); //$NON-NLS-1$

		// Retrieves the session id and a reference to the target system responsible for this requirement instance.
		Long sessionId = model.getId();
		ITargetSystem targetSystem = retrieveTargetSystem(model.eClass());

		// Sends the instruction to the target system.
		try {
			targetSystem.waitForFix(sessionId, awreqName);
		}
		catch (RemoteException e) {
			ControllerUtils.log.error("Error communicating with target system.", e); //$NON-NLS-1$
		}
	}
}
