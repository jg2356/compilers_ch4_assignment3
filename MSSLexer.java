// Generated from MSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, RATOR=5, ARITHMETIC_OP=6, RELATIONAL_OP=7, 
		BOOLEAN_OP=8, BOOLEAN=9, DOUBLE=10, ID=11, NEWLINE=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "RATOR", "ARITHMETIC_OP", "RELATIONAL_OP", 
		"BOOLEAN_OP", "BOOLEAN", "DOUBLE", "ID", "NEWLINE", "WS", "DIGIT", "LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'def'", "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "RATOR", "ARITHMETIC_OP", "RELATIONAL_OP", 
		"BOOLEAN_OP", "BOOLEAN", "DOUBLE", "ID", "NEWLINE", "WS"
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


	public MSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nA\n\n\3\13\5\13D\n\13\3\13\6"+
		"\13G\n\13\r\13\16\13H\3\13\3\13\6\13M\n\13\r\13\16\13N\5\13Q\n\13\3\f"+
		"\3\f\3\f\3\f\7\fW\n\f\f\f\16\fZ\13\f\3\r\5\r]\n\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\2\37\2\3\2\7\6\2,-//\61\61``\5\2##((~"+
		"~\4\2\13\13\"\"\3\2\62;\4\2C\\c|p\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3!\3\2\2\2"+
		"\5#\3\2\2\2\7%\3\2\2\2\t)\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2"+
		"\2\21\65\3\2\2\2\23@\3\2\2\2\25C\3\2\2\2\27R\3\2\2\2\31\\\3\2\2\2\33`"+
		"\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2#$\7+\2\2$\6\3\2"+
		"\2\2%&\7f\2\2&\'\7g\2\2\'(\7h\2\2(\b\3\2\2\2)*\7k\2\2*+\7h\2\2+\n\3\2"+
		"\2\2,\60\5\r\7\2-\60\5\17\b\2.\60\5\21\t\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2"+
		"\2\60\f\3\2\2\2\61\62\t\2\2\2\62\16\3\2\2\2\63\64\4>@\2\64\20\3\2\2\2"+
		"\65\66\t\3\2\2\66\22\3\2\2\2\678\7v\2\289\7t\2\29:\7w\2\2:A\7g\2\2;<\7"+
		"h\2\2<=\7c\2\2=>\7n\2\2>?\7u\2\2?A\7g\2\2@\67\3\2\2\2@;\3\2\2\2A\24\3"+
		"\2\2\2BD\7/\2\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\35\17\2FE\3\2\2\2GH"+
		"\3\2\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\7\60\2\2KM\5\35\17\2LK\3\2\2"+
		"\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2PQ\3\2\2\2Q\26\3\2"+
		"\2\2RX\5\37\20\2SW\5\37\20\2TW\5\35\17\2UW\7a\2\2VS\3\2\2\2VT\3\2\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2ZX\3\2\2\2[]\7\17"+
		"\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_\32\3\2\2\2`a\t\4\2\2a"+
		"b\3\2\2\2bc\b\16\2\2c\34\3\2\2\2de\t\5\2\2e\36\3\2\2\2fg\t\6\2\2g \3\2"+
		"\2\2\f\2/@CHNPVX\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}