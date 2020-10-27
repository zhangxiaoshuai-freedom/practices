// Generated from /Users/xiaoshuai.zhang/IdeaProjects/entry-task/src/main/resources/ETSql.g4 by ANTLR 4.8

package com.shopee.xiaoshuai.entrytask.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ETSqlParser extends Parser {
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
	public static final int
		RULE_sqlstatement = 0, RULE_createStatement = 1, RULE_column_defs = 2, 
		RULE_column_def = 3, RULE_type_name = 4, RULE_selectStatement = 5, RULE_selectElements = 6, 
		RULE_selectElement = 7, RULE_fullColumnName = 8, RULE_uid = 9, RULE_functionCall = 10, 
		RULE_functionArg = 11, RULE_tableSources = 12, RULE_subquery = 13, RULE_tableName = 14, 
		RULE_whereClause = 15, RULE_logicExpression = 16, RULE_conditionExpression = 17, 
		RULE_logicalOperator = 18, RULE_comparisonOperator = 19, RULE_value = 20, 
		RULE_textLiteral = 21, RULE_decimalLiteral = 22, RULE_groupByCaluse = 23, 
		RULE_groupByItem = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlstatement", "createStatement", "column_defs", "column_def", "type_name", 
			"selectStatement", "selectElements", "selectElement", "fullColumnName", 
			"uid", "functionCall", "functionArg", "tableSources", "subquery", "tableName", 
			"whereClause", "logicExpression", "conditionExpression", "logicalOperator", 
			"comparisonOperator", "value", "textLiteral", "decimalLiteral", "groupByCaluse", 
			"groupByItem"
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

	@Override
	public String getGrammarFileName() { return "ETSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ETSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlstatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON_SYMBOL() { return getToken(ETSqlParser.SEMICOLON_SYMBOL, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public SqlstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterSqlstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitSqlstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitSqlstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlstatementContext sqlstatement() throws RecognitionException {
		SqlstatementContext _localctx = new SqlstatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYMBOL:
				{
				setState(50);
				selectStatement();
				}
				break;
			case CREATE_SYMBOL:
				{
				setState(51);
				createStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			match(SEMICOLON_SYMBOL);
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

	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode CREATE_SYMBOL() { return getToken(ETSqlParser.CREATE_SYMBOL, 0); }
		public TerminalNode TABLE_SYMBOL() { return getToken(ETSqlParser.TABLE_SYMBOL, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(ETSqlParser.OPEN_PAR_SYMBOL, 0); }
		public Column_defsContext column_defs() {
			return getRuleContext(Column_defsContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(ETSqlParser.CLOSE_PAR_SYMBOL, 0); }
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CREATE_SYMBOL);
			setState(57);
			match(TABLE_SYMBOL);
			setState(58);
			tableName();
			setState(59);
			match(OPEN_PAR_SYMBOL);
			setState(60);
			column_defs();
			setState(61);
			match(CLOSE_PAR_SYMBOL);
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

	public static class Column_defsContext extends ParserRuleContext {
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(ETSqlParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(ETSqlParser.COMMA_SYMBOL, i);
		}
		public Column_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterColumn_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitColumn_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitColumn_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defsContext column_defs() throws RecognitionException {
		Column_defsContext _localctx = new Column_defsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			column_def();
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(64);
				match(COMMA_SYMBOL);
				setState(65);
				column_def();
				}
				}
				setState(70);
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

	public static class Column_defContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_column_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			fullColumnName();
			setState(72);
			type_name();
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

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode INT_SYMBOL() { return getToken(ETSqlParser.INT_SYMBOL, 0); }
		public TerminalNode STRING_SYMBOL() { return getToken(ETSqlParser.STRING_SYMBOL, 0); }
		public TerminalNode DOUBLE_SYMBOL() { return getToken(ETSqlParser.DOUBLE_SYMBOL, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_SYMBOL) | (1L << INT_SYMBOL) | (1L << DOUBLE_SYMBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT_SYMBOL() { return getToken(ETSqlParser.SELECT_SYMBOL, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode FROM_SYMBOL() { return getToken(ETSqlParser.FROM_SYMBOL, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByCaluseContext groupByCaluse() {
			return getRuleContext(GroupByCaluseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SELECT_SYMBOL);
			setState(77);
			selectElements();
			setState(78);
			match(FROM_SYMBOL);
			setState(79);
			tableSources();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(80);
				whereClause();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_SYMBOL) {
				{
				setState(83);
				groupByCaluse();
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

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(ETSqlParser.MULT_OPERATOR, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(ETSqlParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(ETSqlParser.COMMA_SYMBOL, i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT_OPERATOR:
				{
				setState(86);
				((SelectElementsContext)_localctx).star = match(MULT_OPERATOR);
				}
				break;
			case SUM_SYMBOL:
			case IDENTIFIER:
				{
				setState(87);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(90);
				match(COMMA_SYMBOL);
				setState(91);
				selectElement();
				}
				}
				setState(96);
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

	public static class SelectElementContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(ETSqlParser.AS_SYMBOL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitSelectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectElement);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				fullColumnName();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_SYMBOL || _la==IDENTIFIER) {
					{
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_SYMBOL) {
						{
						setState(98);
						match(AS_SYMBOL);
						}
					}

					setState(101);
					uid();
					}
				}

				}
				break;
			case SUM_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				functionCall();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_SYMBOL || _la==IDENTIFIER) {
					{
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_SYMBOL) {
						{
						setState(105);
						match(AS_SYMBOL);
						}
					}

					setState(108);
					uid();
					}
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

	public static class FullColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ETSqlParser.IDENTIFIER, 0); }
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENTIFIER);
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

	public static class UidContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ETSqlParser.IDENTIFIER, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode SUM_SYMBOL() { return getToken(ETSqlParser.SUM_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(ETSqlParser.OPEN_PAR_SYMBOL, 0); }
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(ETSqlParser.CLOSE_PAR_SYMBOL, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SUM_SYMBOL);
			setState(118);
			match(OPEN_PAR_SYMBOL);
			setState(119);
			functionArg();
			setState(120);
			match(CLOSE_PAR_SYMBOL);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ETSqlParser.IDENTIFIER, 0); }
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
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

	public static class TableSourcesContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterTableSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitTableSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitTableSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableSources);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				tableName();
				}
				break;
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				subquery();
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(ETSqlParser.OPEN_PAR_SYMBOL, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(ETSqlParser.CLOSE_PAR_SYMBOL, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(ETSqlParser.AS_SYMBOL, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			match(OPEN_PAR_SYMBOL);
			setState(129);
			selectStatement();
			setState(130);
			match(CLOSE_PAR_SYMBOL);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL) {
				{
				setState(131);
				match(AS_SYMBOL);
				}
			}

			setState(134);
			tableName();
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ETSqlParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IDENTIFIER);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE_SYMBOL() { return getToken(ETSqlParser.WHERE_SYMBOL, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHERE_SYMBOL);
			setState(139);
			logicExpression(0);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142);
			conditionExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
					setState(144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					logicalOperator();
					setState(146);
					logicExpression(2);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			fullColumnName();
			setState(154);
			comparisonOperator();
			setState(155);
			value();
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND_SYMBOL() { return getToken(ETSqlParser.AND_SYMBOL, 0); }
		public TerminalNode LOGICAL_AND_OPERATOR() { return getToken(ETSqlParser.LOGICAL_AND_OPERATOR, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(ETSqlParser.OR_SYMBOL, 0); }
		public TerminalNode LOGICAL_OR_OPERATOR() { return getToken(ETSqlParser.LOGICAL_OR_OPERATOR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICAL_AND_OPERATOR) | (1L << LOGICAL_OR_OPERATOR) | (1L << AND_SYMBOL) | (1L << OR_SYMBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_OPERATOR() { return getToken(ETSqlParser.EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(ETSqlParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(ETSqlParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_OR_EQUAL_OPERATOR() { return getToken(ETSqlParser.GREATER_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_OR_EQUAL_OPERATOR() { return getToken(ETSqlParser.LESS_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(ETSqlParser.NOT_EQUAL_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL2_OPERATOR() { return getToken(ETSqlParser.NOT_EQUAL2_OPERATOR, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_OPERATOR) | (1L << GREATER_OR_EQUAL_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_OR_EQUAL_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << NOT_EQUAL_OPERATOR) | (1L << NOT_EQUAL2_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ValueContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				uid();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				textLiteral();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				decimalLiteral();
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

	public static class TextLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ETSqlParser.STRING_LITERAL, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitTextLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitTextLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_textLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(STRING_LITERAL);
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

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(ETSqlParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ETSqlParser.INT, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
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

	public static class GroupByCaluseContext extends ParserRuleContext {
		public TerminalNode GROUP_SYMBOL() { return getToken(ETSqlParser.GROUP_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(ETSqlParser.BY_SYMBOL, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(ETSqlParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(ETSqlParser.COMMA_SYMBOL, i);
		}
		public GroupByCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterGroupByCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitGroupByCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitGroupByCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByCaluseContext groupByCaluse() throws RecognitionException {
		GroupByCaluseContext _localctx = new GroupByCaluseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_groupByCaluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(GROUP_SYMBOL);
			setState(171);
			match(BY_SYMBOL);
			setState(172);
			groupByItem();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(173);
				match(COMMA_SYMBOL);
				setState(174);
				groupByItem();
				}
				}
				setState(179);
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

	public static class GroupByItemContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).enterGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETSqlListener ) ((ETSqlListener)listener).exitGroupByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ETSqlVisitor ) return ((ETSqlVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(180);
				fullColumnName();
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
		case 16:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7T\n\7\3\7\5\7W\n\7\3\b\3\b\5\b[\n\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13"+
		"\b\3\t\3\t\5\tf\n\t\3\t\5\ti\n\t\3\t\3\t\5\tm\n\t\3\t\5\tp\n\t\5\tr\n"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0081"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0097\n\22\f\22\16\22\u009a"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u00a7"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u00b2\n\31\f\31"+
		"\16\31\u00b5\13\31\3\32\5\32\u00b8\n\32\3\32\2\3\"\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2!#\4\2\16\17\37 \4\2\3\b/"+
		"/\3\2-.\2\u00b2\2\66\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nL\3\2\2"+
		"\2\fN\3\2\2\2\16Z\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26w\3\2"+
		"\2\2\30|\3\2\2\2\32\u0080\3\2\2\2\34\u0082\3\2\2\2\36\u008a\3\2\2\2 \u008c"+
		"\3\2\2\2\"\u008f\3\2\2\2$\u009b\3\2\2\2&\u009f\3\2\2\2(\u00a1\3\2\2\2"+
		"*\u00a6\3\2\2\2,\u00a8\3\2\2\2.\u00aa\3\2\2\2\60\u00ac\3\2\2\2\62\u00b7"+
		"\3\2\2\2\64\67\5\f\7\2\65\67\5\4\3\2\66\64\3\2\2\2\66\65\3\2\2\2\678\3"+
		"\2\2\289\7\21\2\29\3\3\2\2\2:;\7\30\2\2;<\7\33\2\2<=\5\36\20\2=>\7\23"+
		"\2\2>?\5\6\4\2?@\7\24\2\2@\5\3\2\2\2AF\5\b\5\2BC\7\20\2\2CE\5\b\5\2DB"+
		"\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\5\22\n\2"+
		"JK\5\n\6\2K\t\3\2\2\2LM\t\2\2\2M\13\3\2\2\2NO\7\31\2\2OP\5\16\b\2PQ\7"+
		"\32\2\2QS\5\32\16\2RT\5 \21\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\60\31"+
		"\2VU\3\2\2\2VW\3\2\2\2W\r\3\2\2\2X[\7\13\2\2Y[\5\20\t\2ZX\3\2\2\2ZY\3"+
		"\2\2\2[`\3\2\2\2\\]\7\20\2\2]_\5\20\t\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2a\17\3\2\2\2b`\3\2\2\2ch\5\22\n\2df\7\34\2\2ed\3\2\2\2ef\3\2"+
		"\2\2fg\3\2\2\2gi\5\24\13\2he\3\2\2\2hi\3\2\2\2ir\3\2\2\2jo\5\26\f\2km"+
		"\7\34\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\5\24\13\2ol\3\2\2\2op\3\2\2"+
		"\2pr\3\2\2\2qc\3\2\2\2qj\3\2\2\2r\21\3\2\2\2st\7+\2\2t\23\3\2\2\2uv\7"+
		"+\2\2v\25\3\2\2\2wx\7\36\2\2xy\7\23\2\2yz\5\30\r\2z{\7\24\2\2{\27\3\2"+
		"\2\2|}\7+\2\2}\31\3\2\2\2~\u0081\5\36\20\2\177\u0081\5\34\17\2\u0080~"+
		"\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2\2\2\u0082\u0083\7\23\2\2\u0083"+
		"\u0084\5\f\7\2\u0084\u0086\7\24\2\2\u0085\u0087\7\34\2\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\36\20\2\u0089"+
		"\35\3\2\2\2\u008a\u008b\7+\2\2\u008b\37\3\2\2\2\u008c\u008d\7\35\2\2\u008d"+
		"\u008e\5\"\22\2\u008e!\3\2\2\2\u008f\u0090\b\22\1\2\u0090\u0091\5$\23"+
		"\2\u0091\u0098\3\2\2\2\u0092\u0093\f\3\2\2\u0093\u0094\5&\24\2\u0094\u0095"+
		"\5\"\22\4\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099#\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\5(\25\2\u009d\u009e\5*\26\2\u009e"+
		"%\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0\'\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		")\3\2\2\2\u00a3\u00a7\5\24\13\2\u00a4\u00a7\5,\27\2\u00a5\u00a7\5.\30"+
		"\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7+"+
		"\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9-\3\2\2\2\u00aa\u00ab\t\5\2\2\u00ab/"+
		"\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\7%\2\2\u00ae\u00b3\5\62\32\2\u00af"+
		"\u00b0\7\20\2\2\u00b0\u00b2\5\62\32\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\61\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b8\5\22\n\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\63\3\2\2\2\23\66FSVZ`ehloq\u0080\u0086\u0098\u00a6\u00b3"+
		"\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}