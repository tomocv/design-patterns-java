package composite.implementations;

import composite.Expression;

public abstract class UnaryExpression implements Expression {
    protected Expression expression;

    protected UnaryExpression(Expression expression) {
        this.expression = expression;
    }

    public abstract double calculate();
}
