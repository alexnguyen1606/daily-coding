package com.leetcode.data_struct.stackandqueue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:07 PM ,November 26,2020
 */
public class RemoveAllAdjacentDuplicatesInString_1047 {
  public String removeDuplicates(String S) {
    Stack<Character> characterStack = new Stack<>();
    for (int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if (characterStack.empty()) {
        characterStack.push(ch);
      } else if (characterStack.peek() == ch) {
        characterStack.pop();
      } else {
        characterStack.push(ch);
      }
    }
    StringBuilder result = new StringBuilder();
    while (!characterStack.empty()) {
      result.append(characterStack.pop());
    }
    return result.reverse().toString();
  }
}
