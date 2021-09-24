package com.brownbox_online.stack_queue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:57 PM ,September 19,2021
 */
public class ReverseWordsInString_151 {

  public String reverseWords(String s) {
    String[] array = s.split(" ");
    Stack<String> stack = toStack(array);
    return buildString(stack);
  }

  private Stack<String> toStack(String[] array) {
    Stack<String> stack = new Stack<>();
    for (String element : array) {
      if (!containJustSpace(element)) {
        stack.push(element);
      }
    }
    return stack;
  }

  private String buildString(Stack<String> stack) {
    StringBuilder builder = new StringBuilder();
    String temp;
    while (!stack.isEmpty()) {
      temp = stack.pop();
      if (!temp.contains(" ")) {
        builder.append(temp);
      }
      if (!stack.isEmpty()) {
        builder.append(" ");
      }
    }
    return builder.toString();
  }

  private boolean containJustSpace(String s) {
    return s.contains(" ") || s.length() == 0;
  }
}
