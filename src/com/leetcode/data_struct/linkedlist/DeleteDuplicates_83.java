package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:02 AM ,December 02,2020
 */
public class DeleteDuplicates_83 {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode currentNode = head;
    ListNode preNode = null;
    while (currentNode != null) {
      if (preNode != null && preNode.val == currentNode.val) {
        preNode.next = currentNode.next;
        currentNode = preNode;
      }
      preNode = currentNode;
      currentNode = currentNode.next;
    }
    return currentNode;
  }
}
