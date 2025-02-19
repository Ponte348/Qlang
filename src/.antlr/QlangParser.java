// Generated from /home/tomas/C/Aula03/qlang-q05/src/Qlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, STARTPIL=59, 
		FINISHPIL=60, PIL=61, STRING=62, ID=63, BOOLEAN=64, NUMBER=65, SKIPPING=66, 
		NEWterm=67, BLOCKCOMMENT=68, SINGLECOMMENT=69;
	public static final int
		RULE_statList = 0, RULE_statementComposition = 1, RULE_statements = 2, 
		RULE_question = 3, RULE_code = 4, RULE_simpleCode = 5, RULE_questionHole = 6, 
		RULE_questionOpen = 7, RULE_questionCodeHole = 8, RULE_questionCodeOpen = 9, 
		RULE_questionColeOutput = 10, RULE_questionMultiChoice = 11, RULE_questionComposed = 12, 
		RULE_commandComposition = 13, RULE_assignment = 14, RULE_term = 15, RULE_command = 16, 
		RULE_variableDeclaration = 17, RULE_ifLineSentence = 18, RULE_ifBlock = 19, 
		RULE_elseifBlock = 20, RULE_elseBlock = 21, RULE_execution = 22, RULE_export = 23, 
		RULE_exportedlocation = 24, RULE_codeholeComposition = 25, RULE_codehole = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"statList", "statementComposition", "statements", "question", "code", 
			"simpleCode", "questionHole", "questionOpen", "questionCodeHole", "questionCodeOpen", 
			"questionColeOutput", "questionMultiChoice", "questionComposed", "commandComposition", 
			"assignment", "term", "command", "variableDeclaration", "ifLineSentence", 
			"ifBlock", "elseifBlock", "elseBlock", "execution", "export", "exportedlocation", 
			"codeholeComposition", "codehole"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'code'", "'is'", "'end'", "'println'", "'text('", "')'", 
			"'print'", "'hole'", "'->'", "'open'", "'code-hole'", "'code-open'", 
			"'code-output'", "'multi-choice'", "'composed'", "':='", "'new'", "'('", 
			"'|'", "'-'", "'+'", "'not'", "'*'", "':'", "'%'", "'='", "'>='", "'<='", 
			"'>'", "'<'", "'/='", "'and'", "'or'", "'xor'", "'implies'", "'and then'", 
			"'or else'", "'/'", "'read'", "'integer'", "'real'", "'text'", "'question'", 
			"'fraction'", "'|program'", "'uses code from '", "'uses code '", "'choice'", 
			"','", "'if'", "'then'", "'elseif'", "'else'", "'execute'", "'export'", 
			"'to'", "'line'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STARTPIL", 
			"FINISHPIL", "PIL", "STRING", "ID", "BOOLEAN", "NUMBER", "SKIPPING", 
			"NEWterm", "BLOCKCOMMENT", "SINGLECOMMENT"
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

	@Override
	public String getGrammarFileName() { return "Qlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatListContext extends ParserRuleContext {
		public StatementCompositionContext statementComposition() {
			return getRuleContext(StatementCompositionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QlangParser.EOF, 0); }
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			statementComposition();
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementCompositionContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementCompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementComposition; }
	}

	public final StatementCompositionContext statementComposition() throws RecognitionException {
		StatementCompositionContext _localctx = new StatementCompositionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementComposition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					statements();
					setState(58);
					match(T__0);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			{
			setState(65);
			statements();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(66);
				match(T__0);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeOrderContext extends StatementsContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationOrderContext extends StatementsContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOrderContext extends StatementsContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionOrderContext extends StatementsContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public QuestionOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportOrderContext extends StatementsContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ExportOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCodeOrderContext extends StatementsContext {
		public SimpleCodeContext simpleCode() {
			return getRuleContext(SimpleCodeContext.class,0);
		}
		public SimpleCodeOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionOrderContext extends StatementsContext {
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExecutionOrderContext(StatementsContext ctx) { copyFrom(ctx); }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new QuestionOrderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				question();
				}
				break;
			case 2:
				_localctx = new DeclarationOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				variableDeclaration();
				}
				break;
			case 3:
				_localctx = new AssignmentOrderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				assignment();
				}
				break;
			case 4:
				_localctx = new ExecutionOrderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				execution();
				}
				break;
			case 5:
				_localctx = new ExportOrderContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				export();
				}
				break;
			case 6:
				_localctx = new CodeOrderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				code();
				}
				break;
			case 7:
				_localctx = new SimpleCodeOrderContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				simpleCode();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	 
		public QuestionContext() { }
		public void copyFrom(QuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HoleContext extends QuestionContext {
		public QuestionHoleContext questionHole() {
			return getRuleContext(QuestionHoleContext.class,0);
		}
		public HoleContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeHoleContext extends QuestionContext {
		public QuestionCodeHoleContext questionCodeHole() {
			return getRuleContext(QuestionCodeHoleContext.class,0);
		}
		public CodeHoleContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComposedContext extends QuestionContext {
		public QuestionComposedContext questionComposed() {
			return getRuleContext(QuestionComposedContext.class,0);
		}
		public ComposedContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeOpenContext extends QuestionContext {
		public QuestionCodeOpenContext questionCodeOpen() {
			return getRuleContext(QuestionCodeOpenContext.class,0);
		}
		public CodeOpenContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultichoiceContext extends QuestionContext {
		public QuestionMultiChoiceContext questionMultiChoice() {
			return getRuleContext(QuestionMultiChoiceContext.class,0);
		}
		public MultichoiceContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColeOutputContext extends QuestionContext {
		public QuestionColeOutputContext questionColeOutput() {
			return getRuleContext(QuestionColeOutputContext.class,0);
		}
		public ColeOutputContext(QuestionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenContext extends QuestionContext {
		public QuestionOpenContext questionOpen() {
			return getRuleContext(QuestionOpenContext.class,0);
		}
		public OpenContext(QuestionContext ctx) { copyFrom(ctx); }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new HoleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				questionHole();
				}
				break;
			case T__10:
				_localctx = new OpenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				questionOpen();
				}
				break;
			case T__11:
				_localctx = new CodeHoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				questionCodeHole();
				}
				break;
			case T__12:
				_localctx = new CodeOpenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				questionCodeOpen();
				}
				break;
			case T__13:
				_localctx = new ColeOutputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				questionColeOutput();
				}
				break;
			case T__14:
				_localctx = new MultichoiceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				questionMultiChoice();
				}
				break;
			case T__15:
				_localctx = new ComposedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				questionComposed();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public List<TerminalNode> PIL() { return getTokens(QlangParser.PIL); }
		public TerminalNode PIL(int i) {
			return getToken(QlangParser.PIL, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			match(ID);
			setState(89);
			match(T__2);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				match(PIL);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(91);
					assignment();
					}
				}

				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIL );
			setState(98);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCodeContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(QlangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QlangParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(QlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QlangParser.ID, i);
		}
		public SimpleCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCode; }
	}

	public final SimpleCodeContext simpleCode() throws RecognitionException {
		SimpleCodeContext _localctx = new SimpleCodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleCode);
		try {
			int _alt;
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__4);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(106);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING:
							{
							setState(101);
							match(STRING);
							}
							break;
						case ID:
							{
							setState(102);
							match(ID);
							}
							break;
						case T__5:
							{
							{
							setState(103);
							match(T__5);
							setState(104);
							match(ID);
							setState(105);
							match(T__6);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__7);
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(117);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING:
							{
							setState(112);
							match(STRING);
							}
							break;
						case ID:
							{
							setState(113);
							match(ID);
							}
							break;
						case T__5:
							{
							{
							setState(114);
							match(T__5);
							setState(115);
							match(ID);
							setState(116);
							match(T__6);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionHoleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QlangParser.ID, i);
		}
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(QlangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QlangParser.STRING, i);
		}
		public QuestionHoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionHole; }
	}

	public final QuestionHoleContext questionHole() throws RecognitionException {
		QuestionHoleContext _localctx = new QuestionHoleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questionHole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(125);
			match(ID);
			setState(126);
			match(T__2);
			setState(127);
			commandComposition();
			setState(128);
			match(ID);
			setState(129);
			match(T__9);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(130);
				match(STRING);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionOpenContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionOpen; }
	}

	public final QuestionOpenContext questionOpen() throws RecognitionException {
		QuestionOpenContext _localctx = new QuestionOpenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_questionOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__10);
			setState(139);
			match(ID);
			setState(140);
			match(T__2);
			setState(141);
			commandComposition();
			setState(142);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionCodeHoleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionCodeHoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionCodeHole; }
	}

	public final QuestionCodeHoleContext questionCodeHole() throws RecognitionException {
		QuestionCodeHoleContext _localctx = new QuestionCodeHoleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionCodeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__11);
			setState(145);
			match(ID);
			setState(146);
			match(T__2);
			setState(147);
			commandComposition();
			setState(148);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionCodeOpenContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionCodeOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionCodeOpen; }
	}

	public final QuestionCodeOpenContext questionCodeOpen() throws RecognitionException {
		QuestionCodeOpenContext _localctx = new QuestionCodeOpenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questionCodeOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__12);
			setState(151);
			match(ID);
			setState(152);
			match(T__2);
			setState(153);
			commandComposition();
			setState(154);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionColeOutputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionColeOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionColeOutput; }
	}

	public final QuestionColeOutputContext questionColeOutput() throws RecognitionException {
		QuestionColeOutputContext _localctx = new QuestionColeOutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_questionColeOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__13);
			setState(157);
			match(ID);
			setState(158);
			match(T__2);
			setState(159);
			commandComposition();
			setState(160);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionMultiChoiceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionMultiChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionMultiChoice; }
	}

	public final QuestionMultiChoiceContext questionMultiChoice() throws RecognitionException {
		QuestionMultiChoiceContext _localctx = new QuestionMultiChoiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_questionMultiChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__14);
			setState(163);
			match(ID);
			setState(164);
			match(T__2);
			setState(165);
			commandComposition();
			setState(166);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionComposedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CommandCompositionContext commandComposition() {
			return getRuleContext(CommandCompositionContext.class,0);
		}
		public QuestionComposedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionComposed; }
	}

	public final QuestionComposedContext questionComposed() throws RecognitionException {
		QuestionComposedContext _localctx = new QuestionComposedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_questionComposed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__15);
			setState(169);
			match(ID);
			setState(170);
			match(T__2);
			setState(171);
			commandComposition();
			setState(172);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandCompositionContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandCompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandComposition; }
	}

	public final CommandCompositionContext commandComposition() throws RecognitionException {
		CommandCompositionContext _localctx = new CommandCompositionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commandComposition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					command();
					setState(175);
					match(T__0);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			{
			setState(182);
			command();
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(183);
				match(T__0);
				}
			}

			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadAssignmentContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(QlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QlangParser.ID, i);
		}
		public ReadAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IDAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HoleQuestionAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public HoleQuestionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IDAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__16);
				setState(188);
				term(0);
				}
				break;
			case 2:
				_localctx = new ReadAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__16);
				setState(191);
				match(T__17);
				setState(192);
				match(ID);
				}
				break;
			case 3:
				_localctx = new HoleQuestionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(ID);
				setState(194);
				match(T__9);
				setState(195);
				term(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Type eType;
		public String varName;
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadTermContext extends TermContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public ReadTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultDivModContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermMultDivModContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FractionContext extends TermContext {
		public List<TerminalNode> NUMBER() { return getTokens(QlangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QlangParser.NUMBER, i);
		}
		public FractionContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTermContext extends TermContext {
		public Token type;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TypeTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StdouttermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public StdouttermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermBinaryLogicalContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermBinaryLogicalContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDTermContext extends TermContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public IDTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionTermContext extends TermContext {
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExecutionTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermAddMinusContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermAddMinusContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextTermContext extends TermContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public TextTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryTermContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermBinaryRelationalContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermBinaryRelationalContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesistermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ParenthesistermContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				_localctx = new ParenthesistermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				match(T__18);
				setState(200);
				term(0);
				setState(201);
				match(T__6);
				}
				break;
			case T__20:
			case T__21:
			case T__22:
				{
				_localctx = new UnaryTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				((UnaryTermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
					((UnaryTermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				term(11);
				}
				break;
			case NUMBER:
				{
				_localctx = new FractionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(NUMBER);
				{
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(206);
					match(T__38);
					setState(207);
					match(NUMBER);
					}
					break;
				}
				}
				}
				break;
			case ID:
				{
				_localctx = new IDTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new TextTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(STRING);
				}
				break;
			case T__39:
				{
				_localctx = new ReadTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__39);
				setState(213);
				match(STRING);
				}
				break;
			case T__1:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
				{
				_localctx = new TypeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				((TypeTermContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68169720922116L) != 0)) ) {
					((TypeTermContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				match(T__18);
				setState(216);
				term(0);
				setState(217);
				match(T__6);
				}
				break;
			case T__54:
				{
				_localctx = new ExecutionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				execution();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new StdouttermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(222);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(223);
						match(T__19);
						setState(224);
						term(13);
						}
						break;
					case 2:
						{
						_localctx = new TermMultDivModContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(225);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(226);
						((TermMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
							((TermMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						term(11);
						}
						break;
					case 3:
						{
						_localctx = new TermAddMinusContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(228);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(229);
						((TermAddMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((TermAddMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						term(10);
						}
						break;
					case 4:
						{
						_localctx = new TermBinaryRelationalContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(231);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(232);
						((TermBinaryRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
							((TermBinaryRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						term(9);
						}
						break;
					case 5:
						{
						_localctx = new TermBinaryLogicalContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						((TermBinaryLogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
							((TermBinaryLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						term(8);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionSentenceContext extends CommandContext {
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExecutionSentenceContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsesCodePilContext extends CommandContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public CodeholeCompositionContext codeholeComposition() {
			return getRuleContext(CodeholeCompositionContext.class,0);
		}
		public UsesCodePilContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintSentenceContext extends CommandContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public PrintSentenceContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceSentenceContext extends CommandContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ChoiceSentenceContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentCommandContext extends CommandContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsesCodeSentenceContext extends CommandContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public CodeholeCompositionContext codeholeComposition() {
			return getRuleContext(CodeholeCompositionContext.class,0);
		}
		public UsesCodeSentenceContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationCommandContext extends CommandContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrinttermSentenceContext extends CommandContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public PrinttermSentenceContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfLineContext extends CommandContext {
		public IfLineSentenceContext ifLineSentence() {
			return getRuleContext(IfLineSentenceContext.class,0);
		}
		public IfLineContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_command);
		int _la;
		try {
			int _alt;
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new PrintSentenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__7);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(245);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(243);
							assignment();
							}
							break;
						case 2:
							{
							setState(244);
							term(0);
							}
							break;
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new PrinttermSentenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__4);
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(251);
							assignment();
							}
							break;
						case 2:
							{
							setState(252);
							term(0);
							}
							break;
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__45) {
							{
							setState(255);
							match(T__45);
							}
						}

						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new UsesCodeSentenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(T__46);
				setState(264);
				match(STRING);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) {
					{
					setState(265);
					codeholeComposition();
					}
				}

				setState(268);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new UsesCodePilContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(T__47);
				setState(270);
				match(ID);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) {
					{
					setState(271);
					codeholeComposition();
					}
				}

				setState(274);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new ChoiceSentenceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				match(T__48);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(276);
					term(0);
					setState(277);
					match(T__49);
					}
					break;
				}
				setState(281);
				match(STRING);
				setState(282);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new ExecutionSentenceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				execution();
				}
				break;
			case 7:
				_localctx = new AssignmentCommandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				assignment();
				}
				break;
			case 8:
				_localctx = new DeclarationCommandContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				variableDeclaration();
				}
				break;
			case 9:
				_localctx = new IfLineContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				ifLineSentence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
			setState(290);
			match(T__24);
			setState(291);
			((VariableDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68169720922116L) != 0)) ) {
				((VariableDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfLineSentenceContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElseifBlockContext> elseifBlock() {
			return getRuleContexts(ElseifBlockContext.class);
		}
		public ElseifBlockContext elseifBlock(int i) {
			return getRuleContext(ElseifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfLineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLineSentence; }
	}

	public final IfLineSentenceContext ifLineSentence() throws RecognitionException {
		IfLineSentenceContext _localctx = new IfLineSentenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifLineSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			ifBlock();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(294);
				elseifBlock();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(300);
				elseBlock();
				}
			}

			setState(303);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__50);
			setState(306);
			term(0);
			setState(307);
			match(T__51);
			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(308);
				statements();
				}
				}
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9115285645797754076L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifBlockContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifBlock; }
	}

	public final ElseifBlockContext elseifBlock() throws RecognitionException {
		ElseifBlockContext _localctx = new ElseifBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__52);
			setState(314);
			term(0);
			setState(315);
			match(T__51);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				statements();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9115285645797754076L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__53);
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				statements();
				}
				}
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9115285645797754076L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionContext extends ParserRuleContext {
		public Type eType;
		public String varName;
		public Token new_;
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_execution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__54);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(328);
				term(0);
				setState(329);
				match(T__49);
				}
				break;
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(333);
				((ExecutionContext)_localctx).new_ = match(T__17);
				}
			}

			setState(336);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public ExportedlocationContext exportedlocation() {
			return getRuleContext(ExportedlocationContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__55);
			setState(339);
			match(ID);
			setState(340);
			match(T__56);
			setState(341);
			exportedlocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportedlocationContext extends ParserRuleContext {
		public Type eType;
		public String varName;
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public ExportedlocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportedlocation; }
	}

	public final ExportedlocationContext exportedlocation() throws RecognitionException {
		ExportedlocationContext _localctx = new ExportedlocationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exportedlocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeholeCompositionContext extends ParserRuleContext {
		public List<CodeholeContext> codehole() {
			return getRuleContexts(CodeholeContext.class);
		}
		public CodeholeContext codehole(int i) {
			return getRuleContext(CodeholeContext.class,i);
		}
		public CodeholeCompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeholeComposition; }
	}

	public final CodeholeCompositionContext codeholeComposition() throws RecognitionException {
		CodeholeCompositionContext _localctx = new CodeholeCompositionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_codeholeComposition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					codehole();
					setState(346);
					match(T__0);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(353);
				codehole();
				}
				break;
			case 2:
				{
				{
				setState(354);
				codehole();
				setState(355);
				match(T__0);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeholeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(QlangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QlangParser.NUMBER, i);
		}
		public CodeholeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codehole; }
	}

	public final CodeholeContext codehole() throws RecognitionException {
		CodeholeContext _localctx = new CodeholeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_codehole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(359);
				match(NUMBER);
				setState(360);
				match(T__49);
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(363);
				match(NUMBER);
				setState(364);
				match(T__49);
				}
			}

			setState(367);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(368);
				match(T__57);
				setState(369);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u0175\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001"+
		"\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"]\b\u0004\u0004\u0004_\b\u0004\u000b\u0004\f\u0004`\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005v\b"+
		"\u0005\n\u0005\f\u0005y\t\u0005\u0003\u0005{\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0084\b\u0006\n\u0006\f\u0006\u0087\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00b2\b\r\n\r\f\r\u00b5\t\r\u0001\r\u0001\r\u0003\r\u00b9\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c5\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00dd\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ee\b\u000f\n\u000f"+
		"\f\u000f\u00f1\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00f6\b\u0010\n\u0010\f\u0010\u00f9\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00fe\b\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010"+
		"\u0005\u0010\u0103\b\u0010\n\u0010\f\u0010\u0106\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u010b\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0111\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0118\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0128\b\u0012\n\u0012\f\u0012\u012b\t\u0012\u0001\u0012"+
		"\u0003\u0012\u012e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u0136\b\u0013\u000b\u0013\f\u0013"+
		"\u0137\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u013e"+
		"\b\u0014\u000b\u0014\f\u0014\u013f\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u0144\b\u0015\u000b\u0015\f\u0015\u0145\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u014c\b\u0016\u0001\u0016\u0003\u0016\u014f"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u015d\b\u0019\n\u0019\f\u0019\u0160\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0166\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u016a\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u016e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0173\b"+
		"\u001a\u0001\u001a\u0000\u0001\u001e\u001b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000"+
		"\u0007\u0001\u0000\u0015\u0017\u0002\u0000\u0002\u0002)-\u0001\u0000\u0018"+
		"\u001a\u0001\u0000\u0015\u0016\u0001\u0000\u001b \u0001\u0000!&\u0001"+
		"\u0000>?\u019e\u00006\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000"+
		"\u0000\u0004L\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f|\u0001\u0000\u0000"+
		"\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u0090\u0001\u0000\u0000"+
		"\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000"+
		"\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000"+
		"\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000"+
		"\u0000\u001e\u00dc\u0001\u0000\u0000\u0000 \u011f\u0001\u0000\u0000\u0000"+
		"\"\u0121\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000&\u0131"+
		"\u0001\u0000\u0000\u0000(\u0139\u0001\u0000\u0000\u0000*\u0141\u0001\u0000"+
		"\u0000\u0000,\u0147\u0001\u0000\u0000\u0000.\u0152\u0001\u0000\u0000\u0000"+
		"0\u0157\u0001\u0000\u0000\u00002\u015e\u0001\u0000\u0000\u00004\u0169"+
		"\u0001\u0000\u0000\u000067\u0003\u0002\u0001\u000078\u0005\u0000\u0000"+
		"\u00018\u0001\u0001\u0000\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005"+
		"\u0001\u0000\u0000;=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0003\u0004"+
		"\u0002\u0000BD\u0005\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EM\u0003\u0006\u0003"+
		"\u0000FM\u0003\"\u0011\u0000GM\u0003\u001c\u000e\u0000HM\u0003,\u0016"+
		"\u0000IM\u0003.\u0017\u0000JM\u0003\b\u0004\u0000KM\u0003\n\u0005\u0000"+
		"LE\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000"+
		"NV\u0003\f\u0006\u0000OV\u0003\u000e\u0007\u0000PV\u0003\u0010\b\u0000"+
		"QV\u0003\u0012\t\u0000RV\u0003\u0014\n\u0000SV\u0003\u0016\u000b\u0000"+
		"TV\u0003\u0018\f\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000"+
		"UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0007\u0001"+
		"\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0005?\u0000\u0000Y^\u0005"+
		"\u0003\u0000\u0000Z\\\u0005=\u0000\u0000[]\u0003\u001c\u000e\u0000\\["+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^Z\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0004\u0000\u0000c\t\u0001\u0000\u0000\u0000dl\u0005\u0005\u0000\u0000"+
		"ek\u0005>\u0000\u0000fk\u0005?\u0000\u0000gh\u0005\u0006\u0000\u0000h"+
		"i\u0005?\u0000\u0000ik\u0005\u0007\u0000\u0000je\u0001\u0000\u0000\u0000"+
		"jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m{\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000ow\u0005\b\u0000\u0000pv\u0005>"+
		"\u0000\u0000qv\u0005?\u0000\u0000rs\u0005\u0006\u0000\u0000st\u0005?\u0000"+
		"\u0000tv\u0005\u0007\u0000\u0000up\u0001\u0000\u0000\u0000uq\u0001\u0000"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000zd\u0001\u0000\u0000\u0000zo\u0001\u0000\u0000"+
		"\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0005\t\u0000\u0000}~\u0005?\u0000"+
		"\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0003\u001a\r\u0000"+
		"\u0080\u0081\u0005?\u0000\u0000\u0081\u0085\u0005\n\u0000\u0000\u0082"+
		"\u0084\u0005>\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\r\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0005"+
		"?\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003\u001a"+
		"\r\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u000f\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0092\u0005?\u0000\u0000"+
		"\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094"+
		"\u0095\u0005\u0004\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\r\u0000\u0000\u0097\u0098\u0005?\u0000\u0000\u0098\u0099"+
		"\u0005\u0003\u0000\u0000\u0099\u009a\u0003\u001a\r\u0000\u009a\u009b\u0005"+
		"\u0004\u0000\u0000\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u000e\u0000\u0000\u009d\u009e\u0005?\u0000\u0000\u009e\u009f\u0005\u0003"+
		"\u0000\u0000\u009f\u00a0\u0003\u001a\r\u0000\u00a0\u00a1\u0005\u0004\u0000"+
		"\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000f\u0000"+
		"\u0000\u00a3\u00a4\u0005?\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7"+
		"\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9"+
		"\u00aa\u0005?\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac"+
		"\u0003\u001a\r\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad\u0019\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0003 \u0010\u0000\u00af\u00b0\u0005\u0001"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003 \u0010"+
		"\u0000\u00b7\u00b9\u0005\u0001\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001b\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005?\u0000\u0000\u00bb\u00bc\u0005\u0011\u0000\u0000"+
		"\u00bc\u00c5\u0003\u001e\u000f\u0000\u00bd\u00be\u0005?\u0000\u0000\u00be"+
		"\u00bf\u0005\u0011\u0000\u0000\u00bf\u00c0\u0005\u0012\u0000\u0000\u00c0"+
		"\u00c5\u0005?\u0000\u0000\u00c1\u00c2\u0005?\u0000\u0000\u00c2\u00c3\u0005"+
		"\n\u0000\u0000\u00c3\u00c5\u0003\u001e\u000f\u0000\u00c4\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c5\u001d\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\u000f"+
		"\uffff\uffff\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000\u00c8\u00c9\u0003"+
		"\u001e\u000f\u0000\u00c9\u00ca\u0005\u0007\u0000\u0000\u00ca\u00dd\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc\u00dd\u0003"+
		"\u001e\u000f\u000b\u00cd\u00d0\u0005A\u0000\u0000\u00ce\u00cf\u0005\'"+
		"\u0000\u0000\u00cf\u00d1\u0005A\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00dd\u0001\u0000\u0000"+
		"\u0000\u00d2\u00dd\u0005?\u0000\u0000\u00d3\u00dd\u0005>\u0000\u0000\u00d4"+
		"\u00d5\u0005(\u0000\u0000\u00d5\u00dd\u0005>\u0000\u0000\u00d6\u00d7\u0007"+
		"\u0001\u0000\u0000\u00d7\u00d8\u0005\u0013\u0000\u0000\u00d8\u00d9\u0003"+
		"\u001e\u000f\u0000\u00d9\u00da\u0005\u0007\u0000\u0000\u00da\u00dd\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0003,\u0016\u0000\u00dc\u00c6\u0001\u0000"+
		"\u0000\u0000\u00dc\u00cb\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000"+
		"\u0000\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00d6\u0001\u0000"+
		"\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00ef\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\n\f\u0000\u0000\u00df\u00e0\u0005\u0014\u0000"+
		"\u0000\u00e0\u00ee\u0003\u001e\u000f\r\u00e1\u00e2\n\n\u0000\u0000\u00e2"+
		"\u00e3\u0007\u0002\u0000\u0000\u00e3\u00ee\u0003\u001e\u000f\u000b\u00e4"+
		"\u00e5\n\t\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000\u0000\u00e6\u00ee"+
		"\u0003\u001e\u000f\n\u00e7\u00e8\n\b\u0000\u0000\u00e8\u00e9\u0007\u0004"+
		"\u0000\u0000\u00e9\u00ee\u0003\u001e\u000f\t\u00ea\u00eb\n\u0007\u0000"+
		"\u0000\u00eb\u00ec\u0007\u0005\u0000\u0000\u00ec\u00ee\u0003\u001e\u000f"+
		"\b\u00ed\u00de\u0001\u0000\u0000\u0000\u00ed\u00e1\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u001f\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f7\u0005\b\u0000\u0000\u00f3\u00f6\u0003\u001c\u000e\u0000\u00f4"+
		"\u00f6\u0003\u001e\u000f\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u0120\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u0104\u0005\u0005\u0000\u0000\u00fb\u00fe\u0003\u001c\u000e\u0000\u00fc"+
		"\u00fe\u0003\u001e\u000f\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0005.\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00fd"+
		"\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0120"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0005/\u0000\u0000\u0108\u010a\u0005>\u0000\u0000\u0109\u010b\u00032"+
		"\u0019\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0120\u0005\u0004"+
		"\u0000\u0000\u010d\u010e\u00050\u0000\u0000\u010e\u0110\u0005?\u0000\u0000"+
		"\u010f\u0111\u00032\u0019\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0120\u0005\u0004\u0000\u0000\u0113\u0117\u00051\u0000\u0000\u0114\u0115"+
		"\u0003\u001e\u000f\u0000\u0115\u0116\u00052\u0000\u0000\u0116\u0118\u0001"+
		"\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		">\u0000\u0000\u011a\u0120\u0005\u0004\u0000\u0000\u011b\u0120\u0003,\u0016"+
		"\u0000\u011c\u0120\u0003\u001c\u000e\u0000\u011d\u0120\u0003\"\u0011\u0000"+
		"\u011e\u0120\u0003$\u0012\u0000\u011f\u00f2\u0001\u0000\u0000\u0000\u011f"+
		"\u00fa\u0001\u0000\u0000\u0000\u011f\u0107\u0001\u0000\u0000\u0000\u011f"+
		"\u010d\u0001\u0000\u0000\u0000\u011f\u0113\u0001\u0000\u0000\u0000\u011f"+
		"\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"!\u0001\u0000\u0000\u0000\u0121\u0122\u0005?\u0000\u0000\u0122\u0123\u0005"+
		"\u0019\u0000\u0000\u0123\u0124\u0007\u0001\u0000\u0000\u0124#\u0001\u0000"+
		"\u0000\u0000\u0125\u0129\u0003&\u0013\u0000\u0126\u0128\u0003(\u0014\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0003*\u0015\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005\u0004\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u00053\u0000\u0000\u0132\u0133\u0003\u001e\u000f\u0000\u0133\u0135\u0005"+
		"4\u0000\u0000\u0134\u0136\u0003\u0004\u0002\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\'\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u00055\u0000\u0000\u013a\u013b\u0003\u001e\u000f\u0000"+
		"\u013b\u013d\u00054\u0000\u0000\u013c\u013e\u0003\u0004\u0002\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		")\u0001\u0000\u0000\u0000\u0141\u0143\u00056\u0000\u0000\u0142\u0144\u0003"+
		"\u0004\u0002\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146+\u0001\u0000\u0000\u0000\u0147\u014b\u00057\u0000"+
		"\u0000\u0148\u0149\u0003\u001e\u000f\u0000\u0149\u014a\u00052\u0000\u0000"+
		"\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0005\u0012\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005?\u0000\u0000\u0151-\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u00058\u0000\u0000\u0153\u0154\u0005?\u0000\u0000\u0154\u0155\u00059"+
		"\u0000\u0000\u0155\u0156\u00030\u0018\u0000\u0156/\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0005>\u0000\u0000\u01581\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u00034\u001a\u0000\u015a\u015b\u0005\u0001\u0000\u0000\u015b\u015d\u0001"+
		"\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0165\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u0166\u00034\u001a\u0000\u0162\u0163\u00034\u001a"+
		"\u0000\u0163\u0164\u0005\u0001\u0000\u0000\u0164\u0166\u0001\u0000\u0000"+
		"\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0162\u0001\u0000\u0000"+
		"\u0000\u01663\u0001\u0000\u0000\u0000\u0167\u0168\u0005A\u0000\u0000\u0168"+
		"\u016a\u00052\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005A\u0000\u0000\u016c\u016e\u00052\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0172\u0007\u0006\u0000\u0000\u0170\u0171\u0005:\u0000"+
		"\u0000\u0171\u0173\u0005A\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u01735\u0001\u0000\u0000\u0000(>"+
		"CLU\\`jluwz\u0085\u00b3\u00b8\u00c4\u00d0\u00dc\u00ed\u00ef\u00f5\u00f7"+
		"\u00fd\u0100\u0104\u010a\u0110\u0117\u011f\u0129\u012d\u0137\u013f\u0145"+
		"\u014b\u014e\u015e\u0165\u0169\u016d\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}