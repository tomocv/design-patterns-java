package composite.implementations;

import composite.Expression;

public class Constant implements Expression {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
