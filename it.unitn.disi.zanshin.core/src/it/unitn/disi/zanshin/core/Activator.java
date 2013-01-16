package it.unitn.disi.zanshin.core;

import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IReconfigurationService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Core module of Zanshin. The core module defines all service interfaces and the base EMF
 * models extended by the target systems. Plus, it registers an implementation for the repository service, which stores
 * requirement model instances from the target systems that are currently executing.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;

	/** The target system controller service, if any is registered. */
	private static ITargetSystemControllerService controllerService;

	/** The adaptation service, if any is registered. */
	private static IAdaptationService adaptationService;

	/** The repository service. */
	private static IRepositoryService repositoryService;

	/** The monitoring service. */
	private static IMonitoringService monitoringService;

	/** The map of reconfiguration services available. */
	private static Map<String, IReconfigurationService> reconfigurationServices = new HashMap<>();

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** Getter for controllerService. */
	public static ITargetSystemControllerService getControllerService() {
		return controllerService;
	}

	/** Setter for controllerService. */
	public static void setControllerService(ITargetSystemControllerService controllerService) {
		Activator.controllerService = controllerService;
		CoreUtils.log.info("Target System Controller Service injected in this bundle"); //$NON-NLS-1$
	}

	/** Un-setter for controllerService (required by OSGi Declarative Services). */
	public static void unsetControllerService(ITargetSystemControllerService controllerService) {
		Activator.controllerService = null;
		CoreUtils.log.info("Target System Controller Service disposed from this bundle"); //$NON-NLS-1$
	}

	/** Getter for adaptationService. */
	public static IAdaptationService getAdaptationService() {
		return adaptationService;
	}

	/** Setter for controllerService. */
	public static void setAdaptationService(IAdaptationService adaptationService) {
		Activator.adaptationService = adaptationService;
		CoreUtils.log.info("Adaptation Service injected in this bundle"); //$NON-NLS-1$
	}

	/** Un-setter for adaptationService (required by OSGi Declarative Services). */
	public static void unsetAdaptationService(IAdaptationService adaptationService) {
		Activator.adaptationService = null;
		CoreUtils.log.info("Adaptation Service disposed from this bundle"); //$NON-NLS-1$
	}

	/** Getter for repositoryService. */
	public static IRepositoryService getRepositoryService() {
		return repositoryService;
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = repositoryService;
		CoreUtils.log.info("Repository Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = null;
		CoreUtils.log.info("Repository Service disposed from the activator"); //$NON-NLS-1$
	}

	/** Getter for repositoryService. */
	public static IMonitoringService getMonitoringService() {
		return monitoringService;
	}

	/** Setter for repositoryService. */
	public void setMonitoringService(IMonitoringService monitoringService) {
		Activator.monitoringService = monitoringService;
		CoreUtils.log.info("Monitoring Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetMonitoringService(IMonitoringService monitoringService) {
		Activator.monitoringService = null;
		CoreUtils.log.info("Monitoring Service disposed from the activator"); //$NON-NLS-1$
	}

	/** Adds a reconfiguration service to the map (used by OSGi Declarative Services). */
	public void addReconfigurationService(IReconfigurationService reconfigurationService) {
		String id = reconfigurationService.getId();
		reconfigurationServices.put(id, reconfigurationService);
		CoreUtils.log.info("Reconfiguration Service added to this bundle: {0}", id); //$NON-NLS-1$
	}

	/** Removes a reconfiguration service from the map (used by OSGi Declarative Services). */
	public void removeReconfigurationService(IReconfigurationService reconfigurationService) {
		String id = reconfigurationService.getId();
		reconfigurationServices.remove(id);
		CoreUtils.log.info("Reconfiguration Service removed from from this bundle: {0}", id); //$NON-NLS-1$
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param id
	 * @return
	 */
	public static IReconfigurationService retrieveReconfigurationService(String id) {
		return reconfigurationServices.get(id);
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		CoreUtils.initialize(logTracker.getService());
		CoreUtils.log.info("Zanshin Core Component starting..."); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		CoreUtils.log.info("Zanshin Core Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
