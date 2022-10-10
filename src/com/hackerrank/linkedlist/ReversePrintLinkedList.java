package com.hackerrank.linkedlist;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/22/2022
 */

public class ReversePrintLinkedList {

    public static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }

        head = reverse(head);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = slow.next;

        while (fast != null) {
            slow.next = fast.next;
            fast.next = head;
            head = fast;
            fast = slow.next;
        }

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertNode(1);
        singlyLinkedList.insertNode(2);
        singlyLinkedList.insertNode(3);
        singlyLinkedList.insertNode(4);
        singlyLinkedList.insertNode(5);
        reversePrint(singlyLinkedList.head);
    }

}
