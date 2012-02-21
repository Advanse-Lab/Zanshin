package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import it.unitn.disi.zanshin.adaptation.qualia.QualiaUtils;
import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractParameterChoiceProcedure;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class RandomSingleParameterChoiceProcedure extends AbstractParameterChoiceProcedure {
	/**
	 * @see it.unitn.disi.zanshin.adaptation.qualia.model.ParameterChoiceProcedure#chooseParameters(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public List<Parameter> chooseParameters(GoalModel model, AwReq awreq) {
		List<Parameter> params = new ArrayList<>();

		// Obtains the relations associated with the given AwReq.
		List<DifferentialRelation> relations = model.filterRelations(awreq);
		
		// Creates a set with the parameters that are associated with these relations, to filter out duplicate params.
		Set<Parameter> paramSet = new HashSet<>();
		for (DifferentialRelation relation : relations)
			// Only adds parameters that are incrementable.
			if (relation.getParameter().incrementableIn(relation))
				paramSet.add(relation.getParameter());

		// Checks how many relations are associated with this AwReq.
		int size = paramSet.size();
		switch (size) {
		// If there are no bounded parameters, issue a warning.
		case 0:
			QualiaUtils.log.warn("No bounded parameters were found to adapt to a failure in {0}.", awreq.eClass().getName()); //$NON-NLS-1$
			break;

		// Trivial case: return the only parameter that is associated with the indicator.
		case 1:
			params.add(paramSet.iterator().next());
			break;
			
		// Usual case: select randomly among the possible parameters.
		default:
			Parameter[] paramArray = paramSet.toArray(new Parameter[] {});
			Random random = new Random(System.currentTimeMillis());
			int idx = random.nextInt(size);
			params.add(paramArray[idx]);
		}

		return params;
	}
}