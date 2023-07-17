package composite.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parser {
    String expression;

    public Parser(String expression) {
        this.expression = expression;
    }

    public String parse() {
        String lowerPrecedence = "+-";
        String operators = "/*-+";
        String parenthesis = "()";

        String temp = "";
        List<String> expressionSplit = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (operators.contains(Character.toString(c)) || parenthesis.contains(Character.toString(c))) {
                if (temp.isBlank()) {
                    expressionSplit.add(Character.toString(c));
                } else {
                    expressionSplit.add(temp);
                    temp = "";
                    expressionSplit.add(Character.toString(c));
                }
            } else {
                temp += Character.toString(c);
            }
        }
        if (!temp.isBlank())
            expressionSplit.add(temp);

        List<String> reversePolishNotation = new ArrayList<>();
        boolean hasLeftValue = false;
        Stack<String> operatorStack = new Stack<>();
        for (int i = 0; i < expressionSplit.size(); i++) {
            String current = expressionSplit.get(i);
            if (operators.contains(current) || parenthesis.contains(current)) {
                switch (current) {
                    case "-":
                        // see if negate or minus
                        if (hasLeftValue) {
                            if (operatorStack.isEmpty() || operatorStack.peek().contains("(")) {
                                operatorStack.push(current);
                            } else {
                                reversePolishNotation.add(operatorStack.pop());
                                operatorStack.push(current);
                            }
                        } else {
                            if (operatorStack.isEmpty() || operatorStack.peek().contains("(")) {
                                operatorStack.push("n");
                            } else {
                                reversePolishNotation.add(operatorStack.pop());
                                operatorStack.push("n");
                            }
                        }
                        break;
                    case "+":
                        if (operatorStack.isEmpty() || operatorStack.peek().contains("(")) {
                            operatorStack.push(current);
                        } else {
                            reversePolishNotation.add(operatorStack.pop());
                            operatorStack.push(current);
                        }
                        break;
                    case "/" : case "*":
                        if (operatorStack.isEmpty() || lowerPrecedence.contains(operatorStack.peek()) || operatorStack.peek().contains("(")) {
                            operatorStack.push(current);
                        } else {
                            reversePolishNotation.add(operatorStack.pop());
                            operatorStack.push(current);
                        }
                        break;
                    case "(":
                        operatorStack.push(current);
                        hasLeftValue = false;
                        break;
                    case ")":
                        while (!operatorStack.peek().contains("(")) {
                            reversePolishNotation.add(operatorStack.pop());
                        }
                        operatorStack.pop();
                        hasLeftValue = true;
                        break;
                }
            } else {
                reversePolishNotation.add(current);
                hasLeftValue = true;
            }
        }
        while (!operatorStack.isEmpty()) {
            reversePolishNotation.add(operatorStack.pop());
        }

        String a,b;
        Stack<String> builderStack = new Stack<>();
        for (int i = 0; i < reversePolishNotation.size(); i++) {
            switch (reversePolishNotation.get(i)) {
                case "n" :
                    a = builderStack.pop();
                    a = isNumber(a);
                    builderStack.push("new Negate(" + a + ")");
                    break;
                case "-" :
                    b = builderStack.pop();
                    b = isNumber(b);
                    a = builderStack.pop();
                    a = isNumber(a);
                    builderStack.push("new Minus(" + a + ", " + b + ")");
                    break;
                case "+" :
                    b = builderStack.pop();
                    b = isNumber(b);
                    a = builderStack.pop();
                    a = isNumber(a);
                    builderStack.push("new Plus(" + a + ", " + b + ")");
                    break;
                case "*" :
                    b = builderStack.pop();
                    b = isNumber(b);
                    a = builderStack.pop();
                    a = isNumber(a);
                    builderStack.push("new Multiply(" + a + ", " + b + ")");
                    break;
                case "/" :
                    b = builderStack.pop();
                    b = isNumber(b);
                    a = builderStack.pop();
                    a = isNumber(a);
                    builderStack.push("new Divide(" + a + ", " + b + ")");
                    break;
                default:
                    builderStack.push(reversePolishNotation.get(i));
            }
        }
        String command = "";
        while (!builderStack.isEmpty()) {
            command += builderStack.pop();
        }
        command += ";";
        return command;
    }

    private String isNumber(String a) {
        String floatDigits = ".0123456789";
        for (int i = 0; i < a.length(); i++) {
            if (!floatDigits.contains(a.substring(i,i+1)))
                return a;
        }
        return "new Constant(" + a + ")";
    }
}

