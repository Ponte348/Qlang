package InterpretadorPil.Pil;

// Generated from Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, BOOLEAN=22, Looper=23, Types=24, 
		CompareOperator=25, BooleanOperator=26, ID=27, INTEGER=28, REAL=29, TEXT=30, 
		String=31, WS=32, Comment=33;
	public static final int
		RULE_program = 0, RULE_compound = 1, RULE_statementWithBreak = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_write = 5, RULE_ifclause = 6, RULE_loopclause = 7, 
		RULE_idset = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "compound", "statementWithBreak", "statement", "assignment", 
			"write", "ifclause", "loopclause", "idset", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'write'", "','", "'writeln'", "'if'", "'then'", 
			"'else'", "'end'", "'loop'", "'do'", "'('", "')'", "'+'", "'-'", "'not'", 
			"'*'", "':'", "'%'", "'read'", "'error'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
			"Looper", "Types", "CompareOperator", "BooleanOperator", "ID", "INTEGER", 
			"REAL", "TEXT", "String", "WS", "Comment"
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
	public String getGrammarFileName() { return "Pil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PilParser.EOF, 0); }
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134218856L) != 0)) {
				{
				setState(20);
				compound();
				}
			}

			setState(23);
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
	public static class CompoundContext extends ParserRuleContext {
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
	 
		public CompoundContext() { }
		public void copyFrom(CompoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends CompoundContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatementWithBreakContext> statementWithBreak() {
			return getRuleContexts(StatementWithBreakContext.class);
		}
		public StatementWithBreakContext statementWithBreak(int i) {
			return getRuleContext(StatementWithBreakContext.class,i);
		}
		public CompoundStatementContext(CompoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound);
		try {
			int _alt;
			_localctx = new CompoundStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					statementWithBreak();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(31);
				statement();
				}
				break;
			case 2:
				{
				setState(32);
				statementWithBreak();
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
	public static class StatementWithBreakContext extends ParserRuleContext {
		public StatementWithBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithBreak; }
	 
		public StatementWithBreakContext() { }
		public void copyFrom(StatementWithBreakContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementWithBreakContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BreakStatementContext(StatementWithBreakContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithBreakContext statementWithBreak() throws RecognitionException {
		StatementWithBreakContext _localctx = new StatementWithBreakContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementWithBreak);
		try {
			_localctx = new BreakStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			statement();
			setState(36);
			match(T__0);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends StatementContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public WriteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopclauseStatementContext extends StatementContext {
		public LoopclauseContext loopclause() {
			return getRuleContext(LoopclauseContext.class,0);
		}
		public LoopclauseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterLoopclauseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitLoopclauseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitLoopclauseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfclauseStatementContext extends StatementContext {
		public IfclauseContext ifclause() {
			return getRuleContext(IfclauseContext.class,0);
		}
		public IfclauseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterIfclauseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitIfclauseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitIfclauseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				assignment();
				}
				break;
			case T__2:
			case T__4:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				write();
				}
				break;
			case T__5:
				_localctx = new IfclauseStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				ifclause();
				}
				break;
			case T__9:
				_localctx = new LoopclauseStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				loopclause();
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
	public static class AssignExprContext extends AssignmentContext {
		public IdsetContext idset() {
			return getRuleContext(IdsetContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			_localctx = new AssignExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			idset();
			setState(45);
			match(T__1);
			setState(46);
			expr(0);
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
	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteExprContext extends WriteContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WriteExprContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterWriteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitWriteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WritelnExprContext extends WriteContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WritelnExprContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterWritelnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitWritelnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitWritelnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_write);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__2);
				setState(49);
				expr(0);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(50);
					match(T__3);
					setState(51);
					expr(0);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				_localctx = new WritelnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__4);
				setState(58);
				expr(0);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(59);
					match(T__3);
					setState(60);
					expr(0);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class IfclauseContext extends ParserRuleContext {
		public IfclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifclause; }
	 
		public IfclauseContext() { }
		public void copyFrom(IfclauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends IfclauseContext {
		public CompoundContext elseStat;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CompoundContext> compound() {
			return getRuleContexts(CompoundContext.class);
		}
		public CompoundContext compound(int i) {
			return getRuleContext(CompoundContext.class,i);
		}
		public IfStatementContext(IfclauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifclause);
		int _la;
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			setState(69);
			expr(0);
			setState(70);
			match(T__6);
			setState(71);
			compound();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(72);
				match(T__7);
				setState(73);
				((IfStatementContext)_localctx).elseStat = compound();
				}
			}

			setState(76);
			match(T__8);
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
	public static class LoopclauseContext extends ParserRuleContext {
		public LoopclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopclause; }
	 
		public LoopclauseContext() { }
		public void copyFrom(LoopclauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends LoopclauseContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode Looper() { return getToken(PilParser.Looper, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopStatementContext(LoopclauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopCompoundStatementContext extends LoopclauseContext {
		public TerminalNode Looper() { return getToken(PilParser.Looper, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public List<StatementWithBreakContext> statementWithBreak() {
			return getRuleContexts(StatementWithBreakContext.class);
		}
		public StatementWithBreakContext statementWithBreak(int i) {
			return getRuleContext(StatementWithBreakContext.class,i);
		}
		public LoopCompoundStatementContext(LoopclauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterLoopCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitLoopCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitLoopCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopclauseContext loopclause() throws RecognitionException {
		LoopclauseContext _localctx = new LoopclauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopclause);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new LoopCompoundStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__9);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134218856L) != 0)) {
					{
					{
					setState(79);
					statementWithBreak();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(Looper);
				setState(86);
				expr(0);
				setState(87);
				match(T__10);
				setState(88);
				compound();
				setState(89);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__9);
				setState(92);
				compound();
				setState(93);
				match(Looper);
				setState(94);
				expr(0);
				setState(95);
				match(T__10);
				setState(96);
				match(T__8);
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
	public static class IdsetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PilParser.ID, 0); }
		public IdsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterIdset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitIdset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitIdset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsetContext idset() throws RecognitionException {
		IdsetContext _localctx = new IdsetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_idset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
	public static class ExprContext extends ParserRuleContext {
		public Type eType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTypeContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Types() { return getToken(PilParser.Types, 0); }
		public ExprTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdsetContext extends ExprContext {
		public IdsetContext idset() {
			return getRuleContext(IdsetContext.class,0);
		}
		public ExprIdsetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprIdset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprIdset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprIdset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(PilParser.BOOLEAN, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTextContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(PilParser.TEXT, 0); }
		public ExprTextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprErrorContext extends ExprContext {
		public ExprErrorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprError(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompareContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CompareOperator() { return getToken(PilParser.CompareOperator, 0); }
		public ExprCompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BooleanOperator() { return getToken(PilParser.BooleanOperator, 0); }
		public ExprBoolOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRealContext extends ExprContext {
		public TerminalNode REAL() { return getToken(PilParser.REAL, 0); }
		public ExprRealContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(PilParser.INTEGER, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PilListener ) ((PilListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PilVisitor ) return ((PilVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(T__11);
				setState(104);
				expr(0);
				setState(105);
				match(T__12);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				expr(13);
				}
				break;
			case ID:
				{
				_localctx = new ExprIdsetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				idset();
				}
				break;
			case INTEGER:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(INTEGER);
				}
				break;
			case REAL:
				{
				_localctx = new ExprRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(REAL);
				}
				break;
			case TEXT:
				{
				_localctx = new ExprTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(BOOLEAN);
				}
				break;
			case Types:
				{
				_localctx = new ExprTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				((ExprTypeContext)_localctx).type = match(Types);
				setState(115);
				match(T__11);
				setState(116);
				expr(0);
				setState(117);
				match(T__12);
				}
				break;
			case T__19:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(T__19);
				setState(120);
				expr(2);
				}
				break;
			case T__20:
				{
				_localctx = new ExprErrorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(125);
						((ExprMulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
							((ExprMulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(128);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						((ExprCompareContext)_localctx).op = match(CompareOperator);
						setState(132);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(134);
						((ExprBoolOpContext)_localctx).op = match(BooleanOperator);
						setState(135);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0003\u0000\u0016\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001"+
		"\u001e\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00055\b\u0005"+
		"\n\u0005\f\u00058\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005>\b\u0005\n\u0005\f\u0005A\t\u0005\u0003\u0005C\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006K\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005"+
		"\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t{\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001\t\u0000\u0001\u0012"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000"+
		"\u000e\u0010\u0001\u0000\u0011\u0013\u0001\u0000\u000e\u000f\u009c\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000\u000e"+
		"b\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012z\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d!\u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0003\u0006\u0003"+
		"\u0000 \"\u0003\u0004\u0002\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001"+
		"\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0003\u0006\u0003"+
		"\u0000$%\u0005\u0001\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&+\u0003"+
		"\b\u0004\u0000\'+\u0003\n\u0005\u0000(+\u0003\f\u0006\u0000)+\u0003\u000e"+
		"\u0007\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0007\u0001\u0000\u0000"+
		"\u0000,-\u0003\u0010\b\u0000-.\u0005\u0002\u0000\u0000./\u0003\u0012\t"+
		"\u0000/\t\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000016\u0003\u0012"+
		"\t\u000023\u0005\u0004\u0000\u000035\u0003\u0012\t\u000042\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007C\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0005\u0000\u0000:?\u0003\u0012\t\u0000;<\u0005\u0004\u0000\u0000"+
		"<>\u0003\u0012\t\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000B0\u0001\u0000\u0000\u0000B9\u0001\u0000"+
		"\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005\u0006\u0000\u0000"+
		"EF\u0003\u0012\t\u0000FG\u0005\u0007\u0000\u0000GJ\u0003\u0002\u0001\u0000"+
		"HI\u0005\b\u0000\u0000IK\u0003\u0002\u0001\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\t\u0000\u0000"+
		"M\r\u0001\u0000\u0000\u0000NR\u0005\n\u0000\u0000OQ\u0003\u0004\u0002"+
		"\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0017\u0000\u0000VW\u0003\u0012\t\u0000WX\u0005"+
		"\u000b\u0000\u0000XY\u0003\u0002\u0001\u0000YZ\u0005\t\u0000\u0000Zc\u0001"+
		"\u0000\u0000\u0000[\\\u0005\n\u0000\u0000\\]\u0003\u0002\u0001\u0000]"+
		"^\u0005\u0017\u0000\u0000^_\u0003\u0012\t\u0000_`\u0005\u000b\u0000\u0000"+
		"`a\u0005\t\u0000\u0000ac\u0001\u0000\u0000\u0000bN\u0001\u0000\u0000\u0000"+
		"b[\u0001\u0000\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005\u001b"+
		"\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0006\t\uffff\uffff\u0000"+
		"gh\u0005\f\u0000\u0000hi\u0003\u0012\t\u0000ij\u0005\r\u0000\u0000j{\u0001"+
		"\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l{\u0003\u0012\t\rm{\u0003"+
		"\u0010\b\u0000n{\u0005\u001c\u0000\u0000o{\u0005\u001d\u0000\u0000p{\u0005"+
		"\u001e\u0000\u0000q{\u0005\u0016\u0000\u0000rs\u0005\u0018\u0000\u0000"+
		"st\u0005\f\u0000\u0000tu\u0003\u0012\t\u0000uv\u0005\r\u0000\u0000v{\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0014\u0000\u0000x{\u0003\u0012\t\u0002y{\u0005"+
		"\u0015\u0000\u0000zf\u0001\u0000\u0000\u0000zk\u0001\u0000\u0000\u0000"+
		"zm\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zo\u0001\u0000\u0000"+
		"\u0000zp\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000zr\u0001\u0000"+
		"\u0000\u0000zw\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u008a"+
		"\u0001\u0000\u0000\u0000|}\n\f\u0000\u0000}~\u0007\u0001\u0000\u0000~"+
		"\u0089\u0003\u0012\t\r\u007f\u0080\n\u000b\u0000\u0000\u0080\u0081\u0007"+
		"\u0002\u0000\u0000\u0081\u0089\u0003\u0012\t\f\u0082\u0083\n\n\u0000\u0000"+
		"\u0083\u0084\u0005\u0019\u0000\u0000\u0084\u0089\u0003\u0012\t\u000b\u0085"+
		"\u0086\n\t\u0000\u0000\u0086\u0087\u0005\u001a\u0000\u0000\u0087\u0089"+
		"\u0003\u0012\t\n\u0088|\u0001\u0000\u0000\u0000\u0088\u007f\u0001\u0000"+
		"\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0013\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\r\u0015\u001c!*6?BJR"+
		"bz\u0088\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}