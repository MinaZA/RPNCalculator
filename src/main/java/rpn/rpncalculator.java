package rpn;

import java.util.Stack;

public class RPNCalculator {
    public double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    if (stack.size() < 2) throw new IllegalArgumentException("Invalid RPN expression");
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    if (stack.size() < 2) throw new IllegalArgumentException("Invalid RPN expression");
                    stack.push(-stack.pop() + stack.pop());
                    break;
                default:
                    try {
                        stack.push(Double.parseDouble(token));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Invalid token: " + token);
                    }
            }
        }

        if (stack.size() != 1) throw new IllegalArgumentException("Invalid RPN expression");

        return stack.pop();
    }

    public static void main(String[] args) {
        RPNCalculator calculator = new RPNCalculator();
        String expression = "5 3 -";
        System.out.println("Result: " + calculator.evaluate(expression));
    }
}
