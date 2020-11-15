package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 16,2020
 */
public class RemoveLinkedListElements_203 {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return head;
    }
    ListNode currentNode = head;
    ListNode preNode = null;
    while (currentNode != null) {
      Boolean checkFound = false;
      if (currentNode.val == val) {
        checkFound = true;
        if (preNode == null) {
          head = currentNode.next;
        } else {
          preNode.next = currentNode.next;
        }
      }
      preNode = checkFound == true ? preNode : currentNode;
      currentNode = currentNode.next;
    }

    return head;
  }
}
