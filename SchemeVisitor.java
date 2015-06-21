import java.util.HashMap;
import java.util.Map;

public class SchemeVisitor extends MSSBaseVisitor<Val> {
    private Map<String, Val> variables;

    public SchemeVisitor()
    {
        variables = new HashMap<String, Val>();
    }

    @Override public Val visitDefvar(MSSParser.DefvarContext ctx) {
        String id = ctx.ID().getText();
        Val value = visit(ctx.expr());
        variables.put(id, value);
        return value;
    }

    @Override public Val visitRefvar(MSSParser.RefvarContext ctx) { 
        String id = ctx.ID().getText();
        Val value = variables.get(id);
        if (value == null)
            throw new RuntimeException(id + " is not defined.");
        return value;
    }

    @Override public Val visitProg(MSSParser.ProgContext ctx) {
        Val result = null;
        for(MSSParser.ExprContext ectx : ctx.expr()) {
            result = visit(ectx);
        }
        if (result != null)
            System.out.println(result.getValue());
        return result;
    }

    @Override public Val visitBoolean(MSSParser.BooleanContext ctx) { 
        Boolean value = new Boolean(ctx.BOOLEAN().getText());
        return new Val(value);
    }

    @Override public Val visitDouble(MSSParser.DoubleContext ctx) {
        Double value = new Double(ctx.DOUBLE().getText()); 
        return new Val(value);
    }

    @Override public Val visitIfexpr(MSSParser.IfexprContext ctx) {
        if (visit(ctx.expr(0)).getBoolean()) {
            return visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(2));
        }
    }

    @Override public Val visitOpexpr(MSSParser.OpexprContext ctx) {
        String op = ctx.RATOR().getText();
        switch(op) {
            case "+":
                {
                    Double result = 0.0;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        result = result + visit(expr).getDouble();              
                    }
                    return new Val(result);
                }
            case "*":
                {
                    Double result = 1.0;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        result = result * visit(expr).getDouble();
                    }
                    return new Val(result);
                }
            case "^":
                {
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 1.0;
                    }
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (result == null)
                        {
                            result = visit(expr).getDouble();
                            continue;
                        }
                        result = Math.pow(result, visit(expr).getDouble());
                    }
                    return new Val(result);
                }                
            case "/":
                {
                    if (ctx.expr().isEmpty())
                        throw new RuntimeException("illegal: (/ )");
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 1.0;
                    }
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (result == null)
                        {
                            result = visit(expr).getDouble();
                            continue;
                        }                        
                        result = result / visit(expr).getDouble();
                    }
                    return new Val(result);
                }               
            case "-":
                {
                    if (ctx.expr().isEmpty())
                        throw new RuntimeException("illegal: (- )");
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 0.0;
                    }
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (result == null)
                        {
                            result = visit(expr).getDouble();
                            continue;
                        }                    
                        result = result - visit(expr).getDouble();
                    }
                    return new Val(result);
                }
            case "&":
                {
                    Boolean result = true;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        result = result && visit(expr).getBoolean();
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case "|":
                {
                    Boolean result = false;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        result = visit(expr).getBoolean();
                        if (result) break;
                    }
                    return new Val(result);
                }
            case "!":
                {
                    if (ctx.expr().size() != 1)
                        throw new RuntimeException("illegal: ! operator must have exactly 1 expr argument.");
                    Boolean result = visit(ctx.expr(0)).getBoolean();
                    return new Val(!result);
                }
            case "=":
                {
                    Boolean result = true;
                    Object pvalue = null;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null)
                        {
                            pvalue = visit(expr).getValue();
                            continue;
                        }
                        Object cvalue = visit(expr).getValue();
                        result = result && (pvalue.equals(cvalue));
                        pvalue = cvalue;
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case ">":
                {
                    if (ctx.expr().size() < 1)
                        throw new RuntimeException("illegal: > operator must have at least 1 expr argument."); 
                    Boolean result = true;
                    Double pvalue = null;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null)
                        {
                            pvalue = visit(expr).getDouble();
                            continue;
                        }
                        Double cvalue = visit(expr).getDouble();
                        result = result && (pvalue > cvalue);
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case "<":
                {
                    if (ctx.expr().size() < 1)
                        throw new RuntimeException("illegal: < operator must have at least 1 expr argument."); 
                    Boolean result = true;
                    Double pvalue = null;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null)
                        {
                            pvalue = visit(expr).getDouble();
                            continue;
                        }
                        Double cvalue = visit(expr).getDouble();
                        result = result && (pvalue < cvalue);
                        if (!result) break;
                    }
                    return new Val(result);
                }                
            default:
                throw new RuntimeException("illegal operator: " + op);
        }
    }
}
