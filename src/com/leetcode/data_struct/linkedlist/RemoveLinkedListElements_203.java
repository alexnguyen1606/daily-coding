package com.leetcode.data_struct.linkedlist;

import java.util.Objects;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 16,2020
 */
public class RemoveLinkedListElements_203 {
  public ListNode removeElements(ListNode head, int val) {
    if (Objects.isNull(head)) {
      return null;
    }
    ListNode currentNode = head;
    ListNode preNode = null;
    boolean isFound;
    while (currentNode != null) {
      isFound = false;
      if (currentNode.val == val) {
        isFound = true;
        if (preNode == null) {
          head = currentNode.next;
        } else {
          preNode.next = currentNode.next;
        }
      }
      preNode = isFound ? preNode : currentNode;
      currentNode = currentNode.next;
    }

    return head;
  }
}
