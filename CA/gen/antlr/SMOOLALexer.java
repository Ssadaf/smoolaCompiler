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
		T__9=10, T__10=11, T__11=12, NUMBER=13, ARRAY=14, BOOLEAN=15, STRING=16, 
		INT=17, CLASS=18, METHOD=19, THEN=20, IF=21, WRITELN=22, EXTENDS=23, VAR=24, 
		THIS=25, FALSE=26, TRUE=27, WHILE=28, ELSE=29, RETURN=30, NEW=31, IDENTIFIER=32, 
		ADD=33, SUB=34, AND=35, OR=36, MUL=37, DIV=38, NOT=39, EQUAL=40, NOTEQUAL=41, 
		LESSTHAN=42, GRATERTHAN=43, ASSIGN=44, ENTER=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "NUMBER", "ARRAY", "BOOLEAN", "STRING", "INT", 
		"CLASS", "METHOD", "THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", 
		"FALSE", "TRUE", "WHILE", "ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", 
		"SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", 
		"GRATERTHAN", "ASSIGN", "ENTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'main'", "'('", "')'", "':'", "';'", "','", "'#'", 
		"'\r'", "'\n'", "'\"'", null, "'int[]'", "'boolean'", "'string'", "'int'", 
		"'class'", "'def'", "'then'", "'if'", "'writeln'", "'extends'", "'var'", 
		"'this'", "'false'", "'true'", "'while'", "'else'", "'return'", "'new'", 
		null, "'+'", "'-'", "'&&'", "'||'", "'*'", "'/'", "'!'", "'=='", "'<>'", 
		"'<'", "'>'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUMBER", "ARRAY", "BOOLEAN", "STRING", "INT", "CLASS", "METHOD", 
		"THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", 
		"ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", 
		"DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", 
		"ENTER", "WS"
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
		case 14:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0128\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\5\16}\n\16\3\16\6\16\u0080\n\16\r\16\16\16\u0081\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\7!\u00fd\n!\f!\16!\u0100\13!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\5.\u011f\n.\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\2\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2"+
		"\2\2\5a\3\2\2\2\7c\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3\2\2\2\17n\3\2\2"+
		"\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33|\3\2"+
		"\2\2\35\u0083\3\2\2\2\37\u0089\3\2\2\2!\u0093\3\2\2\2#\u009c\3\2\2\2%"+
		"\u00a2\3\2\2\2\'\u00aa\3\2\2\2)\u00b0\3\2\2\2+\u00b5\3\2\2\2-\u00ba\3"+
		"\2\2\2/\u00c2\3\2\2\2\61\u00ca\3\2\2\2\63\u00d0\3\2\2\2\65\u00d5\3\2\2"+
		"\2\67\u00db\3\2\2\29\u00e0\3\2\2\2;\u00e8\3\2\2\2=\u00ef\3\2\2\2?\u00f6"+
		"\3\2\2\2A\u00fa\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0108\3\2\2\2K\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u0119\3\2\2\2Y\u011b\3\2\2\2[\u011e"+
		"\3\2\2\2]\u0124\3\2\2\2_`\7}\2\2`\4\3\2\2\2ab\7\177\2\2b\6\3\2\2\2cd\7"+
		"o\2\2de\7c\2\2ef\7k\2\2fg\7p\2\2g\b\3\2\2\2hi\7*\2\2i\n\3\2\2\2jk\7+\2"+
		"\2k\f\3\2\2\2lm\7<\2\2m\16\3\2\2\2no\7=\2\2o\20\3\2\2\2pq\7.\2\2q\22\3"+
		"\2\2\2rs\7%\2\2s\24\3\2\2\2tu\7\17\2\2u\26\3\2\2\2vw\7\f\2\2w\30\3\2\2"+
		"\2xy\7$\2\2y\32\3\2\2\2z}\7/\2\2{}\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\177\3"+
		"\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\34\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7v\2\2\u0086\u0087\7]\2\2\u0087\u0088\7_\2\2\u0088"+
		"\36\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7p\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\b\20\2\2\u0092 \3\2\2\2\u0093\u0094\7"+
		"u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7i\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\21\3\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\22\4\2\u00a1$\3\2\2\2\u00a2\u00a3\7e\2\2"+
		"\u00a3\u00a4\7n\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\23\5\2\u00a9&\3\2\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00af\b\24\6\2\u00af(\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4*\3\2\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\26\7\2\u00b9"+
		",\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1.\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7z\2\2\u00c4\u00c5\7v\2"+
		"\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7x\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\31\b\2\u00cf\62\3\2\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\64\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7"+
		"n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\66\3\2\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7g\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\35"+
		"\t\2\u00e7:\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7u\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\36\n\2\u00ee"+
		"<\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7p\2\2\u00f5>\3\2\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7y\2\2\u00f9@\3\2\2\2\u00fa"+
		"\u00fe\t\3\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffB\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0102\7-\2\2\u0102D\3\2\2\2\u0103\u0104\7/\2\2\u0104F\3"+
		"\2\2\2\u0105\u0106\7(\2\2\u0106\u0107\7(\2\2\u0107H\3\2\2\2\u0108\u0109"+
		"\7~\2\2\u0109\u010a\7~\2\2\u010aJ\3\2\2\2\u010b\u010c\7,\2\2\u010cL\3"+
		"\2\2\2\u010d\u010e\7\61\2\2\u010eN\3\2\2\2\u010f\u0110\7#\2\2\u0110P\3"+
		"\2\2\2\u0111\u0112\7?\2\2\u0112\u0113\7?\2\2\u0113R\3\2\2\2\u0114\u0115"+
		"\7>\2\2\u0115\u0116\7@\2\2\u0116T\3\2\2\2\u0117\u0118\7>\2\2\u0118V\3"+
		"\2\2\2\u0119\u011a\7@\2\2\u011aX\3\2\2\2\u011b\u011c\7?\2\2\u011cZ\3\2"+
		"\2\2\u011d\u011f\7\17\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\7\f\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b."+
		"\13\2\u0123\\\3\2\2\2\u0124\u0125\t\5\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\b/\13\2\u0127^\3\2\2\2\7\2|\u0081\u00fe\u011e\f\3\20\2\3\21\3\3\22\4"+
		"\3\23\5\3\24\6\3\26\7\3\31\b\3\35\t\3\36\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}