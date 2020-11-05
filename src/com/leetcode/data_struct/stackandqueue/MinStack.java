package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 02,2020
 */
public class MinStack {
  private class Node {
    private Node next;
    private int val;

    private Node(int val) {
      this.val = val;
      next = null;
    }
  }
  
  private Node topNode;

  public MinStack() {
    topNode = null;
   
  }

  public void push(int x) {
    Node newNode = new Node(x);
    if (!isEmpty()) {
      newNode.next = topNode;
    }
    topNode = newNode;
  }

  public boolean isEmpty() {
    return topNode == null;
  }

  public void pop() {
    if (!isEmpty()) {
      int removeValue = topNode.val;

      topNode = topNode.next;
    }
  }

  public int top() {
    return topNode.val;
  }

  public int getMin() {
    Node currentNode = topNode;
    int min = topNode.val;
    while (currentNode != null) {
      if (min >= currentNode.val) {
        min = currentNode.val;
      }
      currentNode = currentNode.next;
    }
    return min;
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.pop();
    minStack.pop();
    System.out.println(minStack.getMin());
  }
}
