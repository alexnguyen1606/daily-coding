package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/23/2022
 */

public class RemoveDuplicateInSortedList {

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = slow.next;
        while (fast != null) {
            if (slow.data == fast.data) {
                fast = fast.next;
            } else {
                slow.next = fast;
                slow = fast;
                fast = fast.next;
            }
        }
        return head;

    }

}
