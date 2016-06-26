package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;
import ws.prova.agent2.ProvaReagent;

public class ProvaInitJoinImpl extends ProvaBuiltinImpl {

    public ProvaInitJoinImpl(ProvaKnowledgeBase kb) {
        super(kb,"init_join");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
            ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getWorkflows().init_join(literal, newLiterals, query);
    }

}
