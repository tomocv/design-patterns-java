package composite.implementations;

import composite.Expression;

public class Divide extends BinaryExpression {
    public Divide(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double calculate() {
        return leftExpression.calculate() / rightExpression.calculate();
    }
}
