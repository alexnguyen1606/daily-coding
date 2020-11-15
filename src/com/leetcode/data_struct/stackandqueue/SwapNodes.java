package com.leetcode.data_struct.stackandqueue;

import com.leetcode.data_struct.linkedlist.ListNode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 05,2020
 */
public class SwapNodes {
  public ListNode swapPairs(ListNode head) {
    ListNode currentNode = head;
    int count = 1;
    ListNode preNode = null;
    while (currentNode != null && currentNode.next != null) {
      ListNode nextNode = currentNode.next;
      if (count == 1) {
        currentNode.next = nextNode.next;
        nextNode.next = currentNode;
        head = nextNode;
      } else {
        currentNode.next = nextNode.next;
        nextNode.next = currentNode;
        preNode.next = nextNode;
      }
      preNode = currentNode;
      currentNode = currentNode.next;
      count++;
    }
    return head;
  }
}
