package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.cache.ProvaCacheState;
import ws.prova.kernel2.cache.ProvaCachedLiteral;
import ws.prova.kernel2.cache.ProvaLocalAnswers;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.cache.ProvaCacheStateImpl.ProvaCacheAnswerKey;
import ws.prova.agent2.ProvaReagent;

public class ProvaUpdateCacheImpl extends ProvaBuiltinImpl {

    public ProvaUpdateCacheImpl(ProvaKnowledgeBase kb) {
        super(kb,"@update_cache");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
            ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        if( terms.getFixed().length!=5 )
            return false;
        ProvaObject first = terms.getFixed()[0];
        if( !(first instanceof ProvaConstant) )
            return false;
        ProvaCacheState cacheState = (ProvaCacheState) ((ProvaConstant) first).getObject();
        ProvaList literalList = (ProvaList) terms.getFixed()[1];
        if( literalList==ProvaListImpl.emptyRList )
            return false;
        // TODO: make sure the tail is dealt with properly
        ProvaObject[] fixed = literalList.getFixed();
        ProvaObject[] newFixed = new ProvaObject[fixed.length-1];
        System.arraycopy(fixed,1,newFixed,0,fixed.length-1);
        ProvaList newTerms = ProvaListImpl.create(newFixed,null);
        ProvaCacheAnswerKey cacheAnswerKey = cacheState.getCacheAnswerKey(newTerms, variables);
        boolean answerAdded = false;
        if( cacheAnswerKey!=null ) {
            ProvaLocalAnswers localAnswers = (ProvaLocalAnswers) ((ProvaConstant) terms.getFixed()[2]).getObject();
            boolean solutionAdded = localAnswers.addSolution(cacheAnswerKey, newTerms);
            if( !solutionAdded )
                return false;
            answerAdded = cacheState.addSolution(cacheAnswerKey, newTerms);
        }
        if( answerAdded ) {
            // Add the answer to all equivalent subgoals higher in the call stack (if they exist)
            // The associated goal
            ProvaGoal currentGoal = ((ProvaCachedLiteral) terms.getFixed()[3]).getGoal();
            List<ProvaGoal> goals = cacheState.getGoals();
            int i = 0;
            for( ; i<goals.size(); i++ ) {
                ProvaGoal g = goals.get(i);
                if( node.isCut() )
                    g.setCut(true);
                if( g==currentGoal )
                    break;
                g.addAnswer(newTerms);
            }
            while( ++i<goals.size() )
                goals.get(i).addOuterAnswer(newTerms);
        }
        return true;
    }

}
