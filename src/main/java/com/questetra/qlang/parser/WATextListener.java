// Generated from com\questetra\qlang\parser\WAText.g4 by ANTLR 4.9.2
package com.questetra.qlang.parser;

import com.questetra.qlang.nodes.ExpressionNode;
import com.questetra.qlang.nodes.FunctionNode;
import com.oracle.truffle.api.source.Source;
import java.util.ArrayList;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WATextParser}.
 */
public interface WATextListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WATextParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(WATextParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WATextParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(WATextParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WATextParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WATextParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WATextParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WATextParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WATextParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(WATextParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link WATextParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(WATextParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link WATextParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WATextParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WATextParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WATextParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WATextParser#declare_const}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_const(WATextParser.Declare_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link WATextParser#declare_const}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_const(WATextParser.Declare_constContext ctx);
}