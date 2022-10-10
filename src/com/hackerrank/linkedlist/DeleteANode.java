package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/22/2022
 */

public class DeleteANode {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = null;
        int i = 0;
        while (i != position) {
            slow = fast;
            fast = fast.next;
            i++;
        }
        if (slow == null) {
            return head.next;
        }
        slow.next = fast.next;
        return head;

    }

}
