import java.util.HashMap;
import java.util.Scanner;

public class MyVisitor<T> extends BccLanguageBaseVisitor {

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public  T visitProg(BccLanguageParser.ProgContext ctx){
        for(int i =0 ; i< ctx.fn_decl_list().size(); i++){
            visitFn_decl_list(ctx.fn_decl_list(i));
        }
        return visitMain_prog(ctx.main_prog());
    }
    @Override
    public T visitVar_decl(BccLanguageParser.Var_declContext ctx){
        for(int i=0;i<ctx.ID().size();i++){
            String name = ctx.ID(i).getText();
            if (table.get(name) != null){
                int line = ctx.ID(i).getSymbol().getLine();
                int col = ctx.ID(i).getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semántico, la variable con nombre: " +name + " ya ha sido declarada.",line,col);
                System.exit(-1);
            }else{
                if (ctx.DATATYPE(i).getText() == "num")
                    table.put(name, 0.0);
                else
                    table.put(name, true);
            }
        }
        return null;
    }

    @Override
    public T visitFn_decl_list(BccLanguageParser.Fn_decl_listContext ctx){
        if (ctx.var_decl(0) != null){
            visitVar_decl(ctx.var_decl(0));
        }
        if(ctx.VAR() != null){
            visitVar_decl(ctx.var_decl(1));
        }
        visitStmt_block(ctx.stmt_block());

        return null;
    }

    @Override
    public T visitStmt_block(BccLanguageParser.Stmt_blockContext ctx){
        int stmtSize = ctx.stmt().size();
        if(stmtSize > 1){
            for (int i = 0; i < stmtSize; i++){
                visitStmt(ctx.stmt(0));
            }
        }
        else{
            visitStmt(ctx.stmt(1));
        }
        return null;
    }

    @Override
    public T visitStmt(BccLanguageParser.StmtContext ctx){
        if(ctx.PRINT() != null){
            System.out.println(visitLexpr(ctx.lexpr(0)));
        }
        else if (ctx.INPUT() != null){
            Scanner scan = new Scanner(System.in);
            String id = ctx.ID().getSymbol().getText();
            System.out.println(id);
            if(table.containsKey(id)) {
                System.out.println("Se va a reemplazar el valor de: "+ id);
                if((Double) table.get(id)== 0.0){
                    table.replace(id,scan.nextDouble());
                }
                else{
                    table.replace(id,scan.nextBoolean());
                }
            }
        }
        else if(ctx.WHEN() != null){
            //Hacer hasta que lexpr se de ?
        }
        else if(ctx.IF() != null){
            if((Boolean) visitLexpr(ctx.lexpr(2))){
                visitStmt_block(ctx.stmt_block(1));
            }
            else{
                visitStmt_block(ctx.stmt_block(2));
            }
        }
        else if(ctx.UNLESS() != null){
            //se hace hasta que se cumpla la condicion?
        }
        else if(ctx.WHILE() != null){
            while((Boolean) visitLexpr(ctx.lexpr(4))) {
                visitStmt_block(ctx.stmt_block(4));
            }
        }
        else if(ctx.RETURN() != null){
            return (T) visitLexpr(ctx.lexpr(5));
        }
        else if(ctx.UNTIL() != null){
            while(!(Boolean) visitLexpr(ctx.lexpr(6))){
                visitStmt_block(ctx.stmt_block(6));
            }
        }
        else if(ctx.LOOP() != null){
            //loop infinito????
        }
        else if(ctx.DO() != null){
            if(ctx.WHILE() != null){
                do{
                    visitStmt_block(ctx.stmt_block(7));
                }while((Boolean) visitLexpr(ctx.lexpr(7)));
            }
            else if(ctx.UNTIL() != null){
                do{
                    visitStmt_block(ctx.stmt_block(8));
                }while(!(Boolean) visitLexpr(ctx.lexpr(8)));
            }
        }
        else if(ctx.REPEAT() != null){
            //repetir un bloque un número de veces?
            int iterator = Integer.parseInt(ctx.NUM().getSymbol().getText());
            for (int i = 0; i < iterator; i++){
                visitStmt_block(ctx.stmt_block(9));
            }
        }
        else if(ctx.FOR() != null){
            for (visitLexpr(ctx.lexpr(9)); (Boolean)  visitLexpr(ctx.lexpr(10)); visitLexpr(ctx.lexpr(11))){ //?
                visitStmt_block(ctx.stmt_block(10));
            }
        }
        else if(ctx.NEXT() != null){
            //No entiendo
        }
        else if(ctx.BREAK() != null){
            //No entiendo
        }
        else if(ctx.ID() != null){
            //FALTA
        }
        else if(ctx.SUBS() != null){
            //FALTA
        }
        else if(ctx.ADD() != null){
            //FALTA
        }
        return null;
    }

