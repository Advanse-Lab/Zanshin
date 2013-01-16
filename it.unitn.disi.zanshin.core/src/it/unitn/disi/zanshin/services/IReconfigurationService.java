package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;

import java.util.List;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IReconfigurationService {
	/**
	 * TODO: document this method.
	 * 
	 * @return
	 */
	String getId();

	/**
	 * TODO: document this method.
	 * 
	 * @param procedureIds
	 * @param awreq
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	boolean checkApplicability(List<String> procedureIds, AwReq awreq, AdaptationSession session, List<ApplicabilityCondition> wrappedConditions);

	/**
	 * TODO: document this method.
	 * 
	 * @param procedureIds
	 * @param awreq
	 * @return
	 */
	Configuration findConfiguration(List<String> procedureIds, AwReq awreq);

	/**
	 * TODO: document this method.
	 * 
	 * @param procedureIds
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	boolean checkResolution(List<String> procedureIds, AdaptationSession session, ResolutionCondition wrappedCondition);
}
