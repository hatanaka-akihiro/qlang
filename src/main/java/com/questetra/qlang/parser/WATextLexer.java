// Generated from com\questetra\qlang\parser\WAText.g4 by ANTLR 4.9.2
package com.questetra.qlang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WATextLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, LETTER=8, NON_ZERO_DIGIT=9, 
		DIGIT=10, IDENTIFIER=11, NUMERIC_LITERAL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TYPE", "LETTER", "NON_ZERO_DIGIT", 
			"DIGIT", "IDENTIFIER", "NUMERIC_LITERAL", "WS"
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


	public WATextLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WAText.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t"+
		"J\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fT\n\f\f\f\16\fW\13\f\3\r\3"+
		"\r\7\r[\n\r\f\r\16\r^\13\r\3\16\6\16a\n\16\r\16\16\16b\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6"+
		"\4\2C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2i\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r:\3"+
		"\2\2\2\17B\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31"+
		"X\3\2\2\2\33`\3\2\2\2\35\36\7*\2\2\36\37\7o\2\2\37 \7q\2\2 !\7f\2\2!\""+
		"\7w\2\2\"#\7n\2\2#$\7g\2\2$%\7\"\2\2%\4\3\2\2\2&\'\7+\2\2\'\6\3\2\2\2"+
		"()\7*\2\2)*\7h\2\2*+\7w\2\2+,\7p\2\2,-\7e\2\2-.\7\"\2\2.\b\3\2\2\2/\60"+
		"\7\"\2\2\60\n\3\2\2\2\61\62\7*\2\2\62\63\7t\2\2\63\64\7g\2\2\64\65\7u"+
		"\2\2\65\66\7w\2\2\66\67\7n\2\2\678\7v\2\289\7\"\2\29\f\3\2\2\2:;\7\60"+
		"\2\2;<\7e\2\2<=\7q\2\2=>\7p\2\2>?\7u\2\2?@\7v\2\2@A\7\"\2\2A\16\3\2\2"+
		"\2BC\7k\2\2CD\7p\2\2DE\7v\2\2EF\7\65\2\2FG\7\64\2\2G\20\3\2\2\2HJ\t\2"+
		"\2\2IH\3\2\2\2J\22\3\2\2\2KL\t\3\2\2L\24\3\2\2\2MN\t\4\2\2N\26\3\2\2\2"+
		"OP\7&\2\2PU\5\21\t\2QT\5\21\t\2RT\5\25\13\2SQ\3\2\2\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2V\30\3\2\2\2WU\3\2\2\2X\\\5\23\n\2Y[\5\25\13\2"+
		"ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2^\\\3\2\2\2_a\t"+
		"\5\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\16\2\2e\34"+
		"\3\2\2\2\b\2ISU\\b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}