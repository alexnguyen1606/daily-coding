package com.leetcode.data_struct.stackandqueue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:46 AM ,December 07,2020
 */
public class ValidParenthesisString_678 {
  public static boolean checkValidString(String s) {
    if (s == null || s.length() == 0) {
      return true;
    }
    if (s.length() == 1) {
      if (s.equals("*")) {
        return true;
      } else {
        return false;
      }
    }
    Stack<Character> stack = new Stack<>();
    char[] arrayS = s.toCharArray();
    for (int i = 0; i < arrayS.length; i++) {
      char item = arrayS[i];
      if (item == '(') {
        stack.push(item);
      } else {
        if (stack.isEmpty()) {
          if (item == '*') {
              continue;
          }
        }
      }
    }
    while (!stack.isEmpty()) {
      if (stack.pop() != '*') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = new String("((()))(");
    System.out.println(checkValidString(s));
  }
}
