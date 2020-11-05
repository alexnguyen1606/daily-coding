package com.leetcode.data_struct;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 15,2020
 */
public class ListNode {
  Integer val;
  public ListNode next;

  ListNode(Integer x) {
    val = x;
    next = null;
  }

  ListNode(Integer val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void add(int val) {
    ListNode lastNode = this;
    ListNode newNode = new ListNode(val);
    while (lastNode != null) {
      if (lastNode.next == null) {
        lastNode.next = newNode;
        return;
      }
      lastNode = lastNode.next;
    }
  }

  public void addLast(Integer val) {
    ListNode lastNode = this;
    while (lastNode != null) {
      if (lastNode.next == null) {
        ListNode newNode = new ListNode(val);
        lastNode.next = newNode;
        return;
      }
      lastNode = lastNode.next;
    }
  }

  public Integer get(Integer i) {
    ListNode head = this;
    int count = 0;
    while (head != null) {
      if (i == count) {
        return head.val;
      }
      count++;
      head = head.next;
    }
    return null;
  }

  public ListNode reverse() {
    ListNode head = this;
    if (head == null || head.next == null) {
      return head;
    }
    ListNode currentNode = head;
    while (currentNode.next != null) {
      ListNode nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
    }
    return head;
  }

  public void add(ListNode newNode) {
    ListNode head = this;
    if (newNode == head) {
      return;
    }
    while (head != null) {
      if (head.next == null) {
        head.next = newNode;
        return;
      }
      head = head.next;
    }
  }
}
