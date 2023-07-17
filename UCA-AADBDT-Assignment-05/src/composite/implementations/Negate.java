package composite.implementations;

import composite.Expression;

public class Negate extends UnaryExpression {

    public Negate(Expression expression) {
        super(expression);
    }

    @Override
    public double calculate() {
        return -expression.calculate();
    }
}
