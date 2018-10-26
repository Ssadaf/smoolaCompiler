// Generated from /Users/yasaman/Desktop/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SMOOLAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SMOOLAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#arithmethic_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmethic_exp(SMOOLAParser.Arithmethic_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#logical_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_exp(SMOOLAParser.Logical_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SMOOLAParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(SMOOLAParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SMOOLAParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#logical_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_val(SMOOLAParser.Logical_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SMOOLAParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SMOOLAParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(SMOOLAParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#atom_arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_arith_expr(SMOOLAParser.Atom_arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(SMOOLAParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#atom_logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_logical_expr(SMOOLAParser.Atom_logical_exprContext ctx);
}