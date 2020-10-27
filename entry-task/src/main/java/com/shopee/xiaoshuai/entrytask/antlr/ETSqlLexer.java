// Generated from /Users/xiaoshuai.zhang/IdeaProjects/entry-task/src/main/resources/ETSql.g4 by ANTLR 4.8

package com.shopee.xiaoshuai.entrytask.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ETSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL_OPERATOR=1, GREATER_OR_EQUAL_OPERATOR=2, GREATER_THAN_OPERATOR=3, 
		LESS_OR_EQUAL_OPERATOR=4, LESS_THAN_OPERATOR=5, NOT_EQUAL_OPERATOR=6, 
		PLUS_OPERATOR=7, MINUS_OPERATOR=8, MULT_OPERATOR=9, DIV_OPERATOR=10, LOGICAL_NOT_OPERATOR=11, 
		LOGICAL_AND_OPERATOR=12, LOGICAL_OR_OPERATOR=13, COMMA_SYMBOL=14, SEMICOLON_SYMBOL=15, 
		COLON_SYMBOL=16, OPEN_PAR_SYMBOL=17, CLOSE_PAR_SYMBOL=18, UNDERLINE_SYMBOL=19, 
		NULL2_SYMBOL=20, PARAM_MARKER=21, CREATE_SYMBOL=22, SELECT_SYMBOL=23, 
		FROM_SYMBOL=24, TABLE_SYMBOL=25, AS_SYMBOL=26, WHERE_SYMBOL=27, SUM_SYMBOL=28, 
		AND_SYMBOL=29, OR_SYMBOL=30, STRING_SYMBOL=31, INT_SYMBOL=32, DOUBLE_SYMBOL=33, 
		GROUP_SYMBOL=34, BY_SYMBOL=35, BETWEEN_SYMBOL=36, NO_SYMBOL=37, NOT_SYMBOL=38, 
		IN_SYMBOL=39, WS=40, IDENTIFIER=41, STRING_LITERAL=42, INT=43, DOUBLE=44, 
		NOT_EQUAL2_OPERATOR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ZERO", "NONEZERO", 
			"DIGIT", "DIGITS", "LETTER", "DQUOTA_STRING", "SQUOTA_STRING", "BQUOTA_STRING", 
			"EQUAL_OPERATOR", "GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", 
			"LESS_OR_EQUAL_OPERATOR", "LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", 
			"NOT_EQUAL2_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", 
			"DIV_OPERATOR", "LOGICAL_NOT_OPERATOR", "LOGICAL_AND_OPERATOR", "LOGICAL_OR_OPERATOR", 
			"COMMA_SYMBOL", "SEMICOLON_SYMBOL", "COLON_SYMBOL", "OPEN_PAR_SYMBOL", 
			"CLOSE_PAR_SYMBOL", "UNDERLINE_SYMBOL", "NULL2_SYMBOL", "PARAM_MARKER", 
			"CREATE_SYMBOL", "SELECT_SYMBOL", "FROM_SYMBOL", "TABLE_SYMBOL", "AS_SYMBOL", 
			"WHERE_SYMBOL", "SUM_SYMBOL", "AND_SYMBOL", "OR_SYMBOL", "STRING_SYMBOL", 
			"INT_SYMBOL", "DOUBLE_SYMBOL", "GROUP_SYMBOL", "BY_SYMBOL", "BETWEEN_SYMBOL", 
			"NO_SYMBOL", "NOT_SYMBOL", "IN_SYMBOL", "WS", "IDENTIFIER", "STRING_LITERAL", 
			"INT", "DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'>='", "'>'", "'<='", "'<'", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'!'", "'&&'", "'||'", "','", "';'", "':'", "'('", "')'", "'_'", 
			"'\\N'", "'?'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL_OPERATOR", "GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", 
			"LESS_OR_EQUAL_OPERATOR", "LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "LOGICAL_NOT_OPERATOR", 
			"LOGICAL_AND_OPERATOR", "LOGICAL_OR_OPERATOR", "COMMA_SYMBOL", "SEMICOLON_SYMBOL", 
			"COLON_SYMBOL", "OPEN_PAR_SYMBOL", "CLOSE_PAR_SYMBOL", "UNDERLINE_SYMBOL", 
			"NULL2_SYMBOL", "PARAM_MARKER", "CREATE_SYMBOL", "SELECT_SYMBOL", "FROM_SYMBOL", 
			"TABLE_SYMBOL", "AS_SYMBOL", "WHERE_SYMBOL", "SUM_SYMBOL", "AND_SYMBOL", 
			"OR_SYMBOL", "STRING_SYMBOL", "INT_SYMBOL", "DOUBLE_SYMBOL", "GROUP_SYMBOL", 
			"BY_SYMBOL", "BETWEEN_SYMBOL", "NO_SYMBOL", "NOT_SYMBOL", "IN_SYMBOL", 
			"WS", "IDENTIFIER", "STRING_LITERAL", "INT", "DOUBLE", "NOT_EQUAL2_OPERATOR"
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


	public ETSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ETSql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00dd\n\37\r\37\16\37\u00de"+
		"\3 \3 \3!\3!\3!\3!\3!\3!\7!\u00e9\n!\f!\16!\u00ec\13!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u00f6\n\"\f\"\16\"\u00f9\13\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\7#\u0103\n#\f#\16#\u0106\13#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3"+
		"@\3@\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3"+
		"E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3"+
		"I\3J\3J\3J\3J\3K\3K\3K\3L\6L\u019a\nL\rL\16L\u019b\3L\3L\3M\3M\3M\6M\u01a3"+
		"\nM\rM\16M\u01a4\3N\3N\3N\5N\u01aa\nN\3O\3O\3O\7O\u01af\nO\fO\16O\u01b2"+
		"\13O\3O\3O\3O\7O\u01b7\nO\fO\16O\u01ba\13O\5O\u01bc\nO\3P\3P\7P\u01c0"+
		"\nP\fP\16P\u01c3\13P\3P\3P\7P\u01c7\nP\fP\16P\u01ca\13P\2\2Q\3\2\5\2\7"+
		"\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2"+
		"\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\3I\4K\5M\6"+
		"O\7Q\bS/U\tW\nY\13[\f]\r_\16a\17c\20e\21g\22i\23k\24m\25o\26q\27s\30u"+
		"\31w\32y\33{\34}\35\177\36\u0081\37\u0083 \u0085!\u0087\"\u0089#\u008b"+
		"$\u008d%\u008f&\u0091\'\u0093(\u0095)\u0097*\u0099+\u009b,\u009d-\u009f"+
		".\3\2$\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJj"+
		"j\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\3\2\62\62\3\2\63;\3\2\62;\4\2C\\c|\4\2$$^^\4\2))^^\4\2^^bb\5"+
		"\2\13\f\17\17\"\"\2\u01be\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2"+
		"\2\7\u00a5\3\2\2\2\t\u00a7\3\2\2\2\13\u00a9\3\2\2\2\r\u00ab\3\2\2\2\17"+
		"\u00ad\3\2\2\2\21\u00af\3\2\2\2\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00b5"+
		"\3\2\2\2\31\u00b7\3\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3"+
		"\2\2\2!\u00bf\3\2\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9"+
		"\3\2\2\2=\u00dc\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00fc\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2"+
		"\2\2O\u0113\3\2\2\2Q\u0115\3\2\2\2S\u0118\3\2\2\2U\u011d\3\2\2\2W\u011f"+
		"\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a"+
		"\u012a\3\2\2\2c\u012d\3\2\2\2e\u012f\3\2\2\2g\u0131\3\2\2\2i\u0133\3\2"+
		"\2\2k\u0135\3\2\2\2m\u0137\3\2\2\2o\u0139\3\2\2\2q\u013c\3\2\2\2s\u013e"+
		"\3\2\2\2u\u0145\3\2\2\2w\u014c\3\2\2\2y\u0151\3\2\2\2{\u0157\3\2\2\2}"+
		"\u015a\3\2\2\2\177\u0160\3\2\2\2\u0081\u0164\3\2\2\2\u0083\u0168\3\2\2"+
		"\2\u0085\u016b\3\2\2\2\u0087\u0172\3\2\2\2\u0089\u0176\3\2\2\2\u008b\u017d"+
		"\3\2\2\2\u008d\u0183\3\2\2\2\u008f\u0186\3\2\2\2\u0091\u018e\3\2\2\2\u0093"+
		"\u0191\3\2\2\2\u0095\u0195\3\2\2\2\u0097\u0199\3\2\2\2\u0099\u01a2\3\2"+
		"\2\2\u009b\u01a9\3\2\2\2\u009d\u01bb\3\2\2\2\u009f\u01bd\3\2\2\2\u00a1"+
		"\u00a2\t\2\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4\6\3\2\2\2\u00a5"+
		"\u00a6\t\4\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8\n\3\2\2\2\u00a9"+
		"\u00aa\t\6\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\t\7\2\2\u00ac\16\3\2\2\2\u00ad"+
		"\u00ae\t\b\2\2\u00ae\20\3\2\2\2\u00af\u00b0\t\t\2\2\u00b0\22\3\2\2\2\u00b1"+
		"\u00b2\t\n\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\t\13\2\2\u00b4\26\3\2\2\2"+
		"\u00b5\u00b6\t\f\2\2\u00b6\30\3\2\2\2\u00b7\u00b8\t\r\2\2\u00b8\32\3\2"+
		"\2\2\u00b9\u00ba\t\16\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\t\17\2\2\u00bc"+
		"\36\3\2\2\2\u00bd\u00be\t\20\2\2\u00be \3\2\2\2\u00bf\u00c0\t\21\2\2\u00c0"+
		"\"\3\2\2\2\u00c1\u00c2\t\22\2\2\u00c2$\3\2\2\2\u00c3\u00c4\t\23\2\2\u00c4"+
		"&\3\2\2\2\u00c5\u00c6\t\24\2\2\u00c6(\3\2\2\2\u00c7\u00c8\t\25\2\2\u00c8"+
		"*\3\2\2\2\u00c9\u00ca\t\26\2\2\u00ca,\3\2\2\2\u00cb\u00cc\t\27\2\2\u00cc"+
		".\3\2\2\2\u00cd\u00ce\t\30\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\t\31\2\2\u00d0"+
		"\62\3\2\2\2\u00d1\u00d2\t\32\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\t\33\2\2"+
		"\u00d4\66\3\2\2\2\u00d5\u00d6\t\34\2\2\u00d68\3\2\2\2\u00d7\u00d8\t\35"+
		"\2\2\u00d8:\3\2\2\2\u00d9\u00da\t\36\2\2\u00da<\3\2\2\2\u00db\u00dd\5"+
		";\36\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df>\3\2\2\2\u00e0\u00e1\t\37\2\2\u00e1@\3\2\2\2\u00e2"+
		"\u00ea\7$\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e9\13\2\2\2\u00e5\u00e6\7$\2"+
		"\2\u00e6\u00e9\7$\2\2\u00e7\u00e9\n \2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$"+
		"\2\2\u00eeB\3\2\2\2\u00ef\u00f7\7)\2\2\u00f0\u00f1\7^\2\2\u00f1\u00f6"+
		"\13\2\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f6\7)\2\2\u00f4\u00f6\n!\2\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7)\2\2\u00fbD\3\2\2\2\u00fc\u0104\7b\2\2\u00fd"+
		"\u00fe\7^\2\2\u00fe\u0103\13\2\2\2\u00ff\u0100\7b\2\2\u0100\u0103\7b\2"+
		"\2\u0101\u0103\n\"\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7b\2\2\u0108F\3\2\2\2\u0109"+
		"\u010a\7?\2\2\u010aH\3\2\2\2\u010b\u010c\7@\2\2\u010c\u010d\7?\2\2\u010d"+
		"J\3\2\2\2\u010e\u010f\7@\2\2\u010fL\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112"+
		"\7?\2\2\u0112N\3\2\2\2\u0113\u0114\7>\2\2\u0114P\3\2\2\2\u0115\u0116\7"+
		"#\2\2\u0116\u0117\7?\2\2\u0117R\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a"+
		"\7@\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b*\2\2\u011cT\3\2\2\2\u011d\u011e"+
		"\7-\2\2\u011eV\3\2\2\2\u011f\u0120\7/\2\2\u0120X\3\2\2\2\u0121\u0122\7"+
		",\2\2\u0122Z\3\2\2\2\u0123\u0124\7\61\2\2\u0124\\\3\2\2\2\u0125\u0126"+
		"\7#\2\2\u0126^\3\2\2\2\u0127\u0128\7(\2\2\u0128\u0129\7(\2\2\u0129`\3"+
		"\2\2\2\u012a\u012b\7~\2\2\u012b\u012c\7~\2\2\u012cb\3\2\2\2\u012d\u012e"+
		"\7.\2\2\u012ed\3\2\2\2\u012f\u0130\7=\2\2\u0130f\3\2\2\2\u0131\u0132\7"+
		"<\2\2\u0132h\3\2\2\2\u0133\u0134\7*\2\2\u0134j\3\2\2\2\u0135\u0136\7+"+
		"\2\2\u0136l\3\2\2\2\u0137\u0138\7a\2\2\u0138n\3\2\2\2\u0139\u013a\7^\2"+
		"\2\u013a\u013b\7P\2\2\u013bp\3\2\2\2\u013c\u013d\7A\2\2\u013dr\3\2\2\2"+
		"\u013e\u013f\5\7\4\2\u013f\u0140\5%\23\2\u0140\u0141\5\13\6\2\u0141\u0142"+
		"\5\3\2\2\u0142\u0143\5)\25\2\u0143\u0144\5\13\6\2\u0144t\3\2\2\2\u0145"+
		"\u0146\5\'\24\2\u0146\u0147\5\13\6\2\u0147\u0148\5\31\r\2\u0148\u0149"+
		"\5\13\6\2\u0149\u014a\5\7\4\2\u014a\u014b\5)\25\2\u014bv\3\2\2\2\u014c"+
		"\u014d\5\r\7\2\u014d\u014e\5%\23\2\u014e\u014f\5\37\20\2\u014f\u0150\5"+
		"\33\16\2\u0150x\3\2\2\2\u0151\u0152\5)\25\2\u0152\u0153\5\3\2\2\u0153"+
		"\u0154\5\5\3\2\u0154\u0155\5\31\r\2\u0155\u0156\5\13\6\2\u0156z\3\2\2"+
		"\2\u0157\u0158\5\3\2\2\u0158\u0159\5\'\24\2\u0159|\3\2\2\2\u015a\u015b"+
		"\5/\30\2\u015b\u015c\5\21\t\2\u015c\u015d\5\13\6\2\u015d\u015e\5%\23\2"+
		"\u015e\u015f\5\13\6\2\u015f~\3\2\2\2\u0160\u0161\5\'\24\2\u0161\u0162"+
		"\5+\26\2\u0162\u0163\5\33\16\2\u0163\u0080\3\2\2\2\u0164\u0165\5\3\2\2"+
		"\u0165\u0166\5\35\17\2\u0166\u0167\5\t\5\2\u0167\u0082\3\2\2\2\u0168\u0169"+
		"\5\37\20\2\u0169\u016a\5%\23\2\u016a\u0084\3\2\2\2\u016b\u016c\5\'\24"+
		"\2\u016c\u016d\5)\25\2\u016d\u016e\5%\23\2\u016e\u016f\5\23\n\2\u016f"+
		"\u0170\5\35\17\2\u0170\u0171\5\17\b\2\u0171\u0086\3\2\2\2\u0172\u0173"+
		"\5\23\n\2\u0173\u0174\5\35\17\2\u0174\u0175\5)\25\2\u0175\u0088\3\2\2"+
		"\2\u0176\u0177\5\t\5\2\u0177\u0178\5\37\20\2\u0178\u0179\5+\26\2\u0179"+
		"\u017a\5\5\3\2\u017a\u017b\5\31\r\2\u017b\u017c\5\13\6\2\u017c\u008a\3"+
		"\2\2\2\u017d\u017e\5\17\b\2\u017e\u017f\5%\23\2\u017f\u0180\5\37\20\2"+
		"\u0180\u0181\5+\26\2\u0181\u0182\5!\21\2\u0182\u008c\3\2\2\2\u0183\u0184"+
		"\5\5\3\2\u0184\u0185\5\63\32\2\u0185\u008e\3\2\2\2\u0186\u0187\5\5\3\2"+
		"\u0187\u0188\5\13\6\2\u0188\u0189\5)\25\2\u0189\u018a\5/\30\2\u018a\u018b"+
		"\5\13\6\2\u018b\u018c\5\13\6\2\u018c\u018d\5\35\17\2\u018d\u0090\3\2\2"+
		"\2\u018e\u018f\5\35\17\2\u018f\u0190\5\37\20\2\u0190\u0092\3\2\2\2\u0191"+
		"\u0192\5\35\17\2\u0192\u0193\5\37\20\2\u0193\u0194\5)\25\2\u0194\u0094"+
		"\3\2\2\2\u0195\u0196\5\23\n\2\u0196\u0197\5\35\17\2\u0197\u0096\3\2\2"+
		"\2\u0198\u019a\t#\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\bL\3\2\u019e"+
		"\u0098\3\2\2\2\u019f\u01a3\5? \2\u01a0\u01a3\5;\36\2\u01a1\u01a3\7a\2"+
		"\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u009a\3\2\2\2\u01a6"+
		"\u01aa\5A!\2\u01a7\u01aa\5C\"\2\u01a8\u01aa\5E#\2\u01a9\u01a6\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u009c\3\2\2\2\u01ab\u01bc"+
		"\5\67\34\2\u01ac\u01b0\59\35\2\u01ad\u01af\5;\36\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01bc"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4\u01b8\59\35\2\u01b5"+
		"\u01b7\5;\36\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01ab\3\2\2\2\u01bb\u01ac\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bc\u009e\3\2"+
		"\2\2\u01bd\u01c1\59\35\2\u01be\u01c0\5;\36\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c8\7\60\2\2\u01c5\u01c7\5;\36\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u00a0\3\2\2\2\u01ca\u01c8\3\2\2\2\23\2\u00de\u00e8\u00ea\u00f5"+
		"\u00f7\u0102\u0104\u019b\u01a2\u01a4\u01a9\u01b0\u01b8\u01bb\u01c1\u01c8"+
		"\4\t\b\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}