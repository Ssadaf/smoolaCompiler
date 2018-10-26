// Generated from /home/sadaf/Documents/compiler/phase1/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, COMMENT=13, NUMBER=14, ARRAY=15, BOOLEAN=16, 
		STRING=17, INT=18, CLASS=19, METHOD=20, THEN=21, IF=22, WRITELN=23, EXTENDS=24, 
		VAR=25, THIS=26, FALSE=27, TRUE=28, WHILE=29, ELSE=30, RETURN=31, NEW=32, 
		IDENTIFIER=33, ADD=34, SUB=35, AND=36, OR=37, MUL=38, DIV=39, NOT=40, 
		EQUAL=41, NOTEQUAL=42, LESSTHAN=43, GRATERTHAN=44, ASSIGN=45, ENTER=46, 
		WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "COMMENT", "NUMBER", "ARRAY", "BOOLEAN", "STRING", 
		"INT", "CLASS", "METHOD", "THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", 
		"FALSE", "TRUE", "WHILE", "ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", 
		"SUB", "AND", "OR", "MUL", "DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", 
		"GRATERTHAN", "ASSIGN", "ENTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'main'", "'('", "')'", "':'", "'['", "']'", "','", 
		"';'", "'\"'", "'\r'", null, null, "'int[]'", "'boolean'", "'string'", 
		"'int'", "'class'", "'def'", "'then'", "'if'", "'writeln'", "'extends'", 
		"'var'", "'this'", "'false'", "'true'", "'while'", "'else'", "'return'", 
		"'new'", null, "'+'", "'-'", "'&&'", "'||'", "'*'", "'/'", "'!'", "'=='", 
		"'<>'", "'<'", "'>'", "'='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "NUMBER", "ARRAY", "BOOLEAN", "STRING", "INT", "CLASS", 
		"METHOD", "THEN", "IF", "WRITELN", "EXTENDS", "VAR", "THIS", "FALSE", 
		"TRUE", "WHILE", "ELSE", "RETURN", "NEW", "IDENTIFIER", "ADD", "SUB", 
		"AND", "OR", "MUL", "DIV", "NOT", "EQUAL", "NOTEQUAL", "LESSTHAN", "GRATERTHAN", 
		"ASSIGN", "ENTER", "WS"
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
		case 15:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u012e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\7\16\177\n\16\f\16\16\16\u0082\13\16\3\17\3\17\5\17\u0086"+
		"\n\17\3\17\6\17\u0089\n\17\r\17\16\17\u008a\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u0106"+
		"\n\"\f\"\16\"\u0109\13\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\4\2\f\f\17"+
		"\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\2\u0131\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2"+
		"\2\5c\3\2\2\2\7e\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2"+
		"\21r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33|\3\2\2"+
		"\2\35\u0085\3\2\2\2\37\u008c\3\2\2\2!\u0092\3\2\2\2#\u009c\3\2\2\2%\u00a5"+
		"\3\2\2\2\'\u00ab\3\2\2\2)\u00b3\3\2\2\2+\u00b9\3\2\2\2-\u00be\3\2\2\2"+
		"/\u00c3\3\2\2\2\61\u00cb\3\2\2\2\63\u00d3\3\2\2\2\65\u00d9\3\2\2\2\67"+
		"\u00de\3\2\2\29\u00e4\3\2\2\2;\u00e9\3\2\2\2=\u00f1\3\2\2\2?\u00f8\3\2"+
		"\2\2A\u00ff\3\2\2\2C\u0103\3\2\2\2E\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e"+
		"\3\2\2\2K\u0111\3\2\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u0118\3\2\2\2S"+
		"\u011a\3\2\2\2U\u011d\3\2\2\2W\u0120\3\2\2\2Y\u0122\3\2\2\2[\u0124\3\2"+
		"\2\2]\u0126\3\2\2\2_\u012a\3\2\2\2ab\7}\2\2b\4\3\2\2\2cd\7\177\2\2d\6"+
		"\3\2\2\2ef\7o\2\2fg\7c\2\2gh\7k\2\2hi\7p\2\2i\b\3\2\2\2jk\7*\2\2k\n\3"+
		"\2\2\2lm\7+\2\2m\f\3\2\2\2no\7<\2\2o\16\3\2\2\2pq\7]\2\2q\20\3\2\2\2r"+
		"s\7_\2\2s\22\3\2\2\2tu\7.\2\2u\24\3\2\2\2vw\7=\2\2w\26\3\2\2\2xy\7$\2"+
		"\2y\30\3\2\2\2z{\7\17\2\2{\32\3\2\2\2|\u0080\7%\2\2}\177\n\2\2\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\34\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0086\7/\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\t\3"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\36\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\7]\2\2\u0090\u0091\7_\2\2\u0091 \3\2\2"+
		"\2\u0092\u0093\7d\2\2\u0093\u0094\7q\2\2\u0094\u0095\7q\2\2\u0095\u0096"+
		"\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b\21\2\2\u009b\"\3\2\2\2\u009c\u009d\7u\2\2"+
		"\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\22\3\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\23\4\2\u00aa&\3\2\2\2\u00ab\u00ac\7e\2\2"+
		"\u00ac\u00ad\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\24\5\2\u00b2(\3\2\2\2\u00b3"+
		"\u00b4\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\3\2\2"+
		"\2\u00b7\u00b8\b\25\6\2\u00b8*\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb"+
		"\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\27\7\2\u00c2"+
		".\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\60\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7"+
		"v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\32\b\2\u00d8\64\3\2\2\2\u00d9"+
		"\u00da\7v\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7u\2\2"+
		"\u00dd\66\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7"+
		"n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e38\3\2\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		":\3\2\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\36"+
		"\t\2\u00f0<\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\37\n\2\u00f7"+
		">\3\2\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7w\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7p\2\2\u00fe@\3\2\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101\u0102\7y\2\2\u0102B\3\2\2\2\u0103"+
		"\u0107\t\4\2\2\u0104\u0106\t\5\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108D\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\7-\2\2\u010bF\3\2\2\2\u010c\u010d\7/\2\2\u010dH\3"+
		"\2\2\2\u010e\u010f\7(\2\2\u010f\u0110\7(\2\2\u0110J\3\2\2\2\u0111\u0112"+
		"\7~\2\2\u0112\u0113\7~\2\2\u0113L\3\2\2\2\u0114\u0115\7,\2\2\u0115N\3"+
		"\2\2\2\u0116\u0117\7\61\2\2\u0117P\3\2\2\2\u0118\u0119\7#\2\2\u0119R\3"+
		"\2\2\2\u011a\u011b\7?\2\2\u011b\u011c\7?\2\2\u011cT\3\2\2\2\u011d\u011e"+
		"\7>\2\2\u011e\u011f\7@\2\2\u011fV\3\2\2\2\u0120\u0121\7>\2\2\u0121X\3"+
		"\2\2\2\u0122\u0123\7@\2\2\u0123Z\3\2\2\2\u0124\u0125\7?\2\2\u0125\\\3"+
		"\2\2\2\u0126\u0127\7\f\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b/\13\2\u0129"+
		"^\3\2\2\2\u012a\u012b\t\6\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b\60\13"+
		"\2\u012d`\3\2\2\2\7\2\u0080\u0085\u008a\u0107\f\3\21\2\3\22\3\3\23\4\3"+
		"\24\5\3\25\6\3\27\7\3\32\b\3\36\t\3\37\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}