// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g 2009-10-20 13:45:11

	package ws.prova.parser;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.HashMap;
	
	import ws.prova.util2.ProvaClassUtils;
	import ws.prova.kernel2.ProvaObject;
	import ws.prova.kernel2.ProvaConstant;
	import ws.prova.kernel2.ProvaVariable;
	import ws.prova.kernel2.ProvaList;
	import ws.prova.kernel2.ProvaLiteral;
	import ws.prova.kernel2.ProvaRule;
	import ws.prova.kernel2.ProvaResultSet;
	import ws.prova.reference2.ProvaConstantImpl;
	import ws.prova.reference2.ProvaVariableImpl;
	import ws.prova.reference2.ProvaListImpl;
	import ws.prova.reference2.ProvaLiteralImpl;
	import ws.prova.reference2.ProvaRuleImpl;
	import ws.prova.reference2.ProvaGlobalConstantImpl;
	import ws.prova.reference2.operators.ProvaOperatorFactoryImpl;
	import ws.prova.reference2.operators.ProvaBinaryOperatorFactoryImpl;
	import ws.prova.parser2.ProvaParserImpl;

	import ws.prova.parser2.ProvaErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ProvaWalker2 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "'@'"
    };
    public static final int DOLLAR=61;
    public static final int TERM=34;
    public static final int LT=20;
    public static final int EXPONENT=56;
    public static final int T__67=67;
    public static final int TYPED_VARIABLE=40;
    public static final int RULEBASE=25;
    public static final int ANNOTATION=43;
    public static final int EOF=-1;
    public static final int PREDICATE=33;
    public static final int STATEMENT=26;
    public static final int IF=10;
    public static final int WORD=60;
    public static final int ML_COMMENT=63;
    public static final int EXPR=48;
    public static final int COMMA=9;
    public static final int STRING2=55;
    public static final int STRING1=54;
    public static final int EQUAL=17;
    public static final int ARGS=39;
    public static final int UC=59;
    public static final int PLUS=5;
    public static final int DIGIT=57;
    public static final int CLAUSE=24;
    public static final int DOT=4;
    public static final int ATERM=47;
    public static final int DOLLARWORD=45;
    public static final int GE=23;
    public static final int INT_LITERAL=52;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int CHAR_ESC=66;
    public static final int KET=16;
    public static final int RELATION=30;
    public static final int STATIC_JAVA_CALL=36;
    public static final int UNDERSCORE=62;
    public static final int LITERAL=28;
    public static final int USWORD=41;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int LONG_LITERAL=53;
    public static final int PROVA_LIST=38;
    public static final int CUT=11;
    public static final int LCWORD=50;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int WS=64;
    public static final int NEWLINE=49;
    public static final int CLOSE=13;
    public static final int UCWORD=51;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=65;
    public static final int QUERY=27;
    public static final int GT=21;
    public static final int LC=58;
    public static final int ARITHMETIC_RELATION=32;
    public static final int GUARD=46;
    public static final int DIV=8;
    public static final int METADATA=29;
    public static final int INSTANCE_JAVA_CALL=35;
    public static final int LE=22;
    public static final int BAR=14;
    public static final int BRA=15;
    public static final int NOT_EQUAL2=19;
    public static final int NOT_EQUAL1=18;

    // delegates
    // delegators


        public ProvaWalker2(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ProvaWalker2(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ProvaWalker2.tokenNames; }
    public String getGrammarFileName() { return "F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g"; }


        private ProvaErrorReporter errorReporter = null;

        public void setErrorReporter(ProvaErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }

        public void emitErrorMessage(String msg) {
            errorReporter.reportError(msg);
        }



    protected static class rulebase_scope {
        List ret0;
    }
    protected Stack rulebase_stack = new Stack();


    // $ANTLR start "rulebase"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:60:1: rulebase returns [List ret] : ^( RULEBASE (s= statement )* ) ;
    public final List rulebase() throws RecognitionException {
        rulebase_stack.push(new rulebase_scope());
        List ret = null;

        List s = null;



        	((rulebase_scope)rulebase_stack.peek()).ret0 = new ArrayList();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:70:2: ( ^( RULEBASE (s= statement )* ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:70:4: ^( RULEBASE (s= statement )* )
            {
            match(input,RULEBASE,FOLLOW_RULEBASE_in_rulebase63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:70:15: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:70:16: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_rulebase68);
                	    s=statement();

                	    state._fsp--;

                	    ((rulebase_scope)rulebase_stack.peek()).ret0.add(s);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }


            	ret = ((rulebase_scope)rulebase_stack.peek()).ret0;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            rulebase_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "rulebase"


    // $ANTLR start "statement"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:73:1: statement returns [List ret] : ^( STATEMENT st= stat ) ;
    public final List statement() throws RecognitionException {
        List ret = null;

        List st = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:74:2: ( ^( STATEMENT st= stat ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:74:4: ^( STATEMENT st= stat )
            {
            match(input,STATEMENT,FOLLOW_STATEMENT_in_statement88); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_stat_in_statement92);
            st=stat();

            state._fsp--;


            match(input, Token.UP, null); 
            ret = st;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "statement"

    protected static class stat_scope {
        Object[] ret0;
        Set vars;
        // Variables found in the body (as constructed, they may include those also found in the head)
        	Set bodyVars;
        Set headVars;
        Map tailVars;
        Map mapVars;
        boolean isBody;
        boolean inRest;
        Object[] objects;
        boolean inInstanceCall;
        String src;
    }
    protected Stack stat_stack = new Stack();


    // $ANTLR start "stat"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:76:1: stat returns [List ret] : (c= clause | q= query );
    public final List stat() throws RecognitionException {
        stat_stack.push(new stat_scope());
        List ret = null;

        ProvaRule c = null;

        ProvaRule q = null;



        	((stat_scope)stat_stack.peek()).ret0 = new Object[7];
        	((stat_scope)stat_stack.peek()).vars = new HashSet();
        	((stat_scope)stat_stack.peek()).tailVars = new HashMap();
        	((stat_scope)stat_stack.peek()).mapVars = new HashMap();
        	((stat_scope)stat_stack.peek()).bodyVars = new HashSet();
        	((stat_scope)stat_stack.peek()).headVars = new HashSet();
        	((stat_scope)stat_stack.peek()).isBody = false;
        	((stat_scope)stat_stack.peek()).inRest = false;
        	((stat_scope)stat_stack.peek()).ret0[3] = new HashMap();
        	((stat_scope)stat_stack.peek()).ret0[4] = new HashMap();
        	((stat_scope)stat_stack.peek()).objects = ws.prova.parser2.ProvaParserImpl.tlObjects.get();
        	((stat_scope)stat_stack.peek()).src = ws.prova.parser2.ProvaParserImpl.tlSrc.get();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:108:2: (c= clause | q= query )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CLAUSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==QUERY) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:109:2: c= clause
                    {
                    pushFollow(FOLLOW_clause_in_stat125);
                    c=clause();

                    state._fsp--;


                    		((stat_scope)stat_stack.peek()).ret0[2]=c;
                    	

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:112:4: q= query
                    {
                    pushFollow(FOLLOW_query_in_stat134);
                    q=query();

                    state._fsp--;


                    		((stat_scope)stat_stack.peek()).ret0[0] = "";
                    		((stat_scope)stat_stack.peek()).ret0[1]=ProvaListImpl.emptyRList;
                    		((stat_scope)stat_stack.peek()).ret0[2]=q;
                    	

                    }
                    break;

            }

            	ret = Arrays.asList(((stat_scope)stat_stack.peek()).ret0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            stat_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "stat"


    // $ANTLR start "clause"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:119:1: clause returns [ProvaRule ret] : ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) ;
    public final ProvaRule clause() throws RecognitionException {
        ProvaRule ret = null;

        CommonTree cl=null;
        Map<String,List<Object>> m = null;

        List r = null;

        List<ProvaLiteral> l = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:119:31: ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:120:2: ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? )
            {
            cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause153); 

            match(input, Token.DOWN, null); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:120:15: (m= metadata )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==METADATA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:120:15: m= metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause157);
                    m=metadata();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_relation_in_clause162);
            r=relation();

            state._fsp--;

            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:120:38: (l= literals )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LITERAL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:120:38: l= literals
                    {
                    pushFollow(FOLLOW_literals_in_clause166);
                    l=literals();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            ((stat_scope)stat_stack.peek()).ret0[5]=m; ((stat_scope)stat_stack.peek()).ret0[1]=r; ((stat_scope)stat_stack.peek()).ret0[2]=l;
            	ProvaLiteral head = ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
            	ProvaLiteral[] body = (l==null) ? new ProvaLiteral[0] : l.toArray(new ProvaLiteral[0]);
            	ret = ProvaParserImpl.tlKB.get().generateRule(head,body);
                  	ret.computeSourceCode();
            	ret.setLine(cl.getLine());
            	ret.setSrc(Arrays.asList(new Object[] {((stat_scope)stat_stack.peek()).src}));
            	ret.addMetadata(m);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "clause"


    // $ANTLR start "metadata"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:132:1: metadata returns [Map<String,List<Object>> ret] : ^( METADATA (a= annotation )+ ) ;
    public final Map<String,List<Object>> metadata() throws RecognitionException {
        Map<String,List<Object>> ret = null;

        List<Object> a = null;



        	ret = new HashMap<String,List<Object>>();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:136:2: ( ^( METADATA (a= annotation )+ ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:136:4: ^( METADATA (a= annotation )+ )
            {
            match(input,METADATA,FOLLOW_METADATA_in_metadata192); 

            match(input, Token.DOWN, null); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:136:15: (a= annotation )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ANNOTATION) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:136:16: a= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata197);
            	    a=annotation();

            	    state._fsp--;

            	    ret.put(a.get(0).toString(),(List<Object>) a.get(1));

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "metadata"

    protected static class annotation_scope {
        List<String> value;
    }
    protected Stack annotation_stack = new Stack();


    // $ANTLR start "annotation"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:139:1: annotation returns [List<Object> ret] : ^( ANNOTATION n= LCWORD (v= value )* ) ;
    public final List<Object> annotation() throws RecognitionException {
        annotation_stack.push(new annotation_scope());
        List<Object> ret = null;

        CommonTree n=null;
        String v = null;



        	ret = new ArrayList<Object>();
        	((annotation_scope)annotation_stack.peek()).value = new ArrayList<String>(); 

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:150:2: ( ^( ANNOTATION n= LCWORD (v= value )* ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:150:4: ^( ANNOTATION n= LCWORD (v= value )* )
            {
            match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation231); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_annotation235); 
            ret.add(n.toString());
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:150:52: (v= value )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MINUS||(LA6_0>=LCWORD && LA6_0<=STRING2)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:150:53: v= value
            	    {
            	    pushFollow(FOLLOW_value_in_annotation242);
            	    v=value();

            	    state._fsp--;

            	    ((annotation_scope)annotation_stack.peek()).value.add(v);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input, Token.UP, null); 

            }


            	ret.add(((annotation_scope)annotation_stack.peek()).value);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            annotation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "value"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:153:1: value returns [String ret] : (l= LCWORD | u= UCWORD | s= string | n= number );
    public final String value() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaConstant n = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:154:2: (l= LCWORD | u= UCWORD | s= string | n= number )
            int alt7=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt7=1;
                }
                break;
            case UCWORD:
                {
                alt7=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt7=3;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:154:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_value264); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:155:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_value274); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:156:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_value284);
                    s=string();

                    state._fsp--;

                     ret = s; 

                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:157:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_value294);
                    n=number();

                    state._fsp--;

                     ret = n.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "value"


    // $ANTLR start "literals"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:160:1: literals returns [List<ProvaLiteral> ret] : ^( LITERAL (l= literal )+ ) ;
    public final List<ProvaLiteral> literals() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        ProvaLiteral l = null;



        	ret = new ArrayList<ProvaLiteral>();
        	((stat_scope)stat_stack.peek()).isBody = true;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:165:2: ( ^( LITERAL (l= literal )+ ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:165:4: ^( LITERAL (l= literal )+ )
            {
            match(input,LITERAL,FOLLOW_LITERAL_in_literals317); 

            match(input, Token.DOWN, null); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:165:14: (l= literal )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CUT||(LA8_0>=RELATION && LA8_0<=SEMANTIC_ATTACHMENT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:165:15: l= literal
            	    {
            	    pushFollow(FOLLOW_literal_in_literals322);
            	    l=literal();

            	    state._fsp--;

            	    ret.add(l);

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "literals"


    // $ANTLR start "literal"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:168:1: literal returns [ProvaLiteral ret] : ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(cu= CUT c= cut ) );
    public final ProvaLiteral literal() throws RecognitionException {
        ProvaLiteral ret = null;

        CommonTree rel=null;
        CommonTree sem=null;
        CommonTree cu=null;
        Map<String,List<Object>> m = null;

        List r = null;

        List<ProvaLiteral> g = null;

        List<ProvaObject> sa = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:169:2: ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(cu= CUT c= cut ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RELATION:
                {
                alt13=1;
                }
                break;
            case SEMANTIC_ATTACHMENT:
                {
                alt13=2;
                }
                break;
            case CUT:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:2: ^(rel= RELATION (m= metadata )? r= relation (g= guard )? )
                    {
                    rel=(CommonTree)match(input,RELATION,FOLLOW_RELATION_in_literal345); 

                    match(input, Token.DOWN, null); 
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:18: (m= metadata )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==METADATA) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:18: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal349);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal354);
                    r=relation();

                    state._fsp--;

                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:41: (g= guard )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==GUARD) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:41: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal358);
                            g=guard();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    		Object pred = r.get(0);
                          		if( pred.equals("cache") ) {
                           			String actualPred = ((ProvaList) ((ProvaList) r.get(1)).getFixed()[0]).getFixed()[0].toString();
                           			ProvaParserImpl.tlKB.get().addCachePredicate(actualPred);
                           		}
                    		ret = ProvaParserImpl.tlKB.get().generateLiteral((String) pred,(ProvaList) r.get(1),g);
                    		ret.setLine(rel.getLine());
                    		List<ProvaObject> metaVariables = ret.addMetadata(m);
                    		if( metaVariables!=null ) {
                    			metaVariables.add(0,ProvaConstantImpl.create(pred));
                    			metaVariables.add(1,(ProvaList) r.get(1));
                    			ProvaList metaList = ProvaListImpl.create( metaVariables );
                    			ret = ProvaParserImpl.tlKB.get().generateLiteral("metadata",metaList,g);
                    			ret.setLine(rel.getLine());
                    			ret.addMetadata(m);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:188:4: ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? )
                    {
                    sem=(CommonTree)match(input,SEMANTIC_ATTACHMENT,FOLLOW_SEMANTIC_ATTACHMENT_in_literal370); 

                    match(input, Token.DOWN, null); 
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:188:31: (m= metadata )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==METADATA) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:188:31: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal374);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal379);
                    sa=semantic_attachment();

                    state._fsp--;

                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:188:66: (g= guard )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==GUARD) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:188:66: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal383);
                            g=guard();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    		ret =ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) sa.get(0)).getObject(),(ProvaList) sa.get(1),g);
                    		ret.setLine(sem.getLine());
                    		ret.addMetadata(m);
                    	

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:193:4: ^(cu= CUT c= cut )
                    {
                    cu=(CommonTree)match(input,CUT,FOLLOW_CUT_in_literal395); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_cut_in_literal399);
                    cut();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		ProvaVariable any1 = ProvaVariableImpl.create();
                    		ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
                    		ret = ProvaParserImpl.tlKB.get().generateLiteral("cut",lany1);
                    		ret.setLine(cu.getLine());
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "literal"


    // $ANTLR start "guard"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:1: guard returns [List<ProvaLiteral> ret] : ^(g= GUARD lits= literals ) ;
    public final List<ProvaLiteral> guard() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        CommonTree g=null;
        List<ProvaLiteral> lits = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:202:2: ( ^(g= GUARD lits= literals ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:202:4: ^(g= GUARD lits= literals )
            {
            g=(CommonTree)match(input,GUARD,FOLLOW_GUARD_in_guard419); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literals_in_guard423);
            lits=literals();

            state._fsp--;


            match(input, Token.UP, null); 

            		ret = lits;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "guard"


    // $ANTLR start "cut"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:207:1: cut : CUT ;
    public final void cut() throws RecognitionException {
        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:208:2: ( CUT )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:208:4: CUT
            {
            match(input,CUT,FOLLOW_CUT_in_cut436); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cut"


    // $ANTLR start "semantic_attachment"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:211:1: semantic_attachment returns [List<ProvaObject> ret] : (pjc= predicate_java_call | bo= binary_operation );
    public final List<ProvaObject> semantic_attachment() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> pjc = null;

        List<ProvaObject> bo = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:215:2: (pjc= predicate_java_call | bo= binary_operation )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=INSTANCE_JAVA_CALL && LA14_0<=STATIC_JAVA_CALL)) ) {
                alt14=1;
            }
            else if ( (LA14_0==MINUS||LA14_0==PROVA_LIST||(LA14_0>=TYPED_VARIABLE && LA14_0<=QUALIFIED_JAVA_CLASS)||LA14_0==DOLLARWORD||(LA14_0>=LCWORD && LA14_0<=STRING2)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:215:4: pjc= predicate_java_call
                    {
                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment457);
                    pjc=predicate_java_call();

                    state._fsp--;


                    			ProvaConstant symbolConstant = (ProvaConstant) pjc.remove(0);
                    			ProvaList pl = ProvaListImpl.create(pjc.toArray(new ProvaObject[0]));
                    			String method = symbolConstant.equals("s")?"scalc":"pcalc";
                    			ret.add(ProvaConstantImpl.create(method));
                    			ret.add(pl);
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:222:5: bo= binary_operation
                    {
                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment467);
                    bo=binary_operation();

                    state._fsp--;


                    			ProvaConstant symbolConstant = (ProvaConstant) bo.remove(0);
                    			ret.add(symbolConstant);
                    			ProvaList pl = ProvaListImpl.create(bo.toArray(new ProvaObject[0]));
                    			ret.add(pl);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "semantic_attachment"


    // $ANTLR start "predicate_java_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:230:1: predicate_java_call returns [List<ProvaObject> ret] : (sjc= static_java_call | ijc= instance_java_call );
    public final List<ProvaObject> predicate_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sjc = null;

        List<ProvaObject> ijc = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:231:2: (sjc= static_java_call | ijc= instance_java_call )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==STATIC_JAVA_CALL) ) {
                alt15=1;
            }
            else if ( (LA15_0==INSTANCE_JAVA_CALL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:231:4: sjc= static_java_call
                    {
                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call485);
                    sjc=static_java_call();

                    state._fsp--;


                    			ret =sjc;
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:234:5: ijc= instance_java_call
                    {
                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call495);
                    ijc=instance_java_call();

                    state._fsp--;


                    			ret =ijc;
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "predicate_java_call"


    // $ANTLR start "static_java_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:239:1: static_java_call returns [List<ProvaObject> ret] : ^( STATIC_JAVA_CALL sc= static_call a= args ) ;
    public final List<ProvaObject> static_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sc = null;

        ProvaList a = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:240:2: ( ^( STATIC_JAVA_CALL sc= static_call a= args ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:240:4: ^( STATIC_JAVA_CALL sc= static_call a= args )
            {
            match(input,STATIC_JAVA_CALL,FOLLOW_STATIC_JAVA_CALL_in_static_java_call512); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_static_call_in_static_java_call516);
            sc=static_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_static_java_call520);
            a=args();

            state._fsp--;


            match(input, Token.UP, null); 

            			sc.add(a);
            			ret = sc;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "static_java_call"

    protected static class binary_operation_scope {
        String op;
    }
    protected Stack binary_operation_stack = new Stack();


    // $ANTLR start "binary_operation"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:246:1: binary_operation returns [List<ProvaObject> ret] : lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) ;
    public final List<ProvaObject> binary_operation() throws RecognitionException {
        binary_operation_stack.push(new binary_operation_scope());
        List<ProvaObject> ret = null;

        ProvaObject lt = null;

        List<ProvaObject> cjc = null;

        ProvaList pl = null;

        ProvaConstant c = null;

        ProvaObject e = null;

        String bo = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:250:2: (lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:251:3: lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            {
            pushFollow(FOLLOW_left_term_in_binary_operation546);
            lt=left_term();

            state._fsp--;

            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:251:16: ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            int alt17=3;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt17=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==QUALIFIED_JAVA_CLASS||LA17_2==LCWORD||(LA17_2>=STRING1 && LA17_2<=STRING2)) ) {
                    alt17=2;
                }
                else if ( (LA17_2==MINUS||LA17_2==OPEN||(LA17_2>=INSTANCE_JAVA_CALL && LA17_2<=STATIC_JAVA_CALL)||(LA17_2>=TYPED_VARIABLE && LA17_2<=USWORD)||LA17_2==DOLLARWORD||(LA17_2>=UCWORD && LA17_2<=LONG_LITERAL)) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
            case OPEN:
            case LT:
            case GT:
            case LE:
            case GE:
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:252:4: EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation553); 
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:252:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    int alt16=4;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:253:4: cjc= constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation562);
                            cjc=constructor_java_call();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("construct"));
                            				ret.add(cjc.get(0));
                            				ret.add(lt);
                            				ret.add(cjc.get(1));
                            			

                            }
                            break;
                        case 2 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:260:6: pl= prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation573);
                            pl=prova_list();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(pl);
                            			

                            }
                            break;
                        case 3 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:266:6: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation584);
                            c=constant();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(c);
                            			

                            }
                            break;
                        case 4 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:273:6: e= expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation599);
                            e=expr();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("expr_literal"));
                            				ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create("=")));
                            				ret.add(lt);
                            				ret.add(e);
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:281:5: not_equal c= constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation612);
                    not_equal();

                    state._fsp--;

                    pushFollow(FOLLOW_constant_in_binary_operation616);
                    c=constant();

                    state._fsp--;


                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaConstantImpl.create("equals_minus"));
                    			ret.add(lt);
                    			ret.add(c);
                    		

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:287:5: bo= binary_operator e= expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation626);
                    bo=binary_operator();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_binary_operation630);
                    e=expr();

                    state._fsp--;


                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaConstantImpl.create("expr_literal"));
                    			ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create(bo)));
                    			ret.add(lt);
                    			ret.add(e);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            binary_operation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "binary_operation"


    // $ANTLR start "expr"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:308:1: expr returns [ProvaObject ret] : a= aterm (op= ( PLUS | MINUS ) e= expr )? ;
    public final ProvaObject expr() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree op=null;
        ProvaObject a = null;

        ProvaObject e = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:309:2: (a= aterm (op= ( PLUS | MINUS ) e= expr )? )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:310:2: a= aterm (op= ( PLUS | MINUS ) e= expr )?
            {
            pushFollow(FOLLOW_aterm_in_expr657);
            a=aterm();

            state._fsp--;

            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:310:10: (op= ( PLUS | MINUS ) e= expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=PLUS && LA18_0<=MINUS)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:310:11: op= ( PLUS | MINUS ) e= expr
                    {
                    op=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_expr670);
                    e=expr();

                    state._fsp--;


                    }
                    break;

            }


            		if( op==null )
            			ret = a;
            		else {
            			List list = new ArrayList();
            			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(op.getText())));
            			list.add(a);
            			list.add(e);
            			ret = ProvaListImpl.create(list);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "expr"


    // $ANTLR start "aterm"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:323:1: aterm returns [ProvaObject ret] : ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? ;
    public final ProvaObject aterm() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree m=null;
        CommonTree op=null;
        ProvaObject v = null;

        ProvaConstant n = null;

        List<ProvaObject> pjc = null;

        ProvaObject e = null;

        ProvaObject a = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:324:2: ( ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )?
            {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE )
            int alt21=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case INSTANCE_JAVA_CALL:
                case STATIC_JAVA_CALL:
                    {
                    alt21=3;
                    }
                    break;
                case INT_LITERAL:
                case LONG_LITERAL:
                    {
                    alt21=2;
                    }
                    break;
                case TYPED_VARIABLE:
                case USWORD:
                case DOLLARWORD:
                case UCWORD:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt21=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt21=2;
                }
                break;
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
                {
                alt21=3;
                }
                break;
            case OPEN:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:3: (m= MINUS )? v= variable
                    {
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:4: (m= MINUS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==MINUS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:4: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm693); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm698);
                    v=variable();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:25: n= number
                    {
                    pushFollow(FOLLOW_number_in_aterm704);
                    n=number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:36: (m= MINUS )? pjc= predicate_java_call
                    {
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:37: (m= MINUS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==MINUS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:37: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm710); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm715);
                    pjc=predicate_java_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:71: OPEN e= expr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_aterm719); 
                    pushFollow(FOLLOW_expr_in_aterm723);
                    e=expr();

                    state._fsp--;

                    match(input,CLOSE,FOLLOW_CLOSE_in_aterm725); 

                    }
                    break;

            }

            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:90: (op= ( MULT | DIV | REM ) a= aterm )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=MULT && LA22_0<=DIV)||LA22_0==REM) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:91: op= ( MULT | DIV | REM ) a= aterm
                    {
                    op=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm741);
                    a=aterm();

                    state._fsp--;


                    }
                    break;

            }


            		if( op==null ) {
            			if( m==null ) {
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					ret = ProvaListImpl.create(plist);
            				} else
            					ret = v==null ? (n==null ? e : n) : v;
            			} else {
            				List list = new ArrayList();
            				list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create("neg")));
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					list.add(ProvaListImpl.create(plist));
            				} else
            					list.add(v==null ? (n==null ? e : n) : v);
            				ret = ProvaListImpl.create(list);
            			}
            		} else {
            			List list = new ArrayList();
            			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(op.getText())));
            			if( pjc!=null ) {
            				List plist = new java.util.ArrayList<ProvaObject>();
            				plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            				plist.add(pjc.get(1));
            				plist.add(pjc.get(3));
            				list.add(ProvaListImpl.create(plist));
            			} else
            				list.add(v==null ? (n==null ? e : n) : v);
            			list.add(a);
            			ret = ProvaListImpl.create(list);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "aterm"


    // $ANTLR start "variable_or_number"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:366:1: variable_or_number returns [ProvaObject ret] : (v= variable | n= number );
    public final ProvaObject variable_or_number() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaConstant n = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:2: (v= variable | n= number )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=TYPED_VARIABLE && LA23_0<=USWORD)||LA23_0==DOLLARWORD||LA23_0==UCWORD) ) {
                alt23=1;
            }
            else if ( (LA23_0==MINUS||(LA23_0>=INT_LITERAL && LA23_0<=LONG_LITERAL)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_variable_or_number761);
                    v=variable();

                    state._fsp--;

                    ret = v;

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:29: n= number
                    {
                    pushFollow(FOLLOW_number_in_variable_or_number769);
                    n=number();

                    state._fsp--;

                    ret = n;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "variable_or_number"


    // $ANTLR start "constructor_java_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:369:1: constructor_java_call returns [List<ProvaObject> ret] : (qjc= qualified_java_class | o= UCWORD ) a= args ;
    public final List<ProvaObject> constructor_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree o=null;
        ProvaConstant qjc = null;

        ProvaList a = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:373:2: ( (qjc= qualified_java_class | o= UCWORD ) a= args )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:373:4: (qjc= qualified_java_class | o= UCWORD ) a= args
            {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:373:4: (qjc= qualified_java_class | o= UCWORD )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==QUALIFIED_JAVA_CLASS) ) {
                alt24=1;
            }
            else if ( (LA24_0==UCWORD) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:373:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call792);
                    qjc=qualified_java_class();

                    state._fsp--;

                    ret.add(qjc);

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:374:5: o= UCWORD
                    {
                    o=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call802); 

                    			Class<?> type = ProvaClassUtils.findClass((String) o.toString());
                    			if( type==null )
                    				throw new RecognitionException();
                    			ret.add(ProvaConstantImpl.create(type));
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call810);
            a=args();

            state._fsp--;


            			ret.add(a);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "constructor_java_call"


    // $ANTLR start "binary_operator"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:384:1: binary_operator returns [String ret] : ( | not_equal | LT | GT | LE | GE );
    public final String binary_operator() throws RecognitionException {
        String ret = null;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:385:2: ( | not_equal | LT | GT | LE | GE )
            int alt25=6;
            switch ( input.LA(1) ) {
            case MINUS:
            case OPEN:
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt25=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt25=2;
                }
                break;
            case LT:
                {
                alt25=3;
                }
                break;
            case GT:
                {
                alt25=4;
                }
                break;
            case LE:
                {
                alt25=5;
                }
                break;
            case GE:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:3: 
                    {
                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:5: not_equal
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operator831);
                    not_equal();

                    state._fsp--;

                    ret ="ne";

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:387:5: LT
                    {
                    match(input,LT,FOLLOW_LT_in_binary_operator839); 
                    ret ="lt";

                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:388:5: GT
                    {
                    match(input,GT,FOLLOW_GT_in_binary_operator847); 
                    ret ="gt";

                    }
                    break;
                case 5 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:389:5: LE
                    {
                    match(input,LE,FOLLOW_LE_in_binary_operator855); 
                    ret ="le";

                    }
                    break;
                case 6 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:390:5: GE
                    {
                    match(input,GE,FOLLOW_GE_in_binary_operator863); 
                    ret ="ge";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "binary_operator"


    // $ANTLR start "not_equal"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:393:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final void not_equal() throws RecognitionException {
        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:394:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:
            {
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "not_equal"


    // $ANTLR start "instance_java_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:397:1: instance_java_call returns [List<ProvaObject> ret] : ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) ;
    public final List<ProvaObject> instance_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> ic = null;

        ProvaList a = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:398:2: ( ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:398:4: ^( INSTANCE_JAVA_CALL ic= instance_call a= args )
            {
            match(input,INSTANCE_JAVA_CALL,FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call895); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_instance_call_in_instance_java_call899);
            ic=instance_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_instance_java_call903);
            a=args();

            state._fsp--;


            match(input, Token.UP, null); 

            			ic.add(a);
            			ret = ic;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "instance_java_call"


    // $ANTLR start "instance_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:405:1: instance_call returns [List<ProvaObject> ret] : v= variable l= LCWORD ;
    public final List<ProvaObject> instance_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaObject v = null;



        	ret = new ArrayList();
        	((stat_scope)stat_stack.peek()).inInstanceCall = true;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:413:2: (v= variable l= LCWORD )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:413:4: v= variable l= LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call934);
            v=variable();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call938); 

            			// Prefix set to "" to signal that the predicate_java_call is an instance one
            			//   but can be reclassified as a static call if v is a constant
            			//   representing a class from a default package java.lang or ws.prova
            			String s = (v instanceof ProvaVariable || v instanceof ProvaGlobalConstantImpl || (v instanceof ProvaConstant && !(((ProvaConstant) v).getObject() instanceof Class<?>)))?"":"s";
            			ret.add(ProvaConstantImpl.create(s));
            			ret.add(v);
            			ret.add(ProvaConstantImpl.create((l!=null?l.getText():null)));
            		

            }


            	((stat_scope)stat_stack.peek()).inInstanceCall = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "instance_call"


    // $ANTLR start "static_call"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:424:1: static_call returns [List<ProvaObject> ret] : qjc= qualified_java_class l= LCWORD ;
    public final List<ProvaObject> static_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaConstant qjc = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:428:2: (qjc= qualified_java_class l= LCWORD )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:428:4: qjc= qualified_java_class l= LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call961);
            qjc=qualified_java_class();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_static_call965); 

            			// Prefix set to "s" to signal that the predicate_java_call is a static one
            			ret.add(ProvaConstantImpl.create("s"));
            			ret.add(qjc);
            			ret.add(ProvaConstantImpl.create((l!=null?l.getText():null)));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "static_call"


    // $ANTLR start "query_predicate"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:436:1: query_predicate returns [String ret] : c= constant ;
    public final String query_predicate() throws RecognitionException {
        String ret = null;

        ProvaConstant c = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:437:2: (c= constant )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:437:4: c= constant
            {
            pushFollow(FOLLOW_constant_in_query_predicate983);
            c=constant();

            state._fsp--;

            ret = (String) c.getObject();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "query_predicate"


    // $ANTLR start "query"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:440:1: query returns [ProvaRule ret] : ^( QUERY qp= query_predicate r= relation ) ;
    public final ProvaRule query() throws RecognitionException {
        ProvaRule ret = null;

        String qp = null;

        List r = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:441:2: ( ^( QUERY qp= query_predicate r= relation ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:441:4: ^( QUERY qp= query_predicate r= relation )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query1000); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_query_predicate_in_query1004);
            qp=query_predicate();

            state._fsp--;

            pushFollow(FOLLOW_relation_in_query1008);
            r=relation();

            state._fsp--;


            match(input, Token.UP, null); 

            			ProvaLiteral q=ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
            			if( qp.equals("eval") ) {
            				ret = new ProvaRuleImpl( new ProvaLiteral[] {q});
            				ProvaLiteral fail = ProvaParserImpl.tlKB.get().generateLiteral("fail");
            				ret.addBodyLiteral(fail);
            			} else if( qp.equals("solve") ) {
            				ProvaResultSet resultSet = ProvaParserImpl.tlRS.get();
            				ret =ProvaParserImpl.tlKB.get().generateSolveGoal(resultSet, new ProvaLiteral[] {q});
            			} else throw new RuntimeException();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "query"


    // $ANTLR start "relation"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:454:1: relation returns [List ret] : ^( PREDICATE p= predicate l= list_body ) ;
    public final List relation() throws RecognitionException {
        List ret = null;

        String p = null;

        ProvaList l = null;



        	ret = new ArrayList();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:458:2: ( ^( PREDICATE p= predicate l= list_body ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:458:4: ^( PREDICATE p= predicate l= list_body )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_relation1031); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_relation1035);
            p=predicate();

            state._fsp--;

            pushFollow(FOLLOW_list_body_in_relation1039);
            l=list_body();

            state._fsp--;


            match(input, Token.UP, null); 

            			if( Character.isUpperCase(p.charAt(0)) )
            				ret.add(ProvaVariableImpl.create(p));
            			else
            				ret.add(p);
            			ret.add(l);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "relation"


    // $ANTLR start "predicate"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:476:1: predicate returns [String ret] : (l= LCWORD | u= UCWORD | s= string );
    public final String predicate() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:477:2: (l= LCWORD | u= UCWORD | s= string )
            int alt26=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt26=1;
                }
                break;
            case UCWORD:
                {
                alt26=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:477:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1061); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:478:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1071); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:479:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_predicate1081);
                    s=string();

                    state._fsp--;

                     ret = s; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "func"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:482:1: func returns [ProvaObject ret] : (l= LCWORD | u= UCWORD | s= string | tv= typed_variable );
    public final ProvaObject func() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaObject tv = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:483:2: (l= LCWORD | u= UCWORD | s= string | tv= typed_variable )
            int alt27=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt27=1;
                }
                break;
            case UCWORD:
                {
                alt27=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt27=3;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:483:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_func1099); 

                    			ret =ProvaConstantImpl.create(l.toString());
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:486:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_func1109); 

                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:489:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_func1119);
                    s=string();

                    state._fsp--;


                    			ret =ProvaConstantImpl.create(s);
                    		

                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:492:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_func1129);
                    tv=typed_variable();

                    state._fsp--;


                    			ret =tv;
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "func"

    protected static class list_body_scope {
        Object rest;
    }
    protected Stack list_body_stack = new Stack();


    // $ANTLR start "list_body"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:497:1: list_body returns [ProvaList ret] : ^( LIST_BODY (t= terms (lt= list_tail )? )? ) ;
    public final ProvaList list_body() throws RecognitionException {
        list_body_stack.push(new list_body_scope());
        ProvaList ret = null;

        List<ProvaObject> t = null;

        ProvaObject lt = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:3: ( ^( LIST_BODY (t= terms (lt= list_tail )? )? ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:5: ^( LIST_BODY (t= terms (lt= list_tail )? )? )
            {
            match(input,LIST_BODY,FOLLOW_LIST_BODY_in_list_body1151); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:17: (t= terms (lt= list_tail )? )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==TERM) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:18: t= terms (lt= list_tail )?
                        {
                        pushFollow(FOLLOW_terms_in_list_body1156);
                        t=terms();

                        state._fsp--;

                        // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:28: (lt= list_tail )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==PROVA_LIST||(LA28_0>=TYPED_VARIABLE && LA28_0<=USWORD)||LA28_0==DOLLARWORD||LA28_0==UCWORD) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:501:28: lt= list_tail
                                {
                                pushFollow(FOLLOW_list_tail_in_list_body1160);
                                lt=list_tail();

                                state._fsp--;


                                }
                                break;

                        }


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

             			if( t==null ) {
             				if( lt==null )
            	 				ret = ProvaListImpl.emptyRList;
            	 			else
            					ret = ProvaListImpl.create(new ProvaObject[0],lt);
             			} else
            				ret = ProvaListImpl.create(t.toArray(new ProvaObject[0]),lt);
            			// TODO: deal with the case when t is not ComplexTerm
             		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            list_body_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "list_body"


    // $ANTLR start "terms"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:1: terms returns [List<ProvaObject> ret] : ^( TERM (t= term )+ ) ;
    public final List<ProvaObject> terms() throws RecognitionException {
        List<ProvaObject> ret = null;

        ProvaObject t = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:518:2: ( ^( TERM (t= term )+ ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:518:4: ^( TERM (t= term )+ )
            {
            match(input,TERM,FOLLOW_TERM_in_terms1192); 

            match(input, Token.DOWN, null); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:518:11: (t= term )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==MINUS||LA30_0==PROVA_LIST||(LA30_0>=TYPED_VARIABLE && LA30_0<=QUALIFIED_JAVA_CLASS)||LA30_0==DOLLARWORD||(LA30_0>=LCWORD && LA30_0<=STRING2)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:518:12: t= term
            	    {
            	    pushFollow(FOLLOW_term_in_terms1197);
            	    t=term();

            	    state._fsp--;

            	    ret.add(t);

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "terms"


    // $ANTLR start "term"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:521:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term );
    public final ProvaObject term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject lt = null;

        ProvaObject ft = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:522:2: (lt= left_term | ft= func_term )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:523:3: lt= left_term
                    {
                    pushFollow(FOLLOW_left_term_in_term1222);
                    lt=left_term();

                    state._fsp--;

                    ret =lt;

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:524:5: ft= func_term
                    {
                    pushFollow(FOLLOW_func_term_in_term1232);
                    ft=func_term();

                    state._fsp--;

                    ret =ft;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "term"


    // $ANTLR start "left_term"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:527:1: left_term returns [ProvaObject ret] : (c= constant | v= variable | n= number | p= prova_list );
    public final ProvaObject left_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:528:2: (c= constant | v= variable | n= number | p= prova_list )
            int alt32=4;
            switch ( input.LA(1) ) {
            case QUALIFIED_JAVA_CLASS:
            case LCWORD:
            case STRING1:
            case STRING2:
                {
                alt32=1;
                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt32=2;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt32=3;
                }
                break;
            case PROVA_LIST:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:528:4: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_left_term1250);
                    c=constant();

                    state._fsp--;

                    ret =c;

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:529:5: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_left_term1260);
                    v=variable();

                    state._fsp--;

                    ret =v;

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:530:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_left_term1270);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_left_term1280);
                    p=prova_list();

                    state._fsp--;

                    ret =p;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "left_term"


    // $ANTLR start "right_term"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:534:1: right_term returns [ProvaObject ret] : ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list );
    public final ProvaObject right_term() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree m=null;
        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;



        	((binary_operation_scope)binary_operation_stack.peek()).op ="";

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:2: ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list )
            int alt35=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA35_1 = input.LA(2);

                if ( ((LA35_1>=INT_LITERAL && LA35_1<=LONG_LITERAL)) ) {
                    alt35=2;
                }
                else if ( ((LA35_1>=TYPED_VARIABLE && LA35_1<=QUALIFIED_JAVA_CLASS)||LA35_1==DOLLARWORD||(LA35_1>=LCWORD && LA35_1<=UCWORD)||(LA35_1>=STRING1 && LA35_1<=STRING2)) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case QUALIFIED_JAVA_CLASS:
            case DOLLARWORD:
            case LCWORD:
            case UCWORD:
            case STRING1:
            case STRING2:
                {
                alt35=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt35=2;
                }
                break;
            case PROVA_LIST:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    {
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:5: (m= MINUS )? (c= constant | v= variable )
                    {
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:6: (m= MINUS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==MINUS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:6: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_right_term1309); 

                            }
                            break;

                    }

                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:14: (c= constant | v= variable )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==QUALIFIED_JAVA_CLASS||LA34_0==LCWORD||(LA34_0>=STRING1 && LA34_0<=STRING2)) ) {
                        alt34=1;
                    }
                    else if ( ((LA34_0>=TYPED_VARIABLE && LA34_0<=USWORD)||LA34_0==DOLLARWORD||LA34_0==UCWORD) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:15: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1315);
                            c=constant();

                            state._fsp--;

                            ret =c;

                            }
                            break;
                        case 2 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:38: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1323);
                            v=variable();

                            state._fsp--;

                            ret =v;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_right_term1335);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:544:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_right_term1345);
                    p=prova_list();

                    state._fsp--;

                    ret =p;

                    }
                    break;

            }

            if(m!=null )
            	((binary_operation_scope)binary_operation_stack.peek()).op ="minus";

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "right_term"

    protected static class qualified_java_class_scope {
        String s;
    }
    protected Stack qualified_java_class_stack = new Stack();


    // $ANTLR start "qualified_java_class"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:546:1: qualified_java_class returns [ProvaConstant ret] : ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) ;
    public final ProvaConstant qualified_java_class() throws RecognitionException {
        qualified_java_class_stack.push(new qualified_java_class_scope());
        ProvaConstant ret = null;

        CommonTree l=null;
        CommonTree d=null;
        CommonTree u=null;


        	((qualified_java_class_scope)qualified_java_class_stack.peek()).s = "";

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:2: ( ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:4: ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD )
            {
            match(input,QUALIFIED_JAVA_CLASS,FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1375); 

            match(input, Token.DOWN, null); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:27: ( (l= LCWORD d= DOT ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LCWORD) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:28: (l= LCWORD d= DOT )
            	    {
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:28: (l= LCWORD d= DOT )
            	    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:559:29: l= LCWORD d= DOT
            	    {
            	    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1381); 
            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1385); 

            	    }

            	    ((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=l.toString()+d.toString();

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1394); 

            match(input, Token.UP, null); 

            			((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=u.toString();
            		

            }


            	Class<?> type = ProvaClassUtils.findClass((String) ((qualified_java_class_scope)qualified_java_class_stack.peek()).s);
            	if( type==null )
            		throw new RecognitionException();
            	ret =ProvaConstantImpl.create(/*((qualified_java_class_scope)qualified_java_class_stack.peek()).s*/type);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            qualified_java_class_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "qualified_java_class"


    // $ANTLR start "func_term"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:564:1: func_term returns [ProvaObject ret] : f= func a= args ;
    public final ProvaObject func_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject f = null;

        ProvaList a = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:565:2: (f= func a= args )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:565:4: f= func a= args
            {
            pushFollow(FOLLOW_func_in_func_term1414);
            f=func();

            state._fsp--;

            pushFollow(FOLLOW_args_in_func_term1418);
            a=args();

            state._fsp--;


            			List<ProvaObject> fixed = new ArrayList<ProvaObject>();
            			fixed.add(f);
            			fixed.addAll(Arrays.asList(a.getFixed()));
            			ret=ProvaListImpl.create((ProvaObject[]) fixed.toArray(new ProvaObject[0]),a.getTail());
            //			ret =reagent.cplx(reagent.flist,a,f);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "func_term"


    // $ANTLR start "typed_variable"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:574:1: typed_variable returns [ProvaObject ret] : ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) );
    public final ProvaObject typed_variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree w=null;
        CommonTree u=null;
        CommonTree l=null;
        ProvaConstant q = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:575:2: ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TYPED_VARIABLE) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==DOWN) ) {
                    int LA38_2 = input.LA(3);

                    if ( (LA38_2==UCWORD) ) {
                        int LA38_3 = input.LA(4);

                        if ( (LA38_3==LCWORD) ) {
                            alt38=2;
                        }
                        else if ( (LA38_3==UCWORD) ) {
                            alt38=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA38_2==QUALIFIED_JAVA_CLASS) ) {
                        alt38=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:575:4: ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1436); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1440);
                    q=qualified_java_class();

                    state._fsp--;

                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:575:44: (w= LCWORD | w= UCWORD )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LCWORD) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==UCWORD) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:575:45: w= LCWORD
                            {
                            w=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1445); 

                            }
                            break;
                        case 2 :
                            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:575:54: w= UCWORD
                            {
                            w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1449); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    			Class<?> type = (Class<?>) q.getObject();
                    			Object field = null;
                    			try {
                    				field = type.getField(w.toString()).get(null);
                    			} catch( Exception e1 ) {}
                    			if( field!=null )
                    				ret =ProvaConstantImpl.create(field);
                    			else
                    				ret =ProvaVariableImpl
											.create(w.toString(), type);
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:587:5: ^( TYPED_VARIABLE u= UCWORD l= LCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1463); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1467); 
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1471); 

                    match(input, Token.UP, null); 

                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("ws.prova."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new RecognitionException();
                    				}
                    				Object field;
                    				try {
                    					field = type.getField(l.toString()).get(null);
                    				} catch( Exception e1 ) {
                    					throw new RecognitionException();
                    				}
                    				ret =ProvaConstantImpl.create(field);
                    			} catch( Exception e ) {
                    				throw new RecognitionException();
                    			}
                    		

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:607:5: ^( TYPED_VARIABLE u= UCWORD w= UCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1484); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1488); 
                    w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1492); 

                    match(input, Token.UP, null); 

                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("ws.prova."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new RecognitionException();
                    				}
                    				Object field = null;
                    				try {
                    					field = type.getField(w.toString()).get(null);
                    				} catch( Exception e1 ) {}
                    				if( field!=null )
                    					ret =ProvaConstantImpl.create(field);
                    				else
                    					ret =ProvaVariableImpl.create(w.toString(),
												type);
                    			} catch( Exception e ) {
                    				throw new RecognitionException();
                    			}
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "typed_variable"


    // $ANTLR start "prova_list"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:629:1: prova_list returns [ProvaList ret] : ^( PROVA_LIST l= list_body ) ;
    public final ProvaList prova_list() throws RecognitionException {
        ProvaList ret = null;

        ProvaList l = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:630:2: ( ^( PROVA_LIST l= list_body ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:630:4: ^( PROVA_LIST l= list_body )
            {
            match(input,PROVA_LIST,FOLLOW_PROVA_LIST_in_prova_list1511); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_prova_list1515);
            l=list_body();

            state._fsp--;


            match(input, Token.UP, null); 
            ret =l;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "prova_list"


    // $ANTLR start "variable"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:633:1: variable returns [ProvaObject ret] : (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD );
    public final ProvaObject variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree u=null;
        CommonTree usw=null;
        CommonTree gc=null;
        ProvaObject tv = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:639:2: (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD )
            int alt39=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                alt39=1;
                }
                break;
            case USWORD:
                {
                alt39=2;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt39=3;
                }
                break;
            case DOLLARWORD:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:640:3: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_variable1541); 

                    //			// Allow class lookup from pseudo-instance call
                    //			Class<?> type = Calc.findClass("java.lang."+u);
                    //			if( type!=null )
                    //				ret =new ProvaConstantImpl(type);
                    //			else
                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:648:5: usw= USWORD
                    {
                    usw=(CommonTree)match(input,USWORD,FOLLOW_USWORD_in_variable1551); 

                    			if( usw.toString().length()==1 )
                    				ret =ProvaVariableImpl.create(usw.toString());
                    			else
                    				ret =ProvaConstantImpl.create(ProvaParserImpl.tlObjects.get()[Integer.parseInt(usw.toString().substring(1))]);
                    		

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:654:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_variable1561);
                    tv=typed_variable();

                    state._fsp--;

                    ret =tv;

                    }
                    break;
                case 4 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:655:5: gc= DOLLARWORD
                    {
                    gc=(CommonTree)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1571); 
                    ret =ProvaParserImpl.tlKB.get().generateGlobalConstant(gc.toString());

                    }
                    break;

            }

            	if( ret instanceof ProvaVariable ) {
            		((stat_scope)stat_stack.peek()).vars.add(ret);
            	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "variable"


    // $ANTLR start "args"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:658:1: args returns [ProvaList ret] : ^( ARGS lb= list_body ) ;
    public final ProvaList args() throws RecognitionException {
        ProvaList ret = null;

        ProvaList lb = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:659:2: ( ^( ARGS lb= list_body ) )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:659:4: ^( ARGS lb= list_body )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args1589); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_args1593);
            lb=list_body();

            state._fsp--;


            match(input, Token.UP, null); 
            ret =lb;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "args"


    // $ANTLR start "list_tail"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:662:1: list_tail returns [ProvaObject ret] : (v= variable | p= prova_list );
    public final ProvaObject list_tail() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaList p = null;



        	((stat_scope)stat_stack.peek()).inRest = true;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:669:2: (v= variable | p= prova_list )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=TYPED_VARIABLE && LA40_0<=USWORD)||LA40_0==DOLLARWORD||LA40_0==UCWORD) ) {
                alt40=1;
            }
            else if ( (LA40_0==PROVA_LIST) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:669:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_list_tail1622);
                    v=variable();

                    state._fsp--;


                    			ret =v;
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:672:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_list_tail1632);
                    p=prova_list();

                    state._fsp--;

                    ret =p;

                    }
                    break;

            }

            	((stat_scope)stat_stack.peek()).inRest = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "list_tail"


    // $ANTLR start "constant"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:675:1: constant returns [ProvaConstant ret] : (d= LCWORD | s= string | qjc= qualified_java_class );
    public final ProvaConstant constant() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree d=null;
        String s = null;

        ProvaConstant qjc = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:676:2: (d= LCWORD | s= string | qjc= qualified_java_class )
            int alt41=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt41=1;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt41=2;
                }
                break;
            case QUALIFIED_JAVA_CLASS:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:679:3: d= LCWORD
                    {
                    d=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_constant1659); 

                    			Object sd = d.toString();
                    			if( "false".equals(sd) )
                    				ret =ProvaConstantImpl.create(java.lang.Boolean.FALSE);
                    			else if ("true".equals(sd) )
                    				ret =ProvaConstantImpl.create(java.lang.Boolean.TRUE);
                    			else
                    				ret =ProvaParserImpl.tlKB.get().generateGlobalConstant((String) sd);
                    		

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:688:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_constant1669);
                    s=string();

                    state._fsp--;

                    ret =ProvaConstantImpl.create(s.toString());

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:689:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constant1679);
                    qjc=qualified_java_class();

                    state._fsp--;


                    			ret = qjc;
                    			// A minor hack:
                    			// 	we need the class itself, not its name, to be inserted
                    			// This is guaranteed to succeed
                    			//Class type = Calc.findClass((String) qjc.getObject());
                    			//ret = new ProvaConstantImpl(type);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "constant"


    // $ANTLR start "string"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:703:1: string returns [String ret] : (s1= STRING1 | s2= STRING2 );
    public final String string() throws RecognitionException {
        String ret = null;

        CommonTree s1=null;
        CommonTree s2=null;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:704:2: (s1= STRING1 | s2= STRING2 )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==STRING1) ) {
                alt42=1;
            }
            else if ( (LA42_0==STRING2) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:704:4: s1= STRING1
                    {
                    s1=(CommonTree)match(input,STRING1,FOLLOW_STRING1_in_string1701); 
                    ret =s1.toString().substring(1,s1.toString().length()-1);

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:705:5: s2= STRING2
                    {
                    s2=(CommonTree)match(input,STRING2,FOLLOW_STRING2_in_string1711); 
                    ret =s2.toString().substring(1,s2.toString().length()-1);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "string"


    // $ANTLR start "pos_number"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:708:1: pos_number returns [Number ret] : (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal );
    public final Number pos_number() throws RecognitionException {
        Number ret = null;

        CommonTree i=null;
        CommonTree l=null;
        String f = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:709:2: (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==INT_LITERAL) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==DOT) ) {
                    alt43=3;
                }
                else if ( (LA43_1==EOF||LA43_1==UP||(LA43_1>=PLUS && LA43_1<=DIV)||(LA43_1>=OPEN && LA43_1<=CLOSE)||(LA43_1>=EQUAL && LA43_1<=GE)||(LA43_1>=INSTANCE_JAVA_CALL && LA43_1<=STATIC_JAVA_CALL)||LA43_1==PROVA_LIST||(LA43_1>=TYPED_VARIABLE && LA43_1<=QUALIFIED_JAVA_CLASS)||(LA43_1>=REM && LA43_1<=GUARD)||(LA43_1>=LCWORD && LA43_1<=STRING2)) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==LONG_LITERAL) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:709:4: i= INT_LITERAL
                    {
                    i=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1729); 
                    ret =Integer.parseInt(i.toString());

                    }
                    break;
                case 2 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:710:5: l= LONG_LITERAL
                    {
                    l=(CommonTree)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1739); 
                    String s = l.toString(); ret =Long.parseLong(s.substring(0,s.length()-1));

                    }
                    break;
                case 3 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:711:5: f= float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_pos_number1749);
                    f=float_literal();

                    state._fsp--;

                    ret =Double.parseDouble(f.toString());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "pos_number"


    // $ANTLR start "float_literal"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:715:1: float_literal returns [String ret] : i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? ;
    public final String float_literal() throws RecognitionException {
        String ret = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree e=null;

        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:716:2: (i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:716:4: i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )?
            {
            i1=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1769); 
            match(input,DOT,FOLLOW_DOT_in_float_literal1771); 
            i2=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1775); 
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:716:38: (e= EXPONENT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==EXPONENT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:716:39: e= EXPONENT
                    {
                    e=(CommonTree)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1780); 

                    }
                    break;

            }


            			ret =i1.toString()+'.'+i2.toString();
            			if( e!=null )
            				ret+=e.toString();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "float_literal"


    // $ANTLR start "number"
    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:724:1: number returns [ProvaConstant ret] : (m= '-' )? p= pos_number ;
    public final ProvaConstant number() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree m=null;
        Number p = null;


        try {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:725:2: ( (m= '-' )? p= pos_number )
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:725:4: (m= '-' )? p= pos_number
            {
            // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:725:5: (m= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==MINUS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // F:\\sdp\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:725:5: m= '-'
                    {
                    m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_number1802); 

                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1807);
            p=pos_number();

            state._fsp--;


            			if( m==null ) {
            				ret =ProvaConstantImpl.create(p);
            			} else if( p instanceof Integer ) {
            				ret =ProvaConstantImpl.create(-((Integer) p));
            			} else if( p instanceof Long ) {
            				ret =ProvaConstantImpl.create(-((Long) p));
            			} else if( p instanceof Double ) {
            				ret =ProvaConstantImpl.create(-((Double) p));
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "number"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\6\1\2\1\3\3\uffff\1\62\1\uffff\1\4\1\62\2\3";
    static final String DFA16_maxS =
        "\1\67\1\2\1\56\3\uffff\1\62\1\uffff\1\4\1\63\1\3\1\56";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA16_specialS =
        "\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\5\5\uffff\1\5\26\uffff\2\5\1\uffff\1\3\1\uffff\2\5\1\1\2"+
            "\uffff\1\5\4\uffff\1\4\1\2\2\5\2\4",
            "\1\6",
            "\1\5\1\uffff\4\5\36\uffff\1\7\4\uffff\1\5\1\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "",
            "\1\11",
            "\1\10\1\12",
            "\1\13",
            "\1\4\43\uffff\1\7\6\uffff\1\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "252:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )";
        }
    }
    static final String DFA31_eotS =
        "\27\uffff";
    static final String DFA31_eofS =
        "\27\uffff";
    static final String DFA31_minS =
        "\1\6\3\3\1\uffff\1\3\1\2\1\uffff\1\52\1\62\1\2\2\3\1\62\2\3\1\4"+
        "\1\62\1\3\1\62\3\3";
    static final String DFA31_maxS =
        "\4\67\1\uffff\1\67\1\2\1\uffff\2\63\1\2\2\3\1\62\2\67\1\4\1\63"+
        "\1\3\1\63\2\3\1\67";
    static final String DFA31_acceptS =
        "\4\uffff\1\1\2\uffff\1\2\17\uffff";
    static final String DFA31_specialS =
        "\27\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\37\uffff\1\4\1\uffff\1\6\2\4\2\uffff\1\4\4\uffff\1\1\1"+
            "\5\2\4\1\2\1\3",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "\1\10",
            "",
            "\1\12\10\uffff\1\11",
            "\1\13\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4",
            "\1\21",
            "\1\20\1\22",
            "\1\23",
            "\1\24\1\25",
            "\1\26",
            "\1\26",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\7\3\4\2\uffff\1\4\4\uffff"+
            "\6\4"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "521:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term );";
        }
    }
 

    public static final BitSet FOLLOW_RULEBASE_in_rulebase63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_rulebase68 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_STATEMENT_in_statement88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stat_in_statement92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_clause_in_stat125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLAUSE_in_clause153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_clause157 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_clause162 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_literals_in_clause166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METADATA_in_metadata192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_metadata197 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_annotation235 = new BitSet(new long[]{0x00FC000000000048L});
    public static final BitSet FOLLOW_value_in_annotation242 = new BitSet(new long[]{0x00FC000000000048L});
    public static final BitSet FOLLOW_LCWORD_in_value264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_literals317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_literals322 = new BitSet(new long[]{0x00000000C0000808L});
    public static final BitSet FOLLOW_RELATION_in_literal345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal349 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_literal354 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEMANTIC_ATTACHMENT_in_literal370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal374 = new BitSet(new long[]{0x00FC275800000040L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal379 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_literal395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cut_in_literal399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_in_guard419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_guard423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_cut436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_JAVA_CALL_in_static_java_call512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_call_in_static_java_call516 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_static_java_call520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_left_term_in_binary_operation546 = new BitSet(new long[]{0x00FC231800FE1040L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation553 = new BitSet(new long[]{0x00FC275800FE1040L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation612 = new BitSet(new long[]{0x00C4040000000000L});
    public static final BitSet FOLLOW_constant_in_binary_operation616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation626 = new BitSet(new long[]{0x00FC231800FE1040L});
    public static final BitSet FOLLOW_expr_in_binary_operation630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr657 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr662 = new BitSet(new long[]{0x00FC231800FE1040L});
    public static final BitSet FOLLOW_expr_in_expr670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm693 = new BitSet(new long[]{0x0008230000000000L});
    public static final BitSet FOLLOW_variable_in_aterm698 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm704 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm710 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm715 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm719 = new BitSet(new long[]{0x00FC231800FE1040L});
    public static final BitSet FOLLOW_expr_in_aterm723 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm725 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm731 = new BitSet(new long[]{0x00FC231800FE1040L});
    public static final BitSet FOLLOW_aterm_in_aterm741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call792 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call802 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call899 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_instance_java_call903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_instance_call934 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call961 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_in_query1000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_predicate_in_query1004 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_query1008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_relation1031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_relation1035 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_relation1039 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_BODY_in_list_body1151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_terms_in_list_body1156 = new BitSet(new long[]{0x00FC275800000048L});
    public static final BitSet FOLLOW_list_tail_in_list_body1160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_terms1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_terms1197 = new BitSet(new long[]{0x00FC275800000048L});
    public static final BitSet FOLLOW_left_term_in_term1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1309 = new BitSet(new long[]{0x00CC270000000000L});
    public static final BitSet FOLLOW_constant_in_right_term1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1385 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_func_in_func_term1414 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_func_term1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1440 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1467 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1488 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_LIST_in_prova_list1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_prova_list1515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_variable1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_args1589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_args1593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_list_tail1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING1_in_string1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING2_in_string1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1771 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1775 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1802 = new BitSet(new long[]{0x00FC000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1807 = new BitSet(new long[]{0x0000000000000002L});

}