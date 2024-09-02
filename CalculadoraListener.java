// Generated from Calculadora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculadoraParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculadoraParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculadoraParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculadoraParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(CalculadoraParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(CalculadoraParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculadoraParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculadoraParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculadoraParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculadoraParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculadoraParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculadoraParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculadoraParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculadoraParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Absolute}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute(CalculadoraParser.AbsoluteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Absolute}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute(CalculadoraParser.AbsoluteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(CalculadoraParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(CalculadoraParser.PowerContext ctx);
}