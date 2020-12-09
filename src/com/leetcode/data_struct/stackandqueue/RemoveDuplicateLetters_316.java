package com.leetcode.data_struct.stackandqueue;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:32 AM ,December 08,2020
 */
public class RemoveDuplicateLetters_316 {
  public String removeDuplicateLetters(String s) {
    char[] arrayLetter = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < arrayLetter.length; i++) {
      char item = arrayLetter[i];
      if (stack.isEmpty()) {
        stack.push(item);
      }
    }
    
    StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()) {
      stringBuilder.append(stack.pop());
    }
    
    return stringBuilder.toString();
  }
}
