import java.util.HashMap;
import java.util.Map;

public class CalculatorVisitor extends MSSBaseVisitor<Double> {
    private Map<String, Double> variables;

    public CalculatorVisitor()
    {
        variables = new HashMap<String, Double>();
        variables.put("^", 1.0);
        variables.put("*", 1.0);
        variables.put("/", 1.0);
        variables.put("+", 0.0);
        variables.put("-", 0.0);
    }

    @Override public Double visitDefvar(MSSParser.DefvarContext ctx) {
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());

        variables.put(id, value);

        return value;
    }

    @Override public Double visitRefvar(MSSParser.RefvarContext ctx) { 
        String id = ctx.ID().getText();

        Double value = variables.get(id);

        if (value == null)
            throw new RuntimeException(id + " is not defined.");

        return value;
    }

    @Override public Double visitProg(MSSParser.ProgContext ctx) {
        Double result = null;
        for(MSSParser.ExprContext ectx : ctx.expr()) {
            result = visit(ectx);
        }
        if (result != null)
            System.out.println(result);
        return result;
    }

    @Override public Double visitDouble(MSSParser.DoubleContext ctx) { 
        return new Double(ctx.DOUBLE().getText());      
    }

    @Override public Double visitOperation(MSSParser.OperationContext ctx) {
        String op = ctx.RATOR().getText();
        switch(op) {
            case "+":
                {
                    Double result = variables.get(op);
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        result = result + visit(expr);              
                    }
                    return result;
                }
            case "^":
            case "*":
                {
                    Double result = variables.get(op);
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        switch(op) {
                            case "^":
                                result = Math.pow(result, visit(expr));
                                break;
                            case "*":
                                result = result * visit(expr);
                                break;
                        }
                    }
                    return result;
                }
            case "/":
            case "-":
                {
                    if (ctx.expr().isEmpty())
                        throw new RuntimeException("illegal: (" + op + ")");

                    Double result = null;
                    for (MSSParser.ExprContext expr : ctx.expr()) {
                        if (result == null)
                        {
                            if (ctx.expr().iterator().hasNext()) {
                                result = visit(expr);
                                continue;
                            }
                            else {
                                result = variables.get(op);
                            }
                        }
                        else {
                            switch(op)
                            {
                                case "/":
                                    result = result / visit(expr);
                                    break;
                                case "-":
                                    result = result - visit(expr);
                                    break;
                            }
                        }   
                    }
                    return result;
                }
            default:
                throw new RuntimeException("illegal operator: " + op);
        }
    }
}