    @Override
    public T visitLexpr(BccLanguageParser.LexprContext ctx){
        if (ctx.nexpr().size() == 1) {
            return visitNexpr(ctx.nexpr(0));
        }

        boolean result = (Boolean)  visitNexpr(ctx.nexpr(0));

        if (ctx.AND().size() != 0) {
            for (int i = 1; i < ctx.AND().size(); i++){
                // TODO: Valor de verdad de numeros
                boolean nexpr = (Boolean)  visitNexpr(ctx.nexpr(i + 1));
                result = result && nexpr;
            }

            return (T) (Boolean) result;
        }

        for (int i = 1; i < ctx.OR().size(); i++){
            // TODO: Valor de verdad de numeros
            boolean nexpr = (Boolean) visitNexpr(ctx.nexpr(i + 1));
            result = result || nexpr;
        }
        return (T) (Boolean) result;
    }

    @Override
    public T visitNexpr(BccLanguageParser.NexprContext ctx){
        if(ctx.NOT() != null) {
            // TODO: Valor de verdad de numeros
            Boolean result = !(Boolean) visitLexpr(ctx.lexpr());
            return (T) result;
        };
        return visitRexpr(ctx.rexpr());
    }

    @Override
    public T visitRexpr(BccLanguageParser.RexprContext ctx){
        if (ctx.simple_expr().size() == 1) {
            return (T) visitSimple_expr(ctx.simple_expr(0));
        }

        Double simple_expr1 = (Double) visitSimple_expr(ctx.simple_expr(0));
        Double simple_expr2 = (Double) visitSimple_expr(ctx.simple_expr(1));
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

        Double total = (Double) visitTerm(ctx.term(0));
        for (int i = 1 ; i < ctx.term().size() ; i++){
            Double term = (Double) visitTerm(ctx.term(i));
            String op = ctx.SUMOP(i - 1).getText();
            switch(op){
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
    public T visitTerm(BccLanguageParser.TermContext ctx){
        if (ctx.factor().size() ==1) return visitFactor(ctx.factor(0));

        Double answer = (Double) visitFactor(ctx.factor(0));
        for(int i =1;i<ctx.factor().size();i++){
            try {
                Double fi = (Double) visitFactor(ctx.factor(i)); // Posible fallo si llega Boolean
                if (ctx.DIV(i) != null) {
                    answer /= fi;
                } else if (ctx.MUL(i) != null) {
                    answer *= fi;
                } else if (ctx.MOD(i) != null) {
                    answer %= fi;
                }
            } catch (Exception e){ // Error: Uno de los factores(Bool o ID) no es numero
                int line = ctx.factor(i).NUM().getSymbol().getLine();
                int col = ctx.factor(i).NUM().getSymbol().getCharPositionInLine() + 1;
                if (ctx.factor(i).BOOL() != null){
                    String symbol = ctx.factor(i).BOOL().getSymbol().getText();
                    System.err.printf("<%d:%d> Error semántico, " +symbol + " no es un símbolo válido para una para la operación.",line,col);
                }else{
                    String varName = ctx.factor(i).ID().getSymbol().getText();
                    System.err.printf("<%d:%d> Error semántico, el valor la variable " +varName + " no es válido para la operación.",line,col);
                }
                System.exit(-1);
            }
        }
        return (T)answer;
    }

    @Override
    public T visitFactor(BccLanguageParser.FactorContext ctx){
        if (ctx.NUM() != null) {
            return (T) (Double) Double.parseDouble(ctx.NUM().getText());
        }
        if (ctx.BOOL() != null) {
            return (T) (Boolean) ctx.BOOL().getText().equals("true");
        }
        if (ctx.RIGHT_INC != null || ctx.RIGHT_DEC != null) {
            String name = ctx.ID().getText();
            if(table.get(name) == null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n",line,col);
                System.exit(-1);
            }
            Double id = (Double) table.get(name);
            if (ctx.RIGHT_INC != null) {
                table.put(name, id + 1);
            } else {
                table.put(name, id - 1);
            }
            return (T) (Double) id;
        }
        if (ctx.LEFT_INC != null || ctx.LEFT_DEC != null) {
            String name = ctx.ID().getText();
            if (table.get(name) == null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n",line,col);
                System.exit(-1);
            }

            Double id = (Double) table.get(name);
            if (ctx.RIGHT_INC != null) {
                table.put(name, id + 1);
            } else {
                table.put(name, id - 1);
            }
            return (T) (Double) table.get(name);
        }
        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            if (table.get(name) == null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n",line,col);
                System.exit(-1);
            }
            return (T) table.get(name); // puede ser Double o Boolean
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
    public T visitMain_prog(BccLanguageParser.Main_progContext ctx){
        if(ctx.VAR() != null){
            visitVar_decl(ctx.var_decl());
        }
        if(ctx.stmt() != null){
            for(int i=0;i< ctx.stmt().size();i++){
                visitStmt(ctx.stmt(i));
            }
        }
        return null; // como saber que ya acabo?
    }

}
