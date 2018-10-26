// Generated from /Users/yasaman/Desktop/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SMOOLAParser}.
 */
public interface SMOOLAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#arithmethic_exp}.
	 * @param ctx the parse tree
	 */
	void enterArithmethic_exp(SMOOLAParser.Arithmethic_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#arithmethic_exp}.
	 * @param ctx the parse tree
	 */
	void exitArithmethic_exp(SMOOLAParser.Arithmethic_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SMOOLAParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SMOOLAParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SMOOLAParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SMOOLAParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(SMOOLAParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(SMOOLAParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#comparator_binary}.
	 * @param ctx the parse tree
	 */
	void enterComparator_binary(SMOOLAParser.Comparator_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#comparator_binary}.
	 * @param ctx the parse tree
	 */
	void exitComparator_binary(SMOOLAParser.Comparator_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SMOOLAParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SMOOLAParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#logical_val}.
	 * @param ctx the parse tree
	 */
	void enterLogical_val(SMOOLAParser.Logical_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#logical_val}.
	 * @param ctx the parse tree
	 */
	void exitLogical_val(SMOOLAParser.Logical_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SMOOLAParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SMOOLAParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SMOOLAParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SMOOLAParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#comparator_atom}.
	 * @param ctx the parse tree
	 */
	void enterComparator_atom(SMOOLAParser.Comparator_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#comparator_atom}.
	 * @param ctx the parse tree
	 */
	void exitComparator_atom(SMOOLAParser.Comparator_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#logical_exp}.
	 * @param ctx the parse tree
	 */
	void enterLogical_exp(SMOOLAParser.Logical_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#logical_exp}.
	 * @param ctx the parse tree
	 */
	void exitLogical_exp(SMOOLAParser.Logical_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#equal_exp}.
	 * @param ctx the parse tree
	 */
	void enterEqual_exp(SMOOLAParser.Equal_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#equal_exp}.
	 * @param ctx the parse tree
	 */
	void exitEqual_exp(SMOOLAParser.Equal_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(SMOOLAParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(SMOOLAParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#atom_bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterAtom_bool_exp(SMOOLAParser.Atom_bool_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#atom_bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitAtom_bool_exp(SMOOLAParser.Atom_bool_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#atom_arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_arith_expr(SMOOLAParser.Atom_arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#atom_arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_arith_expr(SMOOLAParser.Atom_arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(SMOOLAParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(SMOOLAParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#atom_logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_logical_expr(SMOOLAParser.Atom_logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#atom_logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_logical_expr(SMOOLAParser.Atom_logical_exprContext ctx);
}