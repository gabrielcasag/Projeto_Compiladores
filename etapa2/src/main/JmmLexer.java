// Generated from /home/gbrl8/Área de Trabalho/CompiladorE2/src/resources/JmmLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_LINE=1, WS=2, COMMENTS=3, PUBLIC=4, PRIVATE=5, PROTECTED=6, STATIC=7, 
		ABSTRACT=8, INT=9, CHAR=10, BOOLEAN=11, VOID=12, TRUE=13, FALSE=14, EXTENDS=15, 
		CLASS=16, IMPORT=17, PACKAGE=18, SUPER=19, THIS=20, NEW=21, RETURN=22, 
		NULL=23, IF=24, ELSE=25, WHILE=26, INSTANCEOF=27, GREATER_THAN=28, LESS_EQUAL=29, 
		EQUAL=30, AND=31, ASSIGN=32, NOT=33, ADD=34, SUB=35, MULT=36, INCREMENT=37, 
		DECREMENT=38, PLUS=39, OPEN_PARENTHESIS=40, CLOSE_PARENTHESIS=41, OPEN_BRACES=42, 
		CLOSE_BRACES=43, OPEN_BRACKETS=44, CLOSE_BRACKETS=45, SEMICOLON=46, COLON=47, 
		DOT=48, TWOPOINTS=49, ERROR=50, IDENTIFIER=51, ESC=52, INT_LITERAL=53, 
		CHAR_LITERAL=54, STRING=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEW_LINE", "WS", "COMMENTS", "LETTER", "DIGIT", "PUBLIC", "PRIVATE", 
			"PROTECTED", "STATIC", "ABSTRACT", "INT", "CHAR", "BOOLEAN", "VOID", 
			"TRUE", "FALSE", "EXTENDS", "CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", 
			"NEW", "RETURN", "NULL", "IF", "ELSE", "WHILE", "INSTANCEOF", "GREATER_THAN", 
			"LESS_EQUAL", "EQUAL", "AND", "ASSIGN", "NOT", "ADD", "SUB", "MULT", 
			"INCREMENT", "DECREMENT", "PLUS", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
			"OPEN_BRACES", "CLOSE_BRACES", "OPEN_BRACKETS", "CLOSE_BRACKETS", "SEMICOLON", 
			"COLON", "DOT", "TWOPOINTS", "ERROR", "IDENTIFIER", "ESC", "INT_LITERAL", 
			"CHAR_LITERAL", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'public'", "'private'", "'protected'", "'static'", 
			"'abstract'", "'int'", "'char'", "'boolean'", "'void'", "'true'", "'false'", 
			"'extends'", "'class'", "'import'", "'package'", "'super'", "'this'", 
			"'new'", "'return'", "'null'", "'if'", "'else'", "'while'", "'instanceof'", 
			"'>'", "'<='", "'=='", "'&&'", "'='", "'!'", "'+'", "'-'", "'*'", "'++'", 
			"'--'", "'+='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW_LINE", "WS", "COMMENTS", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "ABSTRACT", "INT", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", 
			"EXTENDS", "CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", 
			"NULL", "IF", "ELSE", "WHILE", "INSTANCEOF", "GREATER_THAN", "LESS_EQUAL", 
			"EQUAL", "AND", "ASSIGN", "NOT", "ADD", "SUB", "MULT", "INCREMENT", "DECREMENT", 
			"PLUS", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACES", "CLOSE_BRACES", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "SEMICOLON", "COLON", "DOT", "TWOPOINTS", 
			"ERROR", "IDENTIFIER", "ESC", "INT_LITERAL", "CHAR_LITERAL", "STRING"
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


	public JmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JmmLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0190\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\5\2w\n\2\3\2\3"+
		"\2\3\2\3\2\3\3\6\3~\n\3\r\3\16\3\177\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0088"+
		"\n\4\f\4\16\4\u008b\13\4\3\4\3\4\3\5\5\5\u0090\n\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65"+
		"\u0162\n\65\r\65\16\65\u0163\3\65\6\65\u0167\n\65\r\65\16\65\u0168\3\66"+
		"\3\66\5\66\u016d\n\66\3\66\3\66\3\66\7\66\u0172\n\66\f\66\16\66\u0175"+
		"\13\66\3\67\3\67\3\67\38\38\38\78\u017d\n8\f8\168\u0180\138\58\u0182\n"+
		"8\39\39\39\39\3:\3:\7:\u018a\n:\f:\16:\u018d\13:\3:\3:\3\u018b\2;\3\3"+
		"\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67"+
		"q8s9\3\2\7\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2C\\c|\4\2&&aa\n\2$$))^"+
		"^ddhhppttvv\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3v\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t"+
		"\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u009a\3\2\2\2\21\u00a2"+
		"\3\2\2\2\23\u00ac\3\2\2\2\25\u00b3\3\2\2\2\27\u00bc\3\2\2\2\31\u00c0\3"+
		"\2\2\2\33\u00c5\3\2\2\2\35\u00cd\3\2\2\2\37\u00d2\3\2\2\2!\u00d7\3\2\2"+
		"\2#\u00dd\3\2\2\2%\u00e5\3\2\2\2\'\u00eb\3\2\2\2)\u00f2\3\2\2\2+\u00fa"+
		"\3\2\2\2-\u0100\3\2\2\2/\u0105\3\2\2\2\61\u0109\3\2\2\2\63\u0110\3\2\2"+
		"\2\65\u0115\3\2\2\2\67\u0118\3\2\2\29\u011d\3\2\2\2;\u0123\3\2\2\2=\u012e"+
		"\3\2\2\2?\u0130\3\2\2\2A\u0133\3\2\2\2C\u0136\3\2\2\2E\u0139\3\2\2\2G"+
		"\u013b\3\2\2\2I\u013d\3\2\2\2K\u013f\3\2\2\2M\u0141\3\2\2\2O\u0143\3\2"+
		"\2\2Q\u0146\3\2\2\2S\u0149\3\2\2\2U\u014c\3\2\2\2W\u014e\3\2\2\2Y\u0150"+
		"\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a\u0158\3\2\2\2c"+
		"\u015a\3\2\2\2e\u015c\3\2\2\2g\u015e\3\2\2\2i\u0161\3\2\2\2k\u016c\3\2"+
		"\2\2m\u0176\3\2\2\2o\u0181\3\2\2\2q\u0183\3\2\2\2s\u0187\3\2\2\2uw\7\17"+
		"\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\f\2\2yz\3\2\2\2z{\b\2\2\2{\4\3"+
		"\2\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\b\3\2\2\u0082\6\3\2\2\2\u0083\u0084\7"+
		"\61\2\2\u0084\u0085\7\61\2\2\u0085\u0089\3\2\2\2\u0086\u0088\n\3\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\b\4\2\2\u008d"+
		"\b\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\4\62;\2\u0092\f\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7d\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099\7e\2\2"+
		"\u0099\16\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7"+
		"k\2\2\u009d\u009e\7x\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7f\2\2\u00ab\22\3\2\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\u00b1\7k\2\2\u00b1\u00b2\7e\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7"+
		"c\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\26\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\30\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7"+
		"q\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7f\2\2\u00d1\36\3\2\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		" \3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7z\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7p\2\2"+
		"\u00e2\u00e3\7f\2\2\u00e3\u00e4\7u\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7e\2"+
		"\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea"+
		"\7u\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee"+
		"\7r\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"(\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7e\2\2\u00f5"+
		"\u00f6\7m\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7i\2\2\u00f8\u00f9\7g\2\2"+
		"\u00f9*\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7r\2"+
		"\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ff,\3\2\2\2\u0100\u0101\7"+
		"v\2\2\u0101\u0102\7j\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104."+
		"\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7g\2\2\u0107\u0108\7y\2\2\u0108"+
		"\60\3\2\2\2\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7w\2\2\u010d\u010e\7t\2\2\u010e\u010f\7p\2\2\u010f\62\3\2\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7w\2\2\u0112\u0113\7n\2\2\u0113\u0114\7n\2\2"+
		"\u0114\64\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7h\2\2\u0117\66\3\2\2"+
		"\2\u0118\u0119\7g\2\2\u0119\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011c"+
		"\7g\2\2\u011c8\3\2\2\2\u011d\u011e\7y\2\2\u011e\u011f\7j\2\2\u011f\u0120"+
		"\7k\2\2\u0120\u0121\7n\2\2\u0121\u0122\7g\2\2\u0122:\3\2\2\2\u0123\u0124"+
		"\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7u\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7c\2\2\u0128\u0129\7p\2\2\u0129\u012a\7e\2\2\u012a\u012b\7g\2\2"+
		"\u012b\u012c\7q\2\2\u012c\u012d\7h\2\2\u012d<\3\2\2\2\u012e\u012f\7@\2"+
		"\2\u012f>\3\2\2\2\u0130\u0131\7>\2\2\u0131\u0132\7?\2\2\u0132@\3\2\2\2"+
		"\u0133\u0134\7?\2\2\u0134\u0135\7?\2\2\u0135B\3\2\2\2\u0136\u0137\7(\2"+
		"\2\u0137\u0138\7(\2\2\u0138D\3\2\2\2\u0139\u013a\7?\2\2\u013aF\3\2\2\2"+
		"\u013b\u013c\7#\2\2\u013cH\3\2\2\2\u013d\u013e\7-\2\2\u013eJ\3\2\2\2\u013f"+
		"\u0140\7/\2\2\u0140L\3\2\2\2\u0141\u0142\7,\2\2\u0142N\3\2\2\2\u0143\u0144"+
		"\7-\2\2\u0144\u0145\7-\2\2\u0145P\3\2\2\2\u0146\u0147\7/\2\2\u0147\u0148"+
		"\7/\2\2\u0148R\3\2\2\2\u0149\u014a\7-\2\2\u014a\u014b\7?\2\2\u014bT\3"+
		"\2\2\2\u014c\u014d\7*\2\2\u014dV\3\2\2\2\u014e\u014f\7+\2\2\u014fX\3\2"+
		"\2\2\u0150\u0151\7}\2\2\u0151Z\3\2\2\2\u0152\u0153\7\177\2\2\u0153\\\3"+
		"\2\2\2\u0154\u0155\7]\2\2\u0155^\3\2\2\2\u0156\u0157\7_\2\2\u0157`\3\2"+
		"\2\2\u0158\u0159\7=\2\2\u0159b\3\2\2\2\u015a\u015b\7.\2\2\u015bd\3\2\2"+
		"\2\u015c\u015d\7\60\2\2\u015df\3\2\2\2\u015e\u015f\7<\2\2\u015fh\3\2\2"+
		"\2\u0160\u0162\5\13\6\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5k"+
		"\66\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169j\3\2\2\2\u016a\u016d\5\t\5\2\u016b\u016d\t\5\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0173\3\2\2\2\u016e\u0172"+
		"\5\t\5\2\u016f\u0172\5\13\6\2\u0170\u0172\t\5\2\2\u0171\u016e\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174l\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7^\2\2\u0177\u0178\t\6\2\2\u0178n\3\2\2\2\u0179\u0182\7\62\2\2"+
		"\u017a\u017e\4\63;\2\u017b\u017d\5\13\6\2\u017c\u017b\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017a\3\2\2\2\u0182p\3\2\2\2"+
		"\u0183\u0184\7)\2\2\u0184\u0185\13\2\2\2\u0185\u0186\7)\2\2\u0186r\3\2"+
		"\2\2\u0187\u018b\7$\2\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7$\2\2\u018ft\3\2\2\2\17\2v\177\u0089"+
		"\u008f\u0163\u0168\u016c\u0171\u0173\u017e\u0181\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}