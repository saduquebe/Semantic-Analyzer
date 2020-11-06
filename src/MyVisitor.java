import java.util.HashMap;

public class MyVisitor<T> extends BccLanguageBaseVisitor {

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public  T visitProg(BccLanguageParser.ProgContext ctx){
        return null;
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
        return null;
    }

    @Override
    public T visitStmt_block(BccLanguageParser.Stmt_blockContext ctx){
        return null;
    }

    @Override
    public T visitStmt(BccLanguageParser.StmtContext ctx){
        return null;
    }

    @Override
    public Boolean visitLexpr(BccLanguageParser.LexprContext ctx){
        return null;
    }

    @Override
    public Boolean visitNexpr(BccLanguageParser.NexprContext ctx){
        if(ctx.NOT() != null) return  !visitLexpr(ctx.lexpr());
        return visitRexpr(ctx.rexpr());
    }

    @Override
    public Boolean visitRexpr(BccLanguageParser.RexprContext ctx){
        return null;
    }

    @Override
    public T visitSimple_expr(BccLanguageParser.Simple_exprContext ctx){
        return null;
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
