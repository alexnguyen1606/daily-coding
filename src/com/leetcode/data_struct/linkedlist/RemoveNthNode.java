package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 15,2020
 */
public class RemoveNthNode {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
      return head;
    }
    int count = 1;
    ListNode temp = head;
    ListNode wantedNode = null;
    while (temp != null) {
      if (count == n + 1) {
        wantedNode = head;
      }
      if (temp.next == null) {
        if (wantedNode == null) {
          if (count == n) {
            return head.next;
          }
        } else {
          if (wantedNode.next != null) {
            wantedNode.next = wantedNode.next.next;
          }
        }
        return head;
      }
      count++;
      temp = temp.next;
      wantedNode = wantedNode == null ? null : wantedNode.next;
    }
    return head;
  }
}
