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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, MUL=14, DIV=15, MOD=16, SUMOP=17, 
		COMPARISONOP=18, DATATYPE=19, FUNCTION=20, VAR=21, PRINT=22, INPUT=23, 
		WHEN=24, IF=25, UNLESS=26, WHILE=27, REPEAT=28, RETURN=29, UNTIL=30, LOOP=31, 
		DO=32, ELSE=33, AND=34, OR=35, FOR=36, NEXT=37, BREAK=38, NOT=39, BOOL=40, 
		SUBS=41, ADD=42, END=43, NUM=44, FID=45, ID=46, ESP=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "MUL", "DIV", "MOD", "SUMOP", "COMPARISONOP", 
			"DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", "IF", "UNLESS", 
			"WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", "DO", "ELSE", "AND", "OR", 
			"FOR", "NEXT", "BREAK", "NOT", "BOOL", "SUBS", "ADD", "END", "NUM", "FID", 
			"ID", "ESP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'('", "')'", "';'", "'{'", "'}'", "':='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'*'", "'/'", "'%'", null, null, null, 
			"'function'", "'var'", "'print'", "'input'", "'when'", "'if'", "'unless'", 
			"'while'", "'repeat'", "'return'", "'until'", "'loop'", "'do'", "'else'", 
			"'and'", "'or'", "'for'", "'next'", "'break'", "'not'", null, "'--'", 
			"'++'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "MUL", "DIV", "MOD", "SUMOP", "COMPARISONOP", "DATATYPE", 
			"FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", "IF", "UNLESS", "WHILE", 
			"REPEAT", "RETURN", "UNTIL", "LOOP", "DO", "ELSE", "AND", "OR", "FOR", 
			"NEXT", "BREAK", "NOT", "BOOL", "SUBS", "ADD", "END", "NUM", "FID", "ID", 
			"ESP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0094\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u009d\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0111\n)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3,\3-\5-\u011e\n-\3-\6-\u0121\n-\r-\16-\u0122\3-\3-\6-\u0127"+
		"\n-\r-\16-\u0128\5-\u012b\n-\3.\3.\6.\u012f\n.\r.\16.\u0130\3/\6/\u0134"+
		"\n/\r/\16/\u0135\3\60\6\60\u0139\n\60\r\60\16\60\u013a\3\60\3\60\2\2\61"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\4\2--//\3\2\62;\3\2\60"+
		"\60\4\2C\\c|\5\2\13\f\17\17\"\"\2\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\t"+
		"g\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23r\3\2\2\2\25"+
		"u\3\2\2\2\27x\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0083"+
		"\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0093\3\2\2\2\'\u009c\3\2\2\2"+
		")\u009e\3\2\2\2+\u00a7\3\2\2\2-\u00ab\3\2\2\2/\u00b1\3\2\2\2\61\u00b7"+
		"\3\2\2\2\63\u00bc\3\2\2\2\65\u00bf\3\2\2\2\67\u00c6\3\2\2\29\u00cc\3\2"+
		"\2\2;\u00d3\3\2\2\2=\u00da\3\2\2\2?\u00e0\3\2\2\2A\u00e5\3\2\2\2C\u00e8"+
		"\3\2\2\2E\u00ed\3\2\2\2G\u00f1\3\2\2\2I\u00f4\3\2\2\2K\u00f8\3\2\2\2M"+
		"\u00fd\3\2\2\2O\u0103\3\2\2\2Q\u0110\3\2\2\2S\u0112\3\2\2\2U\u0115\3\2"+
		"\2\2W\u0118\3\2\2\2Y\u011d\3\2\2\2[\u012c\3\2\2\2]\u0133\3\2\2\2_\u0138"+
		"\3\2\2\2ab\7<\2\2b\4\3\2\2\2cd\7.\2\2d\6\3\2\2\2ef\7*\2\2f\b\3\2\2\2g"+
		"h\7+\2\2h\n\3\2\2\2ij\7=\2\2j\f\3\2\2\2kl\7}\2\2l\16\3\2\2\2mn\7\177\2"+
		"\2n\20\3\2\2\2op\7<\2\2pq\7?\2\2q\22\3\2\2\2rs\7-\2\2st\7?\2\2t\24\3\2"+
		"\2\2uv\7/\2\2vw\7?\2\2w\26\3\2\2\2xy\7,\2\2yz\7?\2\2z\30\3\2\2\2{|\7\61"+
		"\2\2|}\7?\2\2}\32\3\2\2\2~\177\7\'\2\2\177\u0080\7?\2\2\u0080\34\3\2\2"+
		"\2\u0081\u0082\7,\2\2\u0082\36\3\2\2\2\u0083\u0084\7\61\2\2\u0084 \3\2"+
		"\2\2\u0085\u0086\7\'\2\2\u0086\"\3\2\2\2\u0087\u0088\t\2\2\2\u0088$\3"+
		"\2\2\2\u0089\u0094\7>\2\2\u008a\u008b\7?\2\2\u008b\u0094\7?\2\2\u008c"+
		"\u008d\7>\2\2\u008d\u0094\7?\2\2\u008e\u0094\7@\2\2\u008f\u0090\7@\2\2"+
		"\u0090\u0094\7?\2\2\u0091\u0092\7#\2\2\u0092\u0094\7?\2\2\u0093\u0089"+
		"\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094&\3\2\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u009d\7o\2\2\u0098\u0099\7d\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7q\2\2\u009b\u009d\7n\2\2\u009c\u0095\3\2\2\2\u009c\u0098"+
		"\3\2\2\2\u009d(\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7x\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7t\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0.\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7r\2"+
		"\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7v\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\7y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\62\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2\2\u00be\64\3\2\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u00c4\7u\2\2\u00c4\u00c5\7u\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7"+
		"y\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7r\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		":\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7w\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7p\2\2\u00d9<\3\2\2\2\u00da"+
		"\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2"+
		"\u00de\u00df\7n\2\2\u00df>\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7q\2"+
		"\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7r\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7"+
		"f\2\2\u00e6\u00e7\7q\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7f\2\2\u00f0F\3\2\2\2\u00f1\u00f2"+
		"\7q\2\2\u00f2\u00f3\7t\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7t\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7v\2\2\u00fcL\3\2\2\2\u00fd\u00fe"+
		"\7d\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7c\2\2\u0101"+
		"\u0102\7m\2\2\u0102N\3\2\2\2\u0103\u0104\7p\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7v\2\2\u0106P\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u0111\7g\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2"+
		"\u010d\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f\u0111\7g\2\2\u0110\u0107"+
		"\3\2\2\2\u0110\u010b\3\2\2\2\u0111R\3\2\2\2\u0112\u0113\7/\2\2\u0113\u0114"+
		"\7/\2\2\u0114T\3\2\2\2\u0115\u0116\7-\2\2\u0116\u0117\7-\2\2\u0117V\3"+
		"\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b\7f\2\2\u011b"+
		"X\3\2\2\2\u011c\u011e\7/\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012a\3\2\2\2\u0124"+
		"\u0126\t\4\2\2\u0125\u0127\t\3\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0124\3\2\2\2\u012a\u012b\3\2\2\2\u012bZ\3\2\2\2\u012c\u012e\7B\2\2\u012d"+
		"\u012f\t\5\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\\\3\2\2\2\u0132\u0134\t\5\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"^\3\2\2\2\u0137\u0139\t\6\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\b\60\2\2\u013d`\3\2\2\2\r\2\u0093\u009c\u0110\u011d\u0122\u0128\u012a"+
		"\u0130\u0135\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}