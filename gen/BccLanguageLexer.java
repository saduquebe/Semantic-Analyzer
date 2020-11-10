// Generated from C:/Users/gabri/Desktop/unal/2020-2 Lenguajes/santiago/SemanticAnalyzer/grammar\BccLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BccLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MULOP=8, SUMOP=9, 
		COMPARISONOP=10, ASSIGNOP=11, DATATYPE=12, FUNCTION=13, VAR=14, PRINT=15, 
		INPUT=16, WHEN=17, IF=18, UNLESS=19, WHILE=20, REPEAT=21, RETURN=22, UNTIL=23, 
		LOOP=24, DO=25, ELSE=26, AND=27, OR=28, FOR=29, NEXT=30, BREAK=31, NOT=32, 
		BOOL=33, SUBS=34, ADD=35, END=36, NUM=37, FID=38, ID=39, ESP=40, LINE_COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MULOP", "SUMOP", 
			"COMPARISONOP", "ASSIGNOP", "DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", 
			"WHEN", "IF", "UNLESS", "WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", 
			"DO", "ELSE", "AND", "OR", "FOR", "NEXT", "BREAK", "NOT", "BOOL", "SUBS", 
			"ADD", "END", "NUM", "FID", "ID", "ESP", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'('", "')'", "';'", "'{'", "'}'", null, null, null, 
			null, null, "'function'", "'var'", "'print'", "'input'", "'when'", "'if'", 
			"'unless'", "'while'", "'repeat'", "'return'", "'until'", "'loop'", "'do'", 
			"'else'", "'and'", "'or'", "'for'", "'next'", "'break'", "'not'", null, 
			"'--'", "'++'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MULOP", "SUMOP", "COMPARISONOP", 
			"ASSIGNOP", "DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", 
			"IF", "UNLESS", "WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", "DO", "ELSE", 
			"AND", "OR", "FOR", "NEXT", "BREAK", "NOT", "BOOL", "SUBS", "ADD", "END", 
			"NUM", "FID", "ID", "ESP", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BccLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BccLanguage.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u00fd\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\5&\u010a\n&\3&\6&\u010d"+
		"\n&\r&\16&\u010e\3&\3&\6&\u0113\n&\r&\16&\u0114\5&\u0117\n&\3\'\3\'\6"+
		"\'\u011b\n\'\r\'\16\'\u011c\3(\6(\u0120\n(\r(\16(\u0121\3)\6)\u0125\n"+
		")\r)\16)\u0126\3)\3)\3*\3*\7*\u012d\n*\f*\16*\u0130\13*\3*\3*\2\2+\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\t\5\2\'\',,\61\61\4\2--//\3\2\62;\3\2\60\60"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0146\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7"+
		"Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23"+
		"e\3\2\2\2\25q\3\2\2\2\27\177\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2"+
		"\35\u0093\3\2\2\2\37\u0097\3\2\2\2!\u009d\3\2\2\2#\u00a3\3\2\2\2%\u00a8"+
		"\3\2\2\2\'\u00ab\3\2\2\2)\u00b2\3\2\2\2+\u00b8\3\2\2\2-\u00bf\3\2\2\2"+
		"/\u00c6\3\2\2\2\61\u00cc\3\2\2\2\63\u00d1\3\2\2\2\65\u00d4\3\2\2\2\67"+
		"\u00d9\3\2\2\29\u00dd\3\2\2\2;\u00e0\3\2\2\2=\u00e4\3\2\2\2?\u00e9\3\2"+
		"\2\2A\u00ef\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I\u0104"+
		"\3\2\2\2K\u0109\3\2\2\2M\u0118\3\2\2\2O\u011f\3\2\2\2Q\u0124\3\2\2\2S"+
		"\u012a\3\2\2\2UV\7<\2\2V\4\3\2\2\2WX\7.\2\2X\6\3\2\2\2YZ\7*\2\2Z\b\3\2"+
		"\2\2[\\\7+\2\2\\\n\3\2\2\2]^\7=\2\2^\f\3\2\2\2_`\7}\2\2`\16\3\2\2\2ab"+
		"\7\177\2\2b\20\3\2\2\2cd\t\2\2\2d\22\3\2\2\2ef\t\3\2\2f\24\3\2\2\2gr\7"+
		">\2\2hi\7?\2\2ir\7?\2\2jk\7>\2\2kr\7?\2\2lr\7@\2\2mn\7@\2\2nr\7?\2\2o"+
		"p\7#\2\2pr\7?\2\2qg\3\2\2\2qh\3\2\2\2qj\3\2\2\2ql\3\2\2\2qm\3\2\2\2qo"+
		"\3\2\2\2r\26\3\2\2\2st\7<\2\2t\u0080\7?\2\2uv\7-\2\2v\u0080\7?\2\2wx\7"+
		"/\2\2x\u0080\7?\2\2yz\7,\2\2z\u0080\7?\2\2{|\7\61\2\2|\u0080\7?\2\2}~"+
		"\7\'\2\2~\u0080\7?\2\2\177s\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2"+
		"\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\30\3\2\2\2\u0081\u0082\7p\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0089\7o\2\2\u0084\u0085\7d\2\2\u0085\u0086\7q\2\2"+
		"\u0086\u0087\7q\2\2\u0087\u0089\7n\2\2\u0088\u0081\3\2\2\2\u0088\u0084"+
		"\3\2\2\2\u0089\32\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7w\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2\u0092\34\3\2\2\2\u0093\u0094\7"+
		"x\2\2\u0094\u0095\7c\2\2\u0095\u0096\7t\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7v\2\2\u009c \3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7r\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7$\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa&\3\2\2\2\u00ab"+
		"\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\u00b0\7u\2\2\u00b0\u00b1\7u\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7y\2"+
		"\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be"+
		",\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7p\2\2\u00c5.\3\2\2\2\u00c6"+
		"\u00c7\7w\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7n\2\2\u00cb\60\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7"+
		"q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7r\2\2\u00d0\62\3\2\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\u00d3\7q\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\66\3\2\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc8\3\2\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7t\2\2\u00df:\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e3\7t\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7z\2\2\u00e7\u00e8\7v\2\2\u00e8>\3\2\2\2\u00e9\u00ea"+
		"\7d\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7c\2\2\u00ed"+
		"\u00ee\7m\2\2\u00ee@\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5"+
		"\u00f6\7w\2\2\u00f6\u00fd\7g\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7c\2\2"+
		"\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fd\7g\2\2\u00fc\u00f3"+
		"\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100"+
		"\7/\2\2\u0100F\3\2\2\2\u0101\u0102\7-\2\2\u0102\u0103\7-\2\2\u0103H\3"+
		"\2\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107"+
		"J\3\2\2\2\u0108\u010a\7/\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0116\3\2\2\2\u0110"+
		"\u0112\t\5\2\2\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0110\3\2\2\2\u0116\u0117\3\2\2\2\u0117L\3\2\2\2\u0118\u011a\7B\2\2\u0119"+
		"\u011b\t\6\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011dN\3\2\2\2\u011e\u0120\t\6\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"P\3\2\2\2\u0123\u0125\t\7\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\b)\2\2\u0129R\3\2\2\2\u012a\u012e\7%\2\2\u012b\u012d\n\b\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b*\2\2\u0132T\3\2\2\2\17"+
		"\2q\177\u0088\u00fc\u0109\u010e\u0114\u0116\u011c\u0121\u0126\u012e\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}