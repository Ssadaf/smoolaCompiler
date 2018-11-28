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
			((ClassDeclarationContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null)), null); 
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(100);
				match(T__10);
				setState(101);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				_localctx.syn_classDec.setParentName(new Identifier((((ClassDeclarationContext)_localctx).classParent!=null?((ClassDeclarationContext)_localctx).classParent.getText():null)) );
				}
			}

			setState(105);
			match(T__1);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(106);
				((ClassDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_classDec.addVarDeclaration(((ClassDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(114);
				((ClassDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				_localctx.syn_classDec.addMethodDeclaration(((ClassDeclarationContext)_localctx).methodDeclaration.syn_methodDec);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
			setState(124);
			match(T__11);
			setState(125);
			((VarDeclarationContext)_localctx).varName = match(ID);
			setState(126);
			match(T__5);
			setState(127);
			((VarDeclarationContext)_localctx).type = type();
			((VarDeclarationContext)_localctx).syn_varDec =  new VarDeclaration(new Identifier((((VarDeclarationContext)_localctx).varName!=null?((VarDeclarationContext)_localctx).varName.getText():null)), ((VarDeclarationContext)_localctx).type.syn_type);
			        _localctx.syn_varDec.setLine(_localctx.start.getLine());
			setState(129);
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
			setState(131);
			match(T__2);
			setState(132);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			((MethodDeclarationContext)_localctx).syn_methodDec =  new MethodDeclaration(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)) );
			        _localctx.syn_methodDec.setLine(_localctx.start.getLine());
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__3);
				setState(135);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(136);
				match(T__3);
				setState(137);
				match(ID);
				setState(138);
				match(T__5);
				setState(139);
				type();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(140);
					match(T__12);
					setState(141);
					match(ID);
					setState(142);
					match(T__5);
					setState(143);
					type();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__4);
				}
				}
				break;
			}
			setState(153);
			match(T__5);
			setState(154);
			type();
			setState(155);
			match(T__1);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(156);
				varDeclaration();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			statements();
			setState(163);
			match(T__7);
			setState(164);
			expression();
			setState(165);
			match(T__8);
			setState(166);
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(169);
				((StatementsContext)_localctx).statement = statement();
				_localctx.syn_stmt.addStatement(((StatementsContext)_localctx).statement.syn_stmt);
				}
				}
				setState(176);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((StatementContext)_localctx).statementBlock = statementBlock();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementBlock.syn_stmt;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((StatementContext)_localctx).statementCondition = statementCondition();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementCondition.syn_stmt;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				((StatementContext)_localctx).statementLoop = statementLoop();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementLoop.syn_stmt;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
				setState(189);
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
			setState(194);
			match(T__1);
			setState(195);
			((StatementBlockContext)_localctx).statements = statements();
			setState(196);
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
			setState(199);
			match(T__13);
			setState(200);
			match(T__3);
			setState(201);
			((StatementConditionContext)_localctx).expression = expression();
			setState(202);
			match(T__4);
			setState(203);
			match(T__14);
			setState(204);
			((StatementConditionContext)_localctx).statement = statement();
			((StatementConditionContext)_localctx).syn_stmt =  new Conditional(((StatementConditionContext)_localctx).expression.syn_expr, ((StatementConditionContext)_localctx).statement.syn_stmt);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(206);
				match(T__15);
				setState(207);
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
			setState(212);
			match(T__16);
			setState(213);
			match(T__3);
			setState(214);
			((StatementLoopContext)_localctx).expression = expression();
			setState(215);
			match(T__4);
			setState(216);
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
			setState(219);
			match(T__17);
			setState(220);
			((StatementWriteContext)_localctx).expression = expression();
			setState(221);
			match(T__4);
			setState(222);
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
			setState(225);
			((StatementAssignmentContext)_localctx).expressionOr = expressionOr();
			setState(226);
			match(T__18);
			setState(227);
			((StatementAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
			setState(228);
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
			setState(231);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				setState(235);
				match(T__18);
				setState(236);
				((ExpressionAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
				((ExpressionAssignmentContext)_localctx).syn_expr =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr, ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr, BinaryOperator.assign);
						_localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
			setState(244);
			((ExpressionOrContext)_localctx).expressionAnd = expressionAnd();
			setState(245);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__19);
				setState(249);
				((ExpressionOrTempContext)_localctx).expressionAnd = expressionAnd();
				setState(250);
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
			setState(256);
			((ExpressionAndContext)_localctx).expressionEq = expressionEq();
			setState(257);
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
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__20);
				setState(261);
				((ExpressionAndTempContext)_localctx).expressionEq = expressionEq();
				setState(262);
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
			setState(268);
			((ExpressionEqContext)_localctx).expressionCmp = expressionCmp();
			setState(269);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(272);
					match(T__21);
					((ExpressionEqTempContext)_localctx).syn_op =  "==";
					}
					break;
				case T__22:
					{
					setState(274);
					match(T__22);
					((ExpressionEqTempContext)_localctx).syn_op =  "<>";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278);
				((ExpressionEqTempContext)_localctx).expressionCmp = expressionCmp();
				setState(279);
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
			setState(285);
			((ExpressionCmpContext)_localctx).expressionAdd = expressionAdd();
			setState(286);
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
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(289);
					match(T__23);
					((ExpressionCmpTempContext)_localctx).syn_op =  "<";
					}
					break;
				case T__24:
					{
					setState(291);
					match(T__24);
					((ExpressionCmpTempContext)_localctx).syn_op =  ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295);
				((ExpressionCmpTempContext)_localctx).expressionAdd = expressionAdd();
				setState(296);
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
			setState(302);
			((ExpressionAddContext)_localctx).expressionMult = expressionMult();
			setState(303);
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
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(306);
					match(T__25);
					((ExpressionAddTempContext)_localctx).syn_op =  "+";
					}
					break;
				case T__26:
					{
					setState(308);
					match(T__26);
					((ExpressionAddTempContext)_localctx).syn_op =  "-";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312);
				((ExpressionAddTempContext)_localctx).expressionMult = expressionMult();
				setState(313);
				((ExpressionAddTempContext)_localctx).expressionAddTemp = expressionAddTemp();
				((ExpressionAddTempContext)_localctx).syn_expr =  (((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr == null) ? (((ExpressionAddTempContext)_localctx).expressionMult.syn_expr) : (new BinaryExpression(((ExpressionAddTempContext)_localctx).expressionMult.syn_expr, ((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr, (((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_op == "+" ? BinaryOperator.add : BinaryOperator.sub)) );
						if(((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr != null)
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
			setState(319);
			((ExpressionMultContext)_localctx).expressionUnary = expressionUnary();
			setState(320);
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(323);
					match(T__27);
					((ExpressionMultTempContext)_localctx).syn_op =  "*";
					}
					break;
				case T__28:
					{
					setState(325);
					match(T__28);
					((ExpressionMultTempContext)_localctx).syn_op =  "/";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329);
				((ExpressionMultTempContext)_localctx).expressionUnary = expressionUnary();
				setState(330);
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
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator op; 
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(337);
					match(T__29);
					op = UnaryOperator.not;
					}
					break;
				case T__26:
					{
					setState(339);
					match(T__26);
					op = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343);
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
				setState(346);
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
			setState(351);
			((ExpressionMemContext)_localctx).expressionMethods = expressionMethods();
			setState(352);
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
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__30);
				setState(356);
				((ExpressionMemTempContext)_localctx).expression = expression();
				setState(357);
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
			setState(363);
			((ExpressionMethodsContext)_localctx).expressionOther = expressionOther();
			setState(364);
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
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				Expression instanceTillNow = new MethodCall(null, null);
				setState(368);
				match(T__32);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(369);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					instanceTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(371);
					match(T__3);
					setState(372);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(373);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					setState(374);
					match(T__3);
					{
					setState(375);
					expression();
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(376);
						match(T__12);
						setState(377);
						expression();
						}
						}
						setState(382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(383);
					match(T__4);
					instanceTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					}
					break;
				case 3:
					{
					setState(386);
					match(T__33);
					instanceTillNow = new Length(_localctx.inh_instance);
					}
					break;
				}
				setState(390);
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
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((ExpressionOtherContext)_localctx).val = match(CONST_NUM);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new IntValue( (((ExpressionOtherContext)_localctx).val!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).val.getText()):0), new IntType() );
						        _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((ExpressionOtherContext)_localctx).val = match(CONST_STR);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new StringValue( (((ExpressionOtherContext)_localctx).val!=null?((ExpressionOtherContext)_localctx).val.getText():null), new StringType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(T__34);
				setState(401);
				match(T__6);
				setState(402);
				match(T__30);
				setState(403);
				((ExpressionOtherContext)_localctx).size = match(CONST_NUM);
				setState(404);
				match(T__31);
				NewArray newArr = new NewArray(); newArr.setExpression(new IntValue( (((ExpressionOtherContext)_localctx).size!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).size.getText()):0), new IntType() ));
				                ((ExpressionOtherContext)_localctx).syn_expr =  newArr; _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(T__34);
				setState(407);
				((ExpressionOtherContext)_localctx).className = match(ID);
				setState(408);
				match(T__3);
				setState(409);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new NewClass( new Identifier((((ExpressionOtherContext)_localctx).className!=null?((ExpressionOtherContext)_localctx).className.getText():null)) );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(T__35);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new This();
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(413);
				match(T__36);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( true, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(415);
				match(T__37);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( false, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(417);
				((ExpressionOtherContext)_localctx).iden = match(ID);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new Identifier((((ExpressionOtherContext)_localctx).iden!=null?((ExpressionOtherContext)_localctx).iden.getText():null));
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				((ExpressionOtherContext)_localctx).arrayName = match(ID);
				setState(420);
				match(T__30);
				setState(421);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(422);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new ArrayCall( new Identifier((((ExpressionOtherContext)_localctx).arrayName!=null?((ExpressionOtherContext)_localctx).arrayName.getText():null)), ((ExpressionOtherContext)_localctx).expression.syn_expr);
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(425);
				match(T__3);
				setState(426);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(427);
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
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(T__6);
				 ((TypeContext)_localctx).syn_type =  new IntType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(T__38);
				 ((TypeContext)_localctx).syn_type =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(T__39);
				 ((TypeContext)_localctx).syn_type =  new StringType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(T__6);
				setState(439);
				match(T__30);
				setState(440);
				match(T__31);
				 ((TypeContext)_localctx).syn_type =  new ArrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(ID);
				 ((TypeContext)_localctx).syn_type =  new UserDefinedType();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13"+
		"\4\3\4\3\4\3\4\7\4x\n\4\f\4\16\4{\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n\6"+
		"\f\6\16\6\u0096\13\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\7\6\u00a0\n"+
		"\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00af"+
		"\n\7\f\7\16\7\u00b2\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00c3\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d3\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f5\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0101\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u010d\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\5\25\u0117\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0128\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u012f\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u0139\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0140\n\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u014a\n\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0151\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0158\n\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0160\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u016c\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \7 \u017d\n \f \16 \u0180\13 \3 \3 \3 \3 \3 \5 \u0187\n \3 "+
		"\3 \3 \3 \5 \u018d\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01b1\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01bf\n\"\3\"\2\2#\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2"+
		"\u01cb\2D\3\2\2\2\4Q\3\2\2\2\6c\3\2\2\2\b~\3\2\2\2\n\u0085\3\2\2\2\f\u00aa"+
		"\3\2\2\2\16\u00c2\3\2\2\2\20\u00c4\3\2\2\2\22\u00c9\3\2\2\2\24\u00d6\3"+
		"\2\2\2\26\u00dd\3\2\2\2\30\u00e3\3\2\2\2\32\u00e9\3\2\2\2\34\u00f4\3\2"+
		"\2\2\36\u00f6\3\2\2\2 \u0100\3\2\2\2\"\u0102\3\2\2\2$\u010c\3\2\2\2&\u010e"+
		"\3\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,\u012e\3\2\2\2.\u0130\3\2\2\2\60"+
		"\u013f\3\2\2\2\62\u0141\3\2\2\2\64\u0150\3\2\2\2\66\u015f\3\2\2\28\u0161"+
		"\3\2\2\2:\u016b\3\2\2\2<\u016d\3\2\2\2>\u018c\3\2\2\2@\u01b0\3\2\2\2B"+
		"\u01be\3\2\2\2DE\b\2\1\2EF\5\4\3\2FL\b\2\1\2GH\5\6\4\2HI\b\2\1\2IK\3\2"+
		"\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2"+
		"\2\3P\3\3\2\2\2QR\7\3\2\2RS\7.\2\2ST\b\3\1\2TU\7\4\2\2UV\7\5\2\2VW\7."+
		"\2\2WX\7\6\2\2XY\7\7\2\2YZ\7\b\2\2Z[\7\t\2\2[\\\7\4\2\2\\]\5\f\7\2]^\7"+
		"\n\2\2^_\5\32\16\2_`\7\13\2\2`a\7\f\2\2ab\7\f\2\2b\5\3\2\2\2cd\7\3\2\2"+
		"de\7.\2\2ei\b\4\1\2fg\7\r\2\2gh\7.\2\2hj\b\4\1\2if\3\2\2\2ij\3\2\2\2j"+
		"k\3\2\2\2kq\7\4\2\2lm\5\b\5\2mn\b\4\1\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2sq\3\2\2\2tu\5\n\6\2uv\b\4\1\2vx\3\2\2\2"+
		"wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\f\2\2"+
		"}\7\3\2\2\2~\177\7\16\2\2\177\u0080\7.\2\2\u0080\u0081\7\b\2\2\u0081\u0082"+
		"\5B\"\2\u0082\u0083\b\5\1\2\u0083\u0084\7\13\2\2\u0084\t\3\2\2\2\u0085"+
		"\u0086\7\5\2\2\u0086\u0087\7.\2\2\u0087\u0099\b\6\1\2\u0088\u0089\7\6"+
		"\2\2\u0089\u009a\7\7\2\2\u008a\u008b\7\6\2\2\u008b\u008c\7.\2\2\u008c"+
		"\u008d\7\b\2\2\u008d\u0094\5B\"\2\u008e\u008f\7\17\2\2\u008f\u0090\7."+
		"\2\2\u0090\u0091\7\b\2\2\u0091\u0093\5B\"\2\u0092\u008e\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0088\3\2\2\2\u0099\u008a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\b"+
		"\2\2\u009c\u009d\5B\"\2\u009d\u00a1\7\4\2\2\u009e\u00a0\5\b\5\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\f\7\2\u00a5"+
		"\u00a6\7\n\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9"+
		"\7\f\2\2\u00a9\13\3\2\2\2\u00aa\u00b0\b\7\1\2\u00ab\u00ac\5\16\b\2\u00ac"+
		"\u00ad\b\7\1\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\b\b\1\2\u00b5\u00c3\3\2\2\2"+
		"\u00b6\u00b7\5\22\n\2\u00b7\u00b8\b\b\1\2\u00b8\u00c3\3\2\2\2\u00b9\u00ba"+
		"\5\24\13\2\u00ba\u00bb\b\b\1\2\u00bb\u00c3\3\2\2\2\u00bc\u00bd\5\26\f"+
		"\2\u00bd\u00be\b\b\1\2\u00be\u00c3\3\2\2\2\u00bf\u00c0\5\30\r\2\u00c0"+
		"\u00c1\b\b\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b6\3\2"+
		"\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\17\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7\f\2"+
		"\2\u00c7\u00c8\b\t\1\2\u00c8\21\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb"+
		"\7\6\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\7\21\2"+
		"\2\u00ce\u00cf\5\16\b\2\u00cf\u00d2\b\n\1\2\u00d0\u00d1\7\22\2\2\u00d1"+
		"\u00d3\5\16\b\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d5\b\n\1\2\u00d5\23\3\2\2\2\u00d6\u00d7\7\23\2\2\u00d7"+
		"\u00d8\7\6\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\7\7\2\2\u00da\u00db\5"+
		"\16\b\2\u00db\u00dc\b\13\1\2\u00dc\25\3\2\2\2\u00dd\u00de\7\24\2\2\u00de"+
		"\u00df\5\32\16\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\7\13\2\2\u00e1\u00e2"+
		"\b\f\1\2\u00e2\27\3\2\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\7\25\2\2\u00e5"+
		"\u00e6\5\34\17\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\b\r\1\2\u00e8\31\3\2"+
		"\2\2\u00e9\u00ea\5\34\17\2\u00ea\u00eb\b\16\1\2\u00eb\33\3\2\2\2\u00ec"+
		"\u00ed\5\36\20\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\5\34\17\2\u00ef\u00f0"+
		"\b\17\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\b\17\1"+
		"\2\u00f3\u00f5\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\35"+
		"\3\2\2\2\u00f6\u00f7\5\"\22\2\u00f7\u00f8\5 \21\2\u00f8\u00f9\b\20\1\2"+
		"\u00f9\37\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd"+
		"\5 \21\2\u00fd\u00fe\b\21\1\2\u00fe\u0101\3\2\2\2\u00ff\u0101\b\21\1\2"+
		"\u0100\u00fa\3\2\2\2\u0100\u00ff\3\2\2\2\u0101!\3\2\2\2\u0102\u0103\5"+
		"&\24\2\u0103\u0104\5$\23\2\u0104\u0105\b\22\1\2\u0105#\3\2\2\2\u0106\u0107"+
		"\7\27\2\2\u0107\u0108\5&\24\2\u0108\u0109\5$\23\2\u0109\u010a\b\23\1\2"+
		"\u010a\u010d\3\2\2\2\u010b\u010d\b\23\1\2\u010c\u0106\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d%\3\2\2\2\u010e\u010f\5*\26\2\u010f\u0110\5(\25\2\u0110"+
		"\u0111\b\24\1\2\u0111\'\3\2\2\2\u0112\u0113\7\30\2\2\u0113\u0117\b\25"+
		"\1\2\u0114\u0115\7\31\2\2\u0115\u0117\b\25\1\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5*\26\2\u0119\u011a\5("+
		"\25\2\u011a\u011b\b\25\1\2\u011b\u011e\3\2\2\2\u011c\u011e\b\25\1\2\u011d"+
		"\u0116\3\2\2\2\u011d\u011c\3\2\2\2\u011e)\3\2\2\2\u011f\u0120\5.\30\2"+
		"\u0120\u0121\5,\27\2\u0121\u0122\b\26\1\2\u0122+\3\2\2\2\u0123\u0124\7"+
		"\32\2\2\u0124\u0128\b\27\1\2\u0125\u0126\7\33\2\2\u0126\u0128\b\27\1\2"+
		"\u0127\u0123\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\5.\30\2\u012a\u012b\5,\27\2\u012b\u012c\b\27\1\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012f\b\27\1\2\u012e\u0127\3\2\2\2\u012e\u012d\3\2\2\2\u012f-\3"+
		"\2\2\2\u0130\u0131\5\62\32\2\u0131\u0132\5\60\31\2\u0132\u0133\b\30\1"+
		"\2\u0133/\3\2\2\2\u0134\u0135\7\34\2\2\u0135\u0139\b\31\1\2\u0136\u0137"+
		"\7\35\2\2\u0137\u0139\b\31\1\2\u0138\u0134\3\2\2\2\u0138\u0136\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\5\62\32\2\u013b\u013c\5\60\31\2\u013c"+
		"\u013d\b\31\1\2\u013d\u0140\3\2\2\2\u013e\u0140\b\31\1\2\u013f\u0138\3"+
		"\2\2\2\u013f\u013e\3\2\2\2\u0140\61\3\2\2\2\u0141\u0142\5\66\34\2\u0142"+
		"\u0143\5\64\33\2\u0143\u0144\b\32\1\2\u0144\63\3\2\2\2\u0145\u0146\7\36"+
		"\2\2\u0146\u014a\b\33\1\2\u0147\u0148\7\37\2\2\u0148\u014a\b\33\1\2\u0149"+
		"\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\5\66"+
		"\34\2\u014c\u014d\5\64\33\2\u014d\u014e\b\33\1\2\u014e\u0151\3\2\2\2\u014f"+
		"\u0151\b\33\1\2\u0150\u0149\3\2\2\2\u0150\u014f\3\2\2\2\u0151\65\3\2\2"+
		"\2\u0152\u0157\b\34\1\2\u0153\u0154\7 \2\2\u0154\u0158\b\34\1\2\u0155"+
		"\u0156\7\35\2\2\u0156\u0158\b\34\1\2\u0157\u0153\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5\66\34\2\u015a\u015b\b\34\1\2"+
		"\u015b\u0160\3\2\2\2\u015c\u015d\58\35\2\u015d\u015e\b\34\1\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0152\3\2\2\2\u015f\u015c\3\2\2\2\u0160\67\3\2\2\2\u0161"+
		"\u0162\5<\37\2\u0162\u0163\5:\36\2\u0163\u0164\b\35\1\2\u01649\3\2\2\2"+
		"\u0165\u0166\7!\2\2\u0166\u0167\5\32\16\2\u0167\u0168\7\"\2\2\u0168\u0169"+
		"\b\36\1\2\u0169\u016c\3\2\2\2\u016a\u016c\b\36\1\2\u016b\u0165\3\2\2\2"+
		"\u016b\u016a\3\2\2\2\u016c;\3\2\2\2\u016d\u016e\5@!\2\u016e\u016f\5> "+
		"\2\u016f\u0170\b\37\1\2\u0170=\3\2\2\2\u0171\u0172\b \1\2\u0172\u0186"+
		"\7#\2\2\u0173\u0174\7.\2\2\u0174\u0175\b \1\2\u0175\u0176\7\6\2\2\u0176"+
		"\u0187\7\7\2\2\u0177\u0178\7.\2\2\u0178\u0179\7\6\2\2\u0179\u017e\5\32"+
		"\16\2\u017a\u017b\7\17\2\2\u017b\u017d\5\32\16\2\u017c\u017a\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\7\2\2\u0182\u0183\b \1\2\u0183"+
		"\u0187\3\2\2\2\u0184\u0185\7$\2\2\u0185\u0187\b \1\2\u0186\u0173\3\2\2"+
		"\2\u0186\u0177\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\5> \2\u0189\u018a\b \1\2\u018a\u018d\3\2\2\2\u018b\u018d\b \1\2\u018c"+
		"\u0171\3\2\2\2\u018c\u018b\3\2\2\2\u018d?\3\2\2\2\u018e\u018f\7+\2\2\u018f"+
		"\u01b1\b!\1\2\u0190\u0191\7,\2\2\u0191\u01b1\b!\1\2\u0192\u0193\7%\2\2"+
		"\u0193\u0194\7\t\2\2\u0194\u0195\7!\2\2\u0195\u0196\7+\2\2\u0196\u0197"+
		"\7\"\2\2\u0197\u01b1\b!\1\2\u0198\u0199\7%\2\2\u0199\u019a\7.\2\2\u019a"+
		"\u019b\7\6\2\2\u019b\u019c\7\7\2\2\u019c\u01b1\b!\1\2\u019d\u019e\7&\2"+
		"\2\u019e\u01b1\b!\1\2\u019f\u01a0\7\'\2\2\u01a0\u01b1\b!\1\2\u01a1\u01a2"+
		"\7(\2\2\u01a2\u01b1\b!\1\2\u01a3\u01a4\7.\2\2\u01a4\u01b1\b!\1\2\u01a5"+
		"\u01a6\7.\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a8\5\32\16\2\u01a8\u01a9\7\""+
		"\2\2\u01a9\u01aa\b!\1\2\u01aa\u01b1\3\2\2\2\u01ab\u01ac\7\6\2\2\u01ac"+
		"\u01ad\5\32\16\2\u01ad\u01ae\7\7\2\2\u01ae\u01af\b!\1\2\u01af\u01b1\3"+
		"\2\2\2\u01b0\u018e\3\2\2\2\u01b0\u0190\3\2\2\2\u01b0\u0192\3\2\2\2\u01b0"+
		"\u0198\3\2\2\2\u01b0\u019d\3\2\2\2\u01b0\u019f\3\2\2\2\u01b0\u01a1\3\2"+
		"\2\2\u01b0\u01a3\3\2\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b1"+
		"A\3\2\2\2\u01b2\u01b3\7\t\2\2\u01b3\u01bf\b\"\1\2\u01b4\u01b5\7)\2\2\u01b5"+
		"\u01bf\b\"\1\2\u01b6\u01b7\7*\2\2\u01b7\u01bf\b\"\1\2\u01b8\u01b9\7\t"+
		"\2\2\u01b9\u01ba\7!\2\2\u01ba\u01bb\7\"\2\2\u01bb\u01bf\b\"\1\2\u01bc"+
		"\u01bd\7.\2\2\u01bd\u01bf\b\"\1\2\u01be\u01b2\3\2\2\2\u01be\u01b4\3\2"+
		"\2\2\u01be\u01b6\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"C\3\2\2\2\37Liqy\u0094\u0099\u00a1\u00b0\u00c2\u00d2\u00f4\u0100\u010c"+
		"\u0116\u011d\u0127\u012e\u0138\u013f\u0149\u0150\u0157\u015f\u016b\u017e"+
		"\u0186\u018c\u01b0\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}