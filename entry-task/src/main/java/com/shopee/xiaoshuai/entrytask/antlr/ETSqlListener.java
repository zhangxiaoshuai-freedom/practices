// Generated from /Users/xiaoshuai.zhang/IdeaProjects/entry-task/src/main/resources/ETSql.g4 by ANTLR 4.8

package com.shopee.xiaoshuai.entrytask.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ETSqlParser}.
 */
public interface ETSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#sqlstatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlstatement(ETSqlParser.SqlstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#sqlstatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlstatement(ETSqlParser.SqlstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(ETSqlParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(ETSqlParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#column_defs}.
	 * @param ctx the parse tree
	 */
	void enterColumn_defs(ETSqlParser.Column_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#column_defs}.
	 * @param ctx the parse tree
	 */
	void exitColumn_defs(ETSqlParser.Column_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(ETSqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(ETSqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(ETSqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(ETSqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(ETSqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(ETSqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(ETSqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(ETSqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(ETSqlParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(ETSqlParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(ETSqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(ETSqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(ETSqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(ETSqlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ETSqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ETSqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(ETSqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(ETSqlParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(ETSqlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(ETSqlParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ETSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ETSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ETSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ETSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ETSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ETSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(ETSqlParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(ETSqlParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(ETSqlParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(ETSqlParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(ETSqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(ETSqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ETSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ETSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ETSqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ETSqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(ETSqlParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(ETSqlParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ETSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ETSqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterGroupByCaluse(ETSqlParser.GroupByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitGroupByCaluse(ETSqlParser.GroupByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ETSqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(ETSqlParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ETSqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(ETSqlParser.GroupByItemContext ctx);
}