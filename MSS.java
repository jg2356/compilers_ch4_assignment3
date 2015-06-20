import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MSS {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        MSSLexer lexer = new MSSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MSSParser parser = new MSSParser(tokens);
        ParseTree tree = parser.prog();
        SchemeVisitor calc = new SchemeVisitor();
        calc.visit(tree);
    }
}
