package composite.implementations;

import composite.Expression;

public class Plus extends BinaryExpression {
    public Plus(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double calculate() {
        return leftExpression.calculate() + rightExpression.calculate();
    }
}
