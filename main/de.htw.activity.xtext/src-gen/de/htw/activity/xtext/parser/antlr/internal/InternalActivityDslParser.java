package de.htw.activity.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htw.activity.xtext.services.ActivityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'{'", "'activityPartion'", "'('", "','", "')'", "'edges'", "'}'", "'nodes'", "'activityparameternode'", "'activityGroups'", "'ActivityParameterNode'", "'inBorder'", "'ActivityPartition'", "'activityPartions'", "'InterruptibleActivityRegion'", "'ControlFlow'", "'Name'", "'target'", "'source'", "'ObjectFlow'", "'InterruptEdge'", "'InitialNode'", "'incoming'", "'outgoing'", "'ForkNode'", "'JoinNode'", "'Connector'", "'connected'", "'MergeNode'", "'DecisionNode'", "'FlowFinalNode'", "'ActivityFinalNode'", "'Action'", "'output'", "'input'", "'SendSignalAction'", "'AcceptTimeEventAction'", "'AcceptEventAction'", "'InputPin'", "'OutputPin'", "'Object'", "'CentralBufferNode'", "'DataStoreNode'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalActivityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityDsl.g"; }



     	private ActivityDslGrammarAccess grammarAccess;

        public InternalActivityDslParser(TokenStream input, ActivityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Activity";
       	}

       	@Override
       	protected ActivityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivity"
    // InternalActivityDsl.g:64:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalActivityDsl.g:64:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalActivityDsl.g:65:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalActivityDsl.g:71:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'Activity' otherlv_2= '{' (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )? (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )? (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )? (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_edges_11_0 = null;

        EObject lv_edges_13_0 = null;

        EObject lv_nodes_17_0 = null;

        EObject lv_nodes_19_0 = null;

        EObject lv_activityparameternode_22_0 = null;

        EObject lv_activityGroups_25_0 = null;

        EObject lv_activityGroups_27_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:77:2: ( ( () otherlv_1= 'Activity' otherlv_2= '{' (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )? (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )? (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )? (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalActivityDsl.g:78:2: ( () otherlv_1= 'Activity' otherlv_2= '{' (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )? (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )? (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )? (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalActivityDsl.g:78:2: ( () otherlv_1= 'Activity' otherlv_2= '{' (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )? (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )? (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )? (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalActivityDsl.g:79:3: () otherlv_1= 'Activity' otherlv_2= '{' (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )? (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )? (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )? (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalActivityDsl.g:79:3: ()
            // InternalActivityDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalActivityDsl.g:94:3: (otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityDsl.g:95:4: otherlv_3= 'activityPartion' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getActivityPartionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalActivityDsl.g:103:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:104:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:104:5: ( ruleEString )
                    // InternalActivityDsl.g:105:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityAccess().getActivityPartionActivityPartitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:119:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalActivityDsl.g:120:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalActivityDsl.g:124:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:125:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:125:6: ( ruleEString )
                    	    // InternalActivityDsl.g:126:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getActivityPartionActivityPartitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:146:3: (otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDsl.g:147:4: otherlv_9= 'edges' otherlv_10= '{' ( (lv_edges_11_0= ruleActivityEdge ) ) (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getEdgesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalActivityDsl.g:155:4: ( (lv_edges_11_0= ruleActivityEdge ) )
                    // InternalActivityDsl.g:156:5: (lv_edges_11_0= ruleActivityEdge )
                    {
                    // InternalActivityDsl.g:156:5: (lv_edges_11_0= ruleActivityEdge )
                    // InternalActivityDsl.g:157:6: lv_edges_11_0= ruleActivityEdge
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_edges_11_0=ruleActivityEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_11_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:174:4: (otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalActivityDsl.g:175:5: otherlv_12= ',' ( (lv_edges_13_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDsl.g:179:5: ( (lv_edges_13_0= ruleActivityEdge ) )
                    	    // InternalActivityDsl.g:180:6: (lv_edges_13_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDsl.g:180:6: (lv_edges_13_0= ruleActivityEdge )
                    	    // InternalActivityDsl.g:181:7: lv_edges_13_0= ruleActivityEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_edges_13_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_13_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:204:3: (otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityDsl.g:205:4: otherlv_15= 'nodes' otherlv_16= '{' ( (lv_nodes_17_0= ruleActivityNode ) ) (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getNodesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalActivityDsl.g:213:4: ( (lv_nodes_17_0= ruleActivityNode ) )
                    // InternalActivityDsl.g:214:5: (lv_nodes_17_0= ruleActivityNode )
                    {
                    // InternalActivityDsl.g:214:5: (lv_nodes_17_0= ruleActivityNode )
                    // InternalActivityDsl.g:215:6: lv_nodes_17_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_17_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_17_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:232:4: (otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalActivityDsl.g:233:5: otherlv_18= ',' ( (lv_nodes_19_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:237:5: ( (lv_nodes_19_0= ruleActivityNode ) )
                    	    // InternalActivityDsl.g:238:6: (lv_nodes_19_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDsl.g:238:6: (lv_nodes_19_0= ruleActivityNode )
                    	    // InternalActivityDsl.g:239:7: lv_nodes_19_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_19_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_19_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:262:3: (otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivityDsl.g:263:4: otherlv_21= 'activityparameternode' ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) )
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getActivityparameternodeKeyword_6_0());
                    			
                    // InternalActivityDsl.g:267:4: ( (lv_activityparameternode_22_0= ruleActivityParameterNode ) )
                    // InternalActivityDsl.g:268:5: (lv_activityparameternode_22_0= ruleActivityParameterNode )
                    {
                    // InternalActivityDsl.g:268:5: (lv_activityparameternode_22_0= ruleActivityParameterNode )
                    // InternalActivityDsl.g:269:6: lv_activityparameternode_22_0= ruleActivityParameterNode
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getActivityparameternodeActivityParameterNodeParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_activityparameternode_22_0=ruleActivityParameterNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						set(
                    							current,
                    							"activityparameternode",
                    							lv_activityparameternode_22_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityParameterNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:287:3: (otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalActivityDsl.g:288:4: otherlv_23= 'activityGroups' otherlv_24= '{' ( (lv_activityGroups_25_0= ruleActivityGroup ) ) (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getActivityGroupsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalActivityDsl.g:296:4: ( (lv_activityGroups_25_0= ruleActivityGroup ) )
                    // InternalActivityDsl.g:297:5: (lv_activityGroups_25_0= ruleActivityGroup )
                    {
                    // InternalActivityDsl.g:297:5: (lv_activityGroups_25_0= ruleActivityGroup )
                    // InternalActivityDsl.g:298:6: lv_activityGroups_25_0= ruleActivityGroup
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getActivityGroupsActivityGroupParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_activityGroups_25_0=ruleActivityGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"activityGroups",
                    							lv_activityGroups_25_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:315:4: (otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalActivityDsl.g:316:5: otherlv_26= ',' ( (lv_activityGroups_27_0= ruleActivityGroup ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalActivityDsl.g:320:5: ( (lv_activityGroups_27_0= ruleActivityGroup ) )
                    	    // InternalActivityDsl.g:321:6: (lv_activityGroups_27_0= ruleActivityGroup )
                    	    {
                    	    // InternalActivityDsl.g:321:6: (lv_activityGroups_27_0= ruleActivityGroup )
                    	    // InternalActivityDsl.g:322:7: lv_activityGroups_27_0= ruleActivityGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getActivityGroupsActivityGroupParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_activityGroups_27_0=ruleActivityGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityGroups",
                    	    								lv_activityGroups_27_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityEdge"
    // InternalActivityDsl.g:353:1: entryRuleActivityEdge returns [EObject current=null] : iv_ruleActivityEdge= ruleActivityEdge EOF ;
    public final EObject entryRuleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityEdge = null;


        try {
            // InternalActivityDsl.g:353:53: (iv_ruleActivityEdge= ruleActivityEdge EOF )
            // InternalActivityDsl.g:354:2: iv_ruleActivityEdge= ruleActivityEdge EOF
            {
             newCompositeNode(grammarAccess.getActivityEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityEdge=ruleActivityEdge();

            state._fsp--;

             current =iv_ruleActivityEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityEdge"


    // $ANTLR start "ruleActivityEdge"
    // InternalActivityDsl.g:360:1: ruleActivityEdge returns [EObject current=null] : (this_ControlFlow_0= ruleControlFlow | this_ObjectFlow_1= ruleObjectFlow | this_InterruptEdge_2= ruleInterruptEdge ) ;
    public final EObject ruleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject this_ControlFlow_0 = null;

        EObject this_ObjectFlow_1 = null;

        EObject this_InterruptEdge_2 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:366:2: ( (this_ControlFlow_0= ruleControlFlow | this_ObjectFlow_1= ruleObjectFlow | this_InterruptEdge_2= ruleInterruptEdge ) )
            // InternalActivityDsl.g:367:2: (this_ControlFlow_0= ruleControlFlow | this_ObjectFlow_1= ruleObjectFlow | this_InterruptEdge_2= ruleInterruptEdge )
            {
            // InternalActivityDsl.g:367:2: (this_ControlFlow_0= ruleControlFlow | this_ObjectFlow_1= ruleObjectFlow | this_InterruptEdge_2= ruleInterruptEdge )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalActivityDsl.g:368:3: this_ControlFlow_0= ruleControlFlow
                    {

                    			newCompositeNode(grammarAccess.getActivityEdgeAccess().getControlFlowParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlFlow_0=ruleControlFlow();

                    state._fsp--;


                    			current = this_ControlFlow_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDsl.g:377:3: this_ObjectFlow_1= ruleObjectFlow
                    {

                    			newCompositeNode(grammarAccess.getActivityEdgeAccess().getObjectFlowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectFlow_1=ruleObjectFlow();

                    state._fsp--;


                    			current = this_ObjectFlow_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityDsl.g:386:3: this_InterruptEdge_2= ruleInterruptEdge
                    {

                    			newCompositeNode(grammarAccess.getActivityEdgeAccess().getInterruptEdgeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterruptEdge_2=ruleInterruptEdge();

                    state._fsp--;


                    			current = this_InterruptEdge_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityEdge"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityDsl.g:398:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalActivityDsl.g:398:53: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalActivityDsl.g:399:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
             newCompositeNode(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;

             current =iv_ruleActivityNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityDsl.g:405:1: ruleActivityNode returns [EObject current=null] : (this_InitialNode_0= ruleInitialNode | this_ForkNode_1= ruleForkNode | this_JoinNode_2= ruleJoinNode | this_Connector_3= ruleConnector | this_MergeNode_4= ruleMergeNode | this_DecisionNode_5= ruleDecisionNode | this_FlowFinalNode_6= ruleFlowFinalNode | this_ActivityFinalNode_7= ruleActivityFinalNode | this_Action_8= ruleAction | this_SendSignalAction_9= ruleSendSignalAction | this_AcceptTimeEventAction_10= ruleAcceptTimeEventAction | this_AcceptEventAction_11= ruleAcceptEventAction | this_InputPin_12= ruleInputPin | this_OutputPin_13= ruleOutputPin | this_Object_14= ruleObject | this_CentralBufferNode_15= ruleCentralBufferNode | this_DataStoreNode_16= ruleDataStoreNode ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject this_InitialNode_0 = null;

        EObject this_ForkNode_1 = null;

        EObject this_JoinNode_2 = null;

        EObject this_Connector_3 = null;

        EObject this_MergeNode_4 = null;

        EObject this_DecisionNode_5 = null;

        EObject this_FlowFinalNode_6 = null;

        EObject this_ActivityFinalNode_7 = null;

        EObject this_Action_8 = null;

        EObject this_SendSignalAction_9 = null;

        EObject this_AcceptTimeEventAction_10 = null;

        EObject this_AcceptEventAction_11 = null;

        EObject this_InputPin_12 = null;

        EObject this_OutputPin_13 = null;

        EObject this_Object_14 = null;

        EObject this_CentralBufferNode_15 = null;

        EObject this_DataStoreNode_16 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:411:2: ( (this_InitialNode_0= ruleInitialNode | this_ForkNode_1= ruleForkNode | this_JoinNode_2= ruleJoinNode | this_Connector_3= ruleConnector | this_MergeNode_4= ruleMergeNode | this_DecisionNode_5= ruleDecisionNode | this_FlowFinalNode_6= ruleFlowFinalNode | this_ActivityFinalNode_7= ruleActivityFinalNode | this_Action_8= ruleAction | this_SendSignalAction_9= ruleSendSignalAction | this_AcceptTimeEventAction_10= ruleAcceptTimeEventAction | this_AcceptEventAction_11= ruleAcceptEventAction | this_InputPin_12= ruleInputPin | this_OutputPin_13= ruleOutputPin | this_Object_14= ruleObject | this_CentralBufferNode_15= ruleCentralBufferNode | this_DataStoreNode_16= ruleDataStoreNode ) )
            // InternalActivityDsl.g:412:2: (this_InitialNode_0= ruleInitialNode | this_ForkNode_1= ruleForkNode | this_JoinNode_2= ruleJoinNode | this_Connector_3= ruleConnector | this_MergeNode_4= ruleMergeNode | this_DecisionNode_5= ruleDecisionNode | this_FlowFinalNode_6= ruleFlowFinalNode | this_ActivityFinalNode_7= ruleActivityFinalNode | this_Action_8= ruleAction | this_SendSignalAction_9= ruleSendSignalAction | this_AcceptTimeEventAction_10= ruleAcceptTimeEventAction | this_AcceptEventAction_11= ruleAcceptEventAction | this_InputPin_12= ruleInputPin | this_OutputPin_13= ruleOutputPin | this_Object_14= ruleObject | this_CentralBufferNode_15= ruleCentralBufferNode | this_DataStoreNode_16= ruleDataStoreNode )
            {
            // InternalActivityDsl.g:412:2: (this_InitialNode_0= ruleInitialNode | this_ForkNode_1= ruleForkNode | this_JoinNode_2= ruleJoinNode | this_Connector_3= ruleConnector | this_MergeNode_4= ruleMergeNode | this_DecisionNode_5= ruleDecisionNode | this_FlowFinalNode_6= ruleFlowFinalNode | this_ActivityFinalNode_7= ruleActivityFinalNode | this_Action_8= ruleAction | this_SendSignalAction_9= ruleSendSignalAction | this_AcceptTimeEventAction_10= ruleAcceptTimeEventAction | this_AcceptEventAction_11= ruleAcceptEventAction | this_InputPin_12= ruleInputPin | this_OutputPin_13= ruleOutputPin | this_Object_14= ruleObject | this_CentralBufferNode_15= ruleCentralBufferNode | this_DataStoreNode_16= ruleDataStoreNode )
            int alt11=17;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            case 40:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            case 42:
                {
                alt11=7;
                }
                break;
            case 43:
                {
                alt11=8;
                }
                break;
            case 44:
                {
                alt11=9;
                }
                break;
            case 47:
                {
                alt11=10;
                }
                break;
            case 48:
                {
                alt11=11;
                }
                break;
            case 49:
                {
                alt11=12;
                }
                break;
            case 50:
                {
                alt11=13;
                }
                break;
            case 51:
                {
                alt11=14;
                }
                break;
            case 52:
                {
                alt11=15;
                }
                break;
            case 53:
                {
                alt11=16;
                }
                break;
            case 54:
                {
                alt11=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalActivityDsl.g:413:3: this_InitialNode_0= ruleInitialNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getInitialNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialNode_0=ruleInitialNode();

                    state._fsp--;


                    			current = this_InitialNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDsl.g:422:3: this_ForkNode_1= ruleForkNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getForkNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForkNode_1=ruleForkNode();

                    state._fsp--;


                    			current = this_ForkNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityDsl.g:431:3: this_JoinNode_2= ruleJoinNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getJoinNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoinNode_2=ruleJoinNode();

                    state._fsp--;


                    			current = this_JoinNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalActivityDsl.g:440:3: this_Connector_3= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getConnectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_3=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalActivityDsl.g:449:3: this_MergeNode_4= ruleMergeNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getMergeNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeNode_4=ruleMergeNode();

                    state._fsp--;


                    			current = this_MergeNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalActivityDsl.g:458:3: this_DecisionNode_5= ruleDecisionNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getDecisionNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionNode_5=ruleDecisionNode();

                    state._fsp--;


                    			current = this_DecisionNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalActivityDsl.g:467:3: this_FlowFinalNode_6= ruleFlowFinalNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getFlowFinalNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlowFinalNode_6=ruleFlowFinalNode();

                    state._fsp--;


                    			current = this_FlowFinalNode_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalActivityDsl.g:476:3: this_ActivityFinalNode_7= ruleActivityFinalNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getActivityFinalNodeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityFinalNode_7=ruleActivityFinalNode();

                    state._fsp--;


                    			current = this_ActivityFinalNode_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalActivityDsl.g:485:3: this_Action_8= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getActionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_8=ruleAction();

                    state._fsp--;


                    			current = this_Action_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalActivityDsl.g:494:3: this_SendSignalAction_9= ruleSendSignalAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getSendSignalActionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendSignalAction_9=ruleSendSignalAction();

                    state._fsp--;


                    			current = this_SendSignalAction_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalActivityDsl.g:503:3: this_AcceptTimeEventAction_10= ruleAcceptTimeEventAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getAcceptTimeEventActionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptTimeEventAction_10=ruleAcceptTimeEventAction();

                    state._fsp--;


                    			current = this_AcceptTimeEventAction_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalActivityDsl.g:512:3: this_AcceptEventAction_11= ruleAcceptEventAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getAcceptEventActionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptEventAction_11=ruleAcceptEventAction();

                    state._fsp--;


                    			current = this_AcceptEventAction_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalActivityDsl.g:521:3: this_InputPin_12= ruleInputPin
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getInputPinParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputPin_12=ruleInputPin();

                    state._fsp--;


                    			current = this_InputPin_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalActivityDsl.g:530:3: this_OutputPin_13= ruleOutputPin
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getOutputPinParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutputPin_13=ruleOutputPin();

                    state._fsp--;


                    			current = this_OutputPin_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalActivityDsl.g:539:3: this_Object_14= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getObjectParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_14=ruleObject();

                    state._fsp--;


                    			current = this_Object_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalActivityDsl.g:548:3: this_CentralBufferNode_15= ruleCentralBufferNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getCentralBufferNodeParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_CentralBufferNode_15=ruleCentralBufferNode();

                    state._fsp--;


                    			current = this_CentralBufferNode_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalActivityDsl.g:557:3: this_DataStoreNode_16= ruleDataStoreNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getDataStoreNodeParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataStoreNode_16=ruleDataStoreNode();

                    state._fsp--;


                    			current = this_DataStoreNode_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleActivityGroup"
    // InternalActivityDsl.g:569:1: entryRuleActivityGroup returns [EObject current=null] : iv_ruleActivityGroup= ruleActivityGroup EOF ;
    public final EObject entryRuleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityGroup = null;


        try {
            // InternalActivityDsl.g:569:54: (iv_ruleActivityGroup= ruleActivityGroup EOF )
            // InternalActivityDsl.g:570:2: iv_ruleActivityGroup= ruleActivityGroup EOF
            {
             newCompositeNode(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityGroup=ruleActivityGroup();

            state._fsp--;

             current =iv_ruleActivityGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // InternalActivityDsl.g:576:1: ruleActivityGroup returns [EObject current=null] : (this_ActivityPartition_0= ruleActivityPartition | this_InterruptibleActivityRegion_1= ruleInterruptibleActivityRegion ) ;
    public final EObject ruleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityPartition_0 = null;

        EObject this_InterruptibleActivityRegion_1 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:582:2: ( (this_ActivityPartition_0= ruleActivityPartition | this_InterruptibleActivityRegion_1= ruleInterruptibleActivityRegion ) )
            // InternalActivityDsl.g:583:2: (this_ActivityPartition_0= ruleActivityPartition | this_InterruptibleActivityRegion_1= ruleInterruptibleActivityRegion )
            {
            // InternalActivityDsl.g:583:2: (this_ActivityPartition_0= ruleActivityPartition | this_InterruptibleActivityRegion_1= ruleInterruptibleActivityRegion )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityDsl.g:584:3: this_ActivityPartition_0= ruleActivityPartition
                    {

                    			newCompositeNode(grammarAccess.getActivityGroupAccess().getActivityPartitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityPartition_0=ruleActivityPartition();

                    state._fsp--;


                    			current = this_ActivityPartition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDsl.g:593:3: this_InterruptibleActivityRegion_1= ruleInterruptibleActivityRegion
                    {

                    			newCompositeNode(grammarAccess.getActivityGroupAccess().getInterruptibleActivityRegionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterruptibleActivityRegion_1=ruleInterruptibleActivityRegion();

                    state._fsp--;


                    			current = this_InterruptibleActivityRegion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRuleActivityParameterNode"
    // InternalActivityDsl.g:605:1: entryRuleActivityParameterNode returns [EObject current=null] : iv_ruleActivityParameterNode= ruleActivityParameterNode EOF ;
    public final EObject entryRuleActivityParameterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityParameterNode = null;


        try {
            // InternalActivityDsl.g:605:62: (iv_ruleActivityParameterNode= ruleActivityParameterNode EOF )
            // InternalActivityDsl.g:606:2: iv_ruleActivityParameterNode= ruleActivityParameterNode EOF
            {
             newCompositeNode(grammarAccess.getActivityParameterNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityParameterNode=ruleActivityParameterNode();

            state._fsp--;

             current =iv_ruleActivityParameterNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityParameterNode"


    // $ANTLR start "ruleActivityParameterNode"
    // InternalActivityDsl.g:612:1: ruleActivityParameterNode returns [EObject current=null] : ( () otherlv_1= 'ActivityParameterNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleActivityParameterNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_edges_12_0 = null;

        EObject lv_edges_14_0 = null;

        EObject lv_nodes_18_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_activityparameternode_23_0 = null;

        EObject lv_activityGroups_26_0 = null;

        EObject lv_activityGroups_28_0 = null;

        EObject lv_inBorder_32_0 = null;

        EObject lv_inBorder_34_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:618:2: ( ( () otherlv_1= 'ActivityParameterNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalActivityDsl.g:619:2: ( () otherlv_1= 'ActivityParameterNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalActivityDsl.g:619:2: ( () otherlv_1= 'ActivityParameterNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalActivityDsl.g:620:3: () otherlv_1= 'ActivityParameterNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // InternalActivityDsl.g:620:3: ()
            // InternalActivityDsl.g:621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityParameterNodeAccess().getActivityParameterNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityParameterNodeAccess().getActivityParameterNodeKeyword_1());
            		
            // InternalActivityDsl.g:631:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDsl.g:632:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDsl.g:632:4: (lv_name_2_0= ruleEString )
            // InternalActivityDsl.g:633:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.htw.activity.xtext.ActivityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityParameterNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:654:3: (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalActivityDsl.g:655:4: otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityParameterNodeAccess().getActivityPartionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityParameterNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDsl.g:663:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:664:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:664:5: ( ruleEString )
                    // InternalActivityDsl.g:665:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityParameterNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getActivityPartionActivityPartitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:679:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalActivityDsl.g:680:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityParameterNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDsl.g:684:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:685:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:685:6: ( ruleEString )
                    	    // InternalActivityDsl.g:686:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityParameterNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getActivityPartionActivityPartitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityParameterNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:706:3: (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalActivityDsl.g:707:4: otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getActivityParameterNodeAccess().getEdgesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityParameterNodeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalActivityDsl.g:715:4: ( (lv_edges_12_0= ruleActivityEdge ) )
                    // InternalActivityDsl.g:716:5: (lv_edges_12_0= ruleActivityEdge )
                    {
                    // InternalActivityDsl.g:716:5: (lv_edges_12_0= ruleActivityEdge )
                    // InternalActivityDsl.g:717:6: lv_edges_12_0= ruleActivityEdge
                    {

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getEdgesActivityEdgeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_edges_12_0=ruleActivityEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_12_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:734:4: (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalActivityDsl.g:735:5: otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getActivityParameterNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:739:5: ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    // InternalActivityDsl.g:740:6: (lv_edges_14_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDsl.g:740:6: (lv_edges_14_0= ruleActivityEdge )
                    	    // InternalActivityDsl.g:741:7: lv_edges_14_0= ruleActivityEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getEdgesActivityEdgeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_edges_14_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_14_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityParameterNodeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:764:3: (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalActivityDsl.g:765:4: otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getActivityParameterNodeAccess().getNodesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getActivityParameterNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalActivityDsl.g:773:4: ( (lv_nodes_18_0= ruleActivityNode ) )
                    // InternalActivityDsl.g:774:5: (lv_nodes_18_0= ruleActivityNode )
                    {
                    // InternalActivityDsl.g:774:5: (lv_nodes_18_0= ruleActivityNode )
                    // InternalActivityDsl.g:775:6: lv_nodes_18_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getNodesActivityNodeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_18_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_18_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:792:4: (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalActivityDsl.g:793:5: otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getActivityParameterNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:797:5: ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    // InternalActivityDsl.g:798:6: (lv_nodes_20_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDsl.g:798:6: (lv_nodes_20_0= ruleActivityNode )
                    	    // InternalActivityDsl.g:799:7: lv_nodes_20_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getNodesActivityNodeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_20_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_20_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getActivityParameterNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:822:3: (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityDsl.g:823:4: otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getActivityParameterNodeAccess().getActivityparameternodeKeyword_7_0());
                    			
                    // InternalActivityDsl.g:827:4: ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    // InternalActivityDsl.g:828:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    {
                    // InternalActivityDsl.g:828:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    // InternalActivityDsl.g:829:6: lv_activityparameternode_23_0= ruleActivityParameterNode
                    {

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getActivityparameternodeActivityParameterNodeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_activityparameternode_23_0=ruleActivityParameterNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    						}
                    						set(
                    							current,
                    							"activityparameternode",
                    							lv_activityparameternode_23_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityParameterNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:847:3: (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalActivityDsl.g:848:4: otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getActivityParameterNodeAccess().getActivityGroupsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getActivityParameterNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalActivityDsl.g:856:4: ( (lv_activityGroups_26_0= ruleActivityGroup ) )
                    // InternalActivityDsl.g:857:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    {
                    // InternalActivityDsl.g:857:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    // InternalActivityDsl.g:858:6: lv_activityGroups_26_0= ruleActivityGroup
                    {

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getActivityGroupsActivityGroupParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_activityGroups_26_0=ruleActivityGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    						}
                    						add(
                    							current,
                    							"activityGroups",
                    							lv_activityGroups_26_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:875:4: (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalActivityDsl.g:876:5: otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getActivityParameterNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalActivityDsl.g:880:5: ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    // InternalActivityDsl.g:881:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    {
                    	    // InternalActivityDsl.g:881:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    // InternalActivityDsl.g:882:7: lv_activityGroups_28_0= ruleActivityGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getActivityGroupsActivityGroupParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_activityGroups_28_0=ruleActivityGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityGroups",
                    	    								lv_activityGroups_28_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_29, grammarAccess.getActivityParameterNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:905:3: (otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityDsl.g:906:4: otherlv_30= 'inBorder' otherlv_31= '{' ( (lv_inBorder_32_0= ruleActivityNode ) ) (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getActivityParameterNodeAccess().getInBorderKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_31, grammarAccess.getActivityParameterNodeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalActivityDsl.g:914:4: ( (lv_inBorder_32_0= ruleActivityNode ) )
                    // InternalActivityDsl.g:915:5: (lv_inBorder_32_0= ruleActivityNode )
                    {
                    // InternalActivityDsl.g:915:5: (lv_inBorder_32_0= ruleActivityNode )
                    // InternalActivityDsl.g:916:6: lv_inBorder_32_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getInBorderActivityNodeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_inBorder_32_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    						}
                    						add(
                    							current,
                    							"inBorder",
                    							lv_inBorder_32_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:933:4: (otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalActivityDsl.g:934:5: otherlv_33= ',' ( (lv_inBorder_34_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_33=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getActivityParameterNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalActivityDsl.g:938:5: ( (lv_inBorder_34_0= ruleActivityNode ) )
                    	    // InternalActivityDsl.g:939:6: (lv_inBorder_34_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDsl.g:939:6: (lv_inBorder_34_0= ruleActivityNode )
                    	    // InternalActivityDsl.g:940:7: lv_inBorder_34_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityParameterNodeAccess().getInBorderActivityNodeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_inBorder_34_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityParameterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inBorder",
                    	    								lv_inBorder_34_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_35, grammarAccess.getActivityParameterNodeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getActivityParameterNodeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityParameterNode"


    // $ANTLR start "entryRuleActivityPartition"
    // InternalActivityDsl.g:971:1: entryRuleActivityPartition returns [EObject current=null] : iv_ruleActivityPartition= ruleActivityPartition EOF ;
    public final EObject entryRuleActivityPartition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityPartition = null;


        try {
            // InternalActivityDsl.g:971:58: (iv_ruleActivityPartition= ruleActivityPartition EOF )
            // InternalActivityDsl.g:972:2: iv_ruleActivityPartition= ruleActivityPartition EOF
            {
             newCompositeNode(grammarAccess.getActivityPartitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityPartition=ruleActivityPartition();

            state._fsp--;

             current =iv_ruleActivityPartition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityPartition"


    // $ANTLR start "ruleActivityPartition"
    // InternalActivityDsl.g:978:1: ruleActivityPartition returns [EObject current=null] : ( () otherlv_1= 'ActivityPartition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleActivityPartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_edges_12_0 = null;

        EObject lv_edges_14_0 = null;

        EObject lv_nodes_18_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_activityparameternode_23_0 = null;

        EObject lv_activityGroups_26_0 = null;

        EObject lv_activityGroups_28_0 = null;

        EObject lv_activityPartions_32_0 = null;

        EObject lv_activityPartions_34_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:984:2: ( ( () otherlv_1= 'ActivityPartition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalActivityDsl.g:985:2: ( () otherlv_1= 'ActivityPartition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalActivityDsl.g:985:2: ( () otherlv_1= 'ActivityPartition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalActivityDsl.g:986:3: () otherlv_1= 'ActivityPartition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // InternalActivityDsl.g:986:3: ()
            // InternalActivityDsl.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityPartitionAccess().getActivityPartitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityPartitionAccess().getActivityPartitionKeyword_1());
            		
            // InternalActivityDsl.g:997:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDsl.g:998:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDsl.g:998:4: (lv_name_2_0= ruleEString )
            // InternalActivityDsl.g:999:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityPartitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.htw.activity.xtext.ActivityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityPartitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:1020:3: (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityDsl.g:1021:4: otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityPartitionAccess().getActivityPartionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityPartitionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDsl.g:1029:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1030:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1030:5: ( ruleEString )
                    // InternalActivityDsl.g:1031:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityPartitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityPartionActivityPartitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1045:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1046:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityPartitionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1050:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:1051:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:1051:6: ( ruleEString )
                    	    // InternalActivityDsl.g:1052:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityPartitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityPartionActivityPartitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityPartitionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1072:3: (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActivityDsl.g:1073:4: otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getActivityPartitionAccess().getEdgesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityPartitionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalActivityDsl.g:1081:4: ( (lv_edges_12_0= ruleActivityEdge ) )
                    // InternalActivityDsl.g:1082:5: (lv_edges_12_0= ruleActivityEdge )
                    {
                    // InternalActivityDsl.g:1082:5: (lv_edges_12_0= ruleActivityEdge )
                    // InternalActivityDsl.g:1083:6: lv_edges_12_0= ruleActivityEdge
                    {

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getEdgesActivityEdgeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_edges_12_0=ruleActivityEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_12_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1100:4: (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1101:5: otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getActivityPartitionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1105:5: ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    // InternalActivityDsl.g:1106:6: (lv_edges_14_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDsl.g:1106:6: (lv_edges_14_0= ruleActivityEdge )
                    	    // InternalActivityDsl.g:1107:7: lv_edges_14_0= ruleActivityEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityPartitionAccess().getEdgesActivityEdgeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_edges_14_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_14_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityPartitionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1130:3: (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityDsl.g:1131:4: otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getActivityPartitionAccess().getNodesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getActivityPartitionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalActivityDsl.g:1139:4: ( (lv_nodes_18_0= ruleActivityNode ) )
                    // InternalActivityDsl.g:1140:5: (lv_nodes_18_0= ruleActivityNode )
                    {
                    // InternalActivityDsl.g:1140:5: (lv_nodes_18_0= ruleActivityNode )
                    // InternalActivityDsl.g:1141:6: lv_nodes_18_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getNodesActivityNodeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_18_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_18_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1158:4: (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1159:5: otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getActivityPartitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1163:5: ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    // InternalActivityDsl.g:1164:6: (lv_nodes_20_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDsl.g:1164:6: (lv_nodes_20_0= ruleActivityNode )
                    	    // InternalActivityDsl.g:1165:7: lv_nodes_20_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityPartitionAccess().getNodesActivityNodeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_20_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_20_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getActivityPartitionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1188:3: (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityDsl.g:1189:4: otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getActivityPartitionAccess().getActivityparameternodeKeyword_7_0());
                    			
                    // InternalActivityDsl.g:1193:4: ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    // InternalActivityDsl.g:1194:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    {
                    // InternalActivityDsl.g:1194:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    // InternalActivityDsl.g:1195:6: lv_activityparameternode_23_0= ruleActivityParameterNode
                    {

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityparameternodeActivityParameterNodeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_activityparameternode_23_0=ruleActivityParameterNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    						}
                    						set(
                    							current,
                    							"activityparameternode",
                    							lv_activityparameternode_23_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityParameterNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1213:3: (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalActivityDsl.g:1214:4: otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getActivityPartitionAccess().getActivityGroupsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getActivityPartitionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalActivityDsl.g:1222:4: ( (lv_activityGroups_26_0= ruleActivityGroup ) )
                    // InternalActivityDsl.g:1223:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    {
                    // InternalActivityDsl.g:1223:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    // InternalActivityDsl.g:1224:6: lv_activityGroups_26_0= ruleActivityGroup
                    {

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityGroupsActivityGroupParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_activityGroups_26_0=ruleActivityGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    						}
                    						add(
                    							current,
                    							"activityGroups",
                    							lv_activityGroups_26_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1241:4: (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1242:5: otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getActivityPartitionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1246:5: ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    // InternalActivityDsl.g:1247:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    {
                    	    // InternalActivityDsl.g:1247:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    // InternalActivityDsl.g:1248:7: lv_activityGroups_28_0= ruleActivityGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityGroupsActivityGroupParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_activityGroups_28_0=ruleActivityGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityGroups",
                    	    								lv_activityGroups_28_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_29, grammarAccess.getActivityPartitionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1271:3: (otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalActivityDsl.g:1272:4: otherlv_30= 'activityPartions' otherlv_31= '{' ( (lv_activityPartions_32_0= ruleActivityPartition ) ) (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getActivityPartitionAccess().getActivityPartionsKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_31, grammarAccess.getActivityPartitionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalActivityDsl.g:1280:4: ( (lv_activityPartions_32_0= ruleActivityPartition ) )
                    // InternalActivityDsl.g:1281:5: (lv_activityPartions_32_0= ruleActivityPartition )
                    {
                    // InternalActivityDsl.g:1281:5: (lv_activityPartions_32_0= ruleActivityPartition )
                    // InternalActivityDsl.g:1282:6: lv_activityPartions_32_0= ruleActivityPartition
                    {

                    						newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityPartionsActivityPartitionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_activityPartions_32_0=ruleActivityPartition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    						}
                    						add(
                    							current,
                    							"activityPartions",
                    							lv_activityPartions_32_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityPartition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1299:4: (otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1300:5: otherlv_33= ',' ( (lv_activityPartions_34_0= ruleActivityPartition ) )
                    	    {
                    	    otherlv_33=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getActivityPartitionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1304:5: ( (lv_activityPartions_34_0= ruleActivityPartition ) )
                    	    // InternalActivityDsl.g:1305:6: (lv_activityPartions_34_0= ruleActivityPartition )
                    	    {
                    	    // InternalActivityDsl.g:1305:6: (lv_activityPartions_34_0= ruleActivityPartition )
                    	    // InternalActivityDsl.g:1306:7: lv_activityPartions_34_0= ruleActivityPartition
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityPartitionAccess().getActivityPartionsActivityPartitionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_activityPartions_34_0=ruleActivityPartition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityPartitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityPartions",
                    	    								lv_activityPartions_34_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityPartition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_35, grammarAccess.getActivityPartitionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getActivityPartitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityPartition"


    // $ANTLR start "entryRuleInterruptibleActivityRegion"
    // InternalActivityDsl.g:1337:1: entryRuleInterruptibleActivityRegion returns [EObject current=null] : iv_ruleInterruptibleActivityRegion= ruleInterruptibleActivityRegion EOF ;
    public final EObject entryRuleInterruptibleActivityRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterruptibleActivityRegion = null;


        try {
            // InternalActivityDsl.g:1337:68: (iv_ruleInterruptibleActivityRegion= ruleInterruptibleActivityRegion EOF )
            // InternalActivityDsl.g:1338:2: iv_ruleInterruptibleActivityRegion= ruleInterruptibleActivityRegion EOF
            {
             newCompositeNode(grammarAccess.getInterruptibleActivityRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterruptibleActivityRegion=ruleInterruptibleActivityRegion();

            state._fsp--;

             current =iv_ruleInterruptibleActivityRegion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterruptibleActivityRegion"


    // $ANTLR start "ruleInterruptibleActivityRegion"
    // InternalActivityDsl.g:1344:1: ruleInterruptibleActivityRegion returns [EObject current=null] : ( () otherlv_1= 'InterruptibleActivityRegion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleInterruptibleActivityRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_edges_12_0 = null;

        EObject lv_edges_14_0 = null;

        EObject lv_nodes_18_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_activityparameternode_23_0 = null;

        EObject lv_activityGroups_26_0 = null;

        EObject lv_activityGroups_28_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:1350:2: ( ( () otherlv_1= 'InterruptibleActivityRegion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalActivityDsl.g:1351:2: ( () otherlv_1= 'InterruptibleActivityRegion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalActivityDsl.g:1351:2: ( () otherlv_1= 'InterruptibleActivityRegion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalActivityDsl.g:1352:3: () otherlv_1= 'InterruptibleActivityRegion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )? (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )? (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )? (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalActivityDsl.g:1352:3: ()
            // InternalActivityDsl.g:1353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterruptibleActivityRegionAccess().getInterruptibleActivityRegionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInterruptibleActivityRegionAccess().getInterruptibleActivityRegionKeyword_1());
            		
            // InternalActivityDsl.g:1363:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDsl.g:1364:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDsl.g:1364:4: (lv_name_2_0= ruleEString )
            // InternalActivityDsl.g:1365:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.htw.activity.xtext.ActivityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getInterruptibleActivityRegionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:1386:3: (otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalActivityDsl.g:1387:4: otherlv_4= 'activityPartion' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterruptibleActivityRegionAccess().getActivityPartionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterruptibleActivityRegionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDsl.g:1395:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1396:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1396:5: ( ruleEString )
                    // InternalActivityDsl.g:1397:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterruptibleActivityRegionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getActivityPartionActivityPartitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1411:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1412:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterruptibleActivityRegionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1416:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:1417:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:1417:6: ( ruleEString )
                    	    // InternalActivityDsl.g:1418:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInterruptibleActivityRegionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getActivityPartionActivityPartitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterruptibleActivityRegionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1438:3: (otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalActivityDsl.g:1439:4: otherlv_10= 'edges' otherlv_11= '{' ( (lv_edges_12_0= ruleActivityEdge ) ) (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getInterruptibleActivityRegionAccess().getEdgesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getInterruptibleActivityRegionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalActivityDsl.g:1447:4: ( (lv_edges_12_0= ruleActivityEdge ) )
                    // InternalActivityDsl.g:1448:5: (lv_edges_12_0= ruleActivityEdge )
                    {
                    // InternalActivityDsl.g:1448:5: (lv_edges_12_0= ruleActivityEdge )
                    // InternalActivityDsl.g:1449:6: lv_edges_12_0= ruleActivityEdge
                    {

                    						newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getEdgesActivityEdgeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_edges_12_0=ruleActivityEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_12_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1466:4: (otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1467:5: otherlv_13= ',' ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getInterruptibleActivityRegionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1471:5: ( (lv_edges_14_0= ruleActivityEdge ) )
                    	    // InternalActivityDsl.g:1472:6: (lv_edges_14_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDsl.g:1472:6: (lv_edges_14_0= ruleActivityEdge )
                    	    // InternalActivityDsl.g:1473:7: lv_edges_14_0= ruleActivityEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getEdgesActivityEdgeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_edges_14_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_14_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getInterruptibleActivityRegionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1496:3: (otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalActivityDsl.g:1497:4: otherlv_16= 'nodes' otherlv_17= '{' ( (lv_nodes_18_0= ruleActivityNode ) ) (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getInterruptibleActivityRegionAccess().getNodesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getInterruptibleActivityRegionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalActivityDsl.g:1505:4: ( (lv_nodes_18_0= ruleActivityNode ) )
                    // InternalActivityDsl.g:1506:5: (lv_nodes_18_0= ruleActivityNode )
                    {
                    // InternalActivityDsl.g:1506:5: (lv_nodes_18_0= ruleActivityNode )
                    // InternalActivityDsl.g:1507:6: lv_nodes_18_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getNodesActivityNodeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_18_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_18_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1524:4: (otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1525:5: otherlv_19= ',' ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getInterruptibleActivityRegionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1529:5: ( (lv_nodes_20_0= ruleActivityNode ) )
                    	    // InternalActivityDsl.g:1530:6: (lv_nodes_20_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDsl.g:1530:6: (lv_nodes_20_0= ruleActivityNode )
                    	    // InternalActivityDsl.g:1531:7: lv_nodes_20_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getNodesActivityNodeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_20_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_20_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getInterruptibleActivityRegionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:1554:3: (otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalActivityDsl.g:1555:4: otherlv_22= 'activityparameternode' ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getInterruptibleActivityRegionAccess().getActivityparameternodeKeyword_7_0());
                    			
                    // InternalActivityDsl.g:1559:4: ( (lv_activityparameternode_23_0= ruleActivityParameterNode ) )
                    // InternalActivityDsl.g:1560:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    {
                    // InternalActivityDsl.g:1560:5: (lv_activityparameternode_23_0= ruleActivityParameterNode )
                    // InternalActivityDsl.g:1561:6: lv_activityparameternode_23_0= ruleActivityParameterNode
                    {

                    						newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getActivityparameternodeActivityParameterNodeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_activityparameternode_23_0=ruleActivityParameterNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    						}
                    						set(
                    							current,
                    							"activityparameternode",
                    							lv_activityparameternode_23_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityParameterNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1579:3: (otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalActivityDsl.g:1580:4: otherlv_24= 'activityGroups' otherlv_25= '{' ( (lv_activityGroups_26_0= ruleActivityGroup ) ) (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getInterruptibleActivityRegionAccess().getActivityGroupsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getInterruptibleActivityRegionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalActivityDsl.g:1588:4: ( (lv_activityGroups_26_0= ruleActivityGroup ) )
                    // InternalActivityDsl.g:1589:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    {
                    // InternalActivityDsl.g:1589:5: (lv_activityGroups_26_0= ruleActivityGroup )
                    // InternalActivityDsl.g:1590:6: lv_activityGroups_26_0= ruleActivityGroup
                    {

                    						newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getActivityGroupsActivityGroupParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_activityGroups_26_0=ruleActivityGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    						}
                    						add(
                    							current,
                    							"activityGroups",
                    							lv_activityGroups_26_0,
                    							"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:1607:4: (otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalActivityDsl.g:1608:5: otherlv_27= ',' ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getInterruptibleActivityRegionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalActivityDsl.g:1612:5: ( (lv_activityGroups_28_0= ruleActivityGroup ) )
                    	    // InternalActivityDsl.g:1613:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    {
                    	    // InternalActivityDsl.g:1613:6: (lv_activityGroups_28_0= ruleActivityGroup )
                    	    // InternalActivityDsl.g:1614:7: lv_activityGroups_28_0= ruleActivityGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterruptibleActivityRegionAccess().getActivityGroupsActivityGroupParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_activityGroups_28_0=ruleActivityGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterruptibleActivityRegionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityGroups",
                    	    								lv_activityGroups_28_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.ActivityGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getInterruptibleActivityRegionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getInterruptibleActivityRegionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterruptibleActivityRegion"


    // $ANTLR start "entryRuleEString"
    // InternalActivityDsl.g:1645:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalActivityDsl.g:1645:47: (iv_ruleEString= ruleEString EOF )
            // InternalActivityDsl.g:1646:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalActivityDsl.g:1652:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalActivityDsl.g:1658:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalActivityDsl.g:1659:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalActivityDsl.g:1659:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalActivityDsl.g:1660:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDsl.g:1668:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleControlFlow"
    // InternalActivityDsl.g:1679:1: entryRuleControlFlow returns [EObject current=null] : iv_ruleControlFlow= ruleControlFlow EOF ;
    public final EObject entryRuleControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlow = null;


        try {
            // InternalActivityDsl.g:1679:52: (iv_ruleControlFlow= ruleControlFlow EOF )
            // InternalActivityDsl.g:1680:2: iv_ruleControlFlow= ruleControlFlow EOF
            {
             newCompositeNode(grammarAccess.getControlFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFlow=ruleControlFlow();

            state._fsp--;

             current =iv_ruleControlFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlFlow"


    // $ANTLR start "ruleControlFlow"
    // InternalActivityDsl.g:1686:1: ruleControlFlow returns [EObject current=null] : ( () otherlv_1= 'ControlFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleControlFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:1692:2: ( ( () otherlv_1= 'ControlFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalActivityDsl.g:1693:2: ( () otherlv_1= 'ControlFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalActivityDsl.g:1693:2: ( () otherlv_1= 'ControlFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalActivityDsl.g:1694:3: () otherlv_1= 'ControlFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalActivityDsl.g:1694:3: ()
            // InternalActivityDsl.g:1695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlFlowAccess().getControlFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getControlFlowAccess().getControlFlowKeyword_1());
            		
            // InternalActivityDsl.g:1705:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:1706:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:1706:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:1707:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getControlFlowAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControlFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getControlFlowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:1727:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalActivityDsl.g:1728:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getControlFlowAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:1732:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:1733:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:1733:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:1734:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControlFlowRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1752:3: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalActivityDsl.g:1753:4: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getControlFlowAccess().getTargetKeyword_5_0());
                    			
                    // InternalActivityDsl.g:1757:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1758:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1758:5: ( ruleEString )
                    // InternalActivityDsl.g:1759:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getTargetActivityNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1774:3: (otherlv_8= 'source' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalActivityDsl.g:1775:4: otherlv_8= 'source' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getControlFlowAccess().getSourceKeyword_6_0());
                    			
                    // InternalActivityDsl.g:1779:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1780:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1780:5: ( ruleEString )
                    // InternalActivityDsl.g:1781:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getSourceActivityNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getControlFlowAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlFlow"


    // $ANTLR start "entryRuleObjectFlow"
    // InternalActivityDsl.g:1804:1: entryRuleObjectFlow returns [EObject current=null] : iv_ruleObjectFlow= ruleObjectFlow EOF ;
    public final EObject entryRuleObjectFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFlow = null;


        try {
            // InternalActivityDsl.g:1804:51: (iv_ruleObjectFlow= ruleObjectFlow EOF )
            // InternalActivityDsl.g:1805:2: iv_ruleObjectFlow= ruleObjectFlow EOF
            {
             newCompositeNode(grammarAccess.getObjectFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectFlow=ruleObjectFlow();

            state._fsp--;

             current =iv_ruleObjectFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectFlow"


    // $ANTLR start "ruleObjectFlow"
    // InternalActivityDsl.g:1811:1: ruleObjectFlow returns [EObject current=null] : ( () otherlv_1= 'ObjectFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleObjectFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:1817:2: ( ( () otherlv_1= 'ObjectFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalActivityDsl.g:1818:2: ( () otherlv_1= 'ObjectFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalActivityDsl.g:1818:2: ( () otherlv_1= 'ObjectFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalActivityDsl.g:1819:3: () otherlv_1= 'ObjectFlow' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalActivityDsl.g:1819:3: ()
            // InternalActivityDsl.g:1820:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectFlowAccess().getObjectFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFlowAccess().getObjectFlowKeyword_1());
            		
            // InternalActivityDsl.g:1830:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:1831:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:1831:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:1832:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getObjectFlowAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectFlowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:1852:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalActivityDsl.g:1853:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectFlowAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:1857:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:1858:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:1858:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:1859:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getObjectFlowAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectFlowRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1877:3: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalActivityDsl.g:1878:4: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectFlowAccess().getTargetKeyword_5_0());
                    			
                    // InternalActivityDsl.g:1882:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1883:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1883:5: ( ruleEString )
                    // InternalActivityDsl.g:1884:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectFlowAccess().getTargetActivityNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:1899:3: (otherlv_8= 'source' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalActivityDsl.g:1900:4: otherlv_8= 'source' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectFlowAccess().getSourceKeyword_6_0());
                    			
                    // InternalActivityDsl.g:1904:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:1905:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:1905:5: ( ruleEString )
                    // InternalActivityDsl.g:1906:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectFlowAccess().getSourceActivityNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getObjectFlowAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectFlow"


    // $ANTLR start "entryRuleInterruptEdge"
    // InternalActivityDsl.g:1929:1: entryRuleInterruptEdge returns [EObject current=null] : iv_ruleInterruptEdge= ruleInterruptEdge EOF ;
    public final EObject entryRuleInterruptEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterruptEdge = null;


        try {
            // InternalActivityDsl.g:1929:54: (iv_ruleInterruptEdge= ruleInterruptEdge EOF )
            // InternalActivityDsl.g:1930:2: iv_ruleInterruptEdge= ruleInterruptEdge EOF
            {
             newCompositeNode(grammarAccess.getInterruptEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterruptEdge=ruleInterruptEdge();

            state._fsp--;

             current =iv_ruleInterruptEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterruptEdge"


    // $ANTLR start "ruleInterruptEdge"
    // InternalActivityDsl.g:1936:1: ruleInterruptEdge returns [EObject current=null] : ( () otherlv_1= 'InterruptEdge' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleInterruptEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:1942:2: ( ( () otherlv_1= 'InterruptEdge' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalActivityDsl.g:1943:2: ( () otherlv_1= 'InterruptEdge' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalActivityDsl.g:1943:2: ( () otherlv_1= 'InterruptEdge' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalActivityDsl.g:1944:3: () otherlv_1= 'InterruptEdge' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'source' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalActivityDsl.g:1944:3: ()
            // InternalActivityDsl.g:1945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterruptEdgeAccess().getInterruptEdgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getInterruptEdgeAccess().getInterruptEdgeKeyword_1());
            		
            // InternalActivityDsl.g:1955:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:1956:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:1956:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:1957:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getInterruptEdgeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterruptEdgeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getInterruptEdgeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:1977:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalActivityDsl.g:1978:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterruptEdgeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:1982:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:1983:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:1983:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:1984:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInterruptEdgeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptEdgeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2002:3: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalActivityDsl.g:2003:4: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getInterruptEdgeAccess().getTargetKeyword_5_0());
                    			
                    // InternalActivityDsl.g:2007:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2008:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2008:5: ( ruleEString )
                    // InternalActivityDsl.g:2009:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterruptEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterruptEdgeAccess().getTargetActivityNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2024:3: (otherlv_8= 'source' ( ( ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalActivityDsl.g:2025:4: otherlv_8= 'source' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getInterruptEdgeAccess().getSourceKeyword_6_0());
                    			
                    // InternalActivityDsl.g:2029:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2030:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2030:5: ( ruleEString )
                    // InternalActivityDsl.g:2031:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterruptEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterruptEdgeAccess().getSourceActivityNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterruptEdgeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterruptEdge"


    // $ANTLR start "entryRuleInitialNode"
    // InternalActivityDsl.g:2054:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalActivityDsl.g:2054:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalActivityDsl.g:2055:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalActivityDsl.g:2061:1: ruleInitialNode returns [EObject current=null] : ( () otherlv_1= 'InitialNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:2067:2: ( ( () otherlv_1= 'InitialNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:2068:2: ( () otherlv_1= 'InitialNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:2068:2: ( () otherlv_1= 'InitialNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:2069:3: () otherlv_1= 'InitialNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:2069:3: ()
            // InternalActivityDsl.g:2070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialNodeAccess().getInitialNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_1());
            		
            // InternalActivityDsl.g:2080:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:2081:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:2081:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:2082:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getInitialNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:2102:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalActivityDsl.g:2103:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getInitialNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:2107:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:2108:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:2108:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:2109:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInitialNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2127:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalActivityDsl.g:2128:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInitialNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:2136:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2137:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2137:5: ( ruleEString )
                    // InternalActivityDsl.g:2138:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInitialNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2152:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==15) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2153:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getInitialNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2157:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2158:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2158:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2159:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInitialNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInitialNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2179:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalActivityDsl.g:2180:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getInitialNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:2188:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2189:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2189:5: ( ruleEString )
                    // InternalActivityDsl.g:2190:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2204:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==15) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2205:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInitialNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2209:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2210:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2210:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2211:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInitialNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getInitialNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalActivityDsl.g:2239:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalActivityDsl.g:2239:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalActivityDsl.g:2240:2: iv_ruleForkNode= ruleForkNode EOF
            {
             newCompositeNode(grammarAccess.getForkNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;

             current =iv_ruleForkNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalActivityDsl.g:2246:1: ruleForkNode returns [EObject current=null] : ( () otherlv_1= 'ForkNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:2252:2: ( ( () otherlv_1= 'ForkNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:2253:2: ( () otherlv_1= 'ForkNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:2253:2: ( () otherlv_1= 'ForkNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:2254:3: () otherlv_1= 'ForkNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:2254:3: ()
            // InternalActivityDsl.g:2255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForkNodeAccess().getForkNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getForkNodeKeyword_1());
            		
            // InternalActivityDsl.g:2265:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:2266:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:2266:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:2267:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getForkNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:2287:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==28) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalActivityDsl.g:2288:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:2292:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:2293:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:2293:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:2294:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForkNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2312:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalActivityDsl.g:2313:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getForkNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:2321:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2322:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2322:5: ( ruleEString )
                    // InternalActivityDsl.g:2323:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForkNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForkNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2337:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==15) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2338:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getForkNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2342:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2343:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2343:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2344:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForkNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForkNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2364:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==35) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalActivityDsl.g:2365:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getForkNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:2373:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2374:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2374:5: ( ruleEString )
                    // InternalActivityDsl.g:2375:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForkNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2389:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2390:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getForkNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2394:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2395:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2395:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2396:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForkNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getForkNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalActivityDsl.g:2424:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalActivityDsl.g:2424:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalActivityDsl.g:2425:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
             newCompositeNode(grammarAccess.getJoinNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;

             current =iv_ruleJoinNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalActivityDsl.g:2431:1: ruleJoinNode returns [EObject current=null] : ( () otherlv_1= 'JoinNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:2437:2: ( ( () otherlv_1= 'JoinNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:2438:2: ( () otherlv_1= 'JoinNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:2438:2: ( () otherlv_1= 'JoinNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:2439:3: () otherlv_1= 'JoinNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:2439:3: ()
            // InternalActivityDsl.g:2440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinNodeAccess().getJoinNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getJoinNodeKeyword_1());
            		
            // InternalActivityDsl.g:2450:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:2451:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:2451:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:2452:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getJoinNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:2472:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==28) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalActivityDsl.g:2473:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:2477:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:2478:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:2478:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:2479:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJoinNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2497:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==34) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalActivityDsl.g:2498:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getJoinNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:2506:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2507:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2507:5: ( ruleEString )
                    // InternalActivityDsl.g:2508:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2522:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2523:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getJoinNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2527:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2528:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2528:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2529:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2549:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalActivityDsl.g:2550:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getJoinNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:2558:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2559:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2559:5: ( ruleEString )
                    // InternalActivityDsl.g:2560:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJoinNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2574:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==15) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2575:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getJoinNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2579:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2580:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2580:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2581:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJoinNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getJoinNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleConnector"
    // InternalActivityDsl.g:2609:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalActivityDsl.g:2609:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalActivityDsl.g:2610:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalActivityDsl.g:2616:1: ruleConnector returns [EObject current=null] : ( () otherlv_1= 'Connector' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'connected' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:2622:2: ( ( () otherlv_1= 'Connector' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'connected' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalActivityDsl.g:2623:2: ( () otherlv_1= 'Connector' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'connected' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalActivityDsl.g:2623:2: ( () otherlv_1= 'Connector' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'connected' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalActivityDsl.g:2624:3: () otherlv_1= 'Connector' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'connected' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalActivityDsl.g:2624:3: ()
            // InternalActivityDsl.g:2625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorAccess().getConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getConnectorKeyword_1());
            		
            // InternalActivityDsl.g:2635:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:2636:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:2636:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:2637:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getConnectorAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:2657:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==28) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalActivityDsl.g:2658:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:2662:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:2663:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:2663:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:2664:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2682:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==34) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalActivityDsl.g:2683:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:2691:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2692:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2692:5: ( ruleEString )
                    // InternalActivityDsl.g:2693:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2707:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==15) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2708:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getConnectorAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2712:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2713:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2713:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2714:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConnectorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConnectorAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2734:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==35) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalActivityDsl.g:2735:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getConnectorAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:2743:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2744:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2744:5: ( ruleEString )
                    // InternalActivityDsl.g:2745:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2759:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==15) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2760:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConnectorAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2764:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2765:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2765:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2766:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConnectorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConnectorAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_17, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2786:3: (otherlv_18= 'connected' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==39) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalActivityDsl.g:2787:4: otherlv_18= 'connected' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getConnectorAccess().getConnectedKeyword_7_0());
                    			
                    // InternalActivityDsl.g:2791:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2792:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2792:5: ( ruleEString )
                    // InternalActivityDsl.g:2793:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorAccess().getConnectedConnectorCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleMergeNode"
    // InternalActivityDsl.g:2816:1: entryRuleMergeNode returns [EObject current=null] : iv_ruleMergeNode= ruleMergeNode EOF ;
    public final EObject entryRuleMergeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeNode = null;


        try {
            // InternalActivityDsl.g:2816:50: (iv_ruleMergeNode= ruleMergeNode EOF )
            // InternalActivityDsl.g:2817:2: iv_ruleMergeNode= ruleMergeNode EOF
            {
             newCompositeNode(grammarAccess.getMergeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeNode=ruleMergeNode();

            state._fsp--;

             current =iv_ruleMergeNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMergeNode"


    // $ANTLR start "ruleMergeNode"
    // InternalActivityDsl.g:2823:1: ruleMergeNode returns [EObject current=null] : ( () otherlv_1= 'MergeNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleMergeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:2829:2: ( ( () otherlv_1= 'MergeNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:2830:2: ( () otherlv_1= 'MergeNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:2830:2: ( () otherlv_1= 'MergeNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:2831:3: () otherlv_1= 'MergeNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:2831:3: ()
            // InternalActivityDsl.g:2832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMergeNodeAccess().getMergeNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMergeNodeAccess().getMergeNodeKeyword_1());
            		
            // InternalActivityDsl.g:2842:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:2843:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:2843:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:2844:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getMergeNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getMergeNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:2864:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==28) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalActivityDsl.g:2865:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMergeNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:2869:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:2870:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:2870:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:2871:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMergeNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMergeNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:2889:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==34) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalActivityDsl.g:2890:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMergeNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:2898:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2899:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2899:5: ( ruleEString )
                    // InternalActivityDsl.g:2900:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2914:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==15) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2915:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMergeNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2919:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2920:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2920:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2921:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMergeNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:2941:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==35) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalActivityDsl.g:2942:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getMergeNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:2950:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:2951:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:2951:5: ( ruleEString )
                    // InternalActivityDsl.g:2952:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMergeNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:2966:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==15) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalActivityDsl.g:2967:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMergeNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:2971:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:2972:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:2972:6: ( ruleEString )
                    	    // InternalActivityDsl.g:2973:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMergeNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMergeNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMergeNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMergeNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalActivityDsl.g:3001:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalActivityDsl.g:3001:53: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalActivityDsl.g:3002:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
             newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;

             current =iv_ruleDecisionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalActivityDsl.g:3008:1: ruleDecisionNode returns [EObject current=null] : ( () otherlv_1= 'DecisionNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:3014:2: ( ( () otherlv_1= 'DecisionNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:3015:2: ( () otherlv_1= 'DecisionNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:3015:2: ( () otherlv_1= 'DecisionNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:3016:3: () otherlv_1= 'DecisionNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:3016:3: ()
            // InternalActivityDsl.g:3017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionNodeAccess().getDecisionNodeKeyword_1());
            		
            // InternalActivityDsl.g:3027:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:3028:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:3028:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:3029:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getDecisionNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:3049:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==28) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalActivityDsl.g:3050:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecisionNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:3054:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:3055:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:3055:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:3056:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:3074:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==34) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalActivityDsl.g:3075:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getDecisionNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:3083:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3084:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3084:5: ( ruleEString )
                    // InternalActivityDsl.g:3085:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecisionNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3099:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==15) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3100:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDecisionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3104:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3105:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3105:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3106:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecisionNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3126:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==35) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalActivityDsl.g:3127:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecisionNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:3135:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3136:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3136:5: ( ruleEString )
                    // InternalActivityDsl.g:3137:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3151:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==15) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3152:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDecisionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3156:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3157:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3157:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3158:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDecisionNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleFlowFinalNode"
    // InternalActivityDsl.g:3186:1: entryRuleFlowFinalNode returns [EObject current=null] : iv_ruleFlowFinalNode= ruleFlowFinalNode EOF ;
    public final EObject entryRuleFlowFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowFinalNode = null;


        try {
            // InternalActivityDsl.g:3186:54: (iv_ruleFlowFinalNode= ruleFlowFinalNode EOF )
            // InternalActivityDsl.g:3187:2: iv_ruleFlowFinalNode= ruleFlowFinalNode EOF
            {
             newCompositeNode(grammarAccess.getFlowFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowFinalNode=ruleFlowFinalNode();

            state._fsp--;

             current =iv_ruleFlowFinalNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowFinalNode"


    // $ANTLR start "ruleFlowFinalNode"
    // InternalActivityDsl.g:3193:1: ruleFlowFinalNode returns [EObject current=null] : ( () otherlv_1= 'FlowFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleFlowFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:3199:2: ( ( () otherlv_1= 'FlowFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:3200:2: ( () otherlv_1= 'FlowFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:3200:2: ( () otherlv_1= 'FlowFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:3201:3: () otherlv_1= 'FlowFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:3201:3: ()
            // InternalActivityDsl.g:3202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFlowFinalNodeAccess().getFlowFinalNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getFlowFinalNodeAccess().getFlowFinalNodeKeyword_1());
            		
            // InternalActivityDsl.g:3212:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:3213:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:3213:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:3214:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getFlowFinalNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowFinalNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getFlowFinalNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:3234:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==28) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalActivityDsl.g:3235:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getFlowFinalNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:3239:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:3240:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:3240:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:3241:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFlowFinalNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFlowFinalNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:3259:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==34) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalActivityDsl.g:3260:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getFlowFinalNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getFlowFinalNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:3268:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3269:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3269:5: ( ruleEString )
                    // InternalActivityDsl.g:3270:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlowFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFlowFinalNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3284:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==15) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3285:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFlowFinalNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3289:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3290:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3290:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3291:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFlowFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFlowFinalNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getFlowFinalNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3311:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==35) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalActivityDsl.g:3312:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getFlowFinalNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getFlowFinalNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:3320:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3321:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3321:5: ( ruleEString )
                    // InternalActivityDsl.g:3322:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlowFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFlowFinalNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3336:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==15) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3337:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getFlowFinalNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3341:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3342:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3342:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3343:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFlowFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFlowFinalNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getFlowFinalNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getFlowFinalNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowFinalNode"


    // $ANTLR start "entryRuleActivityFinalNode"
    // InternalActivityDsl.g:3371:1: entryRuleActivityFinalNode returns [EObject current=null] : iv_ruleActivityFinalNode= ruleActivityFinalNode EOF ;
    public final EObject entryRuleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityFinalNode = null;


        try {
            // InternalActivityDsl.g:3371:58: (iv_ruleActivityFinalNode= ruleActivityFinalNode EOF )
            // InternalActivityDsl.g:3372:2: iv_ruleActivityFinalNode= ruleActivityFinalNode EOF
            {
             newCompositeNode(grammarAccess.getActivityFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityFinalNode=ruleActivityFinalNode();

            state._fsp--;

             current =iv_ruleActivityFinalNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityFinalNode"


    // $ANTLR start "ruleActivityFinalNode"
    // InternalActivityDsl.g:3378:1: ruleActivityFinalNode returns [EObject current=null] : ( () otherlv_1= 'ActivityFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:3384:2: ( ( () otherlv_1= 'ActivityFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:3385:2: ( () otherlv_1= 'ActivityFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:3385:2: ( () otherlv_1= 'ActivityFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:3386:3: () otherlv_1= 'ActivityFinalNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:3386:3: ()
            // InternalActivityDsl.g:3387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityFinalNodeAccess().getActivityFinalNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityFinalNodeAccess().getActivityFinalNodeKeyword_1());
            		
            // InternalActivityDsl.g:3397:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:3398:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:3398:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:3399:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getActivityFinalNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityFinalNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityFinalNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:3419:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==28) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalActivityDsl.g:3420:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityFinalNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:3424:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:3425:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:3425:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:3426:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityFinalNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:3444:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==34) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalActivityDsl.g:3445:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivityFinalNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getActivityFinalNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:3453:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3454:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3454:5: ( ruleEString )
                    // InternalActivityDsl.g:3455:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3469:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==15) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3470:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getActivityFinalNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3474:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3475:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3475:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3476:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityFinalNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3496:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==35) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalActivityDsl.g:3497:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getActivityFinalNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getActivityFinalNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:3505:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3506:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3506:5: ( ruleEString )
                    // InternalActivityDsl.g:3507:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3521:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3522:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getActivityFinalNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3526:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3527:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3527:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3528:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getActivityFinalNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getActivityFinalNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityFinalNode"


    // $ANTLR start "entryRuleAction"
    // InternalActivityDsl.g:3556:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalActivityDsl.g:3556:47: (iv_ruleAction= ruleAction EOF )
            // InternalActivityDsl.g:3557:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalActivityDsl.g:3563:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )? (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        EObject lv_output_20_0 = null;

        EObject lv_output_22_0 = null;

        EObject lv_input_26_0 = null;

        EObject lv_input_28_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:3569:2: ( ( () otherlv_1= 'Action' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )? (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalActivityDsl.g:3570:2: ( () otherlv_1= 'Action' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )? (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalActivityDsl.g:3570:2: ( () otherlv_1= 'Action' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )? (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalActivityDsl.g:3571:3: () otherlv_1= 'Action' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )? (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalActivityDsl.g:3571:3: ()
            // InternalActivityDsl.g:3572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalActivityDsl.g:3582:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:3583:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:3583:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:3584:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getActionAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:3604:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==28) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalActivityDsl.g:3605:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:3609:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:3610:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:3610:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:3611:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:3629:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==34) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalActivityDsl.g:3630:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:3638:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3639:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3639:5: ( ruleEString )
                    // InternalActivityDsl.g:3640:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3654:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==15) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3655:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getActionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3659:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3660:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3660:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3661:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActionAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_44); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3681:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==35) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalActivityDsl.g:3682:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:3690:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3691:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3691:5: ( ruleEString )
                    // InternalActivityDsl.g:3692:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3706:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==15) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3707:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3711:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3712:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3712:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3713:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActionAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_45); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3733:3: (otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==45) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalActivityDsl.g:3734:4: otherlv_18= 'output' otherlv_19= '{' ( (lv_output_20_0= ruleOutputPin ) ) (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getActionAccess().getOutputKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_46); 

                    				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalActivityDsl.g:3742:4: ( (lv_output_20_0= ruleOutputPin ) )
                    // InternalActivityDsl.g:3743:5: (lv_output_20_0= ruleOutputPin )
                    {
                    // InternalActivityDsl.g:3743:5: (lv_output_20_0= ruleOutputPin )
                    // InternalActivityDsl.g:3744:6: lv_output_20_0= ruleOutputPin
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getOutputOutputPinParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_output_20_0=ruleOutputPin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"output",
                    							lv_output_20_0,
                    							"de.htw.activity.xtext.ActivityDsl.OutputPin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3761:4: (otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==15) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3762:5: otherlv_21= ',' ( (lv_output_22_0= ruleOutputPin ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_46); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getActionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3766:5: ( (lv_output_22_0= ruleOutputPin ) )
                    	    // InternalActivityDsl.g:3767:6: (lv_output_22_0= ruleOutputPin )
                    	    {
                    	    // InternalActivityDsl.g:3767:6: (lv_output_22_0= ruleOutputPin )
                    	    // InternalActivityDsl.g:3768:7: lv_output_22_0= ruleOutputPin
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getOutputOutputPinParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_output_22_0=ruleOutputPin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"output",
                    	    								lv_output_22_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.OutputPin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,18,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3791:3: (otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==46) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalActivityDsl.g:3792:4: otherlv_24= 'input' otherlv_25= '{' ( (lv_input_26_0= ruleInputPin ) ) (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getActionAccess().getInputKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_25, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalActivityDsl.g:3800:4: ( (lv_input_26_0= ruleInputPin ) )
                    // InternalActivityDsl.g:3801:5: (lv_input_26_0= ruleInputPin )
                    {
                    // InternalActivityDsl.g:3801:5: (lv_input_26_0= ruleInputPin )
                    // InternalActivityDsl.g:3802:6: lv_input_26_0= ruleInputPin
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getInputInputPinParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_input_26_0=ruleInputPin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_26_0,
                    							"de.htw.activity.xtext.ActivityDsl.InputPin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3819:4: (otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==15) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3820:5: otherlv_27= ',' ( (lv_input_28_0= ruleInputPin ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_48); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getActionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3824:5: ( (lv_input_28_0= ruleInputPin ) )
                    	    // InternalActivityDsl.g:3825:6: (lv_input_28_0= ruleInputPin )
                    	    {
                    	    // InternalActivityDsl.g:3825:6: (lv_input_28_0= ruleInputPin )
                    	    // InternalActivityDsl.g:3826:7: lv_input_28_0= ruleInputPin
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getInputInputPinParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_input_28_0=ruleInputPin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_28_0,
                    	    								"de.htw.activity.xtext.ActivityDsl.InputPin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleSendSignalAction"
    // InternalActivityDsl.g:3857:1: entryRuleSendSignalAction returns [EObject current=null] : iv_ruleSendSignalAction= ruleSendSignalAction EOF ;
    public final EObject entryRuleSendSignalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSignalAction = null;


        try {
            // InternalActivityDsl.g:3857:57: (iv_ruleSendSignalAction= ruleSendSignalAction EOF )
            // InternalActivityDsl.g:3858:2: iv_ruleSendSignalAction= ruleSendSignalAction EOF
            {
             newCompositeNode(grammarAccess.getSendSignalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendSignalAction=ruleSendSignalAction();

            state._fsp--;

             current =iv_ruleSendSignalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendSignalAction"


    // $ANTLR start "ruleSendSignalAction"
    // InternalActivityDsl.g:3864:1: ruleSendSignalAction returns [EObject current=null] : ( () otherlv_1= 'SendSignalAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleSendSignalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:3870:2: ( ( () otherlv_1= 'SendSignalAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:3871:2: ( () otherlv_1= 'SendSignalAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:3871:2: ( () otherlv_1= 'SendSignalAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:3872:3: () otherlv_1= 'SendSignalAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:3872:3: ()
            // InternalActivityDsl.g:3873:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendSignalActionAccess().getSendSignalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSendSignalActionAccess().getSendSignalActionKeyword_1());
            		
            // InternalActivityDsl.g:3883:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:3884:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:3884:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:3885:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getSendSignalActionAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendSignalActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getSendSignalActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:3905:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==28) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalActivityDsl.g:3906:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getSendSignalActionAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:3910:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:3911:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:3911:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:3912:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSendSignalActionAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSendSignalActionRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:3930:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==34) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalActivityDsl.g:3931:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSendSignalActionAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getSendSignalActionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:3939:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3940:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3940:5: ( ruleEString )
                    // InternalActivityDsl.g:3941:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSendSignalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSendSignalActionAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:3955:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalActivityDsl.g:3956:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSendSignalActionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:3960:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:3961:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:3961:6: ( ruleEString )
                    	    // InternalActivityDsl.g:3962:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSendSignalActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSendSignalActionAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getSendSignalActionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:3982:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==35) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalActivityDsl.g:3983:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getSendSignalActionAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getSendSignalActionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:3991:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:3992:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:3992:5: ( ruleEString )
                    // InternalActivityDsl.g:3993:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSendSignalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSendSignalActionAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4007:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==15) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4008:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSendSignalActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4012:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4013:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4013:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4014:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSendSignalActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSendSignalActionAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getSendSignalActionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getSendSignalActionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendSignalAction"


    // $ANTLR start "entryRuleAcceptTimeEventAction"
    // InternalActivityDsl.g:4042:1: entryRuleAcceptTimeEventAction returns [EObject current=null] : iv_ruleAcceptTimeEventAction= ruleAcceptTimeEventAction EOF ;
    public final EObject entryRuleAcceptTimeEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptTimeEventAction = null;


        try {
            // InternalActivityDsl.g:4042:62: (iv_ruleAcceptTimeEventAction= ruleAcceptTimeEventAction EOF )
            // InternalActivityDsl.g:4043:2: iv_ruleAcceptTimeEventAction= ruleAcceptTimeEventAction EOF
            {
             newCompositeNode(grammarAccess.getAcceptTimeEventActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptTimeEventAction=ruleAcceptTimeEventAction();

            state._fsp--;

             current =iv_ruleAcceptTimeEventAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptTimeEventAction"


    // $ANTLR start "ruleAcceptTimeEventAction"
    // InternalActivityDsl.g:4049:1: ruleAcceptTimeEventAction returns [EObject current=null] : ( () otherlv_1= 'AcceptTimeEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleAcceptTimeEventAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4055:2: ( ( () otherlv_1= 'AcceptTimeEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4056:2: ( () otherlv_1= 'AcceptTimeEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4056:2: ( () otherlv_1= 'AcceptTimeEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4057:3: () otherlv_1= 'AcceptTimeEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4057:3: ()
            // InternalActivityDsl.g:4058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptTimeEventActionAccess().getAcceptTimeEventActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptTimeEventActionAccess().getAcceptTimeEventActionKeyword_1());
            		
            // InternalActivityDsl.g:4068:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4069:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4069:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4070:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getAcceptTimeEventActionAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAcceptTimeEventActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getAcceptTimeEventActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:4090:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==28) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalActivityDsl.g:4091:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAcceptTimeEventActionAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:4095:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:4096:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:4096:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:4097:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptTimeEventActionAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptTimeEventActionRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:4115:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==34) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalActivityDsl.g:4116:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAcceptTimeEventActionAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getAcceptTimeEventActionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:4124:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4125:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4125:5: ( ruleEString )
                    // InternalActivityDsl.g:4126:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptTimeEventActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAcceptTimeEventActionAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4140:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==15) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4141:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAcceptTimeEventActionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4145:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4146:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4146:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4147:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAcceptTimeEventActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAcceptTimeEventActionAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getAcceptTimeEventActionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:4167:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==35) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalActivityDsl.g:4168:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getAcceptTimeEventActionAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getAcceptTimeEventActionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:4176:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4177:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4177:5: ( ruleEString )
                    // InternalActivityDsl.g:4178:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptTimeEventActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAcceptTimeEventActionAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4192:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==15) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4193:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAcceptTimeEventActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4197:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4198:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4198:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4199:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAcceptTimeEventActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAcceptTimeEventActionAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getAcceptTimeEventActionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAcceptTimeEventActionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptTimeEventAction"


    // $ANTLR start "entryRuleAcceptEventAction"
    // InternalActivityDsl.g:4227:1: entryRuleAcceptEventAction returns [EObject current=null] : iv_ruleAcceptEventAction= ruleAcceptEventAction EOF ;
    public final EObject entryRuleAcceptEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptEventAction = null;


        try {
            // InternalActivityDsl.g:4227:58: (iv_ruleAcceptEventAction= ruleAcceptEventAction EOF )
            // InternalActivityDsl.g:4228:2: iv_ruleAcceptEventAction= ruleAcceptEventAction EOF
            {
             newCompositeNode(grammarAccess.getAcceptEventActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptEventAction=ruleAcceptEventAction();

            state._fsp--;

             current =iv_ruleAcceptEventAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptEventAction"


    // $ANTLR start "ruleAcceptEventAction"
    // InternalActivityDsl.g:4234:1: ruleAcceptEventAction returns [EObject current=null] : ( () otherlv_1= 'AcceptEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleAcceptEventAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4240:2: ( ( () otherlv_1= 'AcceptEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4241:2: ( () otherlv_1= 'AcceptEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4241:2: ( () otherlv_1= 'AcceptEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4242:3: () otherlv_1= 'AcceptEventAction' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4242:3: ()
            // InternalActivityDsl.g:4243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptEventActionAccess().getAcceptEventActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptEventActionAccess().getAcceptEventActionKeyword_1());
            		
            // InternalActivityDsl.g:4253:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4254:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4254:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4255:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getAcceptEventActionAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAcceptEventActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getAcceptEventActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:4275:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==28) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalActivityDsl.g:4276:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAcceptEventActionAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:4280:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:4281:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:4281:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:4282:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptEventActionAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptEventActionRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:4300:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==34) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalActivityDsl.g:4301:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAcceptEventActionAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getAcceptEventActionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:4309:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4310:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4310:5: ( ruleEString )
                    // InternalActivityDsl.g:4311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAcceptEventActionAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4325:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==15) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4326:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAcceptEventActionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4330:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4331:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4331:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4332:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAcceptEventActionAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getAcceptEventActionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:4352:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==35) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalActivityDsl.g:4353:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getAcceptEventActionAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getAcceptEventActionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:4361:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4362:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4362:5: ( ruleEString )
                    // InternalActivityDsl.g:4363:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAcceptEventActionAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4377:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==15) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4378:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAcceptEventActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4382:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4383:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4383:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4384:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAcceptEventActionAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getAcceptEventActionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAcceptEventActionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptEventAction"


    // $ANTLR start "entryRuleInputPin"
    // InternalActivityDsl.g:4412:1: entryRuleInputPin returns [EObject current=null] : iv_ruleInputPin= ruleInputPin EOF ;
    public final EObject entryRuleInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPin = null;


        try {
            // InternalActivityDsl.g:4412:49: (iv_ruleInputPin= ruleInputPin EOF )
            // InternalActivityDsl.g:4413:2: iv_ruleInputPin= ruleInputPin EOF
            {
             newCompositeNode(grammarAccess.getInputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPin=ruleInputPin();

            state._fsp--;

             current =iv_ruleInputPin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputPin"


    // $ANTLR start "ruleInputPin"
    // InternalActivityDsl.g:4419:1: ruleInputPin returns [EObject current=null] : ( () otherlv_1= 'InputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleInputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4425:2: ( ( () otherlv_1= 'InputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4426:2: ( () otherlv_1= 'InputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4426:2: ( () otherlv_1= 'InputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4427:3: () otherlv_1= 'InputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4427:3: ()
            // InternalActivityDsl.g:4428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputPinAccess().getInputPinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getInputPinAccess().getInputPinKeyword_1());
            		
            // InternalActivityDsl.g:4438:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4439:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4439:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4440:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getInputPinAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getInputPinAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:4460:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==28) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalActivityDsl.g:4461:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputPinAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:4465:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:4466:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:4466:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:4467:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputPinAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputPinRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:4485:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==34) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalActivityDsl.g:4486:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputPinAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputPinAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:4494:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4495:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4495:5: ( ruleEString )
                    // InternalActivityDsl.g:4496:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputPinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputPinAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4510:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==15) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4511:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getInputPinAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4515:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4516:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4516:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4517:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputPinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInputPinAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputPinAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:4537:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==35) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalActivityDsl.g:4538:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getInputPinAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getInputPinAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:4546:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4547:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4547:5: ( ruleEString )
                    // InternalActivityDsl.g:4548:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputPinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputPinAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4562:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==15) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4563:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInputPinAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4567:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4568:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4568:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4569:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputPinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInputPinAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getInputPinAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getInputPinAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputPin"


    // $ANTLR start "entryRuleOutputPin"
    // InternalActivityDsl.g:4597:1: entryRuleOutputPin returns [EObject current=null] : iv_ruleOutputPin= ruleOutputPin EOF ;
    public final EObject entryRuleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPin = null;


        try {
            // InternalActivityDsl.g:4597:50: (iv_ruleOutputPin= ruleOutputPin EOF )
            // InternalActivityDsl.g:4598:2: iv_ruleOutputPin= ruleOutputPin EOF
            {
             newCompositeNode(grammarAccess.getOutputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPin=ruleOutputPin();

            state._fsp--;

             current =iv_ruleOutputPin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputPin"


    // $ANTLR start "ruleOutputPin"
    // InternalActivityDsl.g:4604:1: ruleOutputPin returns [EObject current=null] : ( () otherlv_1= 'OutputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4610:2: ( ( () otherlv_1= 'OutputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4611:2: ( () otherlv_1= 'OutputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4611:2: ( () otherlv_1= 'OutputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4612:3: () otherlv_1= 'OutputPin' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4612:3: ()
            // InternalActivityDsl.g:4613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputPinAccess().getOutputPinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputPinAccess().getOutputPinKeyword_1());
            		
            // InternalActivityDsl.g:4623:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4624:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4624:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4625:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getOutputPinAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputPinAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:4645:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==28) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalActivityDsl.g:4646:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getOutputPinAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:4650:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:4651:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:4651:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:4652:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputPinAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputPinRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:4670:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==34) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalActivityDsl.g:4671:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputPinAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputPinAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:4679:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4680:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4680:5: ( ruleEString )
                    // InternalActivityDsl.g:4681:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputPinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputPinAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4695:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==15) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4696:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOutputPinAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4700:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4701:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4701:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4702:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOutputPinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOutputPinAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getOutputPinAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:4722:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==35) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalActivityDsl.g:4723:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getOutputPinAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getOutputPinAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:4731:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4732:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4732:5: ( ruleEString )
                    // InternalActivityDsl.g:4733:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputPinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputPinAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4747:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==15) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4748:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getOutputPinAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4752:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4753:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4753:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4754:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOutputPinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOutputPinAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getOutputPinAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getOutputPinAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputPin"


    // $ANTLR start "entryRuleObject"
    // InternalActivityDsl.g:4782:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalActivityDsl.g:4782:47: (iv_ruleObject= ruleObject EOF )
            // InternalActivityDsl.g:4783:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalActivityDsl.g:4789:1: ruleObject returns [EObject current=null] : ( () otherlv_1= 'Object' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4795:2: ( ( () otherlv_1= 'Object' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4796:2: ( () otherlv_1= 'Object' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4796:2: ( () otherlv_1= 'Object' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4797:3: () otherlv_1= 'Object' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4797:3: ()
            // InternalActivityDsl.g:4798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            // InternalActivityDsl.g:4808:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4809:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4809:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4810:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getObjectAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:4830:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==28) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalActivityDsl.g:4831:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:4835:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:4836:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:4836:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:4837:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:4855:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==34) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalActivityDsl.g:4856:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:4864:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4865:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4865:5: ( ruleEString )
                    // InternalActivityDsl.g:4866:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4880:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==15) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4881:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getObjectAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4885:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4886:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4886:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4887:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getObjectRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getObjectAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:4907:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==35) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalActivityDsl.g:4908:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getObjectAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:4916:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:4917:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:4917:5: ( ruleEString )
                    // InternalActivityDsl.g:4918:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:4932:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==15) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalActivityDsl.g:4933:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getObjectAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:4937:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:4938:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:4938:6: ( ruleEString )
                    	    // InternalActivityDsl.g:4939:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getObjectRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getObjectAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getObjectAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleCentralBufferNode"
    // InternalActivityDsl.g:4967:1: entryRuleCentralBufferNode returns [EObject current=null] : iv_ruleCentralBufferNode= ruleCentralBufferNode EOF ;
    public final EObject entryRuleCentralBufferNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCentralBufferNode = null;


        try {
            // InternalActivityDsl.g:4967:58: (iv_ruleCentralBufferNode= ruleCentralBufferNode EOF )
            // InternalActivityDsl.g:4968:2: iv_ruleCentralBufferNode= ruleCentralBufferNode EOF
            {
             newCompositeNode(grammarAccess.getCentralBufferNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCentralBufferNode=ruleCentralBufferNode();

            state._fsp--;

             current =iv_ruleCentralBufferNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCentralBufferNode"


    // $ANTLR start "ruleCentralBufferNode"
    // InternalActivityDsl.g:4974:1: ruleCentralBufferNode returns [EObject current=null] : ( () otherlv_1= 'CentralBufferNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleCentralBufferNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:4980:2: ( ( () otherlv_1= 'CentralBufferNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:4981:2: ( () otherlv_1= 'CentralBufferNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:4981:2: ( () otherlv_1= 'CentralBufferNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:4982:3: () otherlv_1= 'CentralBufferNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:4982:3: ()
            // InternalActivityDsl.g:4983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCentralBufferNodeAccess().getCentralBufferNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCentralBufferNodeAccess().getCentralBufferNodeKeyword_1());
            		
            // InternalActivityDsl.g:4993:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:4994:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:4994:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:4995:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getCentralBufferNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCentralBufferNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getCentralBufferNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:5015:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==28) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalActivityDsl.g:5016:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCentralBufferNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:5020:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:5021:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:5021:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:5022:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCentralBufferNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCentralBufferNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:5040:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==34) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalActivityDsl.g:5041:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getCentralBufferNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getCentralBufferNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:5049:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:5050:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:5050:5: ( ruleEString )
                    // InternalActivityDsl.g:5051:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCentralBufferNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCentralBufferNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:5065:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==15) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalActivityDsl.g:5066:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCentralBufferNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:5070:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:5071:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:5071:6: ( ruleEString )
                    	    // InternalActivityDsl.g:5072:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCentralBufferNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCentralBufferNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getCentralBufferNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:5092:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==35) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalActivityDsl.g:5093:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getCentralBufferNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getCentralBufferNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:5101:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:5102:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:5102:5: ( ruleEString )
                    // InternalActivityDsl.g:5103:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCentralBufferNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCentralBufferNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:5117:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==15) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalActivityDsl.g:5118:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCentralBufferNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:5122:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:5123:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:5123:6: ( ruleEString )
                    	    // InternalActivityDsl.g:5124:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCentralBufferNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCentralBufferNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getCentralBufferNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCentralBufferNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCentralBufferNode"


    // $ANTLR start "entryRuleDataStoreNode"
    // InternalActivityDsl.g:5152:1: entryRuleDataStoreNode returns [EObject current=null] : iv_ruleDataStoreNode= ruleDataStoreNode EOF ;
    public final EObject entryRuleDataStoreNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStoreNode = null;


        try {
            // InternalActivityDsl.g:5152:54: (iv_ruleDataStoreNode= ruleDataStoreNode EOF )
            // InternalActivityDsl.g:5153:2: iv_ruleDataStoreNode= ruleDataStoreNode EOF
            {
             newCompositeNode(grammarAccess.getDataStoreNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataStoreNode=ruleDataStoreNode();

            state._fsp--;

             current =iv_ruleDataStoreNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataStoreNode"


    // $ANTLR start "ruleDataStoreNode"
    // InternalActivityDsl.g:5159:1: ruleDataStoreNode returns [EObject current=null] : ( () otherlv_1= 'DataStoreNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleDataStoreNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_qualifiedName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_5_0 = null;



        	enterRule();

        try {
            // InternalActivityDsl.g:5165:2: ( ( () otherlv_1= 'DataStoreNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalActivityDsl.g:5166:2: ( () otherlv_1= 'DataStoreNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalActivityDsl.g:5166:2: ( () otherlv_1= 'DataStoreNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalActivityDsl.g:5167:3: () otherlv_1= 'DataStoreNode' ( (lv_qualifiedName_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalActivityDsl.g:5167:3: ()
            // InternalActivityDsl.g:5168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataStoreNodeAccess().getDataStoreNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDataStoreNodeAccess().getDataStoreNodeKeyword_1());
            		
            // InternalActivityDsl.g:5178:3: ( (lv_qualifiedName_2_0= RULE_ID ) )
            // InternalActivityDsl.g:5179:4: (lv_qualifiedName_2_0= RULE_ID )
            {
            // InternalActivityDsl.g:5179:4: (lv_qualifiedName_2_0= RULE_ID )
            // InternalActivityDsl.g:5180:5: lv_qualifiedName_2_0= RULE_ID
            {
            lv_qualifiedName_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_qualifiedName_2_0, grammarAccess.getDataStoreNodeAccess().getQualifiedNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataStoreNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getDataStoreNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDsl.g:5200:3: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==28) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalActivityDsl.g:5201:4: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataStoreNodeAccess().getNameKeyword_4_0());
                    			
                    // InternalActivityDsl.g:5205:4: ( (lv_Name_5_0= ruleEString ) )
                    // InternalActivityDsl.g:5206:5: (lv_Name_5_0= ruleEString )
                    {
                    // InternalActivityDsl.g:5206:5: (lv_Name_5_0= ruleEString )
                    // InternalActivityDsl.g:5207:6: lv_Name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataStoreNodeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataStoreNodeRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_5_0,
                    							"de.htw.activity.xtext.ActivityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDsl.g:5225:3: (otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==34) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalActivityDsl.g:5226:4: otherlv_6= 'incoming' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataStoreNodeAccess().getIncomingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getDataStoreNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDsl.g:5234:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:5235:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:5235:5: ( ruleEString )
                    // InternalActivityDsl.g:5236:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataStoreNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataStoreNodeAccess().getIncomingActivityEdgeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:5250:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==15) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalActivityDsl.g:5251:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDataStoreNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDsl.g:5255:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:5256:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:5256:6: ( ruleEString )
                    	    // InternalActivityDsl.g:5257:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataStoreNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataStoreNodeAccess().getIncomingActivityEdgeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getDataStoreNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDsl.g:5277:3: (otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==35) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalActivityDsl.g:5278:4: otherlv_12= 'outgoing' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getDataStoreNodeAccess().getOutgoingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataStoreNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalActivityDsl.g:5286:4: ( ( ruleEString ) )
                    // InternalActivityDsl.g:5287:5: ( ruleEString )
                    {
                    // InternalActivityDsl.g:5287:5: ( ruleEString )
                    // InternalActivityDsl.g:5288:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataStoreNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataStoreNodeAccess().getOutgoingActivityEdgeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDsl.g:5302:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==15) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalActivityDsl.g:5303:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDataStoreNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDsl.g:5307:5: ( ( ruleEString ) )
                    	    // InternalActivityDsl.g:5308:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDsl.g:5308:6: ( ruleEString )
                    	    // InternalActivityDsl.g:5309:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataStoreNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataStoreNodeAccess().getOutgoingActivityEdgeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getDataStoreNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDataStoreNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataStoreNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003E2000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x007F9F7200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000BE2000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000BE0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000BC0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000B40000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000A40000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000023E2000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000023E0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000023C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002340000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002240000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000070040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000060040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000C10040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000C00040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008C10040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008C00040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008800040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600C10040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000600C00040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000600800040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});

}