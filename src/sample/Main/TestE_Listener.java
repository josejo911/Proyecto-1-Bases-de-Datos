package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de los listeners de errores
 *
 * Se modifico al agregar un string de error donde se guardara el error poara poder hacer
 * un set y get.
 * */

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import org.antlr.v4.runtime.*;

import java.util.*;

public class TestE_Listener extends BaseErrorListener {
        private String error;
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e)
        {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            System.err.println("rule stack: "+stack);
            error+="line "+line+":"+charPositionInLine+" at "+
                    offendingSymbol+": "+msg;
        }
        public String getError(){
            return error;
        }
        public String setError(String error){
            return this.error = error;
        }

    }