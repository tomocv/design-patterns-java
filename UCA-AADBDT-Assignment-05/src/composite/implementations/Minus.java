package composite.implementations;

import composite.Expression;

public class Minus extends BinaryExpression {
    public Minus(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double calculate() {
        return leftExpression.calculate() - rightExpression.calculate();
    }
}
