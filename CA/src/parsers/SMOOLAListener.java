// Generated from /home/sadaf/Documents/compiler/phase1/smoolaCompiler/CA/src/antlr/SMOOLA.g4 by ANTLR 4.7
package parsers;
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
	 * Enter a parse tree produced by {@link SMOOLAParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(SMOOLAParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(SMOOLAParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(SMOOLAParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(SMOOLAParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMOOLAParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(SMOOLAParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMOOLAParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(SMOOLAParser.AtomExpContext ctx);
}