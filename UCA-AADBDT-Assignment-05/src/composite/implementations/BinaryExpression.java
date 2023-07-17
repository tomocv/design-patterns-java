package composite.implementations;

import composite.Expression;

public abstract class BinaryExpression implements Expression {
    protected Expression leftExpression;
    protected Expression rightExpression;

    public BinaryExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public abstract double calculate();
}
