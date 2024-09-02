import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        // Configura el análisis del archivo de entrada
        CharStream input = CharStreams.fromFileName(args[0]);
        CalculadoraLexer lexer = new CalculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculadoraParser parser = new CalculadoraParser(tokens);
        
        // Analiza el archivo
        ParseTree tree = parser.prog();
        
        // Evalúa el árbol de análisis
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
