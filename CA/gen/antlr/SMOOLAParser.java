// Generated from /Users/yasaman/Desktop/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
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
		T__9=10, NUMBER=11, ARRAY=12, BOOLEAN=13, STRING=14, INT=15, CLASS=16, 
		METHOD=17, THEN=18, IF=19, WRITELN=20, EXTENDS=21, VAR=22, THIS=23, FALSE=24, 
		TRUE=25, WHILE=26, ELSE=27, RETURN=28, NEW=29, IDENTIFIER=30, ADD=31, 
		SUB=32, AND=33, OR=34, MUL=35, DIV=36, NOT=37, EQUAL=38, NOTEQUAL=39, 
		LESSTHAN=40, GRATERTHAN=41, ASSIGN=42, WHITESPACE=43;
	public static final int
		RULE_arithmethic_exp = 0, RULE_condition = 1, RULE_while_expression = 2, 
		RULE_if_expression = 3, RULE_expression = 4, RULE_line = 5, RULE_body = 6, 
		RULE_argument = 7, RULE_var_dec = 8, RULE_type = 9, RULE_logical_val = 10, 
		RULE_comment = 11, RULE_string = 12, RULE_comparator_atom = 13, RULE_logical_exp = 14, 
		RULE_equal_exp = 15, RULE_mult_expr = 16, RULE_atom_bool_exp = 17, RULE_atom_arith_expr = 18, 
		RULE_and_expr = 19, RULE_atom_logical_expr = 20;
	public static final String[] ruleNames = {
		"arithmethic_exp", "condition", "while_expression", "if_expression", "expression", 
		"line", "body", "argument", "var_dec", "type", "logical_val", "comment", 
		"string", "comparator_atom", "logical_exp", "equal_exp", "mult_expr", 
		"atom_bool_exp", "atom_arith_expr", "and_expr", "atom_logical_expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "':'", "'#'", "'\r'", "'\n'", 
		"'\"'", null, "'int[]'", "'boolean'", "'string'", "'int'", "'class'", 
		"'def'", "'then'", "'if'", "'writeln'", "'extends'", "'var'", "'this'", 
		"'false'", "'true'", "'while'", "'else'", "'return'", "'new'", null, "'+'", 
		"'-'", "'&&'", "'||'", "'*'", "'/'", "'!'", "'=='", "'<>'", "'<'", "'>'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"ARRAY", "BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", 
		"WRITELN", "EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", 
		"RETURN", "NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", 
		"NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "WHITESPACE"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitArithmethic_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmethic_expContext arithmethic_exp() throws RecognitionException {
		Arithmethic_expContext _localctx = new Arithmethic_expContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arithmethic_exp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			mult_expr();
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(44);
					mult_expr();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			expression();
			setState(52);
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

	public static class While_expressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SMOOLAParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitWhile_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_expressionContext while_expression() throws RecognitionException {
		While_expressionContext _localctx = new While_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(WHILE);
			setState(55);
			condition();
			setState(56);
			match(T__2);
			setState(57);
			body();
			setState(58);
			match(T__3);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IF);
			setState(61);
			condition();
			setState(62);
			match(THEN);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(63);
				match(T__2);
				setState(64);
				body();
				setState(65);
				match(T__3);
				}
				break;
			case T__0:
			case T__4:
			case T__6:
			case T__9:
			case NUMBER:
			case IF:
			case FALSE:
			case TRUE:
			case WHILE:
			case IDENTIFIER:
			case SUB:
			case NOT:
				{
				setState(67);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(70);
				match(ELSE);
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(71);
					match(T__2);
					setState(72);
					body();
					setState(73);
					match(T__3);
					}
					break;
				case T__0:
				case T__4:
				case T__6:
				case T__9:
				case NUMBER:
				case IF:
				case FALSE:
				case TRUE:
				case WHILE:
				case IDENTIFIER:
				case SUB:
				case NOT:
					{
					setState(75);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		public Equal_expContext equal_exp() {
			return getRuleContext(Equal_expContext.class,0);
		}
		public Arithmethic_expContext arithmethic_exp() {
			return getRuleContext(Arithmethic_expContext.class,0);
		}
		public Logical_expContext logical_exp() {
			return getRuleContext(Logical_expContext.class,0);
		}
		public Logical_valContext logical_val() {
			return getRuleContext(Logical_valContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SMOOLAParser.NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__9:
			case NUMBER:
			case FALSE:
			case TRUE:
			case IDENTIFIER:
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(81);
					match(T__0);
					setState(82);
					expression();
					setState(83);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(85);
					equal_exp();
					}
					break;
				case 3:
					{
					setState(86);
					arithmethic_exp();
					}
					break;
				case 4:
					{
					setState(87);
					logical_exp();
					}
					break;
				case 5:
					{
					setState(88);
					logical_val();
					}
					break;
				case 6:
					{
					setState(89);
					string();
					}
					break;
				case 7:
					{
					setState(90);
					match(IDENTIFIER);
					}
					break;
				case 8:
					{
					setState(91);
					match(NUMBER);
					}
					break;
				}
				setState(94);
				expression();
				}
				break;
			case T__1:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LineContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(98);
				expression();
				}
				break;
			case 2:
				{
				setState(99);
				while_expression();
				}
				break;
			case 3:
				{
				setState(100);
				if_expression();
				}
				break;
			case 4:
				{
				setState(101);
				comment();
				}
				break;
			case 5:
				{
				}
				break;
			}
			setState(105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case NUMBER:
			case IF:
			case FALSE:
			case TRUE:
			case WHILE:
			case IDENTIFIER:
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << NUMBER) | (1L << IF) | (1L << FALSE) | (1L << TRUE) | (1L << WHILE) | (1L << IDENTIFIER) | (1L << SUB) | (1L << NOT))) != 0)) {
					{
					{
					setState(107);
					line();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__2);
				setState(114);
				body();
				setState(115);
				match(T__3);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(T__5);
			setState(121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VAR);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(T__5);
			setState(126);
			type();
			setState(127);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitLogical_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_valContext logical_val() throws RecognitionException {
		Logical_valContext _localctx = new Logical_valContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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

	public static class CommentContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__7 || _la==T__8) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitComparator_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparator_atomContext comparator_atom() throws RecognitionException {
		Comparator_atomContext _localctx = new Comparator_atomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparator_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			arithmethic_exp();
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN || _la==GRATERTHAN) {
				{
				{
				setState(145);
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
				setState(146);
				arithmethic_exp();
				}
				}
				}
				setState(151);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitLogical_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expContext logical_exp() throws RecognitionException {
		Logical_expContext _localctx = new Logical_expContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logical_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			and_expr();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(153);
				match(OR);
				setState(154);
				and_expr();
				}
				}
				setState(159);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitEqual_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_expContext equal_exp() throws RecognitionException {
		Equal_expContext _localctx = new Equal_expContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equal_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(160);
				comparator_atom();
				}
				break;
			case 2:
				{
				setState(161);
				atom_logical_expr();
				}
				break;
			case 3:
				{
				{
				setState(162);
				match(T__0);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(163);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(164);
					atom_bool_exp();
					}
					break;
				}
				setState(167);
				match(T__1);
				}
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(172);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(173);
					atom_logical_expr();
					}
					break;
				case 3:
					{
					{
					setState(174);
					match(T__0);
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(175);
						comparator_atom();
						}
						break;
					case 2:
						{
						setState(176);
						atom_bool_exp();
						}
						break;
					}
					setState(179);
					match(T__1);
					}
					}
					break;
				}
				}
				}
				setState(187);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			atom_arith_expr();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				atom_arith_expr();
				}
				}
				setState(195);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitAtom_bool_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_bool_expContext atom_bool_exp() throws RecognitionException {
		Atom_bool_expContext _localctx = new Atom_bool_expContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom_bool_exp);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				logical_val();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__0);
				setState(198);
				logical_exp();
				setState(199);
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

	public static class Atom_arith_exprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(SMOOLAParser.SUB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMOOLAParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitAtom_arith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_arith_exprContext atom_arith_expr() throws RecognitionException {
		Atom_arith_exprContext _localctx = new Atom_arith_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atom_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(203);
				match(SUB);
				}
				break;
			case T__0:
			case NUMBER:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(207);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				setState(208);
				match(NUMBER);
				}
				break;
			case T__0:
				{
				setState(209);
				match(T__0);
				setState(210);
				arithmethic_exp();
				setState(211);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			equal_exp();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(216);
				match(AND);
				{
				setState(217);
				equal_exp();
				}
				}
				}
				setState(222);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitAtom_logical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_logical_exprContext atom_logical_expr() throws RecognitionException {
		Atom_logical_exprContext _localctx = new Atom_logical_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom_logical_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(223);
				match(NOT);
				}
				break;
			case T__0:
			case FALSE:
			case TRUE:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(227);
				match(IDENTIFIER);
				}
				break;
			case FALSE:
			case TRUE:
				{
				setState(228);
				logical_val();
				}
				break;
			case T__0:
				{
				setState(229);
				match(T__0);
				setState(230);
				logical_exp();
				setState(231);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\5\5R\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\5\6c\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\b\7\bo\n\b\f\b\16\br\13\b\3\b\3"+
		"\b\3\b\3\b\5\bx\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17\3\20\3\20\3\20"+
		"\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00a8\n\21\3\21\3\21\5\21\u00ac\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00b4\n\21\3\21\3\21\5\21\u00b8\n\21\7\21\u00ba\n\21\f\21\16\21\u00bd"+
		"\13\21\3\22\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24\5\24\u00d0\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00d8\n\24\3\25\3\25\3\25\7\25\u00dd\n\25\f\25"+
		"\16\25\u00e0\13\25\3\26\3\26\5\26\u00e4\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00ec\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\n\3\2!\"\4\2\16\21  \3\2\32\33\3\2\n\13\3\2\n\f\3\2*+\3\2"+
		"()\3\2%&\2\u00fd\2,\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b>\3\2\2\2\nb\3\2"+
		"\2\2\fi\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22}\3\2\2\2\24\u0083\3\2\2\2\26"+
		"\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u008e\3\2\2\2\34\u0092\3\2\2\2\36\u009a"+
		"\3\2\2\2 \u00ab\3\2\2\2\"\u00be\3\2\2\2$\u00cb\3\2\2\2&\u00cf\3\2\2\2"+
		"(\u00d9\3\2\2\2*\u00e3\3\2\2\2,\61\5\"\22\2-.\t\2\2\2.\60\5\"\22\2/-\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2"+
		"\2\2\64\65\7\3\2\2\65\66\5\n\6\2\66\67\7\4\2\2\67\5\3\2\2\289\7\34\2\2"+
		"9:\5\4\3\2:;\7\5\2\2;<\5\16\b\2<=\7\6\2\2=\7\3\2\2\2>?\7\25\2\2?@\5\4"+
		"\3\2@F\7\24\2\2AB\7\5\2\2BC\5\16\b\2CD\7\6\2\2DG\3\2\2\2EG\5\f\7\2FA\3"+
		"\2\2\2FE\3\2\2\2GQ\3\2\2\2HN\7\35\2\2IJ\7\5\2\2JK\5\16\b\2KL\7\6\2\2L"+
		"O\3\2\2\2MO\5\f\7\2NI\3\2\2\2NM\3\2\2\2OR\3\2\2\2PR\3\2\2\2QH\3\2\2\2"+
		"QP\3\2\2\2R\t\3\2\2\2ST\7\3\2\2TU\5\n\6\2UV\7\4\2\2V_\3\2\2\2W_\5 \21"+
		"\2X_\5\2\2\2Y_\5\36\20\2Z_\5\26\f\2[_\5\32\16\2\\_\7 \2\2]_\7\r\2\2^S"+
		"\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2"+
		"^]\3\2\2\2_`\3\2\2\2`c\5\n\6\2ac\3\2\2\2b^\3\2\2\2ba\3\2\2\2c\13\3\2\2"+
		"\2dj\5\n\6\2ej\5\6\4\2fj\5\b\5\2gj\5\30\r\2hj\3\2\2\2id\3\2\2\2ie\3\2"+
		"\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7\7\2\2l\r\3\2\2\2mo\5"+
		"\f\7\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qx\3\2\2\2rp\3\2\2\2st\7"+
		"\5\2\2tu\5\16\b\2uv\7\6\2\2vx\3\2\2\2wp\3\2\2\2ws\3\2\2\2x\17\3\2\2\2"+
		"yz\7 \2\2z{\7\b\2\2{|\5\24\13\2|\21\3\2\2\2}~\7\30\2\2~\177\7 \2\2\177"+
		"\u0080\7\b\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\7\2\2\u0082\23\3\2"+
		"\2\2\u0083\u0084\t\3\2\2\u0084\25\3\2\2\2\u0085\u0086\t\4\2\2\u0086\27"+
		"\3\2\2\2\u0087\u008b\7\t\2\2\u0088\u008a\n\5\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\31\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\n\6\2\2\u0090\u0091"+
		"\7\f\2\2\u0091\33\3\2\2\2\u0092\u0097\5\2\2\2\u0093\u0094\t\7\2\2\u0094"+
		"\u0096\5\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f"+
		"\5(\25\2\u009b\u009c\7$\2\2\u009c\u009e\5(\25\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\37\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\u00ac\5\34\17\2\u00a3\u00ac\5*\26\2\u00a4"+
		"\u00a7\7\3\2\2\u00a5\u00a8\5\34\17\2\u00a6\u00a8\5$\23\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ac\u00bb\3\2\2\2\u00ad\u00b7\t\b\2\2\u00ae\u00b8\5\34\17\2\u00af"+
		"\u00b8\5*\26\2\u00b0\u00b3\7\3\2\2\u00b1\u00b4\5\34\17\2\u00b2\u00b4\5"+
		"$\23\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b0\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ad\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc!\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0\t\t\2\2\u00c0\u00c2"+
		"\5&\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cc\5\26\f\2"+
		"\u00c7\u00c8\7\3\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc%\3\2\2\2\u00cd"+
		"\u00d0\7\"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d8\7 \2\2\u00d2\u00d8\7\r\2\2\u00d3"+
		"\u00d4\7\3\2\2\u00d4\u00d5\5\2\2\2\u00d5\u00d6\7\4\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00de\5 \21\2\u00da\u00db\7#\2\2\u00db\u00dd\5 \21\2"+
		"\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df)\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\7\'\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00eb\3\2"+
		"\2\2\u00e5\u00ec\7 \2\2\u00e6\u00ec\5\26\f\2\u00e7\u00e8\7\3\2\2\u00e8"+
		"\u00e9\5\36\20\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e5\3"+
		"\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec+\3\2\2\2\32\61FN"+
		"Q^bipw\u008b\u0097\u009f\u00a7\u00ab\u00b3\u00b7\u00bb\u00c3\u00cb\u00cf"+
		"\u00d7\u00de\u00e3\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}