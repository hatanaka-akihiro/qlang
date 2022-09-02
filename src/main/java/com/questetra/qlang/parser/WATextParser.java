// Generated from com\questetra\qlang\parser\WAText.g4 by ANTLR 4.9.2
package com.questetra.qlang.parser;

import com.questetra.qlang.nodes.ExpressionNode;
import com.questetra.qlang.nodes.FunctionNode;
import com.oracle.truffle.api.source.Source;
import java.util.ArrayList;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WATextParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, LETTER=8, NON_ZERO_DIGIT=9, 
		DIGIT=10, IDENTIFIER=11, NUMERIC_LITERAL=12, WS=13;
	public static final int
		RULE_module = 0, RULE_function = 1, RULE_result = 2, RULE_expr = 3, RULE_declare_const = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "function", "result", "expr", "declare_const"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(module '", "')'", "'(func '", "' '", "'(result '", "'.const '", 
			"'int32'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TYPE", "LETTER", "NON_ZERO_DIGIT", 
			"DIGIT", "IDENTIFIER", "NUMERIC_LITERAL", "WS"
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
	public String getGrammarFileName() { return "WAText.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	WANodeFactory factory;
	Source source;

	public Map<String, FunctionNode> getFunctions() {
	  return factory.getFunctions();
	}

	public WATextParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WATextParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(11);
				function();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(T__1);
			setState(18);
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

	public static class FunctionContext extends ParserRuleContext {
		public ExpressionNode node;
		public Token name;
		public ExprContext expr;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WATextParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__2);
			setState(21);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(22);
			match(T__3);
			setState(23);
			result();
			 List<ExpressionNode> exprs = new ArrayList<>(); 
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				((FunctionContext)_localctx).expr = expr();
				 exprs.add(((FunctionContext)_localctx).expr.node); 
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(32);
			match(T__1);
			 factory.addFunction(((FunctionContext)_localctx).name, exprs); 
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(WATextParser.TYPE, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__4);
			setState(36);
			match(TYPE);
			setState(37);
			match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public ExpressionNode node;
		public Declare_constContext declare_const() {
			return getRuleContext(Declare_constContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			declare_const();
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

	public static class Declare_constContext extends ParserRuleContext {
		public ExpressionNode node;
		public Token num;
		public TerminalNode TYPE() { return getToken(WATextParser.TYPE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(WATextParser.NUMERIC_LITERAL, 0); }
		public Declare_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).enterDeclare_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WATextListener ) ((WATextListener)listener).exitDeclare_const(this);
		}
	}

	public final Declare_constContext declare_const() throws RecognitionException {
		Declare_constContext _localctx = new Declare_constContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(TYPE);
			setState(42);
			match(T__5);
			setState(43);
			((Declare_constContext)_localctx).num = match(NUMERIC_LITERAL);
			 ((Declare_constContext)_localctx).node =  factory.createInteger(((Declare_constContext)_localctx).num); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2"+
		"\2-\2\f\3\2\2\2\4\26\3\2\2\2\6%\3\2\2\2\b)\3\2\2\2\n+\3\2\2\2\f\20\7\3"+
		"\2\2\r\17\5\4\3\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2"+
		"\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\4\2\2\24\25\7\2\2\3\25\3\3\2\2"+
		"\2\26\27\7\5\2\2\27\30\7\r\2\2\30\31\7\6\2\2\31\32\5\6\4\2\32\36\b\3\1"+
		"\2\33\34\5\b\5\2\34\35\b\3\1\2\35\37\3\2\2\2\36\33\3\2\2\2\37 \3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\4\2\2#$\b\3\1\2$\5\3\2\2\2%&\7"+
		"\7\2\2&\'\7\t\2\2\'(\7\4\2\2(\7\3\2\2\2)*\5\n\6\2*\t\3\2\2\2+,\7\t\2\2"+
		",-\7\b\2\2-.\7\16\2\2./\b\6\1\2/\13\3\2\2\2\4\20 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}