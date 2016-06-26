package test.ws.prova.test2;

import org.junit.Test;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaKnowledgeBaseTest {

    @Test
    public void countRulesForPredicate() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        
        ProvaVariable v1 = ProvaVariableImpl.create("v1");
        ProvaVariable v2 = ProvaVariableImpl.create("v2");
        ProvaVariable v3 = ProvaVariableImpl.create("v3");
        ProvaVariable v4 = ProvaVariableImpl.create("v4");
        ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {v2},v3);
        ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {v1,l1,v4});
        
        ProvaLiteral lit1 = kb.generateLiteral("pred1", l2);
        
        // This automatically adds the rule to the respective predicate in the knowledge base
        kb.generateRule(lit1, new ProvaLiteral[] {});
        
        org.junit.Assert.assertEquals(kb.getPredicates("pred1",3).size(),1);
        org.junit.Assert.assertEquals(kb.getPredicates("pred1",2).size(),0);
    }

}
