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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMBER=9, 
		ARRAY=10, BOOLEAN=11, STRING=12, INT=13, CLASS=14, METHOD=15, THEN=16, 
		IF=17, WRITELN=18, EXTENDS=19, VAR=20, THIS=21, FALSE=22, TRUE=23, WHILE=24, 
		ELSE=25, RETURN=26, NEW=27, IDENTIFIER=28, ADD=29, SUB=30, AND=31, OR=32, 
		MUL=33, DIV=34, NOT=35, EQUAL=36, NOTEQUAL=37, LESSTHAN=38, GRATERTHAN=39, 
		ASSIGN=40, WHITESPACE=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NUMBER", 
		"ARRAY", "BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", 
		"WRITELN", "EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", 
		"RETURN", "NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", 
		"NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "WHITESPACE"
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
		case 10:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nh"+
		"\n\n\3\n\6\nk\n\n\r\n\16\nl\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00e8\n\35"+
		"\f\35\16\35\u00eb\13\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\2\2+\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\4\2--//\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2"+
		"\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23g\3\2\2\2\25n\3"+
		"\2\2\2\27t\3\2\2\2\31~\3\2\2\2\33\u0087\3\2\2\2\35\u008d\3\2\2\2\37\u0095"+
		"\3\2\2\2!\u009b\3\2\2\2#\u00a0\3\2\2\2%\u00a5\3\2\2\2\'\u00ad\3\2\2\2"+
		")\u00b5\3\2\2\2+\u00bb\3\2\2\2-\u00c0\3\2\2\2/\u00c6\3\2\2\2\61\u00cb"+
		"\3\2\2\2\63\u00d3\3\2\2\2\65\u00da\3\2\2\2\67\u00e1\3\2\2\29\u00e5\3\2"+
		"\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2\2\2A\u00f3\3\2\2\2C\u00f6"+
		"\3\2\2\2E\u00f8\3\2\2\2G\u00fa\3\2\2\2I\u00fc\3\2\2\2K\u00ff\3\2\2\2M"+
		"\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0106\3\2\2\2S\u0108\3\2\2\2UV\7*\2\2V"+
		"\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7<\2\2Z\b\3\2\2\2[\\\7=\2\2\\\n\3\2\2"+
		"\2]^\7%\2\2^\f\3\2\2\2_`\7\17\2\2`\16\3\2\2\2ab\7\f\2\2b\20\3\2\2\2cd"+
		"\7$\2\2d\22\3\2\2\2eh\t\2\2\2fh\3\2\2\2ge\3\2\2\2gf\3\2\2\2hj\3\2\2\2"+
		"ik\t\3\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\24\3\2\2\2no\7k\2"+
		"\2op\7p\2\2pq\7v\2\2qr\7]\2\2rs\7_\2\2s\26\3\2\2\2tu\7d\2\2uv\7q\2\2v"+
		"w\7q\2\2wx\7n\2\2xy\7g\2\2yz\7c\2\2z{\7p\2\2{|\3\2\2\2|}\b\f\2\2}\30\3"+
		"\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k"+
		"\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\r\3\2\u0086\32\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\16\4\2\u008c\34\3\2\2"+
		"\2\u008d\u008e\7e\2\2\u008e\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7u\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\17\5\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7h\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\20\6\2\u009a \3\2\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\"\3\2"+
		"\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\b\22\7\2\u00a4$\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7z\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2"+
		"\u00b3\u00b4\7u\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7c\2"+
		"\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\25\b\2\u00ba*"+
		"\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5.\3\2\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\60\3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7"+
		"k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\31\t\2\u00d2\62\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2"+
		"\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\b\32\n\2\u00d9\64\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0\66\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7"+
		"y\2\2\u00e48\3\2\2\2\u00e5\u00e9\t\4\2\2\u00e6\u00e8\t\5\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		":\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed<\3\2\2\2\u00ee"+
		"\u00ef\7/\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7(\2\2\u00f2"+
		"@\3\2\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f5\7~\2\2\u00f5B\3\2\2\2\u00f6\u00f7"+
		"\7,\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9F\3\2\2\2\u00fa\u00fb"+
		"\7#\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\u00fe\7?\2\2\u00feJ\3"+
		"\2\2\2\u00ff\u0100\7>\2\2\u0100\u0101\7@\2\2\u0101L\3\2\2\2\u0102\u0103"+
		"\7>\2\2\u0103N\3\2\2\2\u0104\u0105\7@\2\2\u0105P\3\2\2\2\u0106\u0107\7"+
		"?\2\2\u0107R\3\2\2\2\u0108\u0109\t\6\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\b*\13\2\u010bT\3\2\2\2\6\2gl\u00e9\f\3\f\2\3\r\3\3\16\4\3\17\5\3\20\6"+
		"\3\22\7\3\25\b\3\31\t\3\32\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}