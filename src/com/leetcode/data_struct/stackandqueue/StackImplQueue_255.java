package com.leetcode.data_struct.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 03,2020
 */
public class StackImplQueue_255 {
  private Queue<Integer> mainQueue = new LinkedList<>();
  private Queue<Integer> tempQueue = new LinkedList<>();

  /** Push element x onto stack. */
  public void push(int x) {
    mainQueue.add(x);
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    int value = -1;
    while (!mainQueue.isEmpty()) {
      if (mainQueue.size() == 1) {
        value = mainQueue.remove();
      } else {
        tempQueue.add(mainQueue.remove());
      }
    }
    Queue<Integer> temp = mainQueue;
    mainQueue = tempQueue;
    tempQueue = temp;
    return value;
  }

  /** Get the top element. */
  public int top() {
      int value = -1;
      while (!mainQueue.isEmpty()) {
          if (mainQueue.size() == 1) {
              value = mainQueue.peek();
              tempQueue.add(mainQueue.remove());
          } else {
              tempQueue.add(mainQueue.remove());
          }
      }
      Queue<Integer> temp = mainQueue;
      mainQueue = tempQueue;
      tempQueue = temp;
      return value;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return mainQueue.isEmpty() && tempQueue.isEmpty();
  }
}
