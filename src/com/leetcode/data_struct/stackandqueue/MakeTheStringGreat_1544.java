package com.leetcode.data_struct.stackandqueue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:14 PM ,November 26,2020
 */
public class MakeTheStringGreat_1544 {
  public String makeGood(String s) {
    Stack<Character> tempStack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      if (tempStack.isEmpty()) {
        tempStack.push(c1);
      } else if (32 + tempStack.peek() == c1 || 32 + c1 == tempStack.peek()) {
        tempStack.pop();
      } else {
        tempStack.push(c1);
      }
    }

    return getValueFromStack(tempStack);
  }

  public String getValueFromStack(Stack<Character> stack) {
    StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()) {
      stringBuilder.append(stack.pop());
    }
    return stringBuilder.reverse().toString();
  }

  public static void main(String[] args) {
    MakeTheStringGreat_1544 stringGreat_1544 = new MakeTheStringGreat_1544();
    System.out.println(stringGreat_1544.makeGood("alexXEexNguyen"));
  }
}
