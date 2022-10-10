package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/23/2022
 */

public class MergeSortList {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = new SinglyLinkedListNode(0);
        SinglyLinkedListNode next = result;
        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                if (head1.data < head2.data) {
                    next.next = head1;
                    head1 = head1.next;
                } else {
                    next.next = head2;
                    head2 = head2.next;
                }
            } else if (head1 != null) {
                next.next =  head1;
                head1 = head1.next;
            } else {
                next.next =  head2;
                head2 = head2.next;
            }

            next = next.next;

        }
        return result.next;
    }

}
