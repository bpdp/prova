package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaFreeImpl extends ProvaBuiltinImpl {

    public ProvaFreeImpl(ProvaKnowledgeBase kb) {
        super(kb,"free");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
            ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        ProvaObject lt = data[0];
        if( lt instanceof ProvaVariablePtr ) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        return lt instanceof ProvaVariable;
    }

}
