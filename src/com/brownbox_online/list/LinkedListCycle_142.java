package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:57 PM ,September 10,2021
 */
public class LinkedListCycle_142 {
  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode fast = head;
    ListNode slow = head;
    boolean isCycle = false;
    while (slow != null && fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        isCycle = true;
        break;
      }
    }
    fast = head;
    while (isCycle) {
      if (fast == slow) {
        isCycle = false;
        return fast;
      }
      fast = fast.next;
      slow = slow.next;
    }
    return null;
  }
}
