// Generated from /home/sadaf/Documents/compiler/phase1/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMOOLA extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, STRING=2, INT=3, CLASS=4, METHOD=5, THEN=6, IF=7, WRITELN=8, 
		EXTENDS=9, VAR=10, THIS=11, FALSE=12, TRUE=13, WHILE=14, ELSE=15, RETURN=16, 
		NEW=17, IDENTIFIER=18, ADD=19, SUB=20, AND=21, OR=22, MUL=23, DIV=24, 
		NOT=25, EQUAL=26, NOTEQUAL=27, LESSTHAN=28, GRATERTHAN=29, ASSIGN=30, 
		NUMBER=31, WHITESPACE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", 
		"EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", "RETURN", 
		"NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", 
		"NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "NUMBER", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'string'", "'int'", "'class'", "'def'", "'then'", 
		"'if'", "'writeln'", "'extends'", "'var'", "'this'", "'false'", "'true'", 
		"'while'", "'else'", "'return'", "'new'", null, "'+'", "'-'", "'&&'", 
		"'||'", "'*'", "'/'", "'!'", "'=='", "'<>'", "'<'", "'>'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "STRING", "INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", 
		"EXTENDS", "VAR", "THIS", "FALSE", "TRUE", "WHILE", "ELSE", "RETURN", 
		"NEW", "IDENTIFIER", "ADD", "SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", 
		"NOTEQUAL", "LESSTHAN", "GRATERTHAN", "ASSIGN", "NUMBER", "WHITESPACE"
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


	public SMOOLA(CharStream input) {
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
		case 0:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("boolean");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("string");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("int");
			break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("ClassDec:");
			break;
		}
	}
	private void METHOD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("MethodDec:");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Conditional:if");
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("VarDec:");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("Loop:While");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("Conditional:else");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\7\23\u00b7\n\23\f\23\16\23\u00ba\13\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00d9\n"+
		" \r \16 \u00da\3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\3C\3\2\2\2\5M\3\2\2\2\7V\3\2\2\2\t\\\3\2\2\2\13d\3\2\2\2\rj\3\2"+
		"\2\2\17o\3\2\2\2\21t\3\2\2\2\23|\3\2\2\2\25\u0084\3\2\2\2\27\u008a\3\2"+
		"\2\2\31\u008f\3\2\2\2\33\u0095\3\2\2\2\35\u009a\3\2\2\2\37\u00a2\3\2\2"+
		"\2!\u00a9\3\2\2\2#\u00b0\3\2\2\2%\u00b4\3\2\2\2\'\u00bb\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00bf\3\2\2\2-\u00c2\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2"+
		"\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00ce\3\2\2\29\u00d1\3\2\2\2;\u00d3"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00dc\3\2\2\2CD\7d\2\2DE\7q\2"+
		"\2EF\7q\2\2FG\7n\2\2GH\7g\2\2HI\7c\2\2IJ\7p\2\2JK\3\2\2\2KL\b\2\2\2L\4"+
		"\3\2\2\2MN\7u\2\2NO\7v\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7i\2\2ST\3\2\2"+
		"\2TU\b\3\3\2U\6\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2YZ\3\2\2\2Z[\b\4\4\2"+
		"[\b\3\2\2\2\\]\7e\2\2]^\7n\2\2^_\7c\2\2_`\7u\2\2`a\7u\2\2ab\3\2\2\2bc"+
		"\b\5\5\2c\n\3\2\2\2de\7f\2\2ef\7g\2\2fg\7h\2\2gh\3\2\2\2hi\b\6\6\2i\f"+
		"\3\2\2\2jk\7v\2\2kl\7j\2\2lm\7g\2\2mn\7p\2\2n\16\3\2\2\2op\7k\2\2pq\7"+
		"h\2\2qr\3\2\2\2rs\b\b\7\2s\20\3\2\2\2tu\7y\2\2uv\7t\2\2vw\7k\2\2wx\7v"+
		"\2\2xy\7g\2\2yz\7n\2\2z{\7p\2\2{\22\3\2\2\2|}\7g\2\2}~\7z\2\2~\177\7v"+
		"\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\u0083"+
		"\7u\2\2\u0083\24\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\13\b\2\u0089\26\3\2\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7u\2\2"+
		"\u008e\30\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091\u0092\7"+
		"n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\32\3\2\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099"+
		"\34\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c\7j\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\17"+
		"\t\2\u00a1\36\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\20\n\2\u00a8"+
		" \3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\"\3\2\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7y\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b8\t\2\2\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9&\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc(\3\2\2\2\u00bd\u00be\7/\2\2\u00be*\3"+
		"\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\7(\2\2\u00c1,\3\2\2\2\u00c2\u00c3"+
		"\7~\2\2\u00c3\u00c4\7~\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\60"+
		"\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca"+
		"\64\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd\66\3\2\2\2\u00ce"+
		"\u00cf\7>\2\2\u00cf\u00d0\7@\2\2\u00d08\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2"+
		":\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6>"+
		"\3\2\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db@\3\2\2\2\u00dc\u00dd\t\5\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00df\b!\13\2\u00dfB\3\2\2\2\5\2\u00b8\u00da"+
		"\f\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\b\7\3\13\b\3\17\t\3\20\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}