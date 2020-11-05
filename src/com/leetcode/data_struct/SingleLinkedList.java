package com.leetcode.data_struct;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 09,2020
 */
public class SingleLinkedList<T> {
  private SingleLinkedList<T> head;
  private SingleLinkedList<T> next;
  private T value;

  public SingleLinkedList(T value) {
    this.value = value;
  }

  public SingleLinkedList() {
    this.head = null;
  }

  public void add(T t) {
    SingleLinkedList<T> lastNode = this.head;
    SingleLinkedList<T> newNode = new SingleLinkedList<>(t);
    while (lastNode != null) {
      if (lastNode.next == null) {
        lastNode.next = newNode;
        return;
      }
      lastNode = lastNode.next;
    }
    head = newNode;
  }

  public T getFirst() {
    return head.value;
  }

  public void addFist(T val) {
    SingleLinkedList<T> newNode = new SingleLinkedList<>(val);
    newNode.next = head;
    head = newNode;
  }

  public void addLast(T val) {
    SingleLinkedList<T> temp = head;
    SingleLinkedList<T> newNode = new SingleLinkedList<>(val);
    while (temp != null) {
      if (temp.next == null) {
        temp.next = newNode;
        return;
      }
      temp = temp.next;
    }
    addFist(val);
  }

  public T getLast() {
    SingleLinkedList<T> sìngleLinkedList = head;
    while (sìngleLinkedList != null) {
      if (sìngleLinkedList.next == null) {
        return sìngleLinkedList.value;
      }
      sìngleLinkedList = sìngleLinkedList.next;
    }
    return head.value;
  }

  public T get(int index) {
    SingleLinkedList<T> tempNode = head;
    int count = 0;
    while (tempNode != null) {
      if (count == index) {
        return tempNode.value;
      }
      count++;
      tempNode = tempNode.next;
    }
    return null;
  }

  public void addAtIndex(int index, T val) {
    SingleLinkedList<T> newNode = new SingleLinkedList<>(val);
    if (index == 0) {
      newNode.next = head;
      head = newNode;
    } else {
      int count = 0;
      SingleLinkedList<T> currentNode = head;
      while (currentNode != null) {
        if (index - 1 == count) {
          newNode.next = currentNode.next;
          currentNode.next = newNode;
          return;
        }
        count++;
        currentNode = currentNode.next;
      }
    }
  }

  public int size() {
    int count = 0;
    SingleLinkedList<T> temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }

  public void print() {
    SingleLinkedList<T> temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void remove(int index){
    if (head==null){
     return;
    }
    if (index==0){
      head = head.next;
    }
  }
}
