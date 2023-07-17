package composite.implementations;

import composite.Expression;

public class Multiply extends BinaryExpression {

    public Multiply(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double calculate() {
        return leftExpression.calculate() * rightExpression.calculate();
    }
}
