package sample.Main;


import jdk.nashorn.api.tree.TreeVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Gramatica.*;

/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de la implementacion del visitor.*/
public class TheCompiler {

    public TheCompiler(){

    }

    public static String compiling(String programa, boolean verbose){
        CharStream stream = CharStreams.fromString(programa);
        pruebaLexer pruebaLexer = new pruebaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(pruebaLexer);
        pruebaParser parser = new pruebaParser(tokens);
        parser.removeErrorListeners();
        TestE_Listener listener=new TestE_Listener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.programa();
        TheVisitor visitor = new TheVisitor(verbose);
        visitor.visit(tree);
        String t = visitor.getTexto();
        return t;
    }



}
