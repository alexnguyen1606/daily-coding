package com.brownbox_online.stack_queue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:01 PM ,September 10,2021
 */
public class ValidParentheses_20 {
  public boolean isValid(String s) {
    char[] arrayChar = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (char value : arrayChar) {
      if (value == '[' || value == '{' || value == '(') {
        stack.push(value);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        Character popValue = stack.pop();
        if ((popValue == '[' && value == ']')
            || (popValue == '(' && value == ')')
            || (popValue == '{' && value == '}')) {

        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
