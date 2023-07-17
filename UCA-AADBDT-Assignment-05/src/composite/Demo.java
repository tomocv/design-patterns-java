package composite;

import composite.implementations.*;
import composite.parser.Parser;

public class Demo {
    public static void main(String[] args) {
        //String expression = "-5*(9/6)/(7+(2-1.5))";
        String expression = "7+3-11*(-1)";
        Parser parser = new Parser(expression);
        System.out.println(parser.parse());

        // uncomment next 2 lines and replace *expression* with generated code
        // var equation = *expression*
        // System.out.println(equation.calculate());
    }
}
