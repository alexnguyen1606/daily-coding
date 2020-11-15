package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 08,2020
 */
public class SignlyLinkedList {
  private SignlyLinkedList head;
  public SignlyLinkedList next;
  private Integer value;

  public SignlyLinkedList() {
  
  }

  public SignlyLinkedList(Integer value) {
    this.value = value;
  }

  public int get(int index) {
    SignlyLinkedList tempNode = head;
    int count = 0;
    while (tempNode != null) {
      if (count == index) {
        return tempNode.value;
      }
      count++;
      tempNode = tempNode.next;
    }
    return -1;
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    SignlyLinkedList newNode = new SignlyLinkedList(val);
    newNode.next = head;
    head = newNode;
  }
  @Deprecated
  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    SignlyLinkedList lastNode = head;
    while (lastNode != null) {
      if (lastNode.next == null) {
        SignlyLinkedList newNode = new SignlyLinkedList(val);
        lastNode.next = newNode;
        return;
      }
      lastNode = lastNode.next;
    }
    head = new SignlyLinkedList(val);
  }

  public void add(int val) {
    SignlyLinkedList lastNode = head;
    while (lastNode != null) {
      if (lastNode.next == null) {
        SignlyLinkedList newNode = new SignlyLinkedList(val);
        lastNode.next = newNode;
        return;
      }
      lastNode = lastNode.next;
    }
    head = new SignlyLinkedList(val);
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    if (index == 0) {
      addAtHead(val);
    } else {
      SignlyLinkedList current = head;
      SignlyLinkedList newNode = new SignlyLinkedList(val);
      int count = 0;
      while (current != null) {
        if (count == index - 1) {
          newNode.next = current.next;
          current.next = newNode;
          return;
        }
        count++;
        current = current.next;
      }
      if (count == index) {
        addAtTail(val);
      }
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    SignlyLinkedList tempNode = head;
    SignlyLinkedList pre = null;
    int count = 0;
    while (tempNode != null) {
      if (count == index) {
        if (index == 0) {
          head = head.next;
        } else {
          pre.next = tempNode.next;
          return;
        }
      }
      pre = tempNode;
      tempNode = tempNode.next;

      count++;
    }
  }

  public void print(){
    SignlyLinkedList tempNode = head;
    while (tempNode!=null){
      System.out.print(tempNode.value+ ", ");
      tempNode = tempNode.next;
    }
    System.out.println();
  }
}
