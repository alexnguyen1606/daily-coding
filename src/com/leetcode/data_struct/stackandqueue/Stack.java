package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 02,2020
 */
public class Stack<T> {
  private class Node<T> {
    private T value;
    private Node next;

    Node(T value) {
      this.value = value;
      next = null;
    }
  }

  public Stack() {
    topNode = null;
  }

  private Node<T> topNode;

  public void push(T t) {
    Node<T> newNode = new Node<>(t);
    if (!isEmpty()) {
      newNode.next = topNode;
    }
    topNode = newNode;
  }

  public T pop() {
    T value = topNode.value;
    topNode = topNode.next;
    return value;
  }

  public T peek() {
    return topNode.value;
  }

  public boolean isEmpty() {
    return topNode == null;
  }
}
