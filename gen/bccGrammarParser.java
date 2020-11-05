// Generated from D:/Users/juanm/Desktop/SemanticAnalyzer/grammar\bccGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bccGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, DATATYPE=27, FUNCTION=28, VAR=29, PRINT=30, INPUT=31, 
		WHEN=32, IF=33, UNLESS=34, WHILE=35, REPEAT=36, RETURN=37, UNTIL=38, LOOP=39, 
		DO=40, ELSE=41, AND=42, OR=43, FOR=44, NEXT=45, BREAK=46, NOT=47, BOOL=48, 
		END=49, NUM=50, FID=51, ID=52, ESP=53;
	public static final int
		RULE_prog = 0, RULE_var_decl = 1, RULE_fn_decl_list = 2, RULE_stmt_block = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simple_expr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_main_prog = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_decl", "fn_decl_list", "stmt_block", "stmt", "lexpr", "nexpr", 
			"rexpr", "simple_expr", "term", "factor", "main_prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'('", "')'", "';'", "'{'", "'}'", "':='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'<'", "'=='", "'<='", 
			"'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", null, "'function'", 
			"'var'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'while'", 
			"'repeat'", "'return'", "'until'", "'loop'", "'do'", "'else'", "'and'", 
			"'or'", "'for'", "'next'", "'break'", "'not'", null, "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", 
			"IF", "UNLESS", "WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", "DO", "ELSE", 
			"AND", "OR", "FOR", "NEXT", "BREAK", "NOT", "BOOL", "END", "NUM", "FID", 
			"ID", "ESP"
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
	public String getGrammarFileName() { return "bccGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bccGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Fn_decl_listContext fn_decl_list() {
			return getRuleContext(Fn_decl_listContext.class,0);
		}
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			fn_decl_list();
			setState(25);
			main_prog();
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(bccGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bccGrammarParser.ID, i);
		}
		public List<TerminalNode> DATATYPE() { return getTokens(bccGrammarParser.DATATYPE); }
		public TerminalNode DATATYPE(int i) {
			return getToken(bccGrammarParser.DATATYPE, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ID);
			setState(28);
			match(T__0);
			setState(29);
			match(DATATYPE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(30);
				match(T__1);
				setState(31);
				match(ID);
				setState(32);
				match(T__0);
				setState(33);
				match(DATATYPE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Fn_decl_listContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(bccGrammarParser.FUNCTION, 0); }
		public TerminalNode FID() { return getToken(bccGrammarParser.FID, 0); }
		public TerminalNode DATATYPE() { return getToken(bccGrammarParser.DATATYPE, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode VAR() { return getToken(bccGrammarParser.VAR, 0); }
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(FUNCTION);
			setState(40);
			match(FID);
			setState(41);
			match(T__0);
			setState(42);
			match(DATATYPE);
			setState(43);
			match(T__2);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(44);
				var_decl();
				}
			}

			setState(47);
			match(T__3);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(48);
				match(VAR);
				setState(49);
				var_decl();
				setState(50);
				match(T__4);
				}
			}

			setState(54);
			stmt_block();
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt_block);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__5);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					stmt();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << REPEAT) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << DO) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0) );
				setState(62);
				match(T__6);
				}
				break;
			case T__13:
			case T__14:
			case PRINT:
			case INPUT:
			case WHEN:
			case IF:
			case UNLESS:
			case WHILE:
			case REPEAT:
			case RETURN:
			case UNTIL:
			case LOOP:
			case DO:
			case FOR:
			case NEXT:
			case BREAK:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(bccGrammarParser.PRINT, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(bccGrammarParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(bccGrammarParser.ID, 0); }
		public TerminalNode WHEN() { return getToken(bccGrammarParser.WHEN, 0); }
		public TerminalNode DO() { return getToken(bccGrammarParser.DO, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode IF() { return getToken(bccGrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(bccGrammarParser.ELSE, 0); }
		public TerminalNode UNLESS() { return getToken(bccGrammarParser.UNLESS, 0); }
		public TerminalNode WHILE() { return getToken(bccGrammarParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(bccGrammarParser.RETURN, 0); }
		public TerminalNode UNTIL() { return getToken(bccGrammarParser.UNTIL, 0); }
		public TerminalNode LOOP() { return getToken(bccGrammarParser.LOOP, 0); }
		public TerminalNode REPEAT() { return getToken(bccGrammarParser.REPEAT, 0); }
		public TerminalNode NUM() { return getToken(bccGrammarParser.NUM, 0); }
		public TerminalNode FOR() { return getToken(bccGrammarParser.FOR, 0); }
		public TerminalNode NEXT() { return getToken(bccGrammarParser.NEXT, 0); }
		public TerminalNode BREAK() { return getToken(bccGrammarParser.BREAK, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(PRINT);
				setState(68);
				lexpr();
				setState(69);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(INPUT);
				setState(72);
				match(ID);
				setState(73);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(WHEN);
				setState(75);
				match(T__2);
				setState(76);
				lexpr();
				setState(77);
				match(T__3);
				setState(78);
				match(DO);
				setState(79);
				stmt_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(IF);
				setState(82);
				match(T__2);
				setState(83);
				lexpr();
				setState(84);
				match(T__3);
				setState(85);
				match(DO);
				setState(86);
				stmt_block();
				setState(87);
				match(ELSE);
				setState(88);
				stmt_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(UNLESS);
				setState(91);
				match(T__2);
				setState(92);
				lexpr();
				setState(93);
				match(T__3);
				setState(94);
				match(DO);
				setState(95);
				stmt_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(WHILE);
				setState(98);
				match(T__2);
				setState(99);
				lexpr();
				setState(100);
				match(T__3);
				setState(101);
				match(DO);
				setState(102);
				stmt_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				match(RETURN);
				setState(105);
				lexpr();
				setState(106);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(UNTIL);
				setState(109);
				match(T__2);
				setState(110);
				lexpr();
				setState(111);
				match(T__3);
				setState(112);
				match(DO);
				setState(113);
				stmt_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				match(LOOP);
				setState(116);
				stmt_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				match(DO);
				setState(118);
				stmt_block();
				setState(119);
				match(WHILE);
				setState(120);
				match(T__2);
				setState(121);
				lexpr();
				setState(122);
				match(T__3);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				match(DO);
				setState(125);
				stmt_block();
				setState(126);
				match(UNTIL);
				setState(127);
				match(T__2);
				setState(128);
				lexpr();
				setState(129);
				match(T__3);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				match(REPEAT);
				setState(132);
				match(NUM);
				setState(133);
				match(T__0);
				setState(134);
				stmt_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(135);
				match(FOR);
				setState(136);
				match(T__2);
				setState(137);
				lexpr();
				setState(138);
				match(T__4);
				setState(139);
				lexpr();
				setState(140);
				match(T__4);
				setState(141);
				lexpr();
				setState(142);
				match(T__3);
				setState(143);
				match(DO);
				setState(144);
				stmt_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				match(NEXT);
				setState(147);
				match(T__4);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(148);
				match(BREAK);
				setState(149);
				match(T__4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(150);
				match(ID);
				setState(151);
				match(T__7);
				setState(152);
				lexpr();
				setState(153);
				match(T__4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__8);
				setState(157);
				lexpr();
				setState(158);
				match(T__4);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(160);
				match(ID);
				setState(161);
				match(T__9);
				setState(162);
				lexpr();
				setState(163);
				match(T__4);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__10);
				setState(167);
				lexpr();
				setState(168);
				match(T__4);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(170);
				match(ID);
				setState(171);
				match(T__11);
				setState(172);
				lexpr();
				setState(173);
				match(T__4);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(175);
				match(ID);
				setState(176);
				match(T__12);
				setState(177);
				lexpr();
				setState(178);
				match(T__4);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__13);
				setState(182);
				match(T__4);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(183);
				match(ID);
				setState(184);
				match(T__14);
				setState(185);
				match(T__4);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(186);
				match(T__14);
				setState(187);
				match(ID);
				setState(188);
				match(T__4);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(189);
				match(T__13);
				setState(190);
				match(ID);
				setState(191);
				match(T__4);
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

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(bccGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(bccGrammarParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(bccGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(bccGrammarParser.OR, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			nexpr();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(195);
					match(AND);
					setState(196);
					nexpr();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(202);
					match(OR);
					setState(203);
					nexpr();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(bccGrammarParser.NOT, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nexpr);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(NOT);
				setState(212);
				match(T__2);
				setState(213);
				lexpr();
				setState(214);
				match(T__3);
				}
				break;
			case T__2:
			case T__13:
			case T__14:
			case BOOL:
			case NUM:
			case FID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				rexpr();
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

	public static class RexprContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			simple_expr();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				simple_expr();
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

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			term();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				term();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			factor();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(233);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				factor();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(bccGrammarParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(bccGrammarParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(bccGrammarParser.ID, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode FID() { return getToken(bccGrammarParser.FID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(ID);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(246);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(249);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(T__2);
				setState(252);
				lexpr();
				setState(253);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(FID);
				setState(256);
				match(T__2);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << NOT) | (1L << BOOL) | (1L << NUM) | (1L << FID) | (1L << ID))) != 0)) {
					{
					setState(257);
					lexpr();
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(258);
						match(T__1);
						setState(259);
						lexpr();
						}
						}
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(267);
				match(T__3);
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

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(bccGrammarParser.END, 0); }
		public TerminalNode VAR() { return getToken(bccGrammarParser.VAR, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bccGrammarVisitor ) return ((bccGrammarVisitor<? extends T>)visitor).visitMain_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(270);
				match(VAR);
				setState(271);
				var_decl();
				setState(272);
				match(T__4);
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << REPEAT) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << DO) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(276);
				stmt();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(END);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u011f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3"+
		"\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\67\n\4\3\4\3\4\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\5\5\5D\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00c3\n\6\3\7\3\7\3\7\7\7\u00c8\n\7\f\7\16\7\u00cb\13\7\3"+
		"\7\3\7\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\5\7\u00d4\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00dc\n\b\3\t\3\t\3\t\5\t\u00e1\n\t\3\n\3\n\3\n\7\n\u00e6"+
		"\n\n\f\n\16\n\u00e9\13\n\3\13\3\13\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u00f7\n\f\3\f\5\f\u00fa\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0107\n\f\f\f\16\f\u010a\13\f\5\f\u010c"+
		"\n\f\3\f\5\f\u010f\n\f\3\r\3\r\3\r\3\r\5\r\u0115\n\r\3\r\7\r\u0118\n\r"+
		"\f\r\16\r\u011b\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\6\3\2\22\27\3\2\30\31\3\2\32\34\3\2\20\21\2\u0142\2\32\3\2\2\2\4\35"+
		"\3\2\2\2\6)\3\2\2\2\bC\3\2\2\2\n\u00c2\3\2\2\2\f\u00c4\3\2\2\2\16\u00db"+
		"\3\2\2\2\20\u00dd\3\2\2\2\22\u00e2\3\2\2\2\24\u00ea\3\2\2\2\26\u010e\3"+
		"\2\2\2\30\u0114\3\2\2\2\32\33\5\6\4\2\33\34\5\30\r\2\34\3\3\2\2\2\35\36"+
		"\7\66\2\2\36\37\7\3\2\2\37&\7\35\2\2 !\7\4\2\2!\"\7\66\2\2\"#\7\3\2\2"+
		"#%\7\35\2\2$ \3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2"+
		"\2\2)*\7\36\2\2*+\7\65\2\2+,\7\3\2\2,-\7\35\2\2-/\7\5\2\2.\60\5\4\3\2"+
		"/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\66\7\6\2\2\62\63\7\37\2\2\63\64"+
		"\5\4\3\2\64\65\7\7\2\2\65\67\3\2\2\2\66\62\3\2\2\2\66\67\3\2\2\2\678\3"+
		"\2\2\289\5\b\5\29\7\3\2\2\2:<\7\b\2\2;=\5\n\6\2<;\3\2\2\2=>\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\t\2\2AD\3\2\2\2BD\5\n\6\2C:\3\2\2\2C"+
		"B\3\2\2\2D\t\3\2\2\2EF\7 \2\2FG\5\f\7\2GH\7\7\2\2H\u00c3\3\2\2\2IJ\7!"+
		"\2\2JK\7\66\2\2K\u00c3\7\7\2\2LM\7\"\2\2MN\7\5\2\2NO\5\f\7\2OP\7\6\2\2"+
		"PQ\7*\2\2QR\5\b\5\2R\u00c3\3\2\2\2ST\7#\2\2TU\7\5\2\2UV\5\f\7\2VW\7\6"+
		"\2\2WX\7*\2\2XY\5\b\5\2YZ\7+\2\2Z[\5\b\5\2[\u00c3\3\2\2\2\\]\7$\2\2]^"+
		"\7\5\2\2^_\5\f\7\2_`\7\6\2\2`a\7*\2\2ab\5\b\5\2b\u00c3\3\2\2\2cd\7%\2"+
		"\2de\7\5\2\2ef\5\f\7\2fg\7\6\2\2gh\7*\2\2hi\5\b\5\2i\u00c3\3\2\2\2jk\7"+
		"\'\2\2kl\5\f\7\2lm\7\7\2\2m\u00c3\3\2\2\2no\7(\2\2op\7\5\2\2pq\5\f\7\2"+
		"qr\7\6\2\2rs\7*\2\2st\5\b\5\2t\u00c3\3\2\2\2uv\7)\2\2v\u00c3\5\b\5\2w"+
		"x\7*\2\2xy\5\b\5\2yz\7%\2\2z{\7\5\2\2{|\5\f\7\2|}\7\6\2\2}\u00c3\3\2\2"+
		"\2~\177\7*\2\2\177\u0080\5\b\5\2\u0080\u0081\7(\2\2\u0081\u0082\7\5\2"+
		"\2\u0082\u0083\5\f\7\2\u0083\u0084\7\6\2\2\u0084\u00c3\3\2\2\2\u0085\u0086"+
		"\7&\2\2\u0086\u0087\7\64\2\2\u0087\u0088\7\3\2\2\u0088\u00c3\5\b\5\2\u0089"+
		"\u008a\7.\2\2\u008a\u008b\7\5\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\7"+
		"\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\7\2\2\u008f\u0090\5\f\7\2\u0090"+
		"\u0091\7\6\2\2\u0091\u0092\7*\2\2\u0092\u0093\5\b\5\2\u0093\u00c3\3\2"+
		"\2\2\u0094\u0095\7/\2\2\u0095\u00c3\7\7\2\2\u0096\u0097\7\60\2\2\u0097"+
		"\u00c3\7\7\2\2\u0098\u0099\7\66\2\2\u0099\u009a\7\n\2\2\u009a\u009b\5"+
		"\f\7\2\u009b\u009c\7\7\2\2\u009c\u00c3\3\2\2\2\u009d\u009e\7\66\2\2\u009e"+
		"\u009f\7\13\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\7\2\2\u00a1\u00c3\3"+
		"\2\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\5\f\7\2\u00a5"+
		"\u00a6\7\7\2\2\u00a6\u00c3\3\2\2\2\u00a7\u00a8\7\66\2\2\u00a8\u00a9\7"+
		"\r\2\2\u00a9\u00aa\5\f\7\2\u00aa\u00ab\7\7\2\2\u00ab\u00c3\3\2\2\2\u00ac"+
		"\u00ad\7\66\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7"+
		"\7\2\2\u00b0\u00c3\3\2\2\2\u00b1\u00b2\7\66\2\2\u00b2\u00b3\7\17\2\2\u00b3"+
		"\u00b4\5\f\7\2\u00b4\u00b5\7\7\2\2\u00b5\u00c3\3\2\2\2\u00b6\u00b7\7\66"+
		"\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00c3\7\7\2\2\u00b9\u00ba\7\66\2\2\u00ba"+
		"\u00bb\7\21\2\2\u00bb\u00c3\7\7\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00be\7"+
		"\66\2\2\u00be\u00c3\7\7\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\7\66\2\2"+
		"\u00c1\u00c3\7\7\2\2\u00c2E\3\2\2\2\u00c2I\3\2\2\2\u00c2L\3\2\2\2\u00c2"+
		"S\3\2\2\2\u00c2\\\3\2\2\2\u00c2c\3\2\2\2\u00c2j\3\2\2\2\u00c2n\3\2\2\2"+
		"\u00c2u\3\2\2\2\u00c2w\3\2\2\2\u00c2~\3\2\2\2\u00c2\u0085\3\2\2\2\u00c2"+
		"\u0089\3\2\2\2\u00c2\u0094\3\2\2\2\u00c2\u0096\3\2\2\2\u00c2\u0098\3\2"+
		"\2\2\u00c2\u009d\3\2\2\2\u00c2\u00a2\3\2\2\2\u00c2\u00a7\3\2\2\2\u00c2"+
		"\u00ac\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b9\3\2"+
		"\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\13\3\2\2\2\u00c4\u00d3"+
		"\5\16\b\2\u00c5\u00c6\7,\2\2\u00c6\u00c8\5\16\b\2\u00c7\u00c5\3\2\2\2"+
		"\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d4"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd\u00cf\5\16\b\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\r\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7\5\2"+
		"\2\u00d7\u00d8\5\f\7\2\u00d8\u00d9\7\6\2\2\u00d9\u00dc\3\2\2\2\u00da\u00dc"+
		"\5\20\t\2\u00db\u00d5\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\17\3\2\2\2\u00dd"+
		"\u00e0\5\22\n\2\u00de\u00df\t\2\2\2\u00df\u00e1\5\22\n\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\21\3\2\2\2\u00e2\u00e7\5\24\13\2\u00e3"+
		"\u00e4\t\3\2\2\u00e4\u00e6\5\24\13\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\23\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ef\5\26\f\2\u00eb\u00ec\t\4\2\2\u00ec\u00ee\5"+
		"\26\f\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\25\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u010f\7\64\2"+
		"\2\u00f3\u010f\7\62\2\2\u00f4\u00f6\7\66\2\2\u00f5\u00f7\t\5\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u010f\3\2\2\2\u00f8\u00fa\t\5"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u010f\7\66\2\2\u00fc\u010f\7\66\2\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\5"+
		"\f\7\2\u00ff\u0100\7\6\2\2\u0100\u010f\3\2\2\2\u0101\u0102\7\65\2\2\u0102"+
		"\u010b\7\5\2\2\u0103\u0108\5\f\7\2\u0104\u0105\7\4\2\2\u0105\u0107\5\f"+
		"\7\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0103\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\7\6\2\2\u010e"+
		"\u00f2\3\2\2\2\u010e\u00f3\3\2\2\2\u010e\u00f4\3\2\2\2\u010e\u00f9\3\2"+
		"\2\2\u010e\u00fc\3\2\2\2\u010e\u00fd\3\2\2\2\u010e\u0101\3\2\2\2\u010f"+
		"\27\3\2\2\2\u0110\u0111\7\37\2\2\u0111\u0112\5\4\3\2\u0112\u0113\7\7\2"+
		"\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119"+
		"\3\2\2\2\u0116\u0118\5\n\6\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\7\63\2\2\u011d\31\3\2\2\2\26&/\66>C\u00c2\u00c9\u00d0"+
		"\u00d3\u00db\u00e0\u00e7\u00ef\u00f6\u00f9\u0108\u010b\u010e\u0114\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}