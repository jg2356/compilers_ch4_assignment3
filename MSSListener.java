// Generated from MSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSSParser}.
 */
public interface MSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MSSParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MSSParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MSSParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MSSParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MSSParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MSSParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpexpr(MSSParser.OpexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpexpr(MSSParser.OpexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(MSSParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(MSSParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfexpr(MSSParser.IfexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfexpr(MSSParser.IfexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRefvar(MSSParser.RefvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRefvar(MSSParser.RefvarContext ctx);
}