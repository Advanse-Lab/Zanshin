package it.unitn.disi.zanshin.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ITargetSystem extends Remote {
	/**
	 * TODO: document this method. Copy the documentation of the remote exception to all other methods.
	 * 
	 * @param sessionId
	 * @param awreqName
	 */
	void abort(Long sessionId, String awreqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param newConfig
	 */
	void applyConfig(Long sessionId, Map<String, String> newConfig) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param newConfig
	 */
	void applyConfig(Map<String, String> newConfig) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param paramName
	 * @param value
	 */
	void changeParameter(Long sessionId, String paramName, String value) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param paramName
	 * @param value
	 */
	void changeParameter(String paramName, String value) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param srcReqName
	 * @param dstReqName
	 */
	void copyData(Long sessionId, String srcReqName, String dstReqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param reqClassName
	 */
	void disable(String reqClassName) throws RemoteException;
	
	/**
	 * TODO: document this method.
	 */
	void doNothing(Long sessionId) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param reqClassName
	 */
	void enable(String reqClassName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param reqName
	 */
	void initiate(Long sessionId, String reqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param reqName
	 */
	void resume(Long sessionId, String reqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param reqName
	 */
	void rollback(Long sessionId, String reqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param actorName
	 * @param awreqName
	 */
	void sendWarning(Long sessionId, String actorName, String awreqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param reqName
	 */
	void suspend(Long sessionId, String reqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param reqName
	 */
	void terminate(Long sessionId, String reqName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param timeInMillis
	 */
	void waitFor(Long sessionId, Long timeInMillis) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param sessionId
	 * @param awreqName
	 */
	void waitForFix(Long sessionId, String awreqName) throws RemoteException;
}
