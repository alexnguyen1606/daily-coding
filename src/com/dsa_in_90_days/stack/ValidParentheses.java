package com.dsa_in_90_days.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            char value = array[i];
            if (stack.empty()) {
                stack.push(value);
                continue;
            }
            if (value == '[' || value =='{' || value == '(') {
                stack.push(value);
                continue;
            }
            char stackValue = stack.pop();
            if (stackValue == '{' && value == '}') {
                continue;
            }
            if (stackValue == '[' && value == ']') {
                continue;
            }
            if (stackValue == '(' && value == ')') {
                continue;
            }
            return false;
        }
        return stack.empty();
    }
}
