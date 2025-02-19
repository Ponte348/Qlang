// Generated from /home/ponte/Uni/qlang-q05/Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, Integer=14, CompareOperator=15, String=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ID", "Integer", "CompareOperator", "String", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'write '", "','", "'writeln '", "'if '", "'then'", 
			"'end;'", "'else'", "'--'", "'\\n'", "'pass;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "Integer", "CompareOperator", "String", "WS"
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


	public PilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pil.g4"; }

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
		"\u0004\u0000\u0011~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\fZ\b\f\u000b\f\f\f[\u0001\r\u0004\r_\b\r\u000b\r\f\r`\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000em\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0005\u000fq\b\u000f\n\u000f\f\u000ft\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010y\b\u0010\u000b\u0010\f\u0010z\u0001"+
		"\u0010\u0001\u0010\u0001r\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0086"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005(\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t"+
		"1\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000"+
		"\u0013M\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017R"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b^\u0001\u0000"+
		"\u0000\u0000\u001dl\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000"+
		"!x\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005:\u0000\u0000&\'\u0005=\u0000\u0000\'\u0004\u0001\u0000"+
		"\u0000\u0000()\u0005w\u0000\u0000)*\u0005r\u0000\u0000*+\u0005i\u0000"+
		"\u0000+,\u0005t\u0000\u0000,-\u0005e\u0000\u0000-.\u0005 \u0000\u0000"+
		".\u0006\u0001\u0000\u0000\u0000/0\u0005,\u0000\u00000\b\u0001\u0000\u0000"+
		"\u000012\u0005w\u0000\u000023\u0005r\u0000\u000034\u0005i\u0000\u0000"+
		"45\u0005t\u0000\u000056\u0005e\u0000\u000067\u0005l\u0000\u000078\u0005"+
		"n\u0000\u000089\u0005 \u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005"+
		"i\u0000\u0000;<\u0005f\u0000\u0000<=\u0005 \u0000\u0000=\f\u0001\u0000"+
		"\u0000\u0000>?\u0005t\u0000\u0000?@\u0005h\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005n\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005e\u0000"+
		"\u0000DE\u0005n\u0000\u0000EF\u0005d\u0000\u0000FG\u0005;\u0000\u0000"+
		"G\u0010\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005l\u0000\u0000"+
		"JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\u0012\u0001\u0000\u0000\u0000"+
		"MN\u0005-\u0000\u0000NO\u0005-\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005\n\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005p\u0000\u0000"+
		"ST\u0005a\u0000\u0000TU\u0005s\u0000\u0000UV\u0005s\u0000\u0000VW\u0005"+
		";\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XZ\u0007\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u001a\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u001c\u0001\u0000"+
		"\u0000\u0000bc\u0005=\u0000\u0000cm\u0005=\u0000\u0000de\u0005!\u0000"+
		"\u0000em\u0005=\u0000\u0000fm\u0005<\u0000\u0000gh\u0005<\u0000\u0000"+
		"hm\u0005=\u0000\u0000im\u0005>\u0000\u0000jk\u0005>\u0000\u0000km\u0005"+
		"=\u0000\u0000lb\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000lf\u0001"+
		"\u0000\u0000\u0000lg\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000m\u001e\u0001\u0000\u0000\u0000nr\u0005\"\u0000"+
		"\u0000oq\t\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v \u0001\u0000"+
		"\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0006\u0010\u0000\u0000}\"\u0001\u0000\u0000"+
		"\u0000\u0006\u0000[`lrz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}