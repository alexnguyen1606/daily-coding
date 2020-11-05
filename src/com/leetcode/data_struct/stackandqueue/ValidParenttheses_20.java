package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 02,2020
 */
public class ValidParenttheses_20 {
  class Stack {
    class Node {
      Node next;
      char val;

      Node(char val) {
        this.val = val;
        next = null;
      }
    }

    Node topNode;

    public void push(char value) {
      Node newNode = new Node(value);
      if (!isEmpty()) {
        newNode.next = topNode;
      }
      topNode = newNode;
    }

    public char pop() {
      char value = topNode.val;
      topNode = topNode.next;
      return value;
    }

    public boolean isEmpty() {
      return topNode == null;
    }
  }

  public boolean isValid(String s) {
    char[] arrayChar = s.toCharArray();
    if (arrayChar.length == 1) {
      return false;
    }
    Stack stack = new Stack();
    for (int i = 0; i < arrayChar.length; i++) {
      char currentValue = arrayChar[i];
      if (currentValue == '[' || currentValue == '{' || currentValue == '(') {
        stack.push(currentValue);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char prev = stack.pop();
        if (prev == '{' && currentValue == '}'
            || prev == '[' && currentValue == ']'
            || prev == '(' && currentValue == ')') {
          continue;
        } else {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
