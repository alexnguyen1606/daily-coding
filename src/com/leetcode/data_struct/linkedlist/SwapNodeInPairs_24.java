package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:15 AM ,December 25,2020
 */
public class SwapNodeInPairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode currentNode = head;
        int count = 1;
        ListNode preNode = null;
        while (currentNode != null && currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            if (count == 1) {
                currentNode.next = nextNode.next;
                nextNode.next = currentNode;
                head = nextNode;
            } else {
                currentNode.next = nextNode.next;
                nextNode.next = currentNode;
                preNode.next = nextNode;
            }
            preNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        return head;
    }
}
