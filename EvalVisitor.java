import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalculadoraBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<>();

    @Override
    public Double visitAssign(CalculadoraParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        double value = visit(ctx.expr());
        memory.put(id, value);
        return value; // Devuelve el valor asignado
    }

    @Override
    public Double visitPrintExpr(CalculadoraParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        if (Double.isNaN(value)) {
            System.err.println("Error: División por cero");
        } else if (value != null) {
            System.out.println(value);
        }
        return value; // Devuelve el valor para la impresión
    }

    @Override
    public Double visitMulDiv(CalculadoraParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.op.getText().equals("*")) {
            return left * right;
        } else if (ctx.op.getText().equals("/")) {
            if (right == 0) {
                return Double.NaN; // Devuelve NaN para indicar un error
            }
            return left / right;
        }
        return null;
    }

    @Override
    public Double visitAddSub(CalculadoraParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.op.getText().equals("+")) {
            return left + right;
        } else if (ctx.op.getText().equals("-")) {
            return left - right;
        }
        return null;
    }

    @Override
    public Double visitPower(CalculadoraParser.PowerContext ctx) {
        double base = visit(ctx.expr(0));
        double exp = visit(ctx.expr(1));
        return Math.pow(base, exp);
    }

    @Override
    public Double visitAbsolute(CalculadoraParser.AbsoluteContext ctx) {
        double value = visit(ctx.expr());
        return Math.abs(value);
    }

    @Override
    public Double visitNegative(CalculadoraParser.NegativeContext ctx) {
        return -visit(ctx.expr());
    }

    @Override
    public Double visitParens(CalculadoraParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitNumber(CalculadoraParser.NumberContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    @Override
    public Double visitId(CalculadoraParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0.0; // Devuelve 0 para variables no inicializadas
    }
}
