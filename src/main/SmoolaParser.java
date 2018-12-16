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
		public Program prog;
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
			((ProgramContext)_localctx).prog =  new Program();
			setState(67);
			((ProgramContext)_localctx).mainClass = mainClass();
			_localctx.prog.setMainClass(((ProgramContext)_localctx).mainClass.syn_classDec);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				((ProgramContext)_localctx).classDeclaration = classDeclaration();
				_localctx.prog.addClass(((ProgramContext)_localctx).classDeclaration.syn_classDec);
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
			setState(79);
			match(T__0);
			setState(80);
			((MainClassContext)_localctx).className = match(ID);
			((MainClassContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((MainClassContext)_localctx).className!=null?((MainClassContext)_localctx).className.getText():null)), null);
			                _localctx.syn_classDec.getParentName().setLine(((MainClassContext)_localctx).className.getLine());
			                _localctx.syn_classDec.setLine(((MainClassContext)_localctx).className.getLine());
			MethodDeclaration mainMethod = new MethodDeclaration(new Identifier(null)); mainMethod.setClassName(new Identifier((((MainClassContext)_localctx).className!=null?((MainClassContext)_localctx).className.getText():null)));
			setState(83);
			match(T__1);
			setState(84);
			match(T__2);
			setState(85);
			((MainClassContext)_localctx).methodName = match(ID);
			mainMethod.setLine(((MainClassContext)_localctx).methodName.getLine()); mainMethod.setName(new Identifier((((MainClassContext)_localctx).methodName!=null?((MainClassContext)_localctx).methodName.getText():null)));
			setState(87);
			match(T__3);
			setState(88);
			match(T__4);
			setState(89);
			match(T__5);
			setState(90);
			match(T__6);
			mainMethod.setReturnType(new IntType());
			setState(92);
			match(T__1);
			setState(93);
			((MainClassContext)_localctx).statements = statements();
			ArrayList<Statement> allStatements = ((MainClassContext)_localctx).statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++) {mainMethod.addStatement(allStatements.get(i));} 
			setState(95);
			match(T__7);
			setState(96);
			((MainClassContext)_localctx).expression = expression();
			mainMethod.setReturnValue(((MainClassContext)_localctx).expression.syn_expr);
			setState(98);
			match(T__8);
			setState(99);
			match(T__9);
			setState(100);
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
			setState(103);
			match(T__0);
			setState(104);
			((ClassDeclarationContext)_localctx).className = match(ID);
			((ClassDeclarationContext)_localctx).syn_classDec =  new ClassDeclaration(new Identifier((((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null)), null); 
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(106);
				match(T__10);
				setState(107);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				_localctx.syn_classDec.setParentName(new Identifier((((ClassDeclarationContext)_localctx).classParent!=null?((ClassDeclarationContext)_localctx).classParent.getText():null)) );  _localctx.syn_classDec.getParentName().setLine(((ClassDeclarationContext)_localctx).className.getLine());
				}
			}

			setState(111);
			match(T__1);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(112);
				((ClassDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_classDec.addVarDeclaration(((ClassDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(120);
				((ClassDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				((ClassDeclarationContext)_localctx).methodDeclaration.syn_methodDec.setClassName(new Identifier((((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null))); _localctx.syn_classDec.addMethodDeclaration(((ClassDeclarationContext)_localctx).methodDeclaration.syn_methodDec);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
			setState(131);
			match(T__11);
			setState(132);
			((VarDeclarationContext)_localctx).varName = match(ID);
			setState(133);
			match(T__5);
			setState(134);
			((VarDeclarationContext)_localctx).type = type();
			((VarDeclarationContext)_localctx).syn_varDec =  new VarDeclaration(new Identifier((((VarDeclarationContext)_localctx).varName!=null?((VarDeclarationContext)_localctx).varName.getText():null)), ((VarDeclarationContext)_localctx).type.syn_type);
			        _localctx.syn_varDec.setLine(((VarDeclarationContext)_localctx).varName.getLine());
			        
			setState(136);
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
			setState(138);
			match(T__2);
			((MethodDeclarationContext)_localctx).syn_methodDec =  new MethodDeclaration(new Identifier(null));
			setState(140);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			_localctx.syn_methodDec.setLine(((MethodDeclarationContext)_localctx).methodName.getLine()); _localctx.syn_methodDec.setName(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)));
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(142);
				match(T__3);
				setState(143);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(144);
				match(T__3);
				setState(145);
				((MethodDeclarationContext)_localctx).argName = match(ID);
				_localctx.syn_methodDec.setName(new Identifier((((MethodDeclarationContext)_localctx).methodName!=null?((MethodDeclarationContext)_localctx).methodName.getText():null)));
				setState(147);
				match(T__5);
				setState(148);
				((MethodDeclarationContext)_localctx).type = type();
				_localctx.syn_methodDec.addArg(new VarDeclaration(new Identifier((((MethodDeclarationContext)_localctx).argName!=null?((MethodDeclarationContext)_localctx).argName.getText():null)), ((MethodDeclarationContext)_localctx).type.syn_type));
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(150);
					match(T__12);
					setState(151);
					((MethodDeclarationContext)_localctx).argName = match(ID);
					setState(152);
					match(T__5);
					setState(153);
					((MethodDeclarationContext)_localctx).type = type();
					_localctx.syn_methodDec.addArg(new VarDeclaration(new Identifier((((MethodDeclarationContext)_localctx).argName!=null?((MethodDeclarationContext)_localctx).argName.getText():null)), ((MethodDeclarationContext)_localctx).type.syn_type));
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__4);
				}
				}
				break;
			}
			setState(165);
			match(T__5);
			setState(166);
			((MethodDeclarationContext)_localctx).type = type();
			_localctx.syn_methodDec.setReturnType(((MethodDeclarationContext)_localctx).type.syn_type);
			setState(168);
			match(T__1);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(169);
				((MethodDeclarationContext)_localctx).varDeclaration = varDeclaration();
				_localctx.syn_methodDec.addLocalVar(((MethodDeclarationContext)_localctx).varDeclaration.syn_varDec);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			((MethodDeclarationContext)_localctx).statements = statements();
			ArrayList<Statement> allStatements = ((MethodDeclarationContext)_localctx).statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++)
			         {_localctx.syn_methodDec.addStatement(allStatements.get(i));} 
			setState(179);
			match(T__7);
			setState(180);
			((MethodDeclarationContext)_localctx).expression = expression();
			setState(181);
			match(T__8);
			_localctx.syn_methodDec.setReturnValue(((MethodDeclarationContext)_localctx).expression.syn_expr);
			setState(183);
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(186);
				((StatementsContext)_localctx).statement = statement();
				_localctx.syn_stmt.addStatement(((StatementsContext)_localctx).statement.syn_stmt);
				}
				}
				setState(193);
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((StatementContext)_localctx).statementBlock = statementBlock();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementBlock.syn_stmt;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((StatementContext)_localctx).statementCondition = statementCondition();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementCondition.syn_stmt;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				((StatementContext)_localctx).statementLoop = statementLoop();
				((StatementContext)_localctx).syn_stmt =  ((StatementContext)_localctx).statementLoop.syn_stmt;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
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
				setState(206);
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
			setState(211);
			match(T__1);
			setState(212);
			((StatementBlockContext)_localctx).statements = statements();
			setState(213);
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
			setState(216);
			match(T__13);
			setState(217);
			match(T__3);
			setState(218);
			((StatementConditionContext)_localctx).expression = expression();
			setState(219);
			match(T__4);
			setState(220);
			match(T__14);
			setState(221);
			((StatementConditionContext)_localctx).statement = statement();
			((StatementConditionContext)_localctx).syn_stmt =  new Conditional(((StatementConditionContext)_localctx).expression.syn_expr, ((StatementConditionContext)_localctx).statement.syn_stmt);
			        _localctx.syn_stmt.setLine(_localctx.start.getLine());
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(223);
				match(T__15);
				setState(224);
				((StatementConditionContext)_localctx).statement = statement();
				_localctx.syn_stmt.setAlternativeBody(((StatementConditionContext)_localctx).statement.syn_stmt);
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
			setState(229);
			match(T__16);
			setState(230);
			match(T__3);
			setState(231);
			((StatementLoopContext)_localctx).expression = expression();
			setState(232);
			match(T__4);
			setState(233);
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
			setState(236);
			match(T__17);
			setState(237);
			((StatementWriteContext)_localctx).expression = expression();
			setState(238);
			match(T__4);
			setState(239);
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
			setState(242);
			((StatementAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
			setState(243);
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
			setState(246);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				setState(250);
				match(T__18);
				setState(251);
				((ExpressionAssignmentContext)_localctx).expressionAssignment = expressionAssignment();
				((ExpressionAssignmentContext)_localctx).syn_expr =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.syn_expr, ((((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr.getRight() == null)? ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr.getLeft() : ((ExpressionAssignmentContext)_localctx).expressionAssignment.syn_expr), BinaryOperator.assign);
						_localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
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
			setState(259);
			((ExpressionOrContext)_localctx).expressionAnd = expressionAnd();
			setState(260);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__19);
				setState(264);
				((ExpressionOrTempContext)_localctx).expressionAnd = expressionAnd();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionOrTempContext)_localctx).expressionAnd.syn_expr, BinaryOperator.or);
						                     exprTillNow.setLine(_localctx.start.getLine());
				setState(266);
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
			setState(272);
			((ExpressionAndContext)_localctx).expressionEq = expressionEq();
			setState(273);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__20);
				setState(277);
				((ExpressionAndTempContext)_localctx).expressionEq = expressionEq();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionAndTempContext)_localctx).expressionEq.syn_expr, BinaryOperator.and);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(279);
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
			setState(285);
			((ExpressionEqContext)_localctx).expressionCmp = expressionCmp();
			setState(286);
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
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(290);
					match(T__21);
					op = BinaryOperator.eq;
					}
					break;
				case T__22:
					{
					setState(292);
					match(T__22);
					op = BinaryOperator.neq;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296);
				((ExpressionEqTempContext)_localctx).expressionCmp = expressionCmp();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionEqTempContext)_localctx).expressionCmp.syn_expr, op);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(298);
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
			setState(304);
			((ExpressionCmpContext)_localctx).expressionAdd = expressionAdd();
			setState(305);
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(309);
					match(T__23);
					op = BinaryOperator.lt;
					}
					break;
				case T__24:
					{
					setState(311);
					match(T__24);
					op = BinaryOperator.gt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315);
				((ExpressionCmpTempContext)_localctx).expressionAdd = expressionAdd();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionCmpTempContext)_localctx).expressionAdd.syn_expr, op);
						    exprTillNow.setLine(_localctx.start.getLine());
				setState(317);
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
			setState(323);
			((ExpressionAddContext)_localctx).expressionMult = expressionMult();
			setState(324);
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(328);
					match(T__25);
					op = BinaryOperator.add;
					}
					break;
				case T__26:
					{
					setState(330);
					match(T__26);
					op = BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334);
				((ExpressionAddTempContext)_localctx).expressionMult = expressionMult();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionAddTempContext)_localctx).expressionMult.syn_expr, op);
				                       exprTillNow.setLine(_localctx.start.getLine());
				setState(336);
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
			setState(342);
			((ExpressionMultContext)_localctx).expressionUnary = expressionUnary();
			setState(343);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				BinaryOperator op;
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(347);
					match(T__27);
					op = BinaryOperator.mult;
					}
					break;
				case T__28:
					{
					setState(349);
					match(T__28);
					op = BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353);
				((ExpressionMultTempContext)_localctx).expressionUnary = expressionUnary();
				Expression exprTillNow = new BinaryExpression(_localctx.inh_expr, ((ExpressionMultTempContext)_localctx).expressionUnary.syn_expr, op);
				                        exprTillNow.setLine(_localctx.start.getLine());
				setState(355);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator op; 
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(362);
					match(T__29);
					op = UnaryOperator.not;
					}
					break;
				case T__26:
					{
					setState(364);
					match(T__26);
					op = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368);
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
				setState(371);
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
			setState(376);
			((ExpressionMemContext)_localctx).expressionMethods = expressionMethods();
			setState(377);
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
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__30);
				setState(381);
				((ExpressionMemTempContext)_localctx).expression = expression();
				setState(382);
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
			setState(388);
			((ExpressionMethodsContext)_localctx).expressionOther = expressionOther();
			setState(389);
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				Expression instanceTillNow = new MethodCall(null, null);
				MethodCall methodCallTillNow = new MethodCall(null, null);
				setState(394);
				match(T__32);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(395);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					methodCallTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(397);
					match(T__3);
					setState(398);
					match(T__4);
					instanceTillNow = methodCallTillNow;
					}
					break;
				case 2:
					{
					setState(400);
					((ExpressionMethodsTempContext)_localctx).methodName = match(ID);
					methodCallTillNow = new MethodCall(_localctx.inh_instance, new Identifier((((ExpressionMethodsTempContext)_localctx).methodName!=null?((ExpressionMethodsTempContext)_localctx).methodName.getText():null)));
					setState(402);
					match(T__3);
					{
					setState(403);
					((ExpressionMethodsTempContext)_localctx).expression = expression();
					methodCallTillNow.addArg(((ExpressionMethodsTempContext)_localctx).expression.syn_expr);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(405);
						match(T__12);
						setState(406);
						((ExpressionMethodsTempContext)_localctx).expression = expression();
						methodCallTillNow.addArg(((ExpressionMethodsTempContext)_localctx).expression.syn_expr);
						}
						}
						setState(413);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(414);
					match(T__4);
					instanceTillNow = methodCallTillNow;
					}
					break;
				case 3:
					{
					setState(417);
					match(T__33);
					instanceTillNow = new Length(_localctx.inh_instance);
					}
					break;
				}
				setState(421);
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
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				((ExpressionOtherContext)_localctx).val = match(CONST_NUM);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new IntValue( (((ExpressionOtherContext)_localctx).val!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).val.getText()):0), new IntType() );
						        _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				((ExpressionOtherContext)_localctx).val = match(CONST_STR);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new StringValue( (((ExpressionOtherContext)_localctx).val!=null?((ExpressionOtherContext)_localctx).val.getText():null), new StringType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(T__34);
				setState(432);
				match(T__6);
				setState(433);
				match(T__30);
				setState(434);
				((ExpressionOtherContext)_localctx).size = match(CONST_NUM);
				setState(435);
				match(T__31);
				NewArray newArr = new NewArray(); newArr.setExpression(new IntValue( (((ExpressionOtherContext)_localctx).size!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).size.getText()):0), new IntType() ));
				                ((ExpressionOtherContext)_localctx).syn_expr =  newArr; _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(T__34);
				setState(438);
				((ExpressionOtherContext)_localctx).className = match(ID);
				setState(439);
				match(T__3);
				setState(440);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new NewClass( new Identifier((((ExpressionOtherContext)_localctx).className!=null?((ExpressionOtherContext)_localctx).className.getText():null)) );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(T__35);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new This();
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(T__36);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( true, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(446);
				match(T__37);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new BooleanValue( false, new BooleanType() );
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(448);
				((ExpressionOtherContext)_localctx).iden = match(ID);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new Identifier((((ExpressionOtherContext)_localctx).iden!=null?((ExpressionOtherContext)_localctx).iden.getText():null));
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
				((ExpressionOtherContext)_localctx).arrayName = match(ID);
				setState(451);
				match(T__30);
				setState(452);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(453);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).syn_expr =  new ArrayCall( new Identifier((((ExpressionOtherContext)_localctx).arrayName!=null?((ExpressionOtherContext)_localctx).arrayName.getText():null)), ((ExpressionOtherContext)_localctx).expression.syn_expr);
				                _localctx.syn_expr.setLine(_localctx.start.getLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(456);
				match(T__3);
				setState(457);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(458);
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
		public Token classType;
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__6);
				 ((TypeContext)_localctx).syn_type =  new IntType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(T__38);
				 ((TypeContext)_localctx).syn_type =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__39);
				 ((TypeContext)_localctx).syn_type =  new StringType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(T__6);
				setState(470);
				match(T__30);
				setState(471);
				match(T__31);
				 ((TypeContext)_localctx).syn_type =  new ArrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				((TypeContext)_localctx).classType = match(ID);
				 UserDefinedType temp = new UserDefinedType(); temp.setClassType((((TypeContext)_localctx).classType!=null?((TypeContext)_localctx).classType.getText():null)); ((TypeContext)_localctx).syn_type =  temp;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4"+
		"\3\4\7\4v\n\4\f\4\16\4y\13\4\3\4\3\4\3\4\7\4~\n\4\f\4\16\4\u0081\13\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2"+
		"\13\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00af\n\6"+
		"\f\6\16\6\u00b2\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7\u00c0\n\7\f\7\16\7\u00c3\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d4\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e6\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011e\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0131\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u013c"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u014f\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0157\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0162"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016a\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0171\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0179\n\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0185\n\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 "+
		"\u019c\n \f \16 \u019f\13 \3 \3 \3 \3 \3 \5 \u01a6\n \3 \3 \3 \3 \5 \u01ac"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01d0\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01de\n\"\3\"\2\2#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2\u01ea\2D\3\2\2\2\4"+
		"Q\3\2\2\2\6i\3\2\2\2\b\u0085\3\2\2\2\n\u008c\3\2\2\2\f\u00bb\3\2\2\2\16"+
		"\u00d3\3\2\2\2\20\u00d5\3\2\2\2\22\u00da\3\2\2\2\24\u00e7\3\2\2\2\26\u00ee"+
		"\3\2\2\2\30\u00f4\3\2\2\2\32\u00f8\3\2\2\2\34\u0103\3\2\2\2\36\u0105\3"+
		"\2\2\2 \u0110\3\2\2\2\"\u0112\3\2\2\2$\u011d\3\2\2\2&\u011f\3\2\2\2(\u0130"+
		"\3\2\2\2*\u0132\3\2\2\2,\u0143\3\2\2\2.\u0145\3\2\2\2\60\u0156\3\2\2\2"+
		"\62\u0158\3\2\2\2\64\u0169\3\2\2\2\66\u0178\3\2\2\28\u017a\3\2\2\2:\u0184"+
		"\3\2\2\2<\u0186\3\2\2\2>\u01ab\3\2\2\2@\u01cf\3\2\2\2B\u01dd\3\2\2\2D"+
		"E\b\2\1\2EF\5\4\3\2FL\b\2\1\2GH\5\6\4\2HI\b\2\1\2IK\3\2\2\2JG\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2\2\3P\3\3\2\2"+
		"\2QR\7\3\2\2RS\7.\2\2ST\b\3\1\2TU\b\3\1\2UV\7\4\2\2VW\7\5\2\2WX\7.\2\2"+
		"XY\b\3\1\2YZ\7\6\2\2Z[\7\7\2\2[\\\7\b\2\2\\]\7\t\2\2]^\b\3\1\2^_\7\4\2"+
		"\2_`\5\f\7\2`a\b\3\1\2ab\7\n\2\2bc\5\32\16\2cd\b\3\1\2de\7\13\2\2ef\7"+
		"\f\2\2fg\7\f\2\2gh\b\3\1\2h\5\3\2\2\2ij\7\3\2\2jk\7.\2\2ko\b\4\1\2lm\7"+
		"\r\2\2mn\7.\2\2np\b\4\1\2ol\3\2\2\2op\3\2\2\2pq\3\2\2\2qw\7\4\2\2rs\5"+
		"\b\5\2st\b\4\1\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\177"+
		"\3\2\2\2yw\3\2\2\2z{\5\n\6\2{|\b\4\1\2|~\3\2\2\2}z\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0083\7\f\2\2\u0083\u0084\b\4\1\2\u0084\7\3\2\2\2\u0085\u0086"+
		"\7\16\2\2\u0086\u0087\7.\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5B\"\2\u0089"+
		"\u008a\b\5\1\2\u008a\u008b\7\13\2\2\u008b\t\3\2\2\2\u008c\u008d\7\5\2"+
		"\2\u008d\u008e\b\6\1\2\u008e\u008f\7.\2\2\u008f\u00a5\b\6\1\2\u0090\u0091"+
		"\7\6\2\2\u0091\u00a6\7\7\2\2\u0092\u0093\7\6\2\2\u0093\u0094\7.\2\2\u0094"+
		"\u0095\b\6\1\2\u0095\u0096\7\b\2\2\u0096\u0097\5B\"\2\u0097\u00a0\b\6"+
		"\1\2\u0098\u0099\7\17\2\2\u0099\u009a\7.\2\2\u009a\u009b\7\b\2\2\u009b"+
		"\u009c\5B\"\2\u009c\u009d\b\6\1\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u0090\3\2\2\2\u00a5\u0092\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\b\2\2\u00a8\u00a9\5B\"\2\u00a9\u00aa\b\6\1\2\u00aa\u00b0\7\4"+
		"\2\2\u00ab\u00ac\5\b\5\2\u00ac\u00ad\b\6\1\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\f\7\2\u00b4"+
		"\u00b5\b\6\1\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7"+
		"\13\2\2\u00b8\u00b9\b\6\1\2\u00b9\u00ba\7\f\2\2\u00ba\13\3\2\2\2\u00bb"+
		"\u00c1\b\7\1\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\7\1\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\r\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\20\t"+
		"\2\u00c5\u00c6\b\b\1\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8\5\22\n\2\u00c8"+
		"\u00c9\b\b\1\2\u00c9\u00d4\3\2\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\b"+
		"\b\1\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\b\b\1\2\u00cf"+
		"\u00d4\3\2\2\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\b\b\1\2\u00d2\u00d4\3"+
		"\2\2\2\u00d3\u00c4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3"+
		"\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\17\3\2\2\2\u00d5\u00d6\7\4\2"+
		"\2\u00d6\u00d7\5\f\7\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\b\t\1\2\u00d9\21"+
		"\3\2\2\2\u00da\u00db\7\20\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\5\32\16"+
		"\2\u00dd\u00de\7\7\2\2\u00de\u00df\7\21\2\2\u00df\u00e0\5\16\b\2\u00e0"+
		"\u00e5\b\n\1\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5\16\b\2\u00e3\u00e4\b"+
		"\n\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\23\3\2\2\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5\32"+
		"\16\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed\b\13\1\2\u00ed"+
		"\25\3\2\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7\7"+
		"\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\b\f\1\2\u00f3\27\3\2\2\2\u00f4\u00f5"+
		"\5\34\17\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\b\r\1\2\u00f7\31\3\2\2\2\u00f8"+
		"\u00f9\5\34\17\2\u00f9\u00fa\b\16\1\2\u00fa\33\3\2\2\2\u00fb\u00fc\5\36"+
		"\20\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\5\34\17\2\u00fe\u00ff\b\17\1\2"+
		"\u00ff\u0104\3\2\2\2\u0100\u0101\5\36\20\2\u0101\u0102\b\17\1\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u0100\3\2\2\2\u0104\35\3\2\2"+
		"\2\u0105\u0106\5\"\22\2\u0106\u0107\5 \21\2\u0107\u0108\b\20\1\2\u0108"+
		"\37\3\2\2\2\u0109\u010a\7\26\2\2\u010a\u010b\5\"\22\2\u010b\u010c\b\21"+
		"\1\2\u010c\u010d\5 \21\2\u010d\u010e\b\21\1\2\u010e\u0111\3\2\2\2\u010f"+
		"\u0111\b\21\1\2\u0110\u0109\3\2\2\2\u0110\u010f\3\2\2\2\u0111!\3\2\2\2"+
		"\u0112\u0113\5&\24\2\u0113\u0114\5$\23\2\u0114\u0115\b\22\1\2\u0115#\3"+
		"\2\2\2\u0116\u0117\7\27\2\2\u0117\u0118\5&\24\2\u0118\u0119\b\23\1\2\u0119"+
		"\u011a\5$\23\2\u011a\u011b\b\23\1\2\u011b\u011e\3\2\2\2\u011c\u011e\b"+
		"\23\1\2\u011d\u0116\3\2\2\2\u011d\u011c\3\2\2\2\u011e%\3\2\2\2\u011f\u0120"+
		"\5*\26\2\u0120\u0121\5(\25\2\u0121\u0122\b\24\1\2\u0122\'\3\2\2\2\u0123"+
		"\u0128\b\25\1\2\u0124\u0125\7\30\2\2\u0125\u0129\b\25\1\2\u0126\u0127"+
		"\7\31\2\2\u0127\u0129\b\25\1\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\5*\26\2\u012b\u012c\b\25\1\2\u012c\u012d"+
		"\5(\25\2\u012d\u012e\b\25\1\2\u012e\u0131\3\2\2\2\u012f\u0131\b\25\1\2"+
		"\u0130\u0123\3\2\2\2\u0130\u012f\3\2\2\2\u0131)\3\2\2\2\u0132\u0133\5"+
		".\30\2\u0133\u0134\5,\27\2\u0134\u0135\b\26\1\2\u0135+\3\2\2\2\u0136\u013b"+
		"\b\27\1\2\u0137\u0138\7\32\2\2\u0138\u013c\b\27\1\2\u0139\u013a\7\33\2"+
		"\2\u013a\u013c\b\27\1\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\5.\30\2\u013e\u013f\b\27\1\2\u013f\u0140\5"+
		",\27\2\u0140\u0141\b\27\1\2\u0141\u0144\3\2\2\2\u0142\u0144\b\27\1\2\u0143"+
		"\u0136\3\2\2\2\u0143\u0142\3\2\2\2\u0144-\3\2\2\2\u0145\u0146\5\62\32"+
		"\2\u0146\u0147\5\60\31\2\u0147\u0148\b\30\1\2\u0148/\3\2\2\2\u0149\u014e"+
		"\b\31\1\2\u014a\u014b\7\34\2\2\u014b\u014f\b\31\1\2\u014c\u014d\7\35\2"+
		"\2\u014d\u014f\b\31\1\2\u014e\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\5\62\32\2\u0151\u0152\b\31\1\2\u0152\u0153"+
		"\5\60\31\2\u0153\u0154\b\31\1\2\u0154\u0157\3\2\2\2\u0155\u0157\b\31\1"+
		"\2\u0156\u0149\3\2\2\2\u0156\u0155\3\2\2\2\u0157\61\3\2\2\2\u0158\u0159"+
		"\5\66\34\2\u0159\u015a\5\64\33\2\u015a\u015b\b\32\1\2\u015b\63\3\2\2\2"+
		"\u015c\u0161\b\33\1\2\u015d\u015e\7\36\2\2\u015e\u0162\b\33\1\2\u015f"+
		"\u0160\7\37\2\2\u0160\u0162\b\33\1\2\u0161\u015d\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5\66\34\2\u0164\u0165\b\33\1\2"+
		"\u0165\u0166\5\64\33\2\u0166\u0167\b\33\1\2\u0167\u016a\3\2\2\2\u0168"+
		"\u016a\b\33\1\2\u0169\u015c\3\2\2\2\u0169\u0168\3\2\2\2\u016a\65\3\2\2"+
		"\2\u016b\u0170\b\34\1\2\u016c\u016d\7 \2\2\u016d\u0171\b\34\1\2\u016e"+
		"\u016f\7\35\2\2\u016f\u0171\b\34\1\2\u0170\u016c\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\66\34\2\u0173\u0174\b\34\1\2"+
		"\u0174\u0179\3\2\2\2\u0175\u0176\58\35\2\u0176\u0177\b\34\1\2\u0177\u0179"+
		"\3\2\2\2\u0178\u016b\3\2\2\2\u0178\u0175\3\2\2\2\u0179\67\3\2\2\2\u017a"+
		"\u017b\5<\37\2\u017b\u017c\5:\36\2\u017c\u017d\b\35\1\2\u017d9\3\2\2\2"+
		"\u017e\u017f\7!\2\2\u017f\u0180\5\32\16\2\u0180\u0181\7\"\2\2\u0181\u0182"+
		"\b\36\1\2\u0182\u0185\3\2\2\2\u0183\u0185\b\36\1\2\u0184\u017e\3\2\2\2"+
		"\u0184\u0183\3\2\2\2\u0185;\3\2\2\2\u0186\u0187\5@!\2\u0187\u0188\5> "+
		"\2\u0188\u0189\b\37\1\2\u0189=\3\2\2\2\u018a\u018b\b \1\2\u018b\u018c"+
		"\b \1\2\u018c\u01a5\7#\2\2\u018d\u018e\7.\2\2\u018e\u018f\b \1\2\u018f"+
		"\u0190\7\6\2\2\u0190\u0191\7\7\2\2\u0191\u01a6\b \1\2\u0192\u0193\7.\2"+
		"\2\u0193\u0194\b \1\2\u0194\u0195\7\6\2\2\u0195\u0196\5\32\16\2\u0196"+
		"\u019d\b \1\2\u0197\u0198\7\17\2\2\u0198\u0199\5\32\16\2\u0199\u019a\b"+
		" \1\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a1\7\7\2\2\u01a1\u01a2\b \1\2\u01a2\u01a6\3\2\2\2\u01a3"+
		"\u01a4\7$\2\2\u01a4\u01a6\b \1\2\u01a5\u018d\3\2\2\2\u01a5\u0192\3\2\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5> \2\u01a8\u01a9"+
		"\b \1\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\b \1\2\u01ab\u018a\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac?\3\2\2\2\u01ad\u01ae\7+\2\2\u01ae\u01d0\b!\1\2\u01af"+
		"\u01b0\7,\2\2\u01b0\u01d0\b!\1\2\u01b1\u01b2\7%\2\2\u01b2\u01b3\7\t\2"+
		"\2\u01b3\u01b4\7!\2\2\u01b4\u01b5\7+\2\2\u01b5\u01b6\7\"\2\2\u01b6\u01d0"+
		"\b!\1\2\u01b7\u01b8\7%\2\2\u01b8\u01b9\7.\2\2\u01b9\u01ba\7\6\2\2\u01ba"+
		"\u01bb\7\7\2\2\u01bb\u01d0\b!\1\2\u01bc\u01bd\7&\2\2\u01bd\u01d0\b!\1"+
		"\2\u01be\u01bf\7\'\2\2\u01bf\u01d0\b!\1\2\u01c0\u01c1\7(\2\2\u01c1\u01d0"+
		"\b!\1\2\u01c2\u01c3\7.\2\2\u01c3\u01d0\b!\1\2\u01c4\u01c5\7.\2\2\u01c5"+
		"\u01c6\7!\2\2\u01c6\u01c7\5\32\16\2\u01c7\u01c8\7\"\2\2\u01c8\u01c9\b"+
		"!\1\2\u01c9\u01d0\3\2\2\2\u01ca\u01cb\7\6\2\2\u01cb\u01cc\5\32\16\2\u01cc"+
		"\u01cd\7\7\2\2\u01cd\u01ce\b!\1\2\u01ce\u01d0\3\2\2\2\u01cf\u01ad\3\2"+
		"\2\2\u01cf\u01af\3\2\2\2\u01cf\u01b1\3\2\2\2\u01cf\u01b7\3\2\2\2\u01cf"+
		"\u01bc\3\2\2\2\u01cf\u01be\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf\u01c2\3\2"+
		"\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01ca\3\2\2\2\u01d0A\3\2\2\2\u01d1\u01d2"+
		"\7\t\2\2\u01d2\u01de\b\"\1\2\u01d3\u01d4\7)\2\2\u01d4\u01de\b\"\1\2\u01d5"+
		"\u01d6\7*\2\2\u01d6\u01de\b\"\1\2\u01d7\u01d8\7\t\2\2\u01d8\u01d9\7!\2"+
		"\2\u01d9\u01da\7\"\2\2\u01da\u01de\b\"\1\2\u01db\u01dc\7.\2\2\u01dc\u01de"+
		"\b\"\1\2\u01dd\u01d1\3\2\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd"+
		"\u01d7\3\2\2\2\u01dd\u01db\3\2\2\2\u01deC\3\2\2\2\37Low\177\u00a0\u00a5"+
		"\u00b0\u00c1\u00d3\u00e5\u0103\u0110\u011d\u0128\u0130\u013b\u0143\u014e"+
		"\u0156\u0161\u0169\u0170\u0178\u0184\u019d\u01a5\u01ab\u01cf\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}