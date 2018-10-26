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
	 * Visit a parse tree produced by {@link SMOOLAParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SMOOLAParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(SMOOLAParser.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_method(SMOOLAParser.Main_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#usual_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsual_class(SMOOLAParser.Usual_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_arithmethic_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_arithmethic_exp(SMOOLAParser.Main_arithmethic_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#arithmethic_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmethic_exp(SMOOLAParser.Arithmethic_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SMOOLAParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_condition(SMOOLAParser.Main_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#while_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expression(SMOOLAParser.While_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_while_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_while_expression(SMOOLAParser.Main_while_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(SMOOLAParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_if_expression(SMOOLAParser.Main_if_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_element(SMOOLAParser.Array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SMOOLAParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_assignment(SMOOLAParser.Main_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#instanciation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciation(SMOOLAParser.InstanciationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#new_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_array(SMOOLAParser.New_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#array_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_length(SMOOLAParser.Array_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(SMOOLAParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_writeln_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_writeln_call(SMOOLAParser.Main_writeln_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#writeln_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_call(SMOOLAParser.Writeln_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_expression(SMOOLAParser.Main_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_line(SMOOLAParser.Main_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SMOOLAParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SMOOLAParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SMOOLAParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_body(SMOOLAParser.Main_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(SMOOLAParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_method_body(SMOOLAParser.Main_method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SMOOLAParser.MethodContext ctx);
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
	 * Visit a parse tree produced by {@link SMOOLAParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SMOOLAParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_comparator_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_comparator_atom(SMOOLAParser.Main_comparator_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#comparator_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator_atom(SMOOLAParser.Comparator_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#logical_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_exp(SMOOLAParser.Logical_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_logical_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_logical_exp(SMOOLAParser.Main_logical_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#equal_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_exp(SMOOLAParser.Equal_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_equal_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_equal_exp(SMOOLAParser.Main_equal_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(SMOOLAParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_mult_expr(SMOOLAParser.Main_mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#atom_bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_bool_exp(SMOOLAParser.Atom_bool_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_atom_bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_atom_bool_exp(SMOOLAParser.Main_atom_bool_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_atom_arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_atom_arith_expr(SMOOLAParser.Main_atom_arith_exprContext ctx);
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
	 * Visit a parse tree produced by {@link SMOOLAParser#main_and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_and_expr(SMOOLAParser.Main_and_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#main_atom_logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_atom_logical_expr(SMOOLAParser.Main_atom_logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#atom_logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_logical_expr(SMOOLAParser.Atom_logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMOOLAParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SMOOLAParser.CommentContext ctx);
}