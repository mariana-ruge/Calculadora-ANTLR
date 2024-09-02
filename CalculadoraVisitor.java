// Generated from Calculadora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CalculadoraParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CalculadoraParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(CalculadoraParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalculadoraParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CalculadoraParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CalculadoraParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalculadoraParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Absolute}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute(CalculadoraParser.AbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalculadoraParser.PowerContext ctx);
}