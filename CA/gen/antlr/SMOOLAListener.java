// Generated from /Users/yasaman/Desktop/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SMOOLAParser}.
 */
public interface SMOOLAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SMOOLAParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SMOOLAParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(SMOOLAParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(SMOOLAParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#main_method}.
	 * @param ctx the parse tree
	 */
	void enterMain_method(SMOOLAParser.Main_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#main_method}.
	 * @param ctx the parse tree
	 */
	void exitMain_method(SMOOLAParser.Main_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#usual_class}.
	 * @param ctx the parse tree
	 */
	void enterUsual_class(SMOOLAParser.Usual_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#usual_class}.
	 * @param ctx the parse tree
	 */
	void exitUsual_class(SMOOLAParser.Usual_classContext ctx);
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
	 * Enter a parse tree produced by {@link SMOOLAParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SMOOLAParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SMOOLAParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#while_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expression(SMOOLAParser.While_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#while_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expression(SMOOLAParser.While_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(SMOOLAParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(SMOOLAParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArray_element(SMOOLAParser.Array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArray_element(SMOOLAParser.Array_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SMOOLAParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SMOOLAParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#instanciation}.
	 * @param ctx the parse tree
	 */
	void enterInstanciation(SMOOLAParser.InstanciationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#instanciation}.
	 * @param ctx the parse tree
	 */
	void exitInstanciation(SMOOLAParser.InstanciationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#new_array}.
	 * @param ctx the parse tree
	 */
	void enterNew_array(SMOOLAParser.New_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#new_array}.
	 * @param ctx the parse tree
	 */
	void exitNew_array(SMOOLAParser.New_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#array_length}.
	 * @param ctx the parse tree
	 */
	void enterArray_length(SMOOLAParser.Array_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#array_length}.
	 * @param ctx the parse tree
	 */
	void exitArray_length(SMOOLAParser.Array_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(SMOOLAParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(SMOOLAParser.Method_callContext ctx);
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
	 * Enter a parse tree produced by {@link SMOOLAParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SMOOLAParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SMOOLAParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SMOOLAParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SMOOLAParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#main_body}.
	 * @param ctx the parse tree
	 */
	void enterMain_body(SMOOLAParser.Main_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#main_body}.
	 * @param ctx the parse tree
	 */
	void exitMain_body(SMOOLAParser.Main_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(SMOOLAParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(SMOOLAParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#main_method_body}.
	 * @param ctx the parse tree
	 */
	void enterMain_method_body(SMOOLAParser.Main_method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#main_method_body}.
	 * @param ctx the parse tree
	 */
	void exitMain_method_body(SMOOLAParser.Main_method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SMOOLAParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SMOOLAParser.MethodContext ctx);
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
}