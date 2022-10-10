package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/23/2022
 */

public class GetNodeFromTail {

    public static int getNodeByPositionFromTail(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode fast = head;
        while (positionFromTail >= 0) {
            fast = fast.next;
            positionFromTail--;
        }

        SinglyLinkedListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }


}
