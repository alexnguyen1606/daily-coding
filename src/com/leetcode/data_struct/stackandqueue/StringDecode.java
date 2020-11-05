package com.leetcode.data_struct.stackandqueue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 03,2020
 */
public class StringDecode {
  
  public String decodeSolution2(String s) {
    Stack<Character> stack = new Stack<>();
    for (Character currentChar : s.toCharArray()) {
      if (currentChar == ']') {
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
          Character character = stack.pop();
          if (character == '[') {
            break;
          } else {
            builder.append(character);
          }
        }
        StringBuilder numberString = new StringBuilder();
        while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
          numberString.append(stack.pop());
        }
        int countString = Integer.parseInt(numberString.reverse().toString());
        String resultRepeat = repeateString(builder.toString(), countString);
        for (Character character1 : resultRepeat.toCharArray()) {
          stack.push(character1);
        }
      } else {
        stack.push(currentChar);
      }
    }
    StringBuilder resultBuilder = new StringBuilder("");
    while (!stack.isEmpty()) {
      resultBuilder.append(stack.pop());
    }
    return resultBuilder.reverse().toString();
  }

  private String repeateString(String s, int countString) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= countString; i++) {
      result.append(s);
    }
    return result.reverse().toString();
  }

  public static void main(String[] args) {
    StringDecode stringDecode = new StringDecode();
    System.out.println("3[a]2[b4[F]c]");
    String a = stringDecode.decodeSolution2("3[a]2[b4[F]c]");
    System.out.println(a);
  }
}
