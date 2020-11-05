public class MyVisitor<T> extends BccLanguageBaseVisitor {
    @Override
    public  T visitProg(BccLanguageParser.ProgContext ctx){
        return null;
    }
    @Override
    public T visitVar_decl(BccLanguageParser.Var_declContext ctx){
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
    public T visitLexpr(BccLanguageParser.LexprContext ctx){
        return null;
    }

    @Override
    public T visitNexpr(BccLanguageParser.NexprContext ctx){
        return null;
    }

    @Override
    public T visitRexpr(BccLanguageParser.RexprContext ctx){
        return null;
    }

    @Override
    public T visitSimple_expr(BccLanguageParser.Simple_exprContext ctx){
        return null;
    }

    @Override
    public T visitTerm(BccLanguageParser.TermContext ctx){
        return null;
    }

    @Override
    public T visitFactor(BccLanguageParser.FactorContext ctx){
        return null;
    }

    @Override
    public T visitMain_prog(BccLanguageParser.Main_progContext ctx){
        return null;
    }

}
