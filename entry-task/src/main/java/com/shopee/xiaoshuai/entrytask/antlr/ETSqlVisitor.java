// Generated from /Users/xiaoshuai.zhang/IdeaProjects/entry-task/src/main/resources/ETSql.g4 by ANTLR 4.8

package com.shopee.xiaoshuai.entrytask.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ETSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ETSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#sqlstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlstatement(ETSqlParser.SqlstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(ETSqlParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#column_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_defs(ETSqlParser.Column_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(ETSqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(ETSqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(ETSqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(ETSqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(ETSqlParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(ETSqlParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(ETSqlParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ETSqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(ETSqlParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(ETSqlParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(ETSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(ETSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ETSqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(ETSqlParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(ETSqlParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(ETSqlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(ETSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ETSqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#textLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLiteral(ETSqlParser.TextLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(ETSqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#groupByCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByCaluse(ETSqlParser.GroupByCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ETSqlParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(ETSqlParser.GroupByItemContext ctx);
}