package com.leetcode.data_struct.stackandqueue;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 03,2020
 */
public class QueueImplByStack_232 {
  /** Initialize your data structure here. */
  private Stack<Integer> mainStack;

  private Stack<Integer> tempStack;

  public QueueImplByStack_232() {
    mainStack = new Stack<>();
    tempStack = new Stack<>();
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    if (mainStack.isEmpty()) {
      while (!tempStack.isEmpty()) {
        mainStack.push(tempStack.pop());
      }
    }
    mainStack.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if (tempStack.isEmpty()) {
      while (!mainStack.isEmpty()) {
        tempStack.push(mainStack.pop());
      }
    }
    return tempStack.pop();
  }

  /** Get the front element. */
  public int peek() {
    if (tempStack.isEmpty()) {
      while (!mainStack.isEmpty()) {
        tempStack.push(mainStack.pop());
      }
    }
    return tempStack.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return mainStack.isEmpty() && tempStack.isEmpty();
  }
}
