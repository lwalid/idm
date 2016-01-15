package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'mandatory'", "'Optional'", "'Alternative'", "'VideoSeq'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

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
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleVideoGen returns [EObject current=null] : ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_video_3_0= ruleVideo ) )* otherlv_4= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_video_3_0 = null;


         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_video_3_0= ruleVideo ) )* otherlv_4= '}' ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_video_3_0= ruleVideo ) )* otherlv_4= '}' )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_video_3_0= ruleVideo ) )* otherlv_4= '}' )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_video_3_0= ruleVideo ) )* otherlv_4= '}'
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVideoGenAccess().getVideoGenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVideoGen131); 

                	newLeafNode(otherlv_1, grammarAccess.getVideoGenAccess().getVideoGenKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleVideoGen143); 

                	newLeafNode(otherlv_2, grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_2());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: ( (lv_video_3_0= ruleVideo ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:1: (lv_video_3_0= ruleVideo )
            	    {
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:1: (lv_video_3_0= ruleVideo )
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:96:3: lv_video_3_0= ruleVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getVideoVideoParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideo_in_ruleVideoGen164);
            	    lv_video_3_0=ruleVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"video",
            	            		lv_video_3_0, 
            	            		"Video");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen177); 

                	newLeafNode(otherlv_4, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideo"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: (iv_ruleVideo= ruleVideo EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo213);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo223); 

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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: ruleVideo returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;

        EObject this_Alternative_2 = null;


         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleVideo270);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleVideo297);
                    this_Optional_1=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:5: this_Alternative_2= ruleAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternative_in_ruleVideo324);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;

                     
                            current = this_Alternative_2; 
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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleMandatory"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory359);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory369); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:1: ruleMandatory returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoSeq_1_0 = null;


         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:28: ( (otherlv_0= 'mandatory' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: (otherlv_0= 'mandatory' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: (otherlv_0= 'mandatory' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:3: otherlv_0= 'mandatory' ( (lv_videoSeq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMandatory406); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: ( (lv_videoSeq_1_0= ruleVideoSeq ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:1: (lv_videoSeq_1_0= ruleVideoSeq )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:1: (lv_videoSeq_1_0= ruleVideoSeq )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:3: lv_videoSeq_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getVideoSeqVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleMandatory427);
            lv_videoSeq_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		set(
                   			current, 
                   			"videoSeq",
                    		lv_videoSeq_1_0, 
                    		"VideoSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:2: (iv_ruleOptional= ruleOptional EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional463);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional473); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:1: ruleOptional returns [EObject current=null] : (otherlv_0= 'Optional' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoSeq_1_0 = null;


         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:28: ( (otherlv_0= 'Optional' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (otherlv_0= 'Optional' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (otherlv_0= 'Optional' ( (lv_videoSeq_1_0= ruleVideoSeq ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:3: otherlv_0= 'Optional' ( (lv_videoSeq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOptional510); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: ( (lv_videoSeq_1_0= ruleVideoSeq ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_videoSeq_1_0= ruleVideoSeq )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_videoSeq_1_0= ruleVideoSeq )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:3: lv_videoSeq_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getVideoSeqVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleOptional531);
            lv_videoSeq_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		set(
                   			current, 
                   			"videoSeq",
                    		lv_videoSeq_1_0, 
                    		"VideoSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternative"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative567);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative577); 

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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'Alternative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoSeq_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videoSeq_3_0 = null;


         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:28: ( (otherlv_0= 'Alternative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoSeq_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (otherlv_0= 'Alternative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoSeq_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (otherlv_0= 'Alternative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoSeq_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:3: otherlv_0= 'Alternative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoSeq_3_0= ruleVideoSeq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternative614); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAlternativeKeyword_0());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:1: ( (lv_name_1_0= RULE_ID ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_name_1_0= RULE_ID )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_name_1_0= RULE_ID )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternative631); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAlternative648); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: ( (lv_videoSeq_3_0= ruleVideoSeq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_videoSeq_3_0= ruleVideoSeq )
            	    {
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_videoSeq_3_0= ruleVideoSeq )
            	    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:3: lv_videoSeq_3_0= ruleVideoSeq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getVideoSeqVideoSeqParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideoSeq_in_ruleAlternative669);
            	    lv_videoSeq_3_0=ruleVideoSeq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videoSeq",
            	            		lv_videoSeq_3_0, 
            	            		"VideoSeq");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAlternative682); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleVideoSeq"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:330:2: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq718);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq728); 

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
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: ruleVideoSeq returns [EObject current=null] : (otherlv_0= 'VideoSeq' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:28: ( (otherlv_0= 'VideoSeq' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (otherlv_0= 'VideoSeq' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (otherlv_0= 'VideoSeq' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:3: otherlv_0= 'VideoSeq' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVideoSeq765); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoSeqAccess().getVideoSeqKeyword_0());
                
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: ( (lv_id_1_0= RULE_ID ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_id_1_0= RULE_ID )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_id_1_0= RULE_ID )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideoSeq782); 

            			newLeafNode(lv_id_1_0, grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:1: (lv_name_2_0= RULE_STRING )
            {
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:1: (lv_name_2_0= RULE_STRING )
            // ../videogen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq804); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVideoSeqAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleVideoSeq"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVideoGen131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVideoGen143 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleVideoGen164 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleVideo270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleVideo297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleVideo324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMandatory406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleMandatory427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOptional510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleOptional531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternative614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternative631 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAlternative648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleAlternative669 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleAlternative682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVideoSeq765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideoSeq782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq804 = new BitSet(new long[]{0x0000000000000002L});

}