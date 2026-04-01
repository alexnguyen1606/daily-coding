package com.dsa_in_90_days.stack;

import java.util.Stack;
import java.util.function.BiFunction;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String value : tokens) {
            if (stack.isEmpty()) {
                stack.push(Integer.parseInt(value));
                continue;
            }
            var operation = Operation.getOperation(value);
            if (operation == null) {
                stack.push(Integer.parseInt(value));
                continue;
            }
            Integer first = stack.pop();
            Integer second = stack.pop();
            Integer newValue = operation.func.apply(second, first);
            stack.push(newValue);
        }
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] array = new String[]{"-78", "-33", "196", "+", "-19", "-", "115", "+", "-", "-99", "/", "-18", "8", "*", "-86", "-", "-", "16", "/", "26", "-14", "-", "-", "47", "-", "101", "-", "163", "*", "143", "-", "0", "-", "171", "+", "120", "*", "-60", "+", "156", "/", "173", "/", "-24", "11", "+", "21", "/", "*", "44", "*", "180", "70", "-40", "-", "*", "86", "132", "-84", "+", "*", "-", "38", "/", "/", "21", "28", "/", "+", "83", "/", "-31", "156", "-", "+", "28", "/", "95", "-", "120", "+", "8", "*", "90", "-", "-94", "*", "-73", "/", "-62", "/", "93", "*", "196", "-", "-59", "+", "187", "-", "143", "/", "-79", "-89", "+", "-"};
        System.out.println(evalRPN(array));
    }

    public enum Operation {
        PLUS("+", Integer::sum),
        SUBTRACT("-", (aDouble, aDouble2) -> aDouble - aDouble2),
        MULTI("*", (aDouble, aDouble2) -> aDouble * aDouble2),
        DIVIDE("/", (aDouble, aDouble2) -> aDouble / aDouble2);

        private final String type;
        private final BiFunction<Integer, Integer, Integer> func;

        Operation(String string, BiFunction<Integer, Integer, Integer> func) {
            type = string;
            this.func = func;
        }

        public static Operation getOperation(String type) {
            switch (type) {
                case "+":
                    return PLUS;
                case "-":
                    return SUBTRACT;
                case "*":
                    return MULTI;
                case "/":
                    return DIVIDE;
                default:
                    return null;
            }
        }

    }

}
