package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:28 PM ,September 19,2021
 */
public class RemoveDuplicatesSortedList_83 {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode fast = head;
    ListNode slow = null;
    while (fast != null) {
      if (slow != null && slow.val == fast.val) {
        fast = fast.next;
        slow.next = fast;
      } else {
        slow = fast;
        fast = fast.next;
      }
    }
    return head;
  }
}
