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
			         VisitorImpl visitor = new VisitorImpl();
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
			prog.accept(visitor);
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
		public Token methodName;
		public StatementsContext statements;
		public ExpressionContext expression;
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
			setState(80);
			match(T__0);
			setState(81);
			((MainClassContext)_localctx).className = match(ID);
			((MainClassContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((MainClassContext)_localctx).className!=null?((MainClassContext)_localctx).className.getText():null)), null);
			                _localctx.syn_classDec.setLine(((MainClassContext)_localctx).className.getLine());
			MethodDeclaration mainMethod = new MethodDeclaration(new Identifier(null));
			setState(84);
			match(T__1);
			setState(85);
			match(T__2);
			setState(86);
			((MainClassContext)_localctx).methodName = match(ID);
			mainMethod.setLine(((MainClassContext)_localctx).methodName.getLine()); mainMethod.setName(new Identifier((((MainClassContext)_localctx).methodName!=null?((MainClassContext)_localctx).methodName.getText():null)));
			setState(88);
			match(T__3);
			setState(89);
			match(T__4);
			setState(90);
			match(T__5);
			setState(91);
			match(T__6);
			mainMethod.setReturnType(new IntType());
			setState(93);
			match(T__1);
			setState(94);
			((MainClassContext)_localctx).statements = statements();
			ArrayList<Statement> allStatements = ((MainClassContext)_localctx).statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++) {mainMethod.addStatement(allStatements.get(i));} 
			setState(96);
			match(T__7);
			setState(97);
			((MainClassContext)_localctx).expression = expression();
			mainMethod.setReturnValue(((MainClassContext)_localctx).expression.syn_expr);
			setState(99);
			match(T__8);
			setState(100);
			match(T__9);
			setState(101);
			match(T__9);
			_localctx.syn_classDec.addMethodDeclaration(mainMethod); 
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
			setState(104);
			match(T__0);
			setState(105);
			((ClassDeclarationContext)_localctx).className = match(ID);
			((ClassDeclarationContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null)), null); 
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(107);
				match(T__10);
				setState(108);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				_localctx.syn_classDec.setParentName(new Identifier((((ClassDeclarationContext)_localctx).classParent!=null?((ClassDeclarationContext)_localctx).classParent.getText():null)) );
				}
			}

			setState(112);
			match(T__1);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(113);
				((ClassDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_classDec.addVarDeclaration(((ClassDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(121);
				((ClassDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				_localctx.syn_classDec.addMethodDeclaration(((ClassDeclarationContext)_localctx).methodDeclaration.syn_methodDec);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__9);
			_localctx.syn_classDec.setLine(((ClassDeclarationContext)_localctx).className.getLine());
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
			setState(132);
			match(T__11);
			setState(133);
			((VarDeclarationContext)_localctx).varName = match(ID);
			setState(134);
			match(T__5);
			setState(135);
			((VarDeclarationContext)_localctx).type = type();
			((VarDeclarationContext)_localctx).syn_varDec =  new VarDeclaration(new Identifier((((VarDeclarationContext)_localctx).varName!=null?((VarDeclarationContext)_localctx).varName.getText():null)), ((VarDeclarationContext)_localctx).type.syn_type);
			        _localctx.syn_varDec.setLine(((VarDeclarationContext)_localctx).varName.getLine());
			setState(137);
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
		public Token argName;
		public TypeContext type;
		public VarDeclarationContext varDeclaration;
		public StatementsContext statements;
		public ExpressionContext expression;
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
			setState(139);
			match(T__2);
			((MethodDeclarationContext)_localctx).syn_methodDec =  new MethodDeclaration(new Identifier(null));
			setState(141);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			_localctx.syn_methodDec.setLine(((MethodDeclarationContext)_localctx).methodName.getLine()); _localctx.syn_methodDec.setName(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)));
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(143);
				match(T__3);
				setState(144);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(145);
				match(T__3);
				setState(146);
				((MethodDeclarationContext)_localctx).argName = match(ID);
				_localctx.syn_methodDec.setName(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)));
				setState(148);
				match(T__5);
				setState(149);
				((MethodDeclarationContext)_localctx).type = type();
				_localctx.syn_methodDec.addArg(new VarDeclaration(new Identifier((((MethodDeclarationContext)_localctx).argName!=null?((MethodDeclarationContext)_localctx).argName.getText():null)), ((MethodDeclarationContext)_localctx).type.syn_type));
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(151);
					match(T__12);
					setState(152);
					((MethodDeclarationContext)_localctx).argName = match(ID);
					setState(153);
					match(T__5);
					setState(154);
					((MethodDeclarationContext)_localctx).type = type();
					_localctx.syn_methodDec.addArg(new VarDeclaration(new Identifier((((MethodDeclarationContext)_localctx).argName!=null?((MethodDeclarationContext)_localctx).argName.getText():null)), ((MethodDeclarationContext)_localctx).type.syn_type));
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__4);
				}
				}
				break;
			}
			setState(166);
			match(T__5);
			setState(167);
			((MethodDeclarationContext)_localctx).type = type();
			_localctx.syn_methodDec.setReturnType(((MethodDeclarationContext)_localctx).type.syn_type);
			setState(169);
			match(T__1);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(170);
				((MethodDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_methodDec.addLocalVar(((MethodDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			((MethodDeclarationContext)_localctx).statements = statements();
			ArrayList<Statement> allStatements = ((MethodDeclarationContext)_localctx).statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++)
			         {_localctx.syn_methodDec.addStatement(allStatements.get(i));} 
			setState(180);
			match(T__7);
			setState(181);
			((MethodDeclarationContext)_localctx).expression = expression();
			setState(182);
			match(T__8);
			_localctx.syn_methodDec.setReturnValue(((MethodDeclarationContext)_localctx).expression.syn_expr);
			setState(184);
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
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(187);
				((StatementsContext)_localctx).statement = statement();
				_localctx.syn_stmt.addStatement(((StatementsContext)_localctx).statement.syn_stmt);
				}
				}
				setState(194);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((StatementContext)_localctx).statementBlock = statementBlock();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementBlock.syn_stmt;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((StatementContext)_localctx).statementCondition = statementCondition();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementCondition.syn_stmt;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((StatementContext)_localctx).statementLoop = statementLoop();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementLoop.syn_stmt;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
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
				setState(207);
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
			setState(212);
			match(T__1);
			setState(213);
			((StatementBlockContext)_localctx).statements = statements();
			setState(214);
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
			setState(217);
			match(T__13);
			setState(218);
			match(T__3);
			setState(219);
			((StatementConditionContext)_localctx).expression = expression();
			setState(220);
			match(T__4);
			setState(221);
			match(T__14);
			setState(222);
			((StatementConditionContext)_localctx).statement = statement();
			((StatementConditionContext)_localctx).syn_stmt =  new Conditional(((StatementConditionContext)_localctx).expression.syn_expr, ((StatementConditionContext)_localctx).statement.syn_stmt);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(224);
				match(T__15);
				setState(225);
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
			setState(230);
			match(T__16);
			setState(231);
			match(T__3);
			setState(232);
			((StatementLoopContext)_localctx).expression = expression();
			setState(233);
			match(T__4);
			setState(234);
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
			setState(237);
			match(T__17);
			setState(238);
			((StatementWriteContext)_localctx).expression = expression();
			setState(239);
			match(T__4);
			setState(240);
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
		public Statement syn_stmt;
		public ExpressionAssignmentContext expressionAssignment;
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
			setState(243);
			((StatementAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
			setState(244);
			match(T__8);
			((StatementAssignmentContext)_localctx).syn_stmt =  (((StatementAssignmentContext)_localctx).expressionAssignment.syn_expr.getRight() == null ? new Statement() :(new Assign(((StatementAssignmentContext)_localctx).expressionAssignment.syn_expr.getLeft(), ((StatementAssignmentContext)_localctx).expressionAssignment.syn_expr.getRight())));
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
			setState(247);
			((ExpressionContext)_localctx).expressionAssignment = expressionAssignment();
			((ExpressionContext)_localctx).syn_expr =  (((ExpressionContext)_localctx).expressionAssignment.syn_expr.getRight() == null ? ((ExpressionContext)_localctx).expressionAssignment.syn_expr.getLeft() : ((ExpressionContext)_localctx).expressionAssignment.syn_expr);
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
		public BinaryExpression syn_expr;
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				setState(251);
				match(T__18);
				setState(252);
				((ExpressionAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
				((ExpressionAssignmentContext)_localctx).syn_expr =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr, ((((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr.getRight() == null)? ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr.getLeft() : ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr), BinaryOperator.assign);
						_localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				((ExpressionAssignmentContext)_localctx).syn_expr =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr, null, null);
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
			setState(260);
			((ExpressionOrContext)_localctx).expressionAnd = expressionAnd();
			setState(261);
			((ExpressionOrContext)_localctx).expressionOrTemp = expressionOrTemp(((ExpressionOrContext)_localctx).expressionAnd.syn_expr);
			((ExpressionOrContext)_localctx).syn_expr =  ((ExpressionOrContext)_localctx).expressionOrTemp.syn_expr;
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
		public Expression inh_expr;
		public Expression syn_expr;
		public ExpressionAndContext expressionAnd;
		public ExpressionOrTempContext expressionOrTemp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionOrTempContext expressionOrTemp(Expression inh_expr) throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 30, RULE_expressionOrTemp);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__19);
				setState(265);
				((ExpressionOrTempContext)_localctx).expressionAnd = expressionAnd();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionOrTempContext)_localctx).expressionAnd.syn_expr, BinaryOperator.or);
						                     exprTillNow.setLine(_localctx.start.getLine());
				setState(267);
				((ExpressionOrTempContext)_localctx).expressionOrTemp = expressionOrTemp(exprTillNow);
				((ExpressionOrTempContext)_localctx).syn_expr =  ((ExpressionOrTempContext)_localctx).expressionOrTemp.syn_expr;
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionOrTempContext)_localctx).syn_expr =  inh_expr;
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
			setState(273);
			((ExpressionAndContext)_localctx).expressionEq = expressionEq();
			setState(274);
			((ExpressionAndContext)_localctx).expressionAndTemp = expressionAndTemp(((ExpressionAndContext)_localctx).expressionEq.syn_expr);
			((ExpressionAndContext)_localctx).syn_expr =  ((ExpressionAndContext)_localctx).expressionAndTemp.syn_expr;
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
		public Expression inh_expr;
		public Expression syn_expr;
		public ExpressionEqContext expressionEq;
		public ExpressionAndTempContext expressionAndTemp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionAndTempContext expressionAndTemp(Expression inh_expr) throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 34, RULE_expressionAndTemp);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__20);
				setState(278);
				((ExpressionAndTempContext)_localctx).expressionEq = expressionEq();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionAndTempContext)_localctx).expressionEq.syn_expr, BinaryOperator.and);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(280);
				((ExpressionAndTempContext)_localctx).expressionAndTemp = expressionAndTemp(exprTillNow);
				((ExpressionAndTempContext)_localctx).syn_expr =  ((ExpressionAndTempContext)_localctx).expressionAndTemp.syn_expr;
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
				((ExpressionAndTempContext)_localctx).syn_expr =  _localctx.inh_expr;
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
			setState(286);
			((ExpressionEqContext)_localctx).expressionCmp = expressionCmp();
			setState(287);
			((ExpressionEqContext)_localctx).expressionEqTemp = expressionEqTemp(((ExpressionEqContext)_localctx).expressionCmp.syn_expr);
			((ExpressionEqContext)_localctx).syn_expr =  ((ExpressionEqContext)_localctx).expressionEqTemp.syn_expr;
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
		public Expression inh_expr;
		public Expression syn_expr;
		public ExpressionCmpContext expressionCmp;
		public ExpressionEqTempContext expressionEqTemp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionEqTempContext expressionEqTemp(Expression inh_expr) throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 38, RULE_expressionEqTemp);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(291);
					match(T__21);
					op = BinaryOperator.eq;
					}
					break;
				case T__22:
					{
					setState(293);
					match(T__22);
					op = BinaryOperator.neq;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297);
				((ExpressionEqTempContext)_localctx).expressionCmp = expressionCmp();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionEqTempContext)_localctx).expressionCmp.syn_expr, op);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(299);
				((ExpressionEqTempContext)_localctx).expressionEqTemp = expressionEqTemp(exprTillNow);
				((ExpressionEqTempContext)_localctx).syn_expr =  ((ExpressionEqTempContext)_localctx).expressionEqTemp.syn_expr;
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
				((ExpressionEqTempContext)_localctx).syn_expr =  _localctx.inh_expr;
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
			setState(305);
			((ExpressionCmpContext)_localctx).expressionAdd = expressionAdd();
			setState(306);
			((ExpressionCmpContext)_localctx).expressionCmpTemp = expressionCmpTemp(((ExpressionCmpContext)_localctx).expressionAdd.syn_expr);
			((ExpressionCmpContext)_localctx).syn_expr =  ((ExpressionCmpContext)_localctx).expressionCmpTemp.syn_expr;
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
		public Expression inh_expr;
		public Expression syn_expr;
		public ExpressionAddContext expressionAdd;
		public ExpressionCmpTempContext expressionCmpTemp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionCmpTempContext expressionCmpTemp(Expression inh_expr) throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 42, RULE_expressionCmpTemp);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(314);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(310);
					match(T__23);
					op = BinaryOperator.lt;
					}
					break;
				case T__24:
					{
					setState(312);
					match(T__24);
					op = BinaryOperator.gt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316);
				((ExpressionCmpTempContext)_localctx).expressionAdd = expressionAdd();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionCmpTempContext)_localctx).expressionAdd.syn_expr, op);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(318);
				((ExpressionCmpTempContext)_localctx).expressionCmpTemp = expressionCmpTemp(exprTillNow);
				((ExpressionCmpTempContext)_localctx).syn_expr =  ((ExpressionCmpTempContext)_localctx).expressionCmpTemp.syn_expr;
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
				((ExpressionCmpTempContext)_localctx).syn_expr =  _localctx.inh_expr;
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
			setState(324);
			((ExpressionAddContext)_localctx).expressionMult = expressionMult();
			setState(325);
			((ExpressionAddContext)_localctx).expressionAddTemp = expressionAddTemp(((ExpressionAddContext)_localctx).expressionMult.syn_expr);
			((ExpressionAddContext)_localctx).syn_expr =  ((ExpressionAddContext)_localctx).expressionAddTemp.syn_expr;
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
		public Expression inh_expr;
		public Expression syn_expr;
		public ExpressionMultContext expressionMult;
		public ExpressionAddTempContext expressionAddTemp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionAddTempContext expressionAddTemp(Expression inh_expr) throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 46, RULE_expressionAddTemp);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(329);
					match(T__25);
					op = BinaryOperator.add;
					}
					break;
				case T__26:
					{
					setState(331);
					match(T__26);
					op = BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335);
				((ExpressionAddTempContext)_localctx).expressionMult = expressionMult();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionAddTempContext)_localctx).expressionMult.syn_expr, op);
				                       exprTillNow.setLine(_localctx.start.getLine());
				setState(337);
				((ExpressionAddTempContext)_localctx).expressionAddTemp = expressionAddTemp(exprTillNow);
				((ExpressionAddTempContext)_localctx).syn_expr =  ((ExpressionAddTempContext)_localctx).expressionAddTemp.syn_expr;
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
				((ExpressionAddTempContext)_localctx).syn_expr =  _localctx.inh_expr;
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
			setState(343);
			((ExpressionMultContext)_localctx).expressionUnary = expressionUnary();
			setState(344);
			((ExpressionMultContext)_localctx).expressionMultTemp = expressionMultTemp(((ExpressionMultContext)_localctx).expressionUnary.syn_expr);
			((ExpressionMultContext)_localctx).syn_expr =  ((ExpressionMultContext)_localctx).expressionMultTemp.syn_expr;
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
		public Expression inh_expr;
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
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState, Expression inh_expr) {
			super(parent, invokingState);
			this.inh_expr = inh_expr;
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

	public final ExpressionMultTempContext expressionMultTemp(Expression inh_expr) throws RecognitionException {
		ExpressionMultTempContext _localctx = new ExpressionMultTempContext(_ctx, getState(), inh_expr);
		enterRule(_localctx, 50, RULE_expressionMultTemp);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(348);
					match(T__27);
					op = BinaryOperator.mult;
					}
					break;
				case T__28:
					{
					setState(350);
					match(T__28);
					op = BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(354);
				((ExpressionMultTempContext)_localctx).expressionUnary = expressionUnary();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionMultTempContext)_localctx).expressionUnary.syn_expr, op);
				                        exprTillNow.setLine(_localctx.start.getLine());
				setState(356);
				((ExpressionMultTempContext)_localctx).expressionMultTemp = expressionMultTemp(exprTillNow);
				((ExpressionMultTempContext)_localctx).syn_expr =  ((ExpressionMultTempContext)_localctx).expressionMultTemp.syn_expr;
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
				((ExpressionMultTempContext)_localctx).syn_expr =  inh_expr;
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
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator op; 
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(363);
					match(T__29);
					op = UnaryOperator.not;
					}
					break;
				case T__26:
					{
					setState(365);
					match(T__26);
					op = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(369);
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
				setState(372);
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
			setState(377);
			((ExpressionMemContext)_localctx).expressionMethods = expressionMethods();
			setState(378);
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
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__30);
				setState(382);
				((ExpressionMemTempContext)_localctx).expression = expression();
				setState(383);
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
			setState(389);
			((ExpressionMethodsContext)_localctx).expressionOther = expressionOther();
			setState(390);
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
		public ExpressionContext expression;
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
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				Expression instanceTillNow = new MethodCall(null, null);
				MethodCall methodCallTillNow = new MethodCall(null, null);
				setState(395);
				match(T__32);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(396);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					methodCallTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(398);
					match(T__3);
					setState(399);
					match(T__4);
					instanceTillNow = methodCallTillNow;
					}
					break;
				case 2:
					{
					setState(401);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					methodCallTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(403);
					match(T__3);
					{
					setState(404);
					((ExpressionMethodsTempContext)_localctx).expression = expression();
					methodCallTillNow.addArg(((ExpressionMethodsTempContext)_localctx).expression.syn_expr);
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(406);
						match(T__12);
						setState(407);
						((ExpressionMethodsTempContext)_localctx).expression = expression();
						methodCallTillNow.addArg(((ExpressionMethodsTempContext)_localctx).expression.syn_expr);
						}
						}
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(415);
					match(T__4);
					instanceTillNow = methodCallTillNow;
					}
					break;
				case 3:
					{
					setState(418);
					match(T__33);
					instanceTillNow = new Length(_localctx.inh_instance);
					}
					break;
				}
				setState(422);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((ExpressionOtherContext)_localctx).val = match(CONST_NUM);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new IntValue( (((ExpressionOtherContext)_localctx).val!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).val.getText()):0), new IntType() );
						        _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				((ExpressionOtherContext)_localctx).val = match(CONST_STR);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new StringValue( (((ExpressionOtherContext)_localctx).val!=null?((ExpressionOtherContext)_localctx).val.getText():null), new StringType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__34);
				setState(433);
				match(T__6);
				setState(434);
				match(T__30);
				setState(435);
				((ExpressionOtherContext)_localctx).size = match(CONST_NUM);
				setState(436);
				match(T__31);
				NewArray newArr = new NewArray(); newArr.setExpression(new IntValue( (((ExpressionOtherContext)_localctx).size!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).size.getText()):0), new IntType() ));
				                ((ExpressionOtherContext)_localctx).syn_expr =  newArr; _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(T__34);
				setState(439);
				((ExpressionOtherContext)_localctx).className = match(ID);
				setState(440);
				match(T__3);
				setState(441);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new NewClass( new Identifier((((ExpressionOtherContext)_localctx).className!=null?((ExpressionOtherContext)_localctx).className.getText():null)) );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(T__35);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new This();
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
				match(T__36);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( true, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(447);
				match(T__37);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( false, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				((ExpressionOtherContext)_localctx).iden = match(ID);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new Identifier((((ExpressionOtherContext)_localctx).iden!=null?((ExpressionOtherContext)_localctx).iden.getText():null));
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				((ExpressionOtherContext)_localctx).arrayName = match(ID);
				setState(452);
				match(T__30);
				setState(453);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(454);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new ArrayCall( new Identifier((((ExpressionOtherContext)_localctx).arrayName!=null?((ExpressionOtherContext)_localctx).arrayName.getText():null)), ((ExpressionOtherContext)_localctx).expression.syn_expr);
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(457);
				match(T__3);
				setState(458);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(459);
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
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__6);
				 ((TypeContext)_localctx).syn_type =  new IntType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(T__38);
				 ((TypeContext)_localctx).syn_type =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(T__39);
				 ((TypeContext)_localctx).syn_type =  new StringType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(T__6);
				setState(471);
				match(T__30);
				setState(472);
				match(T__31);
				 ((TypeContext)_localctx).syn_type =  new ArrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\4\3\4"+
		"\3\4\3\4\7\4w\n\4\f\4\16\4z\13\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082"+
		"\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16"+
		"\6\u00a3\13\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b0"+
		"\n\6\f\6\16\6\u00b3\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7\u00c1\n\7\f\7\16\7\u00c4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d5\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0112\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u012a\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0132\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u013d\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0145\n\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0150\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0158\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0163\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0172\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u017a\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0186"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \7 \u019d\n \f \16 \u01a0\13 \3 \3 \3 \3 \3 \5 \u01a7\n \3 \3 "+
		"\3 \3 \5 \u01ad\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01d1\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01df\n\"\3\"\2\2#\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2\u01eb"+
		"\2D\3\2\2\2\4R\3\2\2\2\6j\3\2\2\2\b\u0086\3\2\2\2\n\u008d\3\2\2\2\f\u00bc"+
		"\3\2\2\2\16\u00d4\3\2\2\2\20\u00d6\3\2\2\2\22\u00db\3\2\2\2\24\u00e8\3"+
		"\2\2\2\26\u00ef\3\2\2\2\30\u00f5\3\2\2\2\32\u00f9\3\2\2\2\34\u0104\3\2"+
		"\2\2\36\u0106\3\2\2\2 \u0111\3\2\2\2\"\u0113\3\2\2\2$\u011e\3\2\2\2&\u0120"+
		"\3\2\2\2(\u0131\3\2\2\2*\u0133\3\2\2\2,\u0144\3\2\2\2.\u0146\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u0159\3\2\2\2\64\u016a\3\2\2\2\66\u0179\3\2\2\28\u017b"+
		"\3\2\2\2:\u0185\3\2\2\2<\u0187\3\2\2\2>\u01ac\3\2\2\2@\u01d0\3\2\2\2B"+
		"\u01de\3\2\2\2DE\b\2\1\2EF\5\4\3\2FL\b\2\1\2GH\5\6\4\2HI\b\2\1\2IK\3\2"+
		"\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2"+
		"\2\3PQ\b\2\1\2Q\3\3\2\2\2RS\7\3\2\2ST\7.\2\2TU\b\3\1\2UV\b\3\1\2VW\7\4"+
		"\2\2WX\7\5\2\2XY\7.\2\2YZ\b\3\1\2Z[\7\6\2\2[\\\7\7\2\2\\]\7\b\2\2]^\7"+
		"\t\2\2^_\b\3\1\2_`\7\4\2\2`a\5\f\7\2ab\b\3\1\2bc\7\n\2\2cd\5\32\16\2d"+
		"e\b\3\1\2ef\7\13\2\2fg\7\f\2\2gh\7\f\2\2hi\b\3\1\2i\5\3\2\2\2jk\7\3\2"+
		"\2kl\7.\2\2lp\b\4\1\2mn\7\r\2\2no\7.\2\2oq\b\4\1\2pm\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rx\7\4\2\2st\5\b\5\2tu\b\4\1\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y\u0080\3\2\2\2zx\3\2\2\2{|\5\n\6\2|}\b\4\1\2}\177"+
		"\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085"+
		"\b\4\1\2\u0085\7\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\7.\2\2\u0088"+
		"\u0089\7\b\2\2\u0089\u008a\5B\"\2\u008a\u008b\b\5\1\2\u008b\u008c\7\13"+
		"\2\2\u008c\t\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u008f\b\6\1\2\u008f\u0090"+
		"\7.\2\2\u0090\u00a6\b\6\1\2\u0091\u0092\7\6\2\2\u0092\u00a7\7\7\2\2\u0093"+
		"\u0094\7\6\2\2\u0094\u0095\7.\2\2\u0095\u0096\b\6\1\2\u0096\u0097\7\b"+
		"\2\2\u0097\u0098\5B\"\2\u0098\u00a1\b\6\1\2\u0099\u009a\7\17\2\2\u009a"+
		"\u009b\7.\2\2\u009b\u009c\7\b\2\2\u009c\u009d\5B\"\2\u009d\u009e\b\6\1"+
		"\2\u009e\u00a0\3\2\2\2\u009f\u0099\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0091\3\2\2\2\u00a6\u0093\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5B\"\2\u00aa"+
		"\u00ab\b\6\1\2\u00ab\u00b1\7\4\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\b\6"+
		"\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\b\6\1\2\u00b6\u00b7\7\n\2\2\u00b7"+
		"\u00b8\5\32\16\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\b\6\1\2\u00ba\u00bb"+
		"\7\f\2\2\u00bb\13\3\2\2\2\u00bc\u00c2\b\7\1\2\u00bd\u00be\5\16\b\2\u00be"+
		"\u00bf\b\7\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\r\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c6\5\20\t\2\u00c6\u00c7\b\b\1\2\u00c7\u00d5\3\2\2\2"+
		"\u00c8\u00c9\5\22\n\2\u00c9\u00ca\b\b\1\2\u00ca\u00d5\3\2\2\2\u00cb\u00cc"+
		"\5\24\13\2\u00cc\u00cd\b\b\1\2\u00cd\u00d5\3\2\2\2\u00ce\u00cf\5\26\f"+
		"\2\u00cf\u00d0\b\b\1\2\u00d0\u00d5\3\2\2\2\u00d1\u00d2\5\30\r\2\u00d2"+
		"\u00d3\b\b\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5"+
		"\17\3\2\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d8\5\f\7\2\u00d8\u00d9\7\f\2"+
		"\2\u00d9\u00da\b\t\1\2\u00da\21\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd"+
		"\7\6\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7\7\2\2\u00df\u00e0\7\21\2"+
		"\2\u00e0\u00e1\5\16\b\2\u00e1\u00e4\b\n\1\2\u00e2\u00e3\7\22\2\2\u00e3"+
		"\u00e5\5\16\b\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\b\n\1\2\u00e7\23\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00ea\7\6\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\5"+
		"\16\b\2\u00ed\u00ee\b\13\1\2\u00ee\25\3\2\2\2\u00ef\u00f0\7\24\2\2\u00f0"+
		"\u00f1\5\32\16\2\u00f1\u00f2\7\7\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4"+
		"\b\f\1\2\u00f4\27\3\2\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\7\13\2\2\u00f7"+
		"\u00f8\b\r\1\2\u00f8\31\3\2\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb\b\16"+
		"\1\2\u00fb\33\3\2\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\25\2\2\u00fe"+
		"\u00ff\5\34\17\2\u00ff\u0100\b\17\1\2\u0100\u0105\3\2\2\2\u0101\u0102"+
		"\5\36\20\2\u0102\u0103\b\17\1\2\u0103\u0105\3\2\2\2\u0104\u00fc\3\2\2"+
		"\2\u0104\u0101\3\2\2\2\u0105\35\3\2\2\2\u0106\u0107\5\"\22\2\u0107\u0108"+
		"\5 \21\2\u0108\u0109\b\20\1\2\u0109\37\3\2\2\2\u010a\u010b\7\26\2\2\u010b"+
		"\u010c\5\"\22\2\u010c\u010d\b\21\1\2\u010d\u010e\5 \21\2\u010e\u010f\b"+
		"\21\1\2\u010f\u0112\3\2\2\2\u0110\u0112\b\21\1\2\u0111\u010a\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112!\3\2\2\2\u0113\u0114\5&\24\2\u0114\u0115\5$\23\2"+
		"\u0115\u0116\b\22\1\2\u0116#\3\2\2\2\u0117\u0118\7\27\2\2\u0118\u0119"+
		"\5&\24\2\u0119\u011a\b\23\1\2\u011a\u011b\5$\23\2\u011b\u011c\b\23\1\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011f\b\23\1\2\u011e\u0117\3\2\2\2\u011e\u011d"+
		"\3\2\2\2\u011f%\3\2\2\2\u0120\u0121\5*\26\2\u0121\u0122\5(\25\2\u0122"+
		"\u0123\b\24\1\2\u0123\'\3\2\2\2\u0124\u0129\b\25\1\2\u0125\u0126\7\30"+
		"\2\2\u0126\u012a\b\25\1\2\u0127\u0128\7\31\2\2\u0128\u012a\b\25\1\2\u0129"+
		"\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5*"+
		"\26\2\u012c\u012d\b\25\1\2\u012d\u012e\5(\25\2\u012e\u012f\b\25\1\2\u012f"+
		"\u0132\3\2\2\2\u0130\u0132\b\25\1\2\u0131\u0124\3\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132)\3\2\2\2\u0133\u0134\5.\30\2\u0134\u0135\5,\27\2\u0135\u0136"+
		"\b\26\1\2\u0136+\3\2\2\2\u0137\u013c\b\27\1\2\u0138\u0139\7\32\2\2\u0139"+
		"\u013d\b\27\1\2\u013a\u013b\7\33\2\2\u013b\u013d\b\27\1\2\u013c\u0138"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5.\30\2\u013f"+
		"\u0140\b\27\1\2\u0140\u0141\5,\27\2\u0141\u0142\b\27\1\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0145\b\27\1\2\u0144\u0137\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"-\3\2\2\2\u0146\u0147\5\62\32\2\u0147\u0148\5\60\31\2\u0148\u0149\b\30"+
		"\1\2\u0149/\3\2\2\2\u014a\u014f\b\31\1\2\u014b\u014c\7\34\2\2\u014c\u0150"+
		"\b\31\1\2\u014d\u014e\7\35\2\2\u014e\u0150\b\31\1\2\u014f\u014b\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\5\62\32\2\u0152"+
		"\u0153\b\31\1\2\u0153\u0154\5\60\31\2\u0154\u0155\b\31\1\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0158\b\31\1\2\u0157\u014a\3\2\2\2\u0157\u0156\3\2\2\2"+
		"\u0158\61\3\2\2\2\u0159\u015a\5\66\34\2\u015a\u015b\5\64\33\2\u015b\u015c"+
		"\b\32\1\2\u015c\63\3\2\2\2\u015d\u0162\b\33\1\2\u015e\u015f\7\36\2\2\u015f"+
		"\u0163\b\33\1\2\u0160\u0161\7\37\2\2\u0161\u0163\b\33\1\2\u0162\u015e"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\66\34\2"+
		"\u0165\u0166\b\33\1\2\u0166\u0167\5\64\33\2\u0167\u0168\b\33\1\2\u0168"+
		"\u016b\3\2\2\2\u0169\u016b\b\33\1\2\u016a\u015d\3\2\2\2\u016a\u0169\3"+
		"\2\2\2\u016b\65\3\2\2\2\u016c\u0171\b\34\1\2\u016d\u016e\7 \2\2\u016e"+
		"\u0172\b\34\1\2\u016f\u0170\7\35\2\2\u0170\u0172\b\34\1\2\u0171\u016d"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\66\34\2"+
		"\u0174\u0175\b\34\1\2\u0175\u017a\3\2\2\2\u0176\u0177\58\35\2\u0177\u0178"+
		"\b\34\1\2\u0178\u017a\3\2\2\2\u0179\u016c\3\2\2\2\u0179\u0176\3\2\2\2"+
		"\u017a\67\3\2\2\2\u017b\u017c\5<\37\2\u017c\u017d\5:\36\2\u017d\u017e"+
		"\b\35\1\2\u017e9\3\2\2\2\u017f\u0180\7!\2\2\u0180\u0181\5\32\16\2\u0181"+
		"\u0182\7\"\2\2\u0182\u0183\b\36\1\2\u0183\u0186\3\2\2\2\u0184\u0186\b"+
		"\36\1\2\u0185\u017f\3\2\2\2\u0185\u0184\3\2\2\2\u0186;\3\2\2\2\u0187\u0188"+
		"\5@!\2\u0188\u0189\5> \2\u0189\u018a\b\37\1\2\u018a=\3\2\2\2\u018b\u018c"+
		"\b \1\2\u018c\u018d\b \1\2\u018d\u01a6\7#\2\2\u018e\u018f\7.\2\2\u018f"+
		"\u0190\b \1\2\u0190\u0191\7\6\2\2\u0191\u0192\7\7\2\2\u0192\u01a7\b \1"+
		"\2\u0193\u0194\7.\2\2\u0194\u0195\b \1\2\u0195\u0196\7\6\2\2\u0196\u0197"+
		"\5\32\16\2\u0197\u019e\b \1\2\u0198\u0199\7\17\2\2\u0199\u019a\5\32\16"+
		"\2\u019a\u019b\b \1\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\7\7\2\2\u01a2\u01a3\b \1\2\u01a3\u01a7\3\2"+
		"\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a7\b \1\2\u01a6\u018e\3\2\2\2\u01a6\u0193"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5> \2\u01a9"+
		"\u01aa\b \1\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\b \1\2\u01ac\u018b\3\2\2"+
		"\2\u01ac\u01ab\3\2\2\2\u01ad?\3\2\2\2\u01ae\u01af\7+\2\2\u01af\u01d1\b"+
		"!\1\2\u01b0\u01b1\7,\2\2\u01b1\u01d1\b!\1\2\u01b2\u01b3\7%\2\2\u01b3\u01b4"+
		"\7\t\2\2\u01b4\u01b5\7!\2\2\u01b5\u01b6\7+\2\2\u01b6\u01b7\7\"\2\2\u01b7"+
		"\u01d1\b!\1\2\u01b8\u01b9\7%\2\2\u01b9\u01ba\7.\2\2\u01ba\u01bb\7\6\2"+
		"\2\u01bb\u01bc\7\7\2\2\u01bc\u01d1\b!\1\2\u01bd\u01be\7&\2\2\u01be\u01d1"+
		"\b!\1\2\u01bf\u01c0\7\'\2\2\u01c0\u01d1\b!\1\2\u01c1\u01c2\7(\2\2\u01c2"+
		"\u01d1\b!\1\2\u01c3\u01c4\7.\2\2\u01c4\u01d1\b!\1\2\u01c5\u01c6\7.\2\2"+
		"\u01c6\u01c7\7!\2\2\u01c7\u01c8\5\32\16\2\u01c8\u01c9\7\"\2\2\u01c9\u01ca"+
		"\b!\1\2\u01ca\u01d1\3\2\2\2\u01cb\u01cc\7\6\2\2\u01cc\u01cd\5\32\16\2"+
		"\u01cd\u01ce\7\7\2\2\u01ce\u01cf\b!\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01ae"+
		"\3\2\2\2\u01d0\u01b0\3\2\2\2\u01d0\u01b2\3\2\2\2\u01d0\u01b8\3\2\2\2\u01d0"+
		"\u01bd\3\2\2\2\u01d0\u01bf\3\2\2\2\u01d0\u01c1\3\2\2\2\u01d0\u01c3\3\2"+
		"\2\2\u01d0\u01c5\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1A\3\2\2\2\u01d2\u01d3"+
		"\7\t\2\2\u01d3\u01df\b\"\1\2\u01d4\u01d5\7)\2\2\u01d5\u01df\b\"\1\2\u01d6"+
		"\u01d7\7*\2\2\u01d7\u01df\b\"\1\2\u01d8\u01d9\7\t\2\2\u01d9\u01da\7!\2"+
		"\2\u01da\u01db\7\"\2\2\u01db\u01df\b\"\1\2\u01dc\u01dd\7.\2\2\u01dd\u01df"+
		"\b\"\1\2\u01de\u01d2\3\2\2\2\u01de\u01d4\3\2\2\2\u01de\u01d6\3\2\2\2\u01de"+
		"\u01d8\3\2\2\2\u01de\u01dc\3\2\2\2\u01dfC\3\2\2\2\37Lpx\u0080\u00a1\u00a6"+
		"\u00b1\u00c2\u00d4\u00e4\u0104\u0111\u011e\u0129\u0131\u013c\u0144\u014f"+
		"\u0157\u0162\u016a\u0171\u0179\u0185\u019e\u01a6\u01ac\u01d0\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}