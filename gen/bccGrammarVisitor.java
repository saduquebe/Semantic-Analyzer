// Generated from D:/Users/juanm/Desktop/SemanticAnalyzer/grammar\bccGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bccGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bccGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(bccGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(bccGrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(bccGrammarParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(bccGrammarParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(bccGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(bccGrammarParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(bccGrammarParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(bccGrammarParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(bccGrammarParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(bccGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(bccGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bccGrammarParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(bccGrammarParser.Main_progContext ctx);
}