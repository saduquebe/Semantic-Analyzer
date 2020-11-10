import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Scanner;

public class MyVisitor<T> extends BccLanguageBaseVisitor {

    HashMap<String, Object> table = new HashMap<>();
    Boolean tk_break = false;
    Boolean tk_next = false;

    @Override
    public T visitProg(BccLanguageParser.ProgContext ctx) {
        for (int i = 0; i < ctx.fn_decl_list().size(); i++) {
            visitFn_decl_list(ctx.fn_decl_list(i));
        }
        return visitMain_prog(ctx.main_prog());
    }

    @Override
    public T visitVar_decl(BccLanguageParser.Var_declContext ctx) {
        for (int i = 0; i < ctx.ID().size(); i++) {
            String name = ctx.ID(i).getText();
            if (table.get(name) != null) {
                int line = ctx.ID(i).getSymbol().getLine();
                int col = ctx.ID(i).getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semántico, la variable con nombre: " + name + " ya ha sido declarada.", line, col);
                System.exit(-1);
            }else{
                Datatype type = new Datatype();
                if (ctx.DATATYPE(i).getText().equals("num")) {
                    type.setType(Datatype.Type.DOUBLE);
                    type.setValue(0.0);
                } else {
                    type.setType(Datatype.Type.BOOLEAN);
                    type.setValue(true);
                }
                table.put(name, type);
            }
        }
        return null;
    }

    @Override
    public T visitFn_decl_list(BccLanguageParser.Fn_decl_listContext ctx) {
        if (ctx.var_decl(0) != null) {
            visitVar_decl(ctx.var_decl(0));
        }
        if (ctx.VAR() != null) {
            visitVar_decl(ctx.var_decl(1));
        }
        visitStmt_block(ctx.stmt_block());

        return null;
    }

    @Override
    public T visitStmt_block(BccLanguageParser.Stmt_blockContext ctx) {
        int stmtSize = ctx.stmt().size();
        if (stmtSize > 1) {
            for (int i = 0; i < stmtSize; i++) {
                if(tk_next || tk_break){
                    tk_next =false;
                    return null;
                }
                visitStmt(ctx.stmt(i));
            }
        } else {
            visitStmt(ctx.stmt(0));
        }
        return null;
    }

    @Override
    public T visitStmt(BccLanguageParser.StmtContext ctx) {
        if (ctx.PRINT() != null) {
            System.out.println(visitLexpr(ctx.lexpr(0)));
        } else if (ctx.INPUT() != null) {
            Scanner scan = new Scanner(System.in);
            String id = ctx.ID().getSymbol().getText();
            if (table.containsKey(id)) {
                System.out.println("Se va a reemplazar el valor de: " + id);
                if ((Double) table.get(id) == 0.0) {
                    table.replace(id, scan.nextDouble());
                } else {
                    table.replace(id, scan.nextBoolean());
                }
            }
        } else if (ctx.WHEN() != null) {
            if (Utils.castToBoolean(visitLexpr(ctx.lexpr(0)))) {
                visitStmt_block(ctx.stmt_block(0));
            }
        } else if (ctx.IF() != null) {
            if (Utils.castToBoolean(visitLexpr(ctx.lexpr(0)))) {
                visitStmt_block(ctx.stmt_block(0));
            } else {
                visitStmt_block(ctx.stmt_block(1));
            }
        } else if (ctx.UNLESS() != null) {
            if (!Utils.castToBoolean(visitLexpr(ctx.lexpr(0)))) {
                visitStmt_block(ctx.stmt_block(0));
            }
        } else if (ctx.ALONEWHILE != null) {
            while (Utils.castToBoolean(visitLexpr(ctx.lexpr(0)))) {
                    visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }
            }
        } else if (ctx.RETURN() != null) {
            return (T) visitLexpr(ctx.lexpr(0));
        } else if (ctx.ALONEUNTIL != null) {
            while (!Utils.castToBoolean(visitLexpr(ctx.lexpr(0)))) {
                    visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }
            }
        } else if (ctx.LOOP() != null) {
            //loop infinito????
        } else if (ctx.DOWHILE != null) {
            do {
                visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }
            } while ((Boolean)visitLexpr(ctx.lexpr(0)));
        } else if (ctx.DOUNTIL != null) {
            do {
                visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }
            } while (!Utils.castToBoolean(visitLexpr(ctx.lexpr(0))));
        } else if (ctx.REPEAT() != null) {
            //repetir un bloque un número de veces?
            int iterator = Integer.parseInt(ctx.NUM().getSymbol().getText());
            for (int i = 0; i < iterator; i++) {
                    visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }

            }
        }
        else if(ctx.FOR() != null){

            for (visitLexpr(ctx.lexpr(0)); Utils.castToBoolean(visitLexpr(ctx.lexpr(1))); visitLexpr(ctx.lexpr(2))){ //?
                visitStmt_block(ctx.stmt_block(0));
                if (tk_break) {
                    tk_break = false;
                    break;
                }
            }
        }
        else if (ctx.NEXT() != null) {
            tk_next = true;
        } else if (ctx.BREAK() != null) {
            tk_break = true;
        }
        else if(ctx.ASSIGNOP() != null){
            T result = visitLexpr(ctx.lexpr(0));
            String name = ctx.ID().getText();
            if (table.get(name) == null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semántico, la variable con nombre: " +name + " no ha sido declarada.",line,col);
                System.exit(-1);
            }

            String op = ctx.ASSIGNOP().getText();
            Datatype var = (Datatype) table.get(name);
            switch (op){
                case ":=":
                    var.setValue(result);
                    break;
                case "+=":
                    if (var.getType() == Datatype.Type.DOUBLE)
                        var.setValue( (Double) var.getValue() + Utils.castToDouble(result));
                    else
                        var.setValue( Utils.castToDouble(var.getValue()) + Utils.castToDouble(result));
                    break;
                case "-=":
                    if (var.getType() == Datatype.Type.DOUBLE)
                        var.setValue( (Double) var.getValue() - Utils.castToDouble(result));
                    else
                        var.setValue( Utils.castToDouble(var.getValue()) - Utils.castToDouble(result));
                    break;
                case "*=":
                    if (var.getType() == Datatype.Type.DOUBLE)
                        var.setValue( (Double) var.getValue() * Utils.castToDouble(result));
                    else
                        var.setValue( Utils.castToDouble(var.getValue()) * Utils.castToDouble(result));
                    break;
                case "/=":
                    if (var.getType() == Datatype.Type.DOUBLE)
                        var.setValue( (Double) var.getValue() / Utils.castToDouble(result));
                    else
                        var.setValue( Utils.castToDouble(var.getValue()) / Utils.castToDouble(result));
                    break;
                case "%=":
                    if (var.getType() == Datatype.Type.DOUBLE)
                        var.setValue( (Double) var.getValue() % Utils.castToDouble(result));
                    else
                        var.setValue( Utils.castToDouble(var.getValue()) % Utils.castToDouble(result));
                    break;

            }
        }
        else if (ctx.RIGHT_INC != null || ctx.RIGHT_DEC != null || ctx.LEFT_INC != null || ctx.LEFT_DEC != null) {
            String name = ctx.ID().getText();
            if (table.get(name) == null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n", line, col);
                System.exit(-1);
            }
            Datatype var = (Datatype) table.get(name);
            Double id = (Double) var.getValue();
            if (ctx.RIGHT_INC != null || ctx.LEFT_INC != null) {
                var.setValue(id + 1);
            } else {
                var.setValue(id - 1);
            }

            if (ctx.RIGHT_INC != null || ctx.RIGHT_DEC != null) {
                return (T) id;
            }
            return (T) var.getValue();
        }
        return null;
    }

    @Override
    public T visitLexpr(BccLanguageParser.LexprContext ctx){
        if (ctx.nexpr().size() == 1) {
            return visitNexpr(ctx.nexpr(0));
        }

        boolean result = Utils.castToBoolean(visitNexpr(ctx.nexpr(0)));

        if (ctx.AND().size() != 0) {
            for (int i = 0; i < ctx.AND().size(); i++){
                boolean nexpr = Utils.castToBoolean(visitNexpr(ctx.nexpr(i + 1)));
                result = result && nexpr;
            }

            return (T) (Boolean) result;
        }

        for (int i = 0; i < ctx.OR().size(); i++){
            boolean nexpr = Utils.castToBoolean(visitNexpr(ctx.nexpr(i + 1)));
            result = result || nexpr;
        }
        return (T) (Boolean) result;
    }

    @Override
    public T visitNexpr(BccLanguageParser.NexprContext ctx){
        if(ctx.NOT() != null) {
            Boolean result = ! Utils.castToBoolean( visitLexpr(ctx.lexpr()));
            return (T) result;
        };
        return visitRexpr(ctx.rexpr());
    }

    @Override
    public T visitRexpr(BccLanguageParser.RexprContext ctx){
        if (ctx.simple_expr().size() == 1) {
            return (T) visitSimple_expr(ctx.simple_expr(0));
        }

        Double simple_expr1 = Utils.castToDouble(visitSimple_expr(ctx.simple_expr(0)));
        Double simple_expr2 = Utils.castToDouble(visitSimple_expr(ctx.simple_expr(1)));
        String op = ctx.COMPARISONOP().getText();

        switch (op) {
            case "<":
                return (T) (Boolean) (simple_expr1 < simple_expr2);
            case "==":
                return (T) (Boolean) (simple_expr1.equals(simple_expr2));
            case "<=":
                return (T) (Boolean) (simple_expr1 <= simple_expr2);
            case ">":
                return (T) (Boolean) (simple_expr1 > simple_expr2);
            case ">=":
                return (T) (Boolean) (simple_expr1 >= simple_expr2);
            case "!=":
                return (T) (Boolean) (!simple_expr1.equals(simple_expr2));
        }
        return null;
    }

    @Override
    public T visitSimple_expr(BccLanguageParser.Simple_exprContext ctx){
        if (ctx.term().size() == 1) {
            return visitTerm(ctx.term(0)); // puede ser un bool o un numero
        }

        // Debe ser un numero
        Double total = Utils.castToDouble(visitTerm(ctx.term(0)));
        for (int i = 1 ; i < ctx.term().size() ; i++){
            Double term = Utils.castToDouble(visitTerm(ctx.term(i)));
            String op = ctx.SUMOP(i - 1).getText();
            switch (op) {
                case "+":
                    total += term;
                    break;
                case "-":
                    total -= term;
                    break;
            }
        }
        return (T) total;
    }

    @Override
    public T visitTerm(BccLanguageParser.TermContext ctx) {
        if (ctx.factor().size() == 1) return visitFactor(ctx.factor(0));

        Double answer = Utils.castToDouble(visitFactor(ctx.factor(0)));
        for(int i =1;i<ctx.factor().size();i++){
            try {
                Double fi = Utils.castToDouble(visitFactor(ctx.factor(i)));
                switch (ctx.MULOP(i - 1).getText()) {
                    case "/":
                        answer /= fi;
                        break;
                    case "*":
                        answer *= fi;
                        break;
                    case "%":
                        answer %= fi;
                        break;
                }
            } catch (Exception e) { // Error: Uno de los factores(Bool o ID) no es numero
                int line = ctx.factor(i).NUM().getSymbol().getLine();
                int col = ctx.factor(i).NUM().getSymbol().getCharPositionInLine() + 1;
                if (ctx.factor(i).BOOL() != null) {
                    String symbol = ctx.factor(i).BOOL().getSymbol().getText();
                    System.err.printf("<%d:%d> Error semántico, " + symbol + " no es un símbolo válido para una para la operación.", line, col);
                } else {
                    String varName = ctx.factor(i).ID().getSymbol().getText();
                    System.err.printf("<%d:%d> Error semántico, el valor la variable " + varName + " no es válido para la operación.", line, col);
                }
                System.exit(-1);
            }
        }
        return (T) answer;
    }

    @Override
    public T visitFactor(BccLanguageParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            return (T) (Double) Double.parseDouble(ctx.NUM().getText());
        }
        if (ctx.BOOL() != null) {
            return (T) (Boolean) ctx.BOOL().getText().equals("true");
        }
        if (ctx.RIGHT_INC != null || ctx.RIGHT_DEC != null || ctx.LEFT_INC != null || ctx.LEFT_DEC != null) {
            String name = ctx.ID().getText();
            if (table.get(name) == null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n", line, col);
                System.exit(-1);
            }
            Datatype var = (Datatype) table.get(name);
            Double id = (Double) var.getValue();
            if (ctx.RIGHT_INC != null || ctx.LEFT_INC != null) {
                var.setValue(id + 1);
            } else {
                var.setValue(id - 1);
            }

            if (ctx.RIGHT_INC != null || ctx.RIGHT_DEC != null) {
                return (T) id;
            }
            return (T) var.getValue();
        }
        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            if (table.get(name) == null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n", line, col);
                System.exit(-1);
            }

            Datatype var = (Datatype) table.get(name);
            return (T) var.getValue();
        }
        if (ctx.ALONE_EXPR != null) {
            return (T) visitLexpr(ctx.lexpr(0));
        }
        if (ctx.FID() != null) {
            // NI IDEA COMO HACER ESTO
        }
        return null;
    }

    @Override
    public T visitMain_prog(BccLanguageParser.Main_progContext ctx) {
        if (ctx.VAR() != null) {
            visitVar_decl(ctx.var_decl());
        }
        if (ctx.stmt() != null) {
            for (int i = 0; i < ctx.stmt().size(); i++) {
                visitStmt(ctx.stmt(i));
            }
        }
        return null; // como saber que ya acabo?
    }

}
