package com.leetcode.data_struct.linkedlist;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 06,2020
 */
public class ConvertBinaryInLinkedList_1290 {
  public int getDecimalValue(ListNode head) {
    int num = 0;
    Stack<Integer> stack = new Stack<>();
    while (head != null) {
      stack.push(head.val);
      head = head.next;
    }
    int count = 0;
    while (!stack.isEmpty()) {
      num += stack.pop() * Math.pow(2, count);
      count++;
    }
    return num;
  }

  public int getDecimalValue2(ListNode head) {
    int num = 0;
    int count = 0;
    ListNode current = head;
    while (current != null) {
      current = current.next;
      count++;
    }
    current = head;
    while (current != null) {
      num +=Math.pow(2,--count)*current.val;
      current = current.next;
    }
    return num;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(0);
    head.add(1);
    head.add(1);
  }
}
