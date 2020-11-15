package com.leetcode.data_struct.doublylinkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 09,2020
 */
public class MyLinkedList {
  /** Initialize your data structure here. */
  public MyLinkedList() {
    next = null;
    prev = null;
    val = null;
    head = null;
  }

  public MyLinkedList(Integer val) {
    this.val = val;
  }

  private Integer val;
  private MyLinkedList prev;
  private MyLinkedList next;
  private MyLinkedList head;

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  int get(int index) {
    int count = 0;
    MyLinkedList currentNode = head;
    while (currentNode != null) {
      if (index == count) {
        return currentNode.val;
      }
      count++;
      currentNode = currentNode.next;
    }
    return -1;
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  void addAtHead(int val) {
    if (isEmpty()) {
      head = new MyLinkedList(val);
      return;
    }
    MyLinkedList newNode = new MyLinkedList(val);
    MyLinkedList currentNode = head;
    newNode.next = currentNode;
    currentNode.prev = newNode;
    head = newNode;
  }

  /** Append a node of value val to the last element of the linked list. */
  void addAtTail(int val) {
    if (isEmpty()) {
      addAtHead(val);
      return;
    }
    MyLinkedList currentNode = head;
    while (currentNode != null) {
      if (currentNode.next == null) {
        MyLinkedList newNode = new MyLinkedList(val);
        currentNode.next = newNode;
        newNode.prev = currentNode;
        return;
      }
      currentNode = currentNode.next;
    }
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  void addAtIndex(int index, int val) {
    if (index == 0) {
      addAtHead(val);
      return;
    }
    int count = 0;
    MyLinkedList currentNode = head;
    MyLinkedList newNode = new MyLinkedList(val);
    while (currentNode != null) {
      if (count == index) {
        MyLinkedList preNode = currentNode.prev;
        newNode.prev = preNode;
        newNode.next = currentNode;
        preNode.next = newNode;
        currentNode.prev = newNode;
        return;
      }
      if (currentNode.next == null && (index - count) == 1) {
        currentNode.next = newNode;
        newNode.prev = currentNode;
        return;
      }
      count++;
      currentNode = currentNode.next;
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  void deleteAtIndex(int index) {
    MyLinkedList currentNode = head;
    int count = 0;
    while (currentNode != null) {
      if (index == 0) {
        head = currentNode.next;
        if (head != null) {
          head.prev = null;
        }
        return;
      }
      if (count == index) {
        MyLinkedList preNode = currentNode.prev;
        MyLinkedList nextNode = currentNode.next;
        if (preNode != null) {
          preNode.next = nextNode;
        }
        if (nextNode != null) {
          nextNode.prev = preNode;
        }
        return;
      }
      currentNode = currentNode.next;
      count++;
    }
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void print() {
    MyLinkedList currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.val);
      currentNode = currentNode.next;
      if (currentNode != null) {
        System.out.print(" , ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtTail(2);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtHead(0);
    myLinkedList.addAtIndex(4, 4);
    myLinkedList.print();
  }
}
