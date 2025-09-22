package com.datastucture.linkedlist;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        ListNode fast = head;
        ListNode slow = null;
        while (fast != null) {
            ListNode temp = fast;
            fast = fast.next;
            temp.next = slow;
            slow = temp;

        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.from(new int[]{1, 2, 3, 4 , 5});
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        listNode = reverseLinkedList.reverseList(listNode);
        System.out.println();
    }

}
