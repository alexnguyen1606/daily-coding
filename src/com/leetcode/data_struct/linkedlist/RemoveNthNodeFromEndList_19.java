package com.leetcode.data_struct.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/12/2022
 */

public class RemoveNthNodeFromEndList_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        while (n>0) {
            fast = fast.next;
            n--;
        }

        ListNode slow = new ListNode(0);
        slow.next = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.next == head) {
            return slow.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
