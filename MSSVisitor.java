// Generated from MSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MSSParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MSSParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(MSSParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MSSParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(MSSParser.OpexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(MSSParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifexpr}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(MSSParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refvar}
	 * labeled alternative in {@link MSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefvar(MSSParser.RefvarContext ctx);
}