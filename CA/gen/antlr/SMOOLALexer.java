// Generated from /Users/yasaman/Desktop/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMOOLALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COMMENT=14, NUMBER=15, LENGTH=16, 
		ARRAY=17, BOOLEAN=18, STRING=19, INT=20, CLASS=21, METHOD=22, THEN=23, 
		IF=24, WRITELN=25, EXTENDS=26, VAR=27, THIS=28, FALSE=29, TRUE=30, WHILE=31, 
		ELSE=32, RETURN=33, NEW=34, IDENTIFIER=35, ADD=36, SUB=37, AND=38, OR=39, 
		MUL=40, DIV=41, NOT=42, EQUAL=43, NOTEQUAL=44, LESSTHAN=45, GRATERTHAN=46, 
		ASSIGN=47, ENTER=48, WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "COMMENT", "NUMBER", "LENGTH", "ARRAY", 
		"BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", 
		"EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", "RETURN", 
		"NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", 
		"NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "ENTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'main'", "'('", "')'", "':'", "'['", "']'", "','", 
		"'.'", "';'", "'\"'", "'\r'", null, null, "'length'", "'int[]'", "'boolean'", 
		"'string'", "'int'", "'class'", "'def'", "'then'", "'if'", "'writeln'", 
		"'extends'", "'var'", "'this'", "'false'", "'true'", "'while'", "'else'", 
		"'return'", "'new'", null, "'+'", "'-'", "'&&'", "'||'", "'*'", "'/'", 
		"'!'", "'=='", "'<>'", "'<'", "'>'", "'='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COMMENT", "NUMBER", "LENGTH", "ARRAY", "BOOLEAN", "STRING", 
		"INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", 
		"FALSE", "TRUE", "WHILE", "ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", 
		"SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", 
		"GRATERTHAN", "ASSIGN", "ENTER", "WS"
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


	public SMOOLALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SMOOLA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("boolean")
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("string")
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("int")
			break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("ClassDec:")
			break;
		}
	}
	private void METHOD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("MethodDec:")
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Conditional:if")
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("VarDec:")
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("Loop:While")
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("Conditional:else")
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\u0085\n\17\f\17\16"+
		"\17\u0088\13\17\3\20\3\20\5\20\u008c\n\20\3\20\6\20\u008f\n\20\r\20\16"+
		"\20\u0090\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\7$\u0113\n$\f$\16$\u0116\13"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\2\2\63"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\2\u013e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3"+
		"\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31"+
		"~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u008b\3\2\2\2!\u0092\3"+
		"\2\2\2#\u0099\3\2\2\2%\u009f\3\2\2\2\'\u00a9\3\2\2\2)\u00b2\3\2\2\2+\u00b8"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c6\3\2\2\2\61\u00cb\3\2\2\2\63\u00d0\3\2\2"+
		"\2\65\u00d8\3\2\2\2\67\u00e0\3\2\2\29\u00e6\3\2\2\2;\u00eb\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00f6\3\2\2\2A\u00fe\3\2\2\2C\u0105\3\2\2\2E\u010c\3\2\2\2G"+
		"\u0110\3\2\2\2I\u0117\3\2\2\2K\u0119\3\2\2\2M\u011b\3\2\2\2O\u011e\3\2"+
		"\2\2Q\u0121\3\2\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127\3\2\2\2Y\u012a"+
		"\3\2\2\2[\u012d\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c"+
		"\u0137\3\2\2\2ef\7}\2\2f\4\3\2\2\2gh\7\177\2\2h\6\3\2\2\2ij\7o\2\2jk\7"+
		"c\2\2kl\7k\2\2lm\7p\2\2m\b\3\2\2\2no\7*\2\2o\n\3\2\2\2pq\7+\2\2q\f\3\2"+
		"\2\2rs\7<\2\2s\16\3\2\2\2tu\7]\2\2u\20\3\2\2\2vw\7_\2\2w\22\3\2\2\2xy"+
		"\7.\2\2y\24\3\2\2\2z{\7\60\2\2{\26\3\2\2\2|}\7=\2\2}\30\3\2\2\2~\177\7"+
		"$\2\2\177\32\3\2\2\2\u0080\u0081\7\17\2\2\u0081\34\3\2\2\2\u0082\u0086"+
		"\7%\2\2\u0083\u0085\n\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\36\3\2\2\2\u0088\u0086\3\2\2"+
		"\2\u0089\u008c\7/\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091 \3\2\2\2"+
		"\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7i\2\2\u0096\u0097\7v\2\2\u0097\u0098\7j\2\2\u0098\"\3\2\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7]\2\2\u009d"+
		"\u009e\7_\2\2\u009e$\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7p\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\23\2\2\u00a8&\3"+
		"\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00b1\b\24\3\2\u00b1(\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\25\4\2\u00b7"+
		"*\3\2\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\26"+
		"\5\2\u00bf,\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\27\6\2\u00c5.\3\2\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\60\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\b\31\7\2\u00cf\62\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7n\2\2\u00d6\u00d7\7p\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7"+
		"g\2\2\u00d9\u00da\7z\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7u\2\2\u00df\66\3\2\2\2\u00e0\u00e1"+
		"\7x\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\34\b\2\u00e58\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7u\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0<\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2"+
		"\2\u00f4\u00f5\7g\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8\7"+
		"j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\b \t\2\u00fd@\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100"+
		"\7n\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b!\n\2\u0104B\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a\7t\2\2\u010a\u010b\7p\2\2"+
		"\u010bD\3\2\2\2\u010c\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e\u010f\7y\2"+
		"\2\u010fF\3\2\2\2\u0110\u0114\t\4\2\2\u0111\u0113\t\5\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"H\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7-\2\2\u0118J\3\2\2\2\u0119"+
		"\u011a\7/\2\2\u011aL\3\2\2\2\u011b\u011c\7(\2\2\u011c\u011d\7(\2\2\u011d"+
		"N\3\2\2\2\u011e\u011f\7~\2\2\u011f\u0120\7~\2\2\u0120P\3\2\2\2\u0121\u0122"+
		"\7,\2\2\u0122R\3\2\2\2\u0123\u0124\7\61\2\2\u0124T\3\2\2\2\u0125\u0126"+
		"\7#\2\2\u0126V\3\2\2\2\u0127\u0128\7?\2\2\u0128\u0129\7?\2\2\u0129X\3"+
		"\2\2\2\u012a\u012b\7>\2\2\u012b\u012c\7@\2\2\u012cZ\3\2\2\2\u012d\u012e"+
		"\7>\2\2\u012e\\\3\2\2\2\u012f\u0130\7@\2\2\u0130^\3\2\2\2\u0131\u0132"+
		"\7?\2\2\u0132`\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\b\61\13\2\u0136b\3\2\2\2\u0137\u0138\t\6\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\b\62\13\2\u013ad\3\2\2\2\7\2\u0086\u008b\u0090\u0114\f\3\23\2\3"+
		"\24\3\3\25\4\3\26\5\3\27\6\3\31\7\3\34\b\3 \t\3!\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}