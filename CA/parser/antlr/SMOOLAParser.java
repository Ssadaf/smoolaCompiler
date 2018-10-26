// Generated from /home/sadaf/Documents/compiler/phase1/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMOOLAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, COMMENT=13, NUMBER=14, ARRAY=15, BOOLEAN=16, 
		STRING=17, INT=18, CLASS=19, METHOD=20, THEN=21, IF=22, WRITELN=23, EXTENDS=24, 
		VAR=25, THIS=26, FALSE=27, TRUE=28, WHILE=29, ELSE=30, RETURN=31, NEW=32, 
		IDENTIFIER=33, ADD=34, SUB=35, AND=36, OR=37, MUL=38, DIV=39, NOT=40, 
		EQUAL=41, NOTEQUAL=42, LESSTHAN=43, GRATERTHAN=44, ASSIGN=45, ENTER=46, 
		WS=47;
	public static final int
		RULE_program = 0, RULE_main_class = 1, RULE_main_method = 2, RULE_usual_class = 3, 
		RULE_arithmethic_exp = 4, RULE_condition = 5, RULE_while_expression = 6, 
		RULE_if_expression = 7, RULE_array_element = 8, RULE_assignment = 9, RULE_instanciation = 10, 
		RULE_expression = 11, RULE_line = 12, RULE_body = 13, RULE_method_body = 14, 
		RULE_method = 15, RULE_argument = 16, RULE_var_dec = 17, RULE_type = 18, 
		RULE_logical_val = 19, RULE_string = 20, RULE_comparator_atom = 21, RULE_logical_exp = 22, 
		RULE_equal_exp = 23, RULE_mult_expr = 24, RULE_atom_bool_exp = 25, RULE_atom_arith_expr = 26, 
		RULE_and_expr = 27, RULE_atom_logical_expr = 28, RULE_comment = 29;
	public static final String[] ruleNames = {
		"program", "main_class", "main_method", "usual_class", "arithmethic_exp", 
		"condition", "while_expression", "if_expression", "array_element", "assignment", 
		"instanciation", "expression", "line", "body", "method_body", "method", 
		"argument", "var_dec", "type", "logical_val", "string", "comparator_atom", 
		"logical_exp", "equal_exp", "mult_expr", "atom_bool_exp", "atom_arith_expr", 
		"and_expr", "atom_logical_expr", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'main'", "'('", "')'", "':'", "'['", "']'", "','", 
		"';'", "'\"'", "'\r'", null, null, "'int[]'", "'boolean'", "'string'", 
		"'int'", "'class'", "'def'", "'then'", "'if'", "'writeln'", "'extends'", 
		"'var'", "'this'", "'false'", "'true'", "'while'", "'else'", "'return'", 
		"'new'", null, "'+'", "'-'", "'&&'", "'||'", "'*'", "'/'", "'!'", "'=='", 
		"'<>'", "'<'", "'>'", "'='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "NUMBER", "ARRAY", "BOOLEAN", "STRING", "INT", "CLASS", 
		"METHOD", "THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", "FALSE", 
		"TRUE", "WHILE", "ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", "SUB", 
		"AND", "OR", "MUL", "DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", "GRATERTHAN", 
		"ASSIGN", "ENTER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SMOOLA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SMOOLAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Main_classContext main_class() {
			return getRuleContext(Main_classContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SMOOLAParser.EOF, 0); }
		public List<Usual_classContext> usual_class() {
			return getRuleContexts(Usual_classContext.class);
		}
		public Usual_classContext usual_class(int i) {
			return getRuleContext(Usual_classContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			main_class();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==CLASS) {
				{
				{
				setState(61);
				usual_class();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SMOOLAParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public Main_methodContext main_method() {
			return getRuleContext(Main_methodContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Main_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterMain_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitMain_class(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(69);
				comment();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(CLASS);
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__0);
			setState(78);
			main_method();
			setState(79);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_methodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(SMOOLAParser.METHOD, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Main_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterMain_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitMain_method(this);
		}
	}

	public final Main_methodContext main_method() throws RecognitionException {
		Main_methodContext _localctx = new Main_methodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(81);
				comment();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(METHOD);
			setState(88);
			match(T__2);
			setState(89);
			match(T__3);
			setState(90);
			match(T__4);
			setState(91);
			match(T__5);
			setState(92);
			match(INT);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(93);
				comment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__0);
			setState(100);
			method_body();
			setState(101);
			match(T__1);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(102);
				comment();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usual_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SMOOLAParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SMOOLAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SMOOLAParser.IDENTIFIER, i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SMOOLAParser.EXTENDS, 0); }
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public Usual_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usual_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterUsual_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitUsual_class(this);
		}
	}

	public final Usual_classContext usual_class() throws RecognitionException {
		Usual_classContext _localctx = new Usual_classContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usual_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(108);
				comment();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(CLASS);
			setState(115);
			match(IDENTIFIER);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				{
				{
				setState(116);
				match(EXTENDS);
				setState(117);
				match(IDENTIFIER);
				}
				}
				break;
			case T__0:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			match(T__0);
			{
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(122);
						comment();
						}
						break;
					case VAR:
						{
						setState(123);
						var_dec();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==METHOD) {
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					comment();
					}
					break;
				case 2:
					{
					setState(130);
					method();
					}
					break;
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(136);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmethic_expContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(SMOOLAParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(SMOOLAParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(SMOOLAParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(SMOOLAParser.ADD, i);
		}
		public Arithmethic_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmethic_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterArithmethic_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitArithmethic_exp(this);
		}
	}

	public final Arithmethic_expContext arithmethic_exp() throws RecognitionException {
		Arithmethic_expContext _localctx = new Arithmethic_expContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmethic_exp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			mult_expr();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(140);
					mult_expr();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__3);
			setState(147);
			expression();
			setState(148);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_expressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SMOOLAParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public While_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterWhile_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitWhile_expression(this);
		}
	}

	public final While_expressionContext while_expression() throws RecognitionException {
		While_expressionContext _localctx = new While_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(150);
				comment();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(WHILE);
			setState(157);
			condition();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(158);
				comment();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__0);
			setState(165);
			body();
			setState(166);
			match(T__1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					comment();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SMOOLAParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SMOOLAParser.THEN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SMOOLAParser.ELSE, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitIf_expression(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(173);
				comment();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(IF);
			setState(180);
			condition();
			setState(181);
			match(THEN);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					comment();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(188);
				match(T__0);
				setState(189);
				body();
				setState(190);
				match(T__1);
				}
				break;
			case T__3:
			case T__9:
			case T__10:
			case COMMENT:
			case NUMBER:
			case IF:
			case FALSE:
			case TRUE:
			case WHILE:
			case IDENTIFIER:
			case SUB:
			case NOT:
				{
				setState(192);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					comment();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(201);
				match(ELSE);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(202);
					match(T__0);
					setState(203);
					body();
					setState(204);
					match(T__1);
					}
					break;
				case T__3:
				case T__9:
				case T__10:
				case COMMENT:
				case NUMBER:
				case IF:
				case FALSE:
				case TRUE:
				case WHILE:
				case IDENTIFIER:
				case SUB:
				case NOT:
					{
					setState(206);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					comment();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public Arithmethic_expContext arithmethic_exp() {
			return getRuleContext(Arithmethic_expContext.class,0);
		}
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterArray_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitArray_element(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
			setState(219);
			match(T__6);
			setState(220);
			arithmethic_exp();
			setState(221);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public Array_elementContext array_element() {
			return getRuleContext(Array_elementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(223);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(224);
				array_element();
				}
				break;
			}
			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					match(ASSIGN);
					{
					setState(228);
					expression();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanciationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SMOOLAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SMOOLAParser.IDENTIFIER, i);
		}
		public TerminalNode NEW() { return getToken(SMOOLAParser.NEW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InstanciationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterInstanciation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitInstanciation(this);
		}
	}

	public final InstanciationContext instanciation() throws RecognitionException {
		InstanciationContext _localctx = new InstanciationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instanciation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDENTIFIER);
			setState(234);
			match(ASSIGN);
			setState(235);
			match(NEW);
			setState(236);
			match(IDENTIFIER);
			setState(237);
			match(T__3);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				{
				setState(238);
				expression();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(239);
					match(T__8);
					setState(240);
					expression();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(249);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Logical_expContext logical_exp() {
			return getRuleContext(Logical_expContext.class,0);
		}
		public InstanciationContext instanciation() {
			return getRuleContext(InstanciationContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(251);
					match(T__3);
					setState(252);
					expression();
					setState(253);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(255);
					assignment();
					}
					break;
				case 3:
					{
					setState(256);
					logical_exp();
					}
					break;
				case 4:
					{
					setState(257);
					instanciation();
					}
					break;
				case 5:
					{
					setState(258);
					string();
					}
					break;
				}
				setState(261);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstanciationContext instanciation() {
			return getRuleContext(InstanciationContext.class,0);
		}
		public While_expressionContext while_expression() {
			return getRuleContext(While_expressionContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expression();
				setState(267);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				instanciation();
				setState(270);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				while_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				if_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__9:
			case T__10:
			case COMMENT:
			case NUMBER:
			case IF:
			case FALSE:
			case TRUE:
			case WHILE:
			case RETURN:
			case IDENTIFIER:
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << COMMENT) | (1L << NUMBER) | (1L << IF) | (1L << FALSE) | (1L << TRUE) | (1L << WHILE) | (1L << IDENTIFIER) | (1L << SUB) | (1L << NOT))) != 0)) {
					{
					{
					setState(278);
					line();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__0);
				setState(285);
				body();
				setState(286);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SMOOLAParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitMethod_body(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			body();
			setState(291);
			match(RETURN);
			setState(292);
			expression();
			setState(293);
			match(T__9);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(294);
				comment();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(SMOOLAParser.METHOD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(300);
				comment();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(METHOD);
			setState(307);
			match(IDENTIFIER);
			setState(308);
			match(T__3);
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(309);
				argument();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(310);
					match(T__8);
					setState(311);
					argument();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__4:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
			match(T__4);
			setState(321);
			match(T__5);
			setState(322);
			type();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(323);
				comment();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__0);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(332);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(330);
						comment();
						}
						break;
					case VAR:
						{
						setState(331);
						var_dec();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(337);
			method_body();
			setState(338);
			match(T__1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					comment();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(T__5);
			setState(347);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SMOOLAParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(VAR);
			setState(350);
			match(IDENTIFIER);
			setState(351);
			match(T__5);
			setState(352);
			type();
			setState(353);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(SMOOLAParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(SMOOLAParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SMOOLAParser.INT, 0); }
		public TerminalNode ARRAY() { return getToken(SMOOLAParser.ARRAY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_valContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SMOOLAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SMOOLAParser.FALSE, 0); }
		public Logical_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterLogical_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitLogical_val(this);
		}
	}

	public final Logical_valContext logical_val() throws RecognitionException {
		Logical_valContext _localctx = new Logical_valContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logical_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__10);
			setState(360);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << ENTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(361);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparator_atomContext extends ParserRuleContext {
		public List<Arithmethic_expContext> arithmethic_exp() {
			return getRuleContexts(Arithmethic_expContext.class);
		}
		public Arithmethic_expContext arithmethic_exp(int i) {
			return getRuleContext(Arithmethic_expContext.class,i);
		}
		public List<TerminalNode> GRATERTHAN() { return getTokens(SMOOLAParser.GRATERTHAN); }
		public TerminalNode GRATERTHAN(int i) {
			return getToken(SMOOLAParser.GRATERTHAN, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(SMOOLAParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(SMOOLAParser.LESSTHAN, i);
		}
		public Comparator_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterComparator_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitComparator_atom(this);
		}
	}

	public final Comparator_atomContext comparator_atom() throws RecognitionException {
		Comparator_atomContext _localctx = new Comparator_atomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparator_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(363);
			arithmethic_exp();
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN || _la==GRATERTHAN) {
				{
				{
				setState(364);
				_la = _input.LA(1);
				if ( !(_la==LESSTHAN || _la==GRATERTHAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(365);
				arithmethic_exp();
				}
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_expContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SMOOLAParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SMOOLAParser.OR, i);
		}
		public Logical_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterLogical_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitLogical_exp(this);
		}
	}

	public final Logical_expContext logical_exp() throws RecognitionException {
		Logical_expContext _localctx = new Logical_expContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logical_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			and_expr();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(372);
				match(OR);
				setState(373);
				and_expr();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_expContext extends ParserRuleContext {
		public List<Comparator_atomContext> comparator_atom() {
			return getRuleContexts(Comparator_atomContext.class);
		}
		public Comparator_atomContext comparator_atom(int i) {
			return getRuleContext(Comparator_atomContext.class,i);
		}
		public List<Atom_logical_exprContext> atom_logical_expr() {
			return getRuleContexts(Atom_logical_exprContext.class);
		}
		public Atom_logical_exprContext atom_logical_expr(int i) {
			return getRuleContext(Atom_logical_exprContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SMOOLAParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SMOOLAParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(SMOOLAParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(SMOOLAParser.NOTEQUAL, i);
		}
		public List<Atom_bool_expContext> atom_bool_exp() {
			return getRuleContexts(Atom_bool_expContext.class);
		}
		public Atom_bool_expContext atom_bool_exp(int i) {
			return getRuleContext(Atom_bool_expContext.class,i);
		}
		public Equal_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterEqual_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitEqual_exp(this);
		}
	}

	public final Equal_expContext equal_exp() throws RecognitionException {
		Equal_expContext _localctx = new Equal_expContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equal_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(379);
				comparator_atom();
				}
				break;
			case 2:
				{
				setState(380);
				atom_logical_expr();
				}
				break;
			case 3:
				{
				{
				setState(381);
				match(T__3);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(382);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(383);
					atom_bool_exp();
					}
					break;
				}
				setState(386);
				match(T__4);
				}
				}
				break;
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(391);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(392);
					atom_logical_expr();
					}
					break;
				case 3:
					{
					{
					setState(393);
					match(T__3);
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(394);
						comparator_atom();
						}
						break;
					case 2:
						{
						setState(395);
						atom_bool_exp();
						}
						break;
					}
					setState(398);
					match(T__4);
					}
					}
					break;
				}
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_exprContext extends ParserRuleContext {
		public List<Atom_arith_exprContext> atom_arith_expr() {
			return getRuleContexts(Atom_arith_exprContext.class);
		}
		public Atom_arith_exprContext atom_arith_expr(int i) {
			return getRuleContext(Atom_arith_exprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(SMOOLAParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(SMOOLAParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SMOOLAParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SMOOLAParser.DIV, i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitMult_expr(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			atom_arith_expr();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(409);
				atom_arith_expr();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_bool_expContext extends ParserRuleContext {
		public Logical_valContext logical_val() {
			return getRuleContext(Logical_valContext.class,0);
		}
		public Logical_expContext logical_exp() {
			return getRuleContext(Logical_expContext.class,0);
		}
		public Atom_bool_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_bool_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterAtom_bool_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitAtom_bool_exp(this);
		}
	}

	public final Atom_bool_expContext atom_bool_exp() throws RecognitionException {
		Atom_bool_expContext _localctx = new Atom_bool_expContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom_bool_exp);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				logical_val();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(T__3);
				setState(417);
				logical_exp();
				setState(418);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_arith_exprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(SMOOLAParser.SUB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public Array_elementContext array_element() {
			return getRuleContext(Array_elementContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SMOOLAParser.NUMBER, 0); }
		public Arithmethic_expContext arithmethic_exp() {
			return getRuleContext(Arithmethic_expContext.class,0);
		}
		public Atom_arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterAtom_arith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitAtom_arith_expr(this);
		}
	}

	public final Atom_arith_exprContext atom_arith_expr() throws RecognitionException {
		Atom_arith_exprContext _localctx = new Atom_arith_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atom_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(422);
				match(SUB);
				}
				break;
			case T__3:
			case NUMBER:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(426);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(427);
				array_element();
				}
				break;
			case 3:
				{
				setState(428);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(429);
				match(T__3);
				setState(430);
				arithmethic_exp();
				setState(431);
				match(T__4);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Equal_expContext> equal_exp() {
			return getRuleContexts(Equal_expContext.class);
		}
		public Equal_expContext equal_exp(int i) {
			return getRuleContext(Equal_expContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SMOOLAParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SMOOLAParser.AND, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			equal_exp();
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(436);
				match(AND);
				{
				setState(437);
				equal_exp();
				}
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_logical_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SMOOLAParser.NOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public Array_elementContext array_element() {
			return getRuleContext(Array_elementContext.class,0);
		}
		public Logical_valContext logical_val() {
			return getRuleContext(Logical_valContext.class,0);
		}
		public Logical_expContext logical_exp() {
			return getRuleContext(Logical_expContext.class,0);
		}
		public Atom_logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterAtom_logical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitAtom_logical_expr(this);
		}
	}

	public final Atom_logical_exprContext atom_logical_expr() throws RecognitionException {
		Atom_logical_exprContext _localctx = new Atom_logical_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom_logical_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(443);
				match(NOT);
				}
				break;
			case T__3:
			case FALSE:
			case TRUE:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(447);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(448);
				array_element();
				}
				break;
			case 3:
				{
				setState(449);
				logical_val();
				}
				break;
			case 4:
				{
				setState(450);
				match(T__3);
				setState(451);
				logical_exp();
				setState(452);
				match(T__4);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SMOOLAParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4a\n\4\f\4\16\4d\13\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\5\7\5"+
		"p\n\5\f\5\16\5s\13\5\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\7\5\177"+
		"\n\5\f\5\16\5\u0082\13\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\7\3\7\3\7\3\7\3\b"+
		"\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\3\b\3\b\7\b\u00a2\n\b\f\b\16\b"+
		"\u00a5\13\b\3\b\3\b\3\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\t\7\t"+
		"\u00b1\n\t\f\t\16\t\u00b4\13\t\3\t\3\t\3\t\3\t\7\t\u00ba\n\t\f\t\16\t"+
		"\u00bd\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\t\7\t\u00c7\n\t\f\t\16"+
		"\t\u00ca\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\t\5\t\u00d5\n\t"+
		"\3\t\7\t\u00d8\n\t\f\t\16\t\u00db\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5"+
		"\13\u00e4\n\13\3\13\3\13\6\13\u00e8\n\13\r\13\16\13\u00e9\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00f4\n\f\f\f\16\f\u00f7\13\f\3\f\5\f\u00fa\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\3\r\5"+
		"\r\u010b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0117"+
		"\n\16\3\17\7\17\u011a\n\17\f\17\16\17\u011d\13\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0123\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u012a\n\20\f\20\16\20\u012d"+
		"\13\20\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u013b\n\21\f\21\16\21\u013e\13\21\3\21\5\21\u0141\n\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0147\n\21\f\21\16\21\u014a\13\21\3\21\3\21"+
		"\3\21\7\21\u014f\n\21\f\21\16\21\u0152\13\21\3\21\3\21\3\21\7\21\u0157"+
		"\n\21\f\21\16\21\u015a\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0171"+
		"\n\27\f\27\16\27\u0174\13\27\3\30\3\30\3\30\7\30\u0179\n\30\f\30\16\30"+
		"\u017c\13\30\3\31\3\31\3\31\3\31\3\31\5\31\u0183\n\31\3\31\3\31\5\31\u0187"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018f\n\31\3\31\3\31\5\31\u0193"+
		"\n\31\7\31\u0195\n\31\f\31\16\31\u0198\13\31\3\32\3\32\3\32\7\32\u019d"+
		"\n\32\f\32\16\32\u01a0\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u01a7\n\33"+
		"\3\34\3\34\5\34\u01ab\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01b4"+
		"\n\34\3\35\3\35\3\35\7\35\u01b9\n\35\f\35\16\35\u01bc\13\35\3\36\3\36"+
		"\5\36\u01c0\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01c9\n\36\3"+
		"\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<\2\t\3\2$%\4\2\21\24##\3\2\35\36\4\2\r\16\60\60\3\2-.\3\2"+
		"+,\3\2()\2\u01f0\2>\3\2\2\2\4J\3\2\2\2\6V\3\2\2\2\bq\3\2\2\2\n\u008c\3"+
		"\2\2\2\f\u0094\3\2\2\2\16\u009b\3\2\2\2\20\u00b2\3\2\2\2\22\u00dc\3\2"+
		"\2\2\24\u00e3\3\2\2\2\26\u00eb\3\2\2\2\30\u010a\3\2\2\2\32\u0116\3\2\2"+
		"\2\34\u0122\3\2\2\2\36\u0124\3\2\2\2 \u0131\3\2\2\2\"\u015b\3\2\2\2$\u015f"+
		"\3\2\2\2&\u0165\3\2\2\2(\u0167\3\2\2\2*\u0169\3\2\2\2,\u016d\3\2\2\2."+
		"\u0175\3\2\2\2\60\u0186\3\2\2\2\62\u0199\3\2\2\2\64\u01a6\3\2\2\2\66\u01aa"+
		"\3\2\2\28\u01b5\3\2\2\2:\u01bf\3\2\2\2<\u01ca\3\2\2\2>B\5\4\3\2?A\5\b"+
		"\5\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\2"+
		"\2\3F\3\3\2\2\2GI\5<\37\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3"+
		"\2\2\2LJ\3\2\2\2MN\7\25\2\2NO\7#\2\2OP\7\3\2\2PQ\5\6\4\2QR\7\4\2\2R\5"+
		"\3\2\2\2SU\5<\37\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2X"+
		"V\3\2\2\2YZ\7\26\2\2Z[\7\5\2\2[\\\7\6\2\2\\]\7\7\2\2]^\7\b\2\2^b\7\24"+
		"\2\2_a\5<\37\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2"+
		"\2\2ef\7\3\2\2fg\5\36\20\2gk\7\4\2\2hj\5<\37\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\7\3\2\2\2mk\3\2\2\2np\5<\37\2on\3\2\2\2ps\3\2\2\2qo"+
		"\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\25\2\2uy\7#\2\2vw\7\32\2\2"+
		"wz\7#\2\2xz\3\2\2\2yv\3\2\2\2yx\3\2\2\2z{\3\2\2\2{\u0080\7\3\2\2|\177"+
		"\5<\37\2}\177\5$\23\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0087\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\5<\37\2\u0084\u0086\5 \21\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\4\2\2\u008b\t\3\2\2\2"+
		"\u008c\u0091\5\62\32\2\u008d\u008e\t\2\2\2\u008e\u0090\5\62\32\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\13\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\6\2\2\u0095\u0096"+
		"\5\30\r\2\u0096\u0097\7\7\2\2\u0097\r\3\2\2\2\u0098\u009a\5<\37\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\37\2\2\u009f"+
		"\u00a3\5\f\7\2\u00a0\u00a2\5<\37\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00ac\7"+
		"\4\2\2\u00a9\u00ab\5<\37\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b1\5<\37\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\7\30\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00bb\7\27\2\2\u00b8\u00ba\5"+
		"<\37\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00c3\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\3"+
		"\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\7\4\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c4\5\32\16\2\u00c3\u00be\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c8\3"+
		"\2\2\2\u00c5\u00c7\5<\37\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d4\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00d1\7 \2\2\u00cc\u00cd\7\3\2\2\u00cd\u00ce\5\34\17\2\u00ce"+
		"\u00cf\7\4\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00cc\3"+
		"\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\5<"+
		"\37\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\21\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7#\2\2"+
		"\u00dd\u00de\7\t\2\2\u00de\u00df\5\n\6\2\u00df\u00e0\7\n\2\2\u00e0\23"+
		"\3\2\2\2\u00e1\u00e4\7#\2\2\u00e2\u00e4\5\22\n\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e8\5\30"+
		"\r\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7/\2\2"+
		"\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f9\7\6\2\2\u00f0\u00f5"+
		"\5\30\r\2\u00f1\u00f2\7\13\2\2\u00f2\u00f4\5\30\r\2\u00f3\u00f1\3\2\2"+
		"\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\7\2\2\u00fc\27\3\2\2"+
		"\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0100\7\7\2\2\u0100"+
		"\u0106\3\2\2\2\u0101\u0106\5\24\13\2\u0102\u0106\5.\30\2\u0103\u0106\5"+
		"\26\f\2\u0104\u0106\5*\26\2\u0105\u00fd\3\2\2\2\u0105\u0101\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\5\30\r\2\u0108\u010b\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0105\3\2\2\2\u010a\u0109\3\2\2\2\u010b\31\3\2\2\2\u010c\u010d\5\30\r"+
		"\2\u010d\u010e\7\f\2\2\u010e\u0117\3\2\2\2\u010f\u0110\5\26\f\2\u0110"+
		"\u0111\7\f\2\2\u0111\u0117\3\2\2\2\u0112\u0117\5\16\b\2\u0113\u0117\5"+
		"\20\t\2\u0114\u0117\5<\37\2\u0115\u0117\7\f\2\2\u0116\u010c\3\2\2\2\u0116"+
		"\u010f\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0115\3\2\2\2\u0117\33\3\2\2\2\u0118\u011a\5\32\16\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0123\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\3\2\2\u011f"+
		"\u0120\5\34\17\2\u0120\u0121\7\4\2\2\u0121\u0123\3\2\2\2\u0122\u011b\3"+
		"\2\2\2\u0122\u011e\3\2\2\2\u0123\35\3\2\2\2\u0124\u0125\5\34\17\2\u0125"+
		"\u0126\7!\2\2\u0126\u0127\5\30\r\2\u0127\u012b\7\f\2\2\u0128\u012a\5<"+
		"\37\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\37\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\5<\37"+
		"\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\26\2\2"+
		"\u0135\u0136\7#\2\2\u0136\u0140\7\6\2\2\u0137\u013c\5\"\22\2\u0138\u0139"+
		"\7\13\2\2\u0139\u013b\5\"\22\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\7\7\2\2\u0143\u0144\7\b\2\2\u0144\u0148\5&"+
		"\24\2\u0145\u0147\5<\37\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u0150\7\3\2\2\u014c\u014f\5<\37\2\u014d\u014f\5$\23\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\5\36\20\2\u0154\u0158\7\4\2\2\u0155\u0157\5<\37\2\u0156\u0155\3"+
		"\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"!\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7#\2\2\u015c\u015d\7\b\2\2\u015d"+
		"\u015e\5&\24\2\u015e#\3\2\2\2\u015f\u0160\7\33\2\2\u0160\u0161\7#\2\2"+
		"\u0161\u0162\7\b\2\2\u0162\u0163\5&\24\2\u0163\u0164\7\f\2\2\u0164%\3"+
		"\2\2\2\u0165\u0166\t\3\2\2\u0166\'\3\2\2\2\u0167\u0168\t\4\2\2\u0168)"+
		"\3\2\2\2\u0169\u016a\7\r\2\2\u016a\u016b\n\5\2\2\u016b\u016c\7\r\2\2\u016c"+
		"+\3\2\2\2\u016d\u0172\5\n\6\2\u016e\u016f\t\6\2\2\u016f\u0171\5\n\6\2"+
		"\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173-\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u017a\58\35\2\u0176"+
		"\u0177\7\'\2\2\u0177\u0179\58\35\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b/\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u0187\5,\27\2\u017e\u0187\5:\36\2\u017f\u0182\7\6\2\2\u0180"+
		"\u0183\5,\27\2\u0181\u0183\5\64\33\2\u0182\u0180\3\2\2\2\u0182\u0181\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\7\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u017d\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u017f\3\2\2\2\u0187\u0196\3\2"+
		"\2\2\u0188\u0192\t\7\2\2\u0189\u0193\5,\27\2\u018a\u0193\5:\36\2\u018b"+
		"\u018e\7\6\2\2\u018c\u018f\5,\27\2\u018d\u018f\5\64\33\2\u018e\u018c\3"+
		"\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\7\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u018a\3\2\2\2\u0192\u018b\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0188\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\61\3\2\2\2\u0198\u0196\3\2\2"+
		"\2\u0199\u019e\5\66\34\2\u019a\u019b\t\b\2\2\u019b\u019d\5\66\34\2\u019c"+
		"\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\63\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a7\5(\25\2\u01a2\u01a3"+
		"\7\6\2\2\u01a3\u01a4\5.\30\2\u01a4\u01a5\7\7\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a1\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01ab\7%\2\2"+
		"\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01b3"+
		"\3\2\2\2\u01ac\u01b4\7#\2\2\u01ad\u01b4\5\22\n\2\u01ae\u01b4\7\20\2\2"+
		"\u01af\u01b0\7\6\2\2\u01b0\u01b1\5\n\6\2\u01b1\u01b2\7\7\2\2\u01b2\u01b4"+
		"\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4\67\3\2\2\2\u01b5\u01ba\5\60\31\2\u01b6\u01b7\7&\2"+
		"\2\u01b7\u01b9\5\60\31\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb9\3\2\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bd\u01c0\7*\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be"+
		"\3\2\2\2\u01c0\u01c8\3\2\2\2\u01c1\u01c9\7#\2\2\u01c2\u01c9\5\22\n\2\u01c3"+
		"\u01c9\5(\25\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\5.\30\2\u01c6\u01c7\7\7"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8"+
		"\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9;\3\2\2\2\u01ca\u01cb\7\17\2\2"+
		"\u01cb=\3\2\2\2\67BJVbkqy~\u0080\u0085\u0087\u0091\u009b\u00a3\u00ac\u00b2"+
		"\u00bb\u00c3\u00c8\u00d1\u00d4\u00d9\u00e3\u00e9\u00f5\u00f9\u0105\u010a"+
		"\u0116\u011b\u0122\u012b\u0131\u013c\u0140\u0148\u014e\u0150\u0158\u0172"+
		"\u017a\u0182\u0186\u018e\u0192\u0196\u019e\u01a6\u01aa\u01b3\u01ba\u01bf"+
		"\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}