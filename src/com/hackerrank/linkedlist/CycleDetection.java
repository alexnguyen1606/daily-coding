package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 11/02/2022
 */

public class CycleDetection {

    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast!= null && slow == fast) {
                return true;
            }
        }
        return false;
    }

}
