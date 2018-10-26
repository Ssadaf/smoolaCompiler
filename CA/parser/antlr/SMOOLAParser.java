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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMBER=9, 
		ARRAY=10, BOOLEAN=11, STRING=12, INT=13, CLASS=14, METHOD=15, THEN=16, 
		IF=17, WRITELN=18, EXTENDS=19, VAR=20, THIS=21, FALSE=22, TRUE=23, WHILE=24, 
		ELSE=25, RETURN=26, NEW=27, IDENTIFIER=28, ADD=29, SUB=30, AND=31, OR=32, 
		MUL=33, DIV=34, NOT=35, EQUAL=36, NOTEQUAL=37, LESSTHAN=38, GRATERTHAN=39, 
		ASSIGN=40, WHITESPACE=41;
	public static final int
		RULE_arithmethic_exp = 0, RULE_expression = 1, RULE_expression_helper = 2, 
		RULE_argument = 3, RULE_var_dec = 4, RULE_comparator_binary = 5, RULE_type = 6, 
		RULE_logical_val = 7, RULE_comment = 8, RULE_string = 9, RULE_comparator_atom = 10, 
		RULE_logical_exp = 11, RULE_equal_exp = 12, RULE_mult_expr = 13, RULE_atom_bool_exp = 14, 
		RULE_atom_arith_expr = 15, RULE_and_expr = 16, RULE_atom_logical_expr = 17;
	public static final String[] ruleNames = {
		"arithmethic_exp", "expression", "expression_helper", "argument", "var_dec", 
		"comparator_binary", "type", "logical_val", "comment", "string", "comparator_atom", 
		"logical_exp", "equal_exp", "mult_expr", "atom_bool_exp", "atom_arith_expr", 
		"and_expr", "atom_logical_expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "';'", "'#'", "'\r'", "'\n'", "'\"'", null, 
		"'int[]'", "'boolean'", "'string'", "'int'", "'class'", "'def'", "'then'", 
		"'if'", "'writeln'", "'extends'", "'var'", "'this'", "'false'", "'true'", 
		"'while'", "'else'", "'return'", "'new'", null, "'+'", "'-'", "'&&'", 
		"'||'", "'*'", "'/'", "'!'", "'=='", "'<>'", "'<'", "'>'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NUMBER", "ARRAY", 
		"BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", 
		"EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", "RETURN", 
		"NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", 
		"NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "WHITESPACE"
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
	}

	public final Arithmethic_expContext arithmethic_exp() throws RecognitionException {
		Arithmethic_expContext _localctx = new Arithmethic_expContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arithmethic_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			mult_expr();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				mult_expr();
				}
				}
				setState(43);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression_helperContext expression_helper() {
			return getRuleContext(Expression_helperContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public TerminalNode INT() { return getToken(SMOOLAParser.INT, 0); }
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
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(44);
				match(T__0);
				setState(45);
				expression();
				setState(46);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(48);
				arithmethic_exp();
				}
				break;
			case 3:
				{
				setState(49);
				logical_exp();
				}
				break;
			case 4:
				{
				setState(50);
				logical_val();
				}
				break;
			case 5:
				{
				setState(51);
				string();
				}
				break;
			case 6:
				{
				setState(52);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(53);
				match(INT);
				}
				break;
			}
			setState(56);
			expression_helper();
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

	public static class Expression_helperContext extends ParserRuleContext {
		public Comparator_binaryContext comparator_binary() {
			return getRuleContext(Comparator_binaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterExpression_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitExpression_helper(this);
		}
	}

	public final Expression_helperContext expression_helper() throws RecognitionException {
		Expression_helperContext _localctx = new Expression_helperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_helper);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
			case NOTEQUAL:
			case LESSTHAN:
			case GRATERTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				comparator_binary();
				setState(59);
				expression();
				}
				break;
			case T__1:
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
		enterRule(_localctx, 6, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENTIFIER);
			setState(65);
			match(T__2);
			setState(66);
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
		enterRule(_localctx, 8, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VAR);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(T__2);
			setState(71);
			type();
			setState(72);
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

	public static class Comparator_binaryContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SMOOLAParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SMOOLAParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(SMOOLAParser.LESSTHAN, 0); }
		public TerminalNode GRATERTHAN() { return getToken(SMOOLAParser.GRATERTHAN, 0); }
		public Comparator_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).enterComparator_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMOOLAListener ) ((SMOOLAListener)listener).exitComparator_binary(this);
		}
	}

	public final Comparator_binaryContext comparator_binary() throws RecognitionException {
		Comparator_binaryContext _localctx = new Comparator_binaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparator_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GRATERTHAN))) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		enterRule(_localctx, 14, RULE_logical_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << NUMBER) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << CLASS) | (1L << METHOD) | (1L << THEN) | (1L << IF) | (1L << WRITELN) | (1L << EXTENDS) | (1L << VAR) | (1L << THIS) | (1L << FALSE) | (1L << TRUE) | (1L << WHILE) | (1L << ELSE) | (1L << RETURN) | (1L << NEW) | (1L << IDENTIFIER) | (1L << ADD) | (1L << SUB) | (1L << AND) | (1L << OR) | (1L << MUL) | (1L << DIV) | (1L << NOT) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GRATERTHAN) | (1L << ASSIGN) | (1L << WHITESPACE))) != 0)) {
				{
				{
				setState(81);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(86);
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
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
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

	public static class Comparator_atomContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SMOOLAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SMOOLAParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(SMOOLAParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SMOOLAParser.INT, i);
		}
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
		enterRule(_localctx, 20, RULE_comparator_atom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(91);
				match(T__0);
				setState(92);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(93);
				match(INT);
				}
				break;
			case 3:
				{
				setState(94);
				arithmethic_exp();
				setState(95);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(98);
				match(INT);
				}
				break;
			case 6:
				{
				setState(99);
				arithmethic_exp();
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					_la = _input.LA(1);
					if ( !(_la==LESSTHAN || _la==GRATERTHAN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(103);
						match(T__0);
						setState(104);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(105);
						match(INT);
						}
						break;
					case 3:
						{
						setState(106);
						arithmethic_exp();
						setState(107);
						match(T__1);
						}
						break;
					case 4:
						{
						setState(109);
						match(IDENTIFIER);
						}
						break;
					case 5:
						{
						setState(110);
						match(INT);
						}
						break;
					case 6:
						{
						setState(111);
						arithmethic_exp();
						}
						break;
					}
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 22, RULE_logical_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			and_expr();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(120);
				match(OR);
				setState(121);
				and_expr();
				}
				}
				setState(126);
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
		public List<Logical_valContext> logical_val() {
			return getRuleContexts(Logical_valContext.class);
		}
		public Logical_valContext logical_val(int i) {
			return getRuleContext(Logical_valContext.class,i);
		}
		public Atom_bool_expContext atom_bool_exp() {
			return getRuleContext(Atom_bool_expContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SMOOLAParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SMOOLAParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(SMOOLAParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(SMOOLAParser.NOTEQUAL, i);
		}
		public List<Logical_expContext> logical_exp() {
			return getRuleContexts(Logical_expContext.class);
		}
		public Logical_expContext logical_exp(int i) {
			return getRuleContext(Logical_expContext.class,i);
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
		enterRule(_localctx, 24, RULE_equal_exp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				comparator_atom();
				}
				break;
			case 2:
				{
				setState(128);
				logical_val();
				}
				break;
			case 3:
				{
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(129);
					match(T__0);
					setState(130);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(131);
					atom_bool_exp();
					setState(132);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(139);
						comparator_atom();
						}
						break;
					case 2:
						{
						setState(140);
						logical_val();
						}
						break;
					case 3:
						{
						setState(147);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(141);
							match(T__0);
							setState(142);
							comparator_atom();
							}
							break;
						case 2:
							{
							setState(143);
							logical_val();
							}
							break;
						case 3:
							{
							setState(144);
							logical_exp();
							setState(145);
							match(T__1);
							}
							break;
						}
						}
						break;
					}
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 26, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			atom_arith_expr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				atom_arith_expr();
				}
				}
				setState(163);
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
		enterRule(_localctx, 28, RULE_atom_bool_exp);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				logical_val();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__0);
				setState(166);
				logical_exp();
				setState(167);
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
		public TerminalNode INT() { return getToken(SMOOLAParser.INT, 0); }
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
		enterRule(_localctx, 30, RULE_atom_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(171);
				match(SUB);
				}
				break;
			case T__0:
			case INT:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(175);
				match(IDENTIFIER);
				}
				break;
			case INT:
				{
				setState(176);
				match(INT);
				}
				break;
			case T__0:
				{
				setState(177);
				match(T__0);
				setState(178);
				arithmethic_exp();
				setState(179);
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
		public List<Atom_logical_exprContext> atom_logical_expr() {
			return getRuleContexts(Atom_logical_exprContext.class);
		}
		public Atom_logical_exprContext atom_logical_expr(int i) {
			return getRuleContext(Atom_logical_exprContext.class,i);
		}
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
		enterRule(_localctx, 32, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(183);
				atom_logical_expr();
				}
				break;
			case 2:
				{
				setState(184);
				equal_exp();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(187);
				match(AND);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(188);
					atom_logical_expr();
					}
					break;
				case 2:
					{
					setState(189);
					equal_exp();
					}
					break;
				}
				}
				}
				setState(196);
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
	}

	public final Atom_logical_exprContext atom_logical_expr() throws RecognitionException {
		Atom_logical_exprContext _localctx = new Atom_logical_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom_logical_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(197);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(201);
				match(IDENTIFIER);
				}
				break;
			case FALSE:
			case TRUE:
				{
				setState(202);
				logical_val();
				}
				break;
			case T__0:
				{
				setState(203);
				match(T__0);
				setState(204);
				logical_exp();
				setState(205);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nU\n\n"+
		"\f\n\16\nX\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\fg\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\7\fu\n\f"+
		"\f\f\16\fx\13\f\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0089\n\16\5\16\u008b\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0096\n\16\5\16\u0098\n\16\7\16\u009a"+
		"\n\16\f\16\16\16\u009d\13\16\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17"+
		"\u00a5\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\5\21\u00b0"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b8\n\21\3\22\3\22\5\22\u00bc"+
		"\n\22\3\22\3\22\3\22\5\22\u00c1\n\22\7\22\u00c3\n\22\f\22\16\22\u00c6"+
		"\13\22\3\23\3\23\5\23\u00ca\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d2"+
		"\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\13\3\2"+
		"\37 \3\2&)\4\2\f\17\36\36\3\2\30\31\3\2\b\t\3\2\b\n\3\2()\3\2&\'\3\2#"+
		"$\2\u00e9\2&\3\2\2\2\48\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fL\3"+
		"\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22R\3\2\2\2\24Y\3\2\2\2\26f\3\2\2\2\30"+
		"y\3\2\2\2\32\u008a\3\2\2\2\34\u009e\3\2\2\2\36\u00ab\3\2\2\2 \u00af\3"+
		"\2\2\2\"\u00bb\3\2\2\2$\u00c9\3\2\2\2&+\5\34\17\2\'(\t\2\2\2(*\5\34\17"+
		"\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2./\7\3"+
		"\2\2/\60\5\4\3\2\60\61\7\4\2\2\619\3\2\2\2\629\5\2\2\2\639\5\30\r\2\64"+
		"9\5\20\t\2\659\5\24\13\2\669\7\36\2\2\679\7\17\2\28.\3\2\2\28\62\3\2\2"+
		"\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29:\3\2\2"+
		"\2:;\5\6\4\2;\5\3\2\2\2<=\5\f\7\2=>\5\4\3\2>A\3\2\2\2?A\3\2\2\2@<\3\2"+
		"\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\36\2\2CD\7\5\2\2DE\5\16\b\2E\t\3\2\2\2F"+
		"G\7\26\2\2GH\7\36\2\2HI\7\5\2\2IJ\5\16\b\2JK\7\6\2\2K\13\3\2\2\2LM\t\3"+
		"\2\2M\r\3\2\2\2NO\t\4\2\2O\17\3\2\2\2PQ\t\5\2\2Q\21\3\2\2\2RV\7\7\2\2"+
		"SU\n\6\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\23\3\2\2\2XV\3\2\2"+
		"\2YZ\7\n\2\2Z[\n\7\2\2[\\\7\n\2\2\\\25\3\2\2\2]^\7\3\2\2^g\7\36\2\2_g"+
		"\7\17\2\2`a\5\2\2\2ab\7\4\2\2bg\3\2\2\2cg\7\36\2\2dg\7\17\2\2eg\5\2\2"+
		"\2f]\3\2\2\2f_\3\2\2\2f`\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gv\3\2\2"+
		"\2hr\t\b\2\2ij\7\3\2\2js\7\36\2\2ks\7\17\2\2lm\5\2\2\2mn\7\4\2\2ns\3\2"+
		"\2\2os\7\36\2\2ps\7\17\2\2qs\5\2\2\2ri\3\2\2\2rk\3\2\2\2rl\3\2\2\2ro\3"+
		"\2\2\2rp\3\2\2\2rq\3\2\2\2su\3\2\2\2th\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\27\3\2\2\2xv\3\2\2\2y~\5\"\22\2z{\7\"\2\2{}\5\"\22\2|z\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u008b\5\26\f\2\u0082\u008b\5\20\t\2\u0083\u0084\7\3\2\2\u0084\u0089\5"+
		"\26\f\2\u0085\u0086\5\36\20\2\u0086\u0087\7\4\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0081"+
		"\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u009b\3\2\2\2\u008c"+
		"\u0097\t\t\2\2\u008d\u0098\5\26\f\2\u008e\u0098\5\20\t\2\u008f\u0090\7"+
		"\3\2\2\u0090\u0096\5\26\f\2\u0091\u0096\5\20\t\2\u0092\u0093\5\30\r\2"+
		"\u0093\u0094\7\4\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0091"+
		"\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u008d\3\2\2\2\u0097"+
		"\u008e\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008c\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\33\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\5 \21\2\u009f\u00a0\t\n\2"+
		"\2\u00a0\u00a2\5 \21\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00ac\5\20\t\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\7"+
		"\4\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00b0\7 \2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b8\7\36\2\2\u00b2\u00b8"+
		"\7\17\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5\2\2\2\u00b5\u00b6\7\4\2\2"+
		"\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3"+
		"\3\2\2\2\u00b8!\3\2\2\2\u00b9\u00bc\5$\23\2\u00ba\u00bc\5\32\16\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00c0\7!"+
		"\2\2\u00be\u00c1\5$\23\2\u00bf\u00c1\5\32\16\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\7%\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00d2\7\36\2\2\u00cc\u00d2\5"+
		"\20\t\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7\4\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2"+
		"\2\2\u00d2%\3\2\2\2\30+8@Vfrv~\u0088\u008a\u0095\u0097\u009b\u00a3\u00ab"+
		"\u00af\u00b7\u00bb\u00c0\u00c4\u00c9\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}