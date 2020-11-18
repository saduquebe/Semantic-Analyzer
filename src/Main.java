/**
 * Memebers:
 * @Author Gabriel Andres Avendaño Casadiego  gavendanoc@unal.edu.co
 * @Author Santiago Duque Bernal              saduquebe@unal.edu.co
 * @Author Juan Diego Medina Naranjo          jmedinan@unal.edu.co
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BccLanguageLexer lexer;
            if (args.length>0)
                lexer = new BccLanguageLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new BccLanguageLexer(CharStreams.fromStream(System.in));


            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BccLanguageParser parser = new BccLanguageParser(tokens);
            ParseTree tree = parser.prog();

            MyVisitor<Object> loader = new MyVisitor<Object>();
            loader.visit(tree);


        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
