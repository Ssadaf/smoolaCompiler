// Generated from /home/sadaf/Documents/Compiler/smoolaCompiler/Smoola.g4 by ANTLR 4.7

    import ast.*;
    import ast.node.*;
    import ast.node.declaration.*;
    import ast.node.expression.*;
    import ast.node.expression.Value.*;
    import ast.node.statement.*;
    import ast.Type.*;
    import ast.Type.ArrayType.*;
    import ast.Type.PrimitiveType.*;
    import ast.Type.UserDefinedType.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmoolaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, CONST_NUM=41, CONST_STR=42, NL=43, ID=44, COMMENT=45, 
		WS=46;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_statements = 5, RULE_statement = 6, RULE_statementBlock = 7, 
		RULE_statementCondition = 8, RULE_statementLoop = 9, RULE_statementWrite = 10, 
		RULE_statementAssignment = 11, RULE_expression = 12, RULE_expressionAssignment = 13, 
		RULE_expressionOr = 14, RULE_expressionOrTemp = 15, RULE_expressionAnd = 16, 
		RULE_expressionAndTemp = 17, RULE_expressionEq = 18, RULE_expressionEqTemp = 19, 
		RULE_expressionCmp = 20, RULE_expressionCmpTemp = 21, RULE_expressionAdd = 22, 
		RULE_expressionAddTemp = 23, RULE_expressionMult = 24, RULE_expressionMultTemp = 25, 
		RULE_expressionUnary = 26, RULE_expressionMem = 27, RULE_expressionMemTemp = 28, 
		RULE_expressionMethods = 29, RULE_expressionMethodsTemp = 30, RULE_expressionOther = 31, 
		RULE_type = 32;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"statements", "statement", "statementBlock", "statementCondition", "statementLoop", 
		"statementWrite", "statementAssignment", "expression", "expressionAssignment", 
		"expressionOr", "expressionOrTemp", "expressionAnd", "expressionAndTemp", 
		"expressionEq", "expressionEqTemp", "expressionCmp", "expressionCmpTemp", 
		"expressionAdd", "expressionAddTemp", "expressionMult", "expressionMultTemp", 
		"expressionUnary", "expressionMem", "expressionMemTemp", "expressionMethods", 
		"expressionMethodsTemp", "expressionOther", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'def'", "'('", "')'", "':'", "'int'", "'return'", 
		"';'", "'}'", "'extends'", "'var'", "','", "'if'", "'then'", "'else'", 
		"'while'", "'writeln('", "'='", "'||'", "'&&'", "'=='", "'<>'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'length'", 
		"'new '", "'this'", "'true'", "'false'", "'boolean'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "Smoola.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmoolaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass;
		public ClassDeclarationContext classDeclaration;
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmoolaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Program prog = new Program();
			         prog.setLine(_localctx.start.getLine());
			setState(67);
			((ProgramContext)_localctx).mainClass = mainClass();
			prog.setMainClass(((ProgramContext)_localctx).mainClass.syn_classDec);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				((ProgramContext)_localctx).classDeclaration = classDeclaration();
				prog.addClass(((ProgramContext)_localctx).classDeclaration.syn_classDec);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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

	public static class MainClassContext extends ParserRuleContext {
		public ClassDeclaration syn_classDec;
		public Token className;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			((MainClassContext)_localctx).className = match(ID);
			((MainClassContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((MainClassContext)_localctx).className!=null?((MainClassContext)_localctx).className.getText():null)), null);
			                _localctx.syn_classDec.setLine(_localctx.start.getLine());
			setState(82);
			match(T__1);
			setState(83);
			match(T__2);
			setState(84);
			match(ID);
			setState(85);
			match(T__3);
			setState(86);
			match(T__4);
			setState(87);
			match(T__5);
			setState(88);
			match(T__6);
			setState(89);
			match(T__1);
			setState(90);
			statements();
			setState(91);
			match(T__7);
			setState(92);
			expression();
			setState(93);
			match(T__8);
			setState(94);
			match(T__9);
			setState(95);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration syn_classDec;
		public Token className;
		public Token classParent;
		public VarDeclarationContext varDeclaration;
		public MethodDeclarationContext methodDeclaration;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			((ClassDeclarationContext)_localctx).className = match(ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(99);
				match(T__10);
				setState(100);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				_localctx.syn_classDec.setParentName(new Identifier((((ClassDeclarationContext)_localctx).classParent!=null?((ClassDeclarationContext)_localctx).classParent.getText():null)) );
				}
			}

			setState(104);
			match(T__1);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(105);
				((ClassDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_classDec.addVarDeclaration(((ClassDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(113);
				((ClassDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				_localctx.syn_classDec.addMethodDeclaration(((ClassDeclarationContext)_localctx).methodDeclaration.syn_methodDec);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration syn_varDec;
		public Token varName;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			((VarDeclarationContext)_localctx).varName = match(ID);
			setState(125);
			match(T__5);
			setState(126);
			((VarDeclarationContext)_localctx).type = type();
			((VarDeclarationContext)_localctx).syn_varDec =  new VarDeclaration(new Identifier((((VarDeclarationContext)_localctx).varName!=null?((VarDeclarationContext)_localctx).varName.getText():null)), ((VarDeclarationContext)_localctx).type.syn_type);
			        _localctx.syn_varDec.setLine(_localctx.start.getLine());
			setState(128);
			match(T__8);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration syn_methodDec;
		public Token methodName;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__2);
			setState(131);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			((MethodDeclarationContext)_localctx).syn_methodDec =  new MethodDeclaration(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)) );
			        _localctx.syn_methodDec.setLine(_localctx.start.getLine());
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(133);
				match(T__3);
				setState(134);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(135);
				match(T__3);
				setState(136);
				match(ID);
				setState(137);
				match(T__5);
				setState(138);
				type();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(139);
					match(T__12);
					setState(140);
					match(ID);
					setState(141);
					match(T__5);
					setState(142);
					type();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__4);
				}
				}
				break;
			}
			setState(152);
			match(T__5);
			setState(153);
			type();
			setState(154);
			match(T__1);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(155);
				varDeclaration();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			statements();
			setState(162);
			match(T__7);
			setState(163);
			expression();
			setState(164);
			match(T__8);
			setState(165);
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

	public static class StatementsContext extends ParserRuleContext {
		public Block syn_stmt;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatementsContext)_localctx).syn_stmt =  new Block();
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(168);
				((StatementsContext)_localctx).statement = statement();
				_localctx.syn_stmt.addStatement(((StatementsContext)_localctx).statement.syn_stmt);
				}
				}
				setState(175);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement syn_stmt;
		public StatementBlockContext statementBlock;
		public StatementConditionContext statementCondition;
		public StatementLoopContext statementLoop;
		public StatementWriteContext statementWrite;
		public StatementAssignmentContext statementAssignment;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public StatementLoopContext statementLoop() {
			return getRuleContext(StatementLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((StatementContext)_localctx).statementBlock = statementBlock();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementBlock.syn_stmt;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((StatementContext)_localctx).statementCondition = statementCondition();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementCondition.syn_stmt;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				((StatementContext)_localctx).statementLoop = statementLoop();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementLoop.syn_stmt;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				((StatementContext)_localctx).statementWrite = statementWrite();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementWrite.syn_stmt;
				}
				break;
			case T__3:
			case T__26:
			case T__29:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				((StatementContext)_localctx).statementAssignment = statementAssignment();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementAssignment.syn_stmt;
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

	public static class StatementBlockContext extends ParserRuleContext {
		public Statement syn_stmt;
		public StatementsContext statements;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__1);
			setState(194);
			((StatementBlockContext)_localctx).statements = statements();
			setState(195);
			match(T__9);
			((StatementBlockContext)_localctx).syn_stmt =  ((StatementBlockContext)_localctx).statements.syn_stmt;
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

	public static class StatementConditionContext extends ParserRuleContext {
		public Conditional syn_stmt;
		public ExpressionContext expression;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementCondition(this);
		}
	}

	public final StatementConditionContext statementCondition() throws RecognitionException {
		StatementConditionContext _localctx = new StatementConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__13);
			setState(199);
			match(T__3);
			setState(200);
			((StatementConditionContext)_localctx).expression = expression();
			setState(201);
			match(T__4);
			setState(202);
			match(T__14);
			setState(203);
			((StatementConditionContext)_localctx).statement = statement();
			((StatementConditionContext)_localctx).syn_stmt =  new Conditional(((StatementConditionContext)_localctx).expression.syn_expr, ((StatementConditionContext)_localctx).statement.syn_stmt);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(205);
				match(T__15);
				setState(206);
				((StatementConditionContext)_localctx).statement = statement();
				}
				break;
			}
			_localctx.syn_stmt.setAlternativeBody(((StatementConditionContext)_localctx).statement.syn_stmt);
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

	public static class StatementLoopContext extends ParserRuleContext {
		public While syn_stmt;
		public ExpressionContext expression;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementLoop(this);
		}
	}

	public final StatementLoopContext statementLoop() throws RecognitionException {
		StatementLoopContext _localctx = new StatementLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			setState(212);
			match(T__3);
			setState(213);
			((StatementLoopContext)_localctx).expression = expression();
			setState(214);
			match(T__4);
			setState(215);
			((StatementLoopContext)_localctx).statement = statement();
			((StatementLoopContext)_localctx).syn_stmt =  new While(((StatementLoopContext)_localctx).expression.syn_expr, ((StatementLoopContext)_localctx).statement.syn_stmt);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
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

	public static class StatementWriteContext extends ParserRuleContext {
		public Write syn_stmt;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementWrite(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__17);
			setState(219);
			((StatementWriteContext)_localctx).expression = expression();
			setState(220);
			match(T__4);
			setState(221);
			match(T__8);
			((StatementWriteContext)_localctx).syn_stmt =  new Write(((StatementWriteContext)_localctx).expression.syn_expr);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
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

	public static class StatementAssignmentContext extends ParserRuleContext {
		public Assign syn_stmt;
		public ExpressionOrContext expressionOr;
		public ExpressionAssignmentContext expressionAssignment;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementAssignment(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((StatementAssignmentContext)_localctx).expressionOr = expressionOr();
			setState(225);
			match(T__18);
			setState(226);
			((StatementAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
			setState(227);
			match(T__8);
			((StatementAssignmentContext)_localctx).syn_stmt =  new Assign(((StatementAssignmentContext)_localctx).expressionOr.syn_expr, ((StatementAssignmentContext)_localctx).expressionAssignment.syn_expr);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
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
		public Expression syn_expr;
		public ExpressionAssignmentContext expressionAssignment;
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((ExpressionContext)_localctx).expressionAssignment = expressionAssignment();
			((ExpressionContext)_localctx).syn_expr =  ((ExpressionContext)_localctx).expressionAssignment.syn_expr;
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

	public static class ExpressionAssignmentContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionOrContext expressionOr;
		public ExpressionAssignmentContext expressionAssignment;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAssignment(this);
		}
	}

	public final ExpressionAssignmentContext expressionAssignment() throws RecognitionException {
		ExpressionAssignmentContext _localctx = new ExpressionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionAssignment);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				setState(234);
				match(T__18);
				setState(235);
				((ExpressionAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
				((ExpressionAssignmentContext)_localctx).syn_expr =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr, ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr, BinaryOperator.assign);
						_localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				((ExpressionAssignmentContext)_localctx).syn_expr =  ((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr;
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

	public static class ExpressionOrContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionAndContext expressionAnd;
		public ExpressionOrTempContext expressionOrTemp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOr(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((ExpressionOrContext)_localctx).expressionAnd = expressionAnd();
			setState(244);
			((ExpressionOrContext)_localctx).expressionOrTemp = expressionOrTemp();
			((ExpressionOrContext)_localctx).syn_expr =  (((ExpressionOrContext)_localctx).expressionOrTemp.syn_expr == null) ?
					((ExpressionOrContext)_localctx).expressionAnd.syn_expr :
					new BinaryExpression(((ExpressionOrContext)_localctx).expressionAnd.syn_expr, ((ExpressionOrContext)_localctx).expressionOrTemp.syn_expr, BinaryOperator.or);
					if(((ExpressionOrContext)_localctx).expressionOrTemp.syn_expr != null)
					    _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionAndContext expressionAnd;
		public ExpressionOrTempContext expressionOrTemp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOrTemp(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp() throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionOrTemp);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__19);
				setState(248);
				((ExpressionOrTempContext)_localctx).expressionAnd = expressionAnd();
				setState(249);
				((ExpressionOrTempContext)_localctx).expressionOrTemp = expressionOrTemp();
				((ExpressionOrTempContext)_localctx).syn_expr =  (((ExpressionOrTempContext)_localctx).expressionOrTemp.syn_expr == null) ?
						(((ExpressionOrTempContext)_localctx).expressionAnd.syn_expr) :
						(new BinaryExpression(((ExpressionOrTempContext)_localctx).expressionAnd.syn_expr, ((ExpressionOrTempContext)_localctx).expressionOrTemp.syn_expr, BinaryOperator.or));
						if(((ExpressionOrTempContext)_localctx).expressionOrTemp.syn_expr == null)
						    _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionOrTempContext)_localctx).syn_expr =  null;
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

	public static class ExpressionAndContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionEqContext expressionEq;
		public ExpressionAndTempContext expressionAndTemp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAnd(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			((ExpressionAndContext)_localctx).expressionEq = expressionEq();
			setState(256);
			((ExpressionAndContext)_localctx).expressionAndTemp = expressionAndTemp();
			((ExpressionAndContext)_localctx).syn_expr =  (((ExpressionAndContext)_localctx).expressionAndTemp.syn_expr == null) ?
					 ((ExpressionAndContext)_localctx).expressionEq.syn_expr :
					 (new BinaryExpression(((ExpressionAndContext)_localctx).expressionEq.syn_expr, ((ExpressionAndContext)_localctx).expressionAndTemp.syn_expr, BinaryOperator.and));
					 if(((ExpressionAndContext)_localctx).expressionAndTemp.syn_expr == null)
					    _localctx.syn_expr.setLine(_localctx.start.getLine());
					 
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

	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionEqContext expressionEq;
		public ExpressionAndTempContext expressionAndTemp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAndTemp(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp() throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionAndTemp);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__20);
				setState(260);
				((ExpressionAndTempContext)_localctx).expressionEq = expressionEq();
				setState(261);
				((ExpressionAndTempContext)_localctx).expressionAndTemp = expressionAndTemp();
				((ExpressionAndTempContext)_localctx).syn_expr =  (((ExpressionAndTempContext)_localctx).expressionAndTemp.syn_expr == null) ?
						(((ExpressionAndTempContext)_localctx).expressionEq.syn_expr) :
						(new BinaryExpression(((ExpressionAndTempContext)_localctx).expressionEq.syn_expr, ((ExpressionAndTempContext)_localctx).expressionAndTemp.syn_expr, BinaryOperator.and));
						if(((ExpressionAndTempContext)_localctx).expressionAndTemp.syn_expr == null)
				    		_localctx.syn_expr.setLine(_localctx.start.getLine());
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAndTempContext)_localctx).syn_expr =  null;
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

	public static class ExpressionEqContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionCmpContext expressionCmp;
		public ExpressionEqTempContext expressionEqTemp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEq(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((ExpressionEqContext)_localctx).expressionCmp = expressionCmp();
			setState(268);
			((ExpressionEqContext)_localctx).expressionEqTemp = expressionEqTemp();
			((ExpressionEqContext)_localctx).syn_expr =  (((ExpressionEqContext)_localctx).expressionEqTemp.syn_expr == null) ?
					((ExpressionEqContext)_localctx).expressionCmp.syn_expr :
					(new BinaryExpression(((ExpressionEqContext)_localctx).expressionCmp.syn_expr, ((ExpressionEqContext)_localctx).expressionEqTemp.syn_expr, (((ExpressionEqContext)_localctx).expressionEqTemp.syn_op == "==" ? BinaryOperator.eq : BinaryOperator.neq)) );
					if(((ExpressionEqContext)_localctx).expressionEqTemp.syn_expr == null)
			    		 _localctx.syn_expr.setLine(_localctx.start.getLine());
					 
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

	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public String syn_op;
		public ExpressionCmpContext expressionCmp;
		public ExpressionEqTempContext expressionEqTemp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEqTemp(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp() throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionEqTemp);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(271);
					match(T__21);
					((ExpressionEqTempContext)_localctx).syn_op =  "==";
					}
					break;
				case T__22:
					{
					setState(273);
					match(T__22);
					((ExpressionEqTempContext)_localctx).syn_op =  "<>";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				((ExpressionEqTempContext)_localctx).expressionCmp = expressionCmp();
				setState(278);
				((ExpressionEqTempContext)_localctx).expressionEqTemp = expressionEqTemp();
				((ExpressionEqTempContext)_localctx).syn_expr =  (((ExpressionEqTempContext)_localctx).expressionEqTemp.syn_expr == null) ?
						(((ExpressionEqTempContext)_localctx).expressionCmp.syn_expr) :
						(new BinaryExpression(((ExpressionEqTempContext)_localctx).expressionCmp.syn_expr, ((ExpressionEqTempContext)_localctx).expressionEqTemp.syn_expr, (((ExpressionEqTempContext)_localctx).expressionEqTemp.syn_op == "==" ? BinaryOperator.eq : BinaryOperator.neq)) );
						if(((ExpressionEqTempContext)_localctx).expressionEqTemp.syn_expr != null)
						    _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionEqTempContext)_localctx).syn_expr =  null; ((ExpressionEqTempContext)_localctx).syn_op =  "";
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

	public static class ExpressionCmpContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionAddContext expressionAdd;
		public ExpressionCmpTempContext expressionCmpTemp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmp(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((ExpressionCmpContext)_localctx).expressionAdd = expressionAdd();
			setState(285);
			((ExpressionCmpContext)_localctx).expressionCmpTemp = expressionCmpTemp();
			((ExpressionCmpContext)_localctx).syn_expr =  (((ExpressionCmpContext)_localctx).expressionCmpTemp.syn_expr == null) ?
					((ExpressionCmpContext)_localctx).expressionAdd.syn_expr :
					(new BinaryExpression(((ExpressionCmpContext)_localctx).expressionAdd.syn_expr, ((ExpressionCmpContext)_localctx).expressionCmpTemp.syn_expr, (((ExpressionCmpContext)_localctx).expressionCmpTemp.syn_op == "<" ? BinaryOperator.lt : BinaryOperator.gt)) );
					if(((ExpressionCmpContext)_localctx).expressionCmpTemp.syn_expr != null)
					    _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public String syn_op;
		public ExpressionAddContext expressionAdd;
		public ExpressionCmpTempContext expressionCmpTemp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmpTemp(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp() throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionCmpTemp);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(288);
					match(T__23);
					((ExpressionCmpTempContext)_localctx).syn_op =  "<";
					}
					break;
				case T__24:
					{
					setState(290);
					match(T__24);
					((ExpressionCmpTempContext)_localctx).syn_op =  ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294);
				((ExpressionCmpTempContext)_localctx).expressionAdd = expressionAdd();
				setState(295);
				((ExpressionCmpTempContext)_localctx).expressionCmpTemp = expressionCmpTemp();
				((ExpressionCmpTempContext)_localctx).syn_expr =  (((ExpressionCmpTempContext)_localctx).expressionCmpTemp.syn_expr == null) ?
						(((ExpressionCmpTempContext)_localctx).expressionAdd.syn_expr) :
						(new BinaryExpression(((ExpressionCmpTempContext)_localctx).expressionAdd.syn_expr, ((ExpressionCmpTempContext)_localctx).expressionCmpTemp.syn_expr, (((ExpressionCmpTempContext)_localctx).expressionCmpTemp.syn_op == "<" ? BinaryOperator.lt : BinaryOperator.gt)));
				        if(((ExpressionCmpTempContext)_localctx).expressionCmpTemp.syn_expr != null)
				            _localctx.syn_expr.setLine(_localctx.start.getLine());
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionCmpTempContext)_localctx).syn_expr =  null; ((ExpressionCmpTempContext)_localctx).syn_op =  "";
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

	public static class ExpressionAddContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionMultContext expressionMult;
		public ExpressionAddTempContext expressionAddTemp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAdd(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((ExpressionAddContext)_localctx).expressionMult = expressionMult();
			setState(302);
			((ExpressionAddContext)_localctx).expressionAddTemp = expressionAddTemp();
			((ExpressionAddContext)_localctx).syn_expr =  (((ExpressionAddContext)_localctx).expressionAddTemp.syn_expr == null) ?
					((ExpressionAddContext)_localctx).expressionMult.syn_expr :
					(new BinaryExpression(((ExpressionAddContext)_localctx).expressionMult.syn_expr, ((ExpressionAddContext)_localctx).expressionAddTemp.syn_expr, (((ExpressionAddContext)_localctx).expressionAddTemp.syn_op == "+" ? BinaryOperator.add : BinaryOperator.sub)) );
					if(((ExpressionAddContext)_localctx).expressionAddTemp.syn_expr != null)
					    _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public String syn_op;
		public ExpressionMultContext expressionMult;
		public ExpressionAddTempContext expressionAddTemp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAddTemp(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp() throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionAddTemp);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(305);
					match(T__25);
					((ExpressionAddTempContext)_localctx).syn_op =  "+";
					}
					break;
				case T__26:
					{
					setState(307);
					match(T__26);
					((ExpressionAddTempContext)_localctx).syn_op =  "-";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311);
				((ExpressionAddTempContext)_localctx).expressionMult = expressionMult();
				setState(312);
				((ExpressionAddTempContext)_localctx).expressionAddTemp = expressionAddTemp();
				((ExpressionAddTempContext)_localctx).syn_expr =  (((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr == null) ? (((ExpressionAddTempContext)_localctx).expressionMult.syn_expr) : (new BinaryExpression(((ExpressionAddTempContext)_localctx).expressionMult.syn_expr, ((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr, (((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_op == "+" ? BinaryOperator.add : BinaryOperator.sub)) );
						if(((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr != null)
						    _localctx.syn_expr.setLine(_localctx.start.getline());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAddTempContext)_localctx).syn_expr =  null; ((ExpressionAddTempContext)_localctx).syn_op =  "";
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

	public static class ExpressionMultContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMultTempContext expressionMultTemp;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMult(this);
		}
	}

	public final ExpressionMultContext expressionMult() throws RecognitionException {
		ExpressionMultContext _localctx = new ExpressionMultContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((ExpressionMultContext)_localctx).expressionUnary = expressionUnary();
			setState(319);
			((ExpressionMultContext)_localctx).expressionMultTemp = expressionMultTemp();
			((ExpressionMultContext)_localctx).syn_expr =  (((ExpressionMultContext)_localctx).expressionMultTemp.syn_expr == null) ?
					((ExpressionMultContext)_localctx).expressionUnary.syn_expr :
					(new BinaryExpression(((ExpressionMultContext)_localctx).expressionUnary.syn_expr, ((ExpressionMultContext)_localctx).expressionMultTemp.syn_expr, (((ExpressionMultContext)_localctx).expressionMultTemp.syn_op == "*") ? BinaryOperator.mult: BinaryOperator.div));
					if(((ExpressionMultContext)_localctx).expressionMultTemp.syn_expr != null)
					    _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionMultTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public String syn_op;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMultTempContext expressionMultTemp;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMultTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMultTemp(this);
		}
	}

	public final ExpressionMultTempContext expressionMultTemp() throws RecognitionException {
		ExpressionMultTempContext _localctx = new ExpressionMultTempContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionMultTemp);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(322);
					match(T__27);
					((ExpressionMultTempContext)_localctx).syn_op =  "*";
					}
					break;
				case T__28:
					{
					setState(324);
					match(T__28);
					((ExpressionMultTempContext)_localctx).syn_op =  "/";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328);
				((ExpressionMultTempContext)_localctx).expressionUnary = expressionUnary();
				setState(329);
				((ExpressionMultTempContext)_localctx).expressionMultTemp = expressionMultTemp();
				((ExpressionMultTempContext)_localctx).syn_expr =  (((ExpressionMultTempContext)_localctx).expressionMultTemp.syn_expr == null) ?
						(((ExpressionMultTempContext)_localctx).expressionUnary.syn_expr) :
						(new BinaryExpression(((ExpressionMultTempContext)_localctx).expressionUnary.syn_expr, ((ExpressionMultTempContext)_localctx).expressionMultTemp.syn_expr, (((ExpressionMultTempContext)_localctx).expressionMultTemp.syn_op == "*" ? BinaryOperator.mult : BinaryOperator.div)) );
						if(((ExpressionMultTempContext)_localctx).expressionMultTemp.syn_expr != null)
						    _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMultTempContext)_localctx).syn_expr =  null; ((ExpressionMultTempContext)_localctx).syn_op =  "";
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

	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMemContext expressionMem;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMemContext expressionMem() {
			return getRuleContext(ExpressionMemContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionUnary(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionUnary);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator op; 
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(336);
					match(T__29);
					op = UnaryOperator.not;
					}
					break;
				case T__26:
					{
					setState(338);
					match(T__26);
					op = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				((ExpressionUnaryContext)_localctx).expressionUnary = expressionUnary();
				((ExpressionUnaryContext)_localctx).syn_expr =  new UnaryExpression(op, ((ExpressionUnaryContext)_localctx).expressionUnary.syn_expr);
						_localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__3:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				((ExpressionUnaryContext)_localctx).expressionMem = expressionMem();
				((ExpressionUnaryContext)_localctx).syn_expr =  ((ExpressionUnaryContext)_localctx).expressionMem.syn_expr;
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

	public static class ExpressionMemContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionMethodsContext expressionMethods;
		public ExpressionMemTempContext expressionMemTemp;
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionMemTempContext expressionMemTemp() {
			return getRuleContext(ExpressionMemTempContext.class,0);
		}
		public ExpressionMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMem(this);
		}
	}

	public final ExpressionMemContext expressionMem() throws RecognitionException {
		ExpressionMemContext _localctx = new ExpressionMemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((ExpressionMemContext)_localctx).expressionMethods = expressionMethods();
			setState(351);
			((ExpressionMemContext)_localctx).expressionMemTemp = expressionMemTemp();
			 ((ExpressionMemContext)_localctx).syn_expr =  (((ExpressionMemContext)_localctx).expressionMemTemp.syn_expr == null) ? ((ExpressionMemContext)_localctx).expressionMethods.syn_expr :  (new ArrayCall(((ExpressionMemContext)_localctx).expressionMethods.syn_expr, ((ExpressionMemContext)_localctx).expressionMemTemp.syn_expr));
					        if(((ExpressionMemContext)_localctx).expressionMemTemp.syn_expr != null)
					            _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionMemTempContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionMemTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMemTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMemTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMemTemp(this);
		}
	}

	public final ExpressionMemTempContext expressionMemTemp() throws RecognitionException {
		ExpressionMemTempContext _localctx = new ExpressionMemTempContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionMemTemp);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__30);
				setState(355);
				((ExpressionMemTempContext)_localctx).expression = expression();
				setState(356);
				match(T__31);
				((ExpressionMemTempContext)_localctx).syn_expr =  ((ExpressionMemTempContext)_localctx).expression.syn_expr;
						        _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMemTempContext)_localctx).syn_expr =  null;
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

	public static class ExpressionMethodsContext extends ParserRuleContext {
		public Expression syn_expr;
		public ExpressionOtherContext expressionOther;
		public ExpressionMethodsTempContext expressionMethodsTemp;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethods(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((ExpressionMethodsContext)_localctx).expressionOther = expressionOther();
			setState(363);
			((ExpressionMethodsContext)_localctx).expressionMethodsTemp = expressionMethodsTemp(((ExpressionMethodsContext)_localctx).expressionOther.syn_expr);
			((ExpressionMethodsContext)_localctx).syn_expr =  ((ExpressionMethodsContext)_localctx).expressionMethodsTemp.syn_expr;
				            _localctx.syn_expr.setLine(_localctx.start.getLine());
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

	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Expression inh_instance;
		public Expression syn_expr;
		public Token methodName;
		public ExpressionMethodsTempContext expressionMethodsTemp;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState, Expression inh_instance) {
			super(parent, invokingState);
			this.inh_instance = inh_instance;
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethodsTemp(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp(Expression inh_instance) throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState(), inh_instance);
		enterRule(_localctx, 60, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				Expression instanceTillNow;
				setState(367);
				match(T__32);
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(368);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					instanceTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(370);
					match(T__3);
					setState(371);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(372);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					setState(373);
					match(T__3);
					{
					setState(374);
					expression();
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(375);
						match(T__12);
						setState(376);
						expression();
						}
						}
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(382);
					match(T__4);
					instanceTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					}
					break;
				case 3:
					{
					setState(385);
					match(T__33);
					instanceTillNow = new Length(_localctx.inh_instance);
					}
					break;
				}
				setState(389);
				((ExpressionMethodsTempContext)_localctx).expressionMethodsTemp = expressionMethodsTemp(instanceTillNow);
				((ExpressionMethodsTempContext)_localctx).syn_expr =  ((ExpressionMethodsTempContext)_localctx).expressionMethodsTemp.syn_expr; _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMethodsTempContext)_localctx).syn_expr =  _localctx.inh_instance; 
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

	public static class ExpressionOtherContext extends ParserRuleContext {
		public Expression syn_expr;
		public Token val;
		public Token size;
		public Token className;
		public Token iden;
		public Token arrayName;
		public ExpressionContext expression;
		public TerminalNode CONST_NUM() { return getToken(SmoolaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(SmoolaParser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOther(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionOther);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				((ExpressionOtherContext)_localctx).val = match(CONST_NUM);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new IntValue( (((ExpressionOtherContext)_localctx).val!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).val.getText()):0), new IntType() );
						        _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((ExpressionOtherContext)_localctx).val = match(CONST_STR);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new StringValue( (((ExpressionOtherContext)_localctx).val!=null?((ExpressionOtherContext)_localctx).val.getText():null), new StringType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(T__34);
				setState(400);
				match(T__6);
				setState(401);
				match(T__30);
				setState(402);
				((ExpressionOtherContext)_localctx).size = match(CONST_NUM);
				setState(403);
				match(T__31);
				NewArray newArr = new NewArray(); newArr.setExpression(new IntValue( (((ExpressionOtherContext)_localctx).size!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).size.getText()):0), new IntType() ));
				                ((ExpressionOtherContext)_localctx).syn_expr =  newArr; _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(T__34);
				setState(406);
				((ExpressionOtherContext)_localctx).className = match(ID);
				setState(407);
				match(T__3);
				setState(408);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new NewClass( new Identifier((((ExpressionOtherContext)_localctx).className!=null?((ExpressionOtherContext)_localctx).className.getText():null)) );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(T__35);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new This();
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(T__36);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( true, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(414);
				match(T__37);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( false, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(416);
				((ExpressionOtherContext)_localctx).iden = match(ID);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new Identifier((((ExpressionOtherContext)_localctx).iden!=null?((ExpressionOtherContext)_localctx).iden.getText():null));
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(418);
				((ExpressionOtherContext)_localctx).arrayName = match(ID);
				setState(419);
				match(T__30);
				setState(420);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(421);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new ArrayCall( new Identifier((((ExpressionOtherContext)_localctx).arrayName!=null?((ExpressionOtherContext)_localctx).arrayName.getText():null)), ((ExpressionOtherContext)_localctx).expression.syn_expr);
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(424);
				match(T__3);
				setState(425);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(426);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).syn_expr =  ((ExpressionOtherContext)_localctx).expression.syn_expr; 
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

	public static class TypeContext extends ParserRuleContext {
		public Type syn_type;
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__6);
				 ((TypeContext)_localctx).syn_type =  new IntType();
					        _localctx.syn_type.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(T__38);
				 ((TypeContext)_localctx).syn_type =  new BooleanType();
					        _localctx.syn_type.setLine(_localctx.start.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(T__39);
				 ((TypeContext)_localctx).syn_type =  new StringType();
					        _localctx.syn_type.setLine(_localctx.start.getLine());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(T__6);
				setState(438);
				match(T__30);
				setState(439);
				match(T__31);
				 ((TypeContext)_localctx).syn_type =  new ArrayType();
					        _localctx.syn_type.setLine(_localctx.start.getLine());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(ID);
				 ((TypeContext)_localctx).syn_type =  new UserDefinedType();
				    	     _localctx.syn_type.setLine(_localctx.start.getLine());
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4"+
		"\3\4\3\4\3\4\7\4w\n\4\f\4\16\4z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0092\n\6\f"+
		"\6\16\6\u0095\13\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6"+
		"\f\6\16\6\u00a2\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ae"+
		"\n\7\f\7\16\7\u00b1\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d2\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0100\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u010c\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\5\25\u0116\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u011d\n\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0127\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u012e\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u0138\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u013f\n\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u0149\n\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0150\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0157\n\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u015f\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u016b\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \7 \u017c\n \f \16 \u017f\13 \3 \3 \3 \3 \3 \5 \u0186\n \3 "+
		"\3 \3 \3 \5 \u018c\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01b0\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01be\n\"\3\"\2\2#\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2"+
		"\u01ca\2D\3\2\2\2\4Q\3\2\2\2\6c\3\2\2\2\b}\3\2\2\2\n\u0084\3\2\2\2\f\u00a9"+
		"\3\2\2\2\16\u00c1\3\2\2\2\20\u00c3\3\2\2\2\22\u00c8\3\2\2\2\24\u00d5\3"+
		"\2\2\2\26\u00dc\3\2\2\2\30\u00e2\3\2\2\2\32\u00e8\3\2\2\2\34\u00f3\3\2"+
		"\2\2\36\u00f5\3\2\2\2 \u00ff\3\2\2\2\"\u0101\3\2\2\2$\u010b\3\2\2\2&\u010d"+
		"\3\2\2\2(\u011c\3\2\2\2*\u011e\3\2\2\2,\u012d\3\2\2\2.\u012f\3\2\2\2\60"+
		"\u013e\3\2\2\2\62\u0140\3\2\2\2\64\u014f\3\2\2\2\66\u015e\3\2\2\28\u0160"+
		"\3\2\2\2:\u016a\3\2\2\2<\u016c\3\2\2\2>\u018b\3\2\2\2@\u01af\3\2\2\2B"+
		"\u01bd\3\2\2\2DE\b\2\1\2EF\5\4\3\2FL\b\2\1\2GH\5\6\4\2HI\b\2\1\2IK\3\2"+
		"\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2"+
		"\2\3P\3\3\2\2\2QR\7\3\2\2RS\7.\2\2ST\b\3\1\2TU\7\4\2\2UV\7\5\2\2VW\7."+
		"\2\2WX\7\6\2\2XY\7\7\2\2YZ\7\b\2\2Z[\7\t\2\2[\\\7\4\2\2\\]\5\f\7\2]^\7"+
		"\n\2\2^_\5\32\16\2_`\7\13\2\2`a\7\f\2\2ab\7\f\2\2b\5\3\2\2\2cd\7\3\2\2"+
		"dh\7.\2\2ef\7\r\2\2fg\7.\2\2gi\b\4\1\2he\3\2\2\2hi\3\2\2\2ij\3\2\2\2j"+
		"p\7\4\2\2kl\5\b\5\2lm\b\4\1\2mo\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qx\3\2\2\2rp\3\2\2\2st\5\n\6\2tu\b\4\1\2uw\3\2\2\2vs\3\2\2\2"+
		"wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\f\2\2|\7\3\2\2"+
		"\2}~\7\16\2\2~\177\7.\2\2\177\u0080\7\b\2\2\u0080\u0081\5B\"\2\u0081\u0082"+
		"\b\5\1\2\u0082\u0083\7\13\2\2\u0083\t\3\2\2\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0086\7.\2\2\u0086\u0098\b\6\1\2\u0087\u0088\7\6\2\2\u0088\u0099\7\7"+
		"\2\2\u0089\u008a\7\6\2\2\u008a\u008b\7.\2\2\u008b\u008c\7\b\2\2\u008c"+
		"\u0093\5B\"\2\u008d\u008e\7\17\2\2\u008e\u008f\7.\2\2\u008f\u0090\7\b"+
		"\2\2\u0090\u0092\5B\"\2\u0091\u008d\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7\7\2\2\u0097\u0099\3\2\2\2\u0098\u0087\3\2\2\2\u0098"+
		"\u0089\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5B"+
		"\"\2\u009c\u00a0\7\4\2\2\u009d\u009f\5\b\5\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\n\2\2\u00a5"+
		"\u00a6\5\32\16\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\7\f\2\2\u00a8\13\3\2"+
		"\2\2\u00a9\u00af\b\7\1\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\b\7\1\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\5\20\t\2\u00b3\u00b4\b\b\1\2\u00b4\u00c2\3\2\2\2\u00b5\u00b6\5\22\n\2"+
		"\u00b6\u00b7\b\b\1\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba"+
		"\b\b\1\2\u00ba\u00c2\3\2\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd\b\b\1\2"+
		"\u00bd\u00c2\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\b\b\1\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1"+
		"\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\7\4\2"+
		"\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\b\t\1\2\u00c7\21"+
		"\3\2\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce\5\16\b\2\u00ce"+
		"\u00d1\b\n\1\2\u00cf\u00d0\7\22\2\2\u00d0\u00d2\5\16\b\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\n\1\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\5\32"+
		"\16\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\16\b\2\u00da\u00db\b\13\1\2\u00db"+
		"\25\3\2\2\2\u00dc\u00dd\7\24\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7\7"+
		"\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\b\f\1\2\u00e1\27\3\2\2\2\u00e2\u00e3"+
		"\5\36\20\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6\7\13"+
		"\2\2\u00e6\u00e7\b\r\1\2\u00e7\31\3\2\2\2\u00e8\u00e9\5\34\17\2\u00e9"+
		"\u00ea\b\16\1\2\u00ea\33\3\2\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\25"+
		"\2\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\b\17\1\2\u00ef\u00f4\3\2\2\2\u00f0"+
		"\u00f1\5\36\20\2\u00f1\u00f2\b\17\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00eb"+
		"\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\5\"\22\2\u00f6"+
		"\u00f7\5 \21\2\u00f7\u00f8\b\20\1\2\u00f8\37\3\2\2\2\u00f9\u00fa\7\26"+
		"\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\b\21\1\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u0100\b\21\1\2\u00ff\u00f9\3\2\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100!\3\2\2\2\u0101\u0102\5&\24\2\u0102\u0103\5$\23\2\u0103\u0104"+
		"\b\22\1\2\u0104#\3\2\2\2\u0105\u0106\7\27\2\2\u0106\u0107\5&\24\2\u0107"+
		"\u0108\5$\23\2\u0108\u0109\b\23\1\2\u0109\u010c\3\2\2\2\u010a\u010c\b"+
		"\23\1\2\u010b\u0105\3\2\2\2\u010b\u010a\3\2\2\2\u010c%\3\2\2\2\u010d\u010e"+
		"\5*\26\2\u010e\u010f\5(\25\2\u010f\u0110\b\24\1\2\u0110\'\3\2\2\2\u0111"+
		"\u0112\7\30\2\2\u0112\u0116\b\25\1\2\u0113\u0114\7\31\2\2\u0114\u0116"+
		"\b\25\1\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\5*\26\2\u0118\u0119\5(\25\2\u0119\u011a\b\25\1\2\u011a\u011d"+
		"\3\2\2\2\u011b\u011d\b\25\1\2\u011c\u0115\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d)\3\2\2\2\u011e\u011f\5.\30\2\u011f\u0120\5,\27\2\u0120\u0121\b"+
		"\26\1\2\u0121+\3\2\2\2\u0122\u0123\7\32\2\2\u0123\u0127\b\27\1\2\u0124"+
		"\u0125\7\33\2\2\u0125\u0127\b\27\1\2\u0126\u0122\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5.\30\2\u0129\u012a\5,\27\2\u012a"+
		"\u012b\b\27\1\2\u012b\u012e\3\2\2\2\u012c\u012e\b\27\1\2\u012d\u0126\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012e-\3\2\2\2\u012f\u0130\5\62\32\2\u0130"+
		"\u0131\5\60\31\2\u0131\u0132\b\30\1\2\u0132/\3\2\2\2\u0133\u0134\7\34"+
		"\2\2\u0134\u0138\b\31\1\2\u0135\u0136\7\35\2\2\u0136\u0138\b\31\1\2\u0137"+
		"\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5\62"+
		"\32\2\u013a\u013b\5\60\31\2\u013b\u013c\b\31\1\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013f\b\31\1\2\u013e\u0137\3\2\2\2\u013e\u013d\3\2\2\2\u013f\61\3\2\2"+
		"\2\u0140\u0141\5\66\34\2\u0141\u0142\5\64\33\2\u0142\u0143\b\32\1\2\u0143"+
		"\63\3\2\2\2\u0144\u0145\7\36\2\2\u0145\u0149\b\33\1\2\u0146\u0147\7\37"+
		"\2\2\u0147\u0149\b\33\1\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\5\66\34\2\u014b\u014c\5\64\33\2\u014c\u014d"+
		"\b\33\1\2\u014d\u0150\3\2\2\2\u014e\u0150\b\33\1\2\u014f\u0148\3\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\65\3\2\2\2\u0151\u0156\b\34\1\2\u0152\u0153"+
		"\7 \2\2\u0153\u0157\b\34\1\2\u0154\u0155\7\35\2\2\u0155\u0157\b\34\1\2"+
		"\u0156\u0152\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\5\66\34\2\u0159\u015a\b\34\1\2\u015a\u015f\3\2\2\2\u015b\u015c\58\35"+
		"\2\u015c\u015d\b\34\1\2\u015d\u015f\3\2\2\2\u015e\u0151\3\2\2\2\u015e"+
		"\u015b\3\2\2\2\u015f\67\3\2\2\2\u0160\u0161\5<\37\2\u0161\u0162\5:\36"+
		"\2\u0162\u0163\b\35\1\2\u01639\3\2\2\2\u0164\u0165\7!\2\2\u0165\u0166"+
		"\5\32\16\2\u0166\u0167\7\"\2\2\u0167\u0168\b\36\1\2\u0168\u016b\3\2\2"+
		"\2\u0169\u016b\b\36\1\2\u016a\u0164\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		";\3\2\2\2\u016c\u016d\5@!\2\u016d\u016e\5> \2\u016e\u016f\b\37\1\2\u016f"+
		"=\3\2\2\2\u0170\u0171\b \1\2\u0171\u0185\7#\2\2\u0172\u0173\7.\2\2\u0173"+
		"\u0174\b \1\2\u0174\u0175\7\6\2\2\u0175\u0186\7\7\2\2\u0176\u0177\7.\2"+
		"\2\u0177\u0178\7\6\2\2\u0178\u017d\5\32\16\2\u0179\u017a\7\17\2\2\u017a"+
		"\u017c\5\32\16\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\7\7\2\2\u0181\u0182\b \1\2\u0182\u0186\3\2\2\2\u0183\u0184\7$\2"+
		"\2\u0184\u0186\b \1\2\u0185\u0172\3\2\2\2\u0185\u0176\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\5> \2\u0188\u0189\b \1\2\u0189"+
		"\u018c\3\2\2\2\u018a\u018c\b \1\2\u018b\u0170\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c?\3\2\2\2\u018d\u018e\7+\2\2\u018e\u01b0\b!\1\2\u018f\u0190"+
		"\7,\2\2\u0190\u01b0\b!\1\2\u0191\u0192\7%\2\2\u0192\u0193\7\t\2\2\u0193"+
		"\u0194\7!\2\2\u0194\u0195\7+\2\2\u0195\u0196\7\"\2\2\u0196\u01b0\b!\1"+
		"\2\u0197\u0198\7%\2\2\u0198\u0199\7.\2\2\u0199\u019a\7\6\2\2\u019a\u019b"+
		"\7\7\2\2\u019b\u01b0\b!\1\2\u019c\u019d\7&\2\2\u019d\u01b0\b!\1\2\u019e"+
		"\u019f\7\'\2\2\u019f\u01b0\b!\1\2\u01a0\u01a1\7(\2\2\u01a1\u01b0\b!\1"+
		"\2\u01a2\u01a3\7.\2\2\u01a3\u01b0\b!\1\2\u01a4\u01a5\7.\2\2\u01a5\u01a6"+
		"\7!\2\2\u01a6\u01a7\5\32\16\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9\b!\1\2\u01a9"+
		"\u01b0\3\2\2\2\u01aa\u01ab\7\6\2\2\u01ab\u01ac\5\32\16\2\u01ac\u01ad\7"+
		"\7\2\2\u01ad\u01ae\b!\1\2\u01ae\u01b0\3\2\2\2\u01af\u018d\3\2\2\2\u01af"+
		"\u018f\3\2\2\2\u01af\u0191\3\2\2\2\u01af\u0197\3\2\2\2\u01af\u019c\3\2"+
		"\2\2\u01af\u019e\3\2\2\2\u01af\u01a0\3\2\2\2\u01af\u01a2\3\2\2\2\u01af"+
		"\u01a4\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0A\3\2\2\2\u01b1\u01b2\7\t\2\2"+
		"\u01b2\u01be\b\"\1\2\u01b3\u01b4\7)\2\2\u01b4\u01be\b\"\1\2\u01b5\u01b6"+
		"\7*\2\2\u01b6\u01be\b\"\1\2\u01b7\u01b8\7\t\2\2\u01b8\u01b9\7!\2\2\u01b9"+
		"\u01ba\7\"\2\2\u01ba\u01be\b\"\1\2\u01bb\u01bc\7.\2\2\u01bc\u01be\b\""+
		"\1\2\u01bd\u01b1\3\2\2\2\u01bd\u01b3\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01bb\3\2\2\2\u01beC\3\2\2\2\37Lhpx\u0093\u0098\u00a0"+
		"\u00af\u00c1\u00d1\u00f3\u00ff\u010b\u0115\u011c\u0126\u012d\u0137\u013e"+
		"\u0148\u014f\u0156\u015e\u016a\u017d\u0185\u018b\u01af\u01bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}