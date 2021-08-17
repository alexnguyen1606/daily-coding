package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:55 PM ,August 17,2021
 */
public class MyStackLinkedList implements IStackQueue {
  private int SIZE;
  private int count;
  private Node head;
  private Node tail;

  static class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public MyStackLinkedList(int SIZE) {
    this.SIZE = SIZE;
    count = 0;
  }

  @Override
  public int pop() {
    if (isEmpty()) {
      return 0;
    }
    int value = tail.value;
    removeTailNode();
    count--;
    return value;
  }

  private void removeTailNode() {
    Node currentNode = head;
    Node slowNode = null;
    while (currentNode.next != null) {
      slowNode = currentNode;
      currentNode = currentNode.next;
    }
    tail = slowNode;
    if (tail != null) {
      tail.next = null;
    } else {
      head = null;
    }
  }

  @Override
  public boolean push(int value) {
    if (isFull()) {
      return false;
    }
    Node newNode = new Node(value);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    count++;
    return true;
  }

  @Override
  public boolean isFull() {
    return count == SIZE;
  }

  @Override
  public boolean isEmpty() {
    return count == 0;
  }

  @Override
  public int size() {
    return count;
  }

  @Override
  public void print() {
    if (isEmpty()){
        return;
    }
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.value + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }
}
