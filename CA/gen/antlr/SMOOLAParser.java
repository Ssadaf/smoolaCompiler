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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMBER=9, 
		ARRAY=10, BOOLEAN=11, STRING=12, INT=13, CLASS=14, METHOD=15, THEN=16, 
		IF=17, WRITELN=18, EXTENDS=19, VAR=20, THIS=21, FALSE=22, TRUE=23, WHILE=24, 
		ELSE=25, RETURN=26, NEW=27, IDENTIFIER=28, ADD=29, SUB=30, AND=31, OR=32, 
		MUL=33, DIV=34, NOT=35, EQUAL=36, NOTEQUAL=37, LESSTHAN=38, GRATERTHAN=39, 
		ASSIGN=40, WHITESPACE=41;
	public static final int
		RULE_arithmethic_exp = 0, RULE_expression = 1, RULE_argument = 2, RULE_var_dec = 3, 
		RULE_comparator_binary = 4, RULE_type = 5, RULE_logical_val = 6, RULE_comment = 7, 
		RULE_string = 8, RULE_comparator_atom = 9, RULE_logical_exp = 10, RULE_equal_exp = 11, 
		RULE_mult_expr = 12, RULE_atom_bool_exp = 13, RULE_atom_arith_expr = 14, 
		RULE_and_expr = 15, RULE_atom_logical_expr = 16;
	public static final String[] ruleNames = {
		"arithmethic_exp", "expression", "argument", "var_dec", "comparator_binary", 
		"type", "logical_val", "comment", "string", "comparator_atom", "logical_exp", 
		"equal_exp", "mult_expr", "atom_bool_exp", "atom_arith_expr", "and_expr", 
		"atom_logical_expr"
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
			setState(34);
			mult_expr();
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(36);
					mult_expr();
					}
					} 
				}
				setState(41);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public Equal_expContext equal_exp() {
			return getRuleContext(Equal_expContext.class,0);
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
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case NUMBER:
			case FALSE:
			case TRUE:
			case IDENTIFIER:
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(42);
					match(T__0);
					setState(43);
					expression();
					setState(44);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(46);
					arithmethic_exp();
					}
					break;
				case 3:
					{
					setState(47);
					logical_exp();
					}
					break;
				case 4:
					{
					setState(48);
					logical_val();
					}
					break;
				case 5:
					{
					setState(49);
					string();
					}
					break;
				case 6:
					{
					setState(50);
					equal_exp();
					}
					break;
				case 7:
					{
					setState(51);
					match(IDENTIFIER);
					}
					break;
				case 8:
					{
					setState(52);
					match(NUMBER);
					}
					break;
				}
				setState(55);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(T__2);
			setState(61);
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
		enterRule(_localctx, 6, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VAR);
			setState(64);
			match(IDENTIFIER);
			setState(65);
			match(T__2);
			setState(66);
			type();
			setState(67);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitComparator_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparator_binaryContext comparator_binary() throws RecognitionException {
		Comparator_binaryContext _localctx = new Comparator_binaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparator_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		enterRule(_localctx, 12, RULE_logical_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << NUMBER) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << CLASS) | (1L << METHOD) | (1L << THEN) | (1L << IF) | (1L << WRITELN) | (1L << EXTENDS) | (1L << VAR) | (1L << THIS) | (1L << FALSE) | (1L << TRUE) | (1L << WHILE) | (1L << ELSE) | (1L << RETURN) | (1L << NEW) | (1L << IDENTIFIER) | (1L << ADD) | (1L << SUB) | (1L << AND) | (1L << OR) | (1L << MUL) | (1L << DIV) | (1L << NOT) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GRATERTHAN) | (1L << ASSIGN) | (1L << WHITESPACE))) != 0)) {
				{
				{
				setState(76);
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
				setState(81);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
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
		public List<TerminalNode> NUMBER() { return getTokens(SMOOLAParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SMOOLAParser.NUMBER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitComparator_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparator_atomContext comparator_atom() throws RecognitionException {
		Comparator_atomContext _localctx = new Comparator_atomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(86);
				match(T__0);
				setState(87);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(88);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(89);
				arithmethic_exp();
				setState(90);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(92);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(93);
				match(NUMBER);
				}
				break;
			case 6:
				{
				setState(94);
				arithmethic_exp();
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN || _la==GRATERTHAN) {
				{
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==LESSTHAN || _la==GRATERTHAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(98);
					match(T__0);
					setState(99);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(100);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(101);
					arithmethic_exp();
					setState(102);
					match(T__1);
					}
					break;
				case 4:
					{
					setState(104);
					match(IDENTIFIER);
					}
					break;
				case 5:
					{
					setState(105);
					match(NUMBER);
					}
					break;
				case 6:
					{
					setState(106);
					arithmethic_exp();
					}
					break;
				}
				}
				}
				setState(113);
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
		enterRule(_localctx, 20, RULE_logical_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			and_expr();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(115);
				match(OR);
				setState(116);
				and_expr();
				}
				}
				setState(121);
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
		public Atom_logical_exprContext atom_logical_expr() {
			return getRuleContext(Atom_logical_exprContext.class,0);
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
		public List<Logical_valContext> logical_val() {
			return getRuleContexts(Logical_valContext.class);
		}
		public Logical_valContext logical_val(int i) {
			return getRuleContext(Logical_valContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitEqual_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_expContext equal_exp() throws RecognitionException {
		Equal_expContext _localctx = new Equal_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equal_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(122);
				comparator_atom();
				}
				break;
			case 2:
				{
				setState(123);
				atom_logical_expr();
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(124);
					match(T__0);
					setState(125);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(126);
					atom_bool_exp();
					setState(127);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(134);
					comparator_atom();
					}
					break;
				case 2:
					{
					setState(135);
					logical_val();
					}
					break;
				case 3:
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(136);
						match(T__0);
						setState(137);
						comparator_atom();
						}
						break;
					case 2:
						{
						setState(138);
						logical_val();
						}
						break;
					case 3:
						{
						setState(139);
						logical_exp();
						setState(140);
						match(T__1);
						}
						break;
					}
					}
					break;
				}
				}
				}
				setState(150);
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
		enterRule(_localctx, 24, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			atom_arith_expr();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				atom_arith_expr();
				}
				}
				setState(158);
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
		enterRule(_localctx, 26, RULE_atom_bool_exp);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				logical_val();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__0);
				setState(161);
				logical_exp();
				setState(162);
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
		enterRule(_localctx, 28, RULE_atom_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(166);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(170);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				setState(171);
				match(NUMBER);
				}
				break;
			case T__0:
				{
				setState(172);
				match(T__0);
				setState(173);
				arithmethic_exp();
				setState(174);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMOOLAVisitor ) return ((SMOOLAVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(178);
				atom_logical_expr();
				}
				break;
			case 2:
				{
				setState(179);
				equal_exp();
				}
				break;
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(182);
				match(AND);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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
				}
				}
				setState(191);
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
		enterRule(_localctx, 32, RULE_atom_logical_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(192);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(196);
				match(IDENTIFIER);
				}
				break;
			case FALSE:
			case TRUE:
				{
				setState(197);
				logical_val();
				}
				break;
			case T__0:
				{
				setState(198);
				match(T__0);
				setState(199);
				logical_exp();
				setState(200);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13b\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\7\13p\n\13\f"+
		"\13\16\13s\13\13\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0084\n\r\5\r\u0086\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0091\n\r\5\r\u0093\n\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\16"+
		"\3\16\3\16\7\16\u009d\n\16\f\16\16\16\u00a0\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00a7\n\17\3\20\3\20\5\20\u00ab\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00b3\n\20\3\21\3\21\5\21\u00b7\n\21\3\21\3\21\3\21\5\21"+
		"\u00bc\n\21\7\21\u00be\n\21\f\21\16\21\u00c1\13\21\3\22\3\22\5\22\u00c5"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3\22\2\2\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\13\3\2\37 \3\2&)\4\2\f\17\36\36"+
		"\3\2\30\31\3\2\b\t\3\2\b\n\3\2()\3\2&\'\3\2#$\2\u00e5\2$\3\2\2\2\4;\3"+
		"\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16K\3\2\2\2\20M\3\2"+
		"\2\2\22T\3\2\2\2\24a\3\2\2\2\26t\3\2\2\2\30\u0085\3\2\2\2\32\u0099\3\2"+
		"\2\2\34\u00a6\3\2\2\2\36\u00aa\3\2\2\2 \u00b6\3\2\2\2\"\u00c4\3\2\2\2"+
		"$)\5\32\16\2%&\t\2\2\2&(\5\32\16\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\3\3\2\2\2+)\3\2\2\2,-\7\3\2\2-.\5\4\3\2./\7\4\2\2/8\3\2\2\2\60"+
		"8\5\2\2\2\618\5\26\f\2\628\5\16\b\2\638\5\22\n\2\648\5\30\r\2\658\7\36"+
		"\2\2\668\7\13\2\2\67,\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2"+
		"\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29"+
		"<\5\4\3\2:<\3\2\2\2;\67\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\36\2\2>?\7\5"+
		"\2\2?@\5\f\7\2@\7\3\2\2\2AB\7\26\2\2BC\7\36\2\2CD\7\5\2\2DE\5\f\7\2EF"+
		"\7\6\2\2F\t\3\2\2\2GH\t\3\2\2H\13\3\2\2\2IJ\t\4\2\2J\r\3\2\2\2KL\t\5\2"+
		"\2L\17\3\2\2\2MQ\7\7\2\2NP\n\6\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2R\21\3\2\2\2SQ\3\2\2\2TU\7\n\2\2UV\n\7\2\2VW\7\n\2\2W\23\3\2\2\2X"+
		"Y\7\3\2\2Yb\7\36\2\2Zb\7\13\2\2[\\\5\2\2\2\\]\7\4\2\2]b\3\2\2\2^b\7\36"+
		"\2\2_b\7\13\2\2`b\5\2\2\2aX\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a^\3\2\2\2a_\3"+
		"\2\2\2a`\3\2\2\2bq\3\2\2\2cm\t\b\2\2de\7\3\2\2en\7\36\2\2fn\7\13\2\2g"+
		"h\5\2\2\2hi\7\4\2\2in\3\2\2\2jn\7\36\2\2kn\7\13\2\2ln\5\2\2\2md\3\2\2"+
		"\2mf\3\2\2\2mg\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2np\3\2\2\2oc\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\25\3\2\2\2sq\3\2\2\2ty\5 \21\2uv\7\""+
		"\2\2vx\5 \21\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3"+
		"\2\2\2|\u0086\5\24\13\2}\u0083\5\"\22\2~\177\7\3\2\2\177\u0084\5\24\13"+
		"\2\u0080\u0081\5\34\17\2\u0081\u0082\7\4\2\2\u0082\u0084\3\2\2\2\u0083"+
		"~\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2\u0085"+
		"}\3\2\2\2\u0086\u0096\3\2\2\2\u0087\u0092\t\t\2\2\u0088\u0093\5\24\13"+
		"\2\u0089\u0093\5\16\b\2\u008a\u008b\7\3\2\2\u008b\u0091\5\24\13\2\u008c"+
		"\u0091\5\16\b\2\u008d\u008e\5\26\f\2\u008e\u008f\7\4\2\2\u008f\u0091\3"+
		"\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0087\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009e\5\36\20\2\u009a\u009b\t\n\2\2\u009b\u009d\5\36\20\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\33\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a7\5\16\b\2\u00a2\u00a3"+
		"\7\3\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\4\2\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00ab"+
		"\7 \2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00b2\3\2\2\2\u00ac\u00b3\7\36\2\2\u00ad\u00b3\7\13\2\2\u00ae\u00af\7"+
		"\3\2\2\u00af\u00b0\5\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\37\3\2\2"+
		"\2\u00b4\u00b7\5\"\22\2\u00b5\u00b7\5\30\r\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00bb\7!\2\2\u00b9\u00bc\5\""+
		"\22\2\u00ba\u00bc\5\30\r\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5"+
		"\7%\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00cc\3\2\2\2\u00c6\u00cd\7\36\2\2\u00c7\u00cd\5\16\b\2\u00c8\u00c9\7"+
		"\3\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\4\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd#\3\2\2\2"+
		"\30)\67;Qamqy\u0083\u0085\u0090\u0092\u0096\u009e\u00a6\u00aa\u00b2\u00b6"+
		"\u00bb\u00bf\u00c4\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}