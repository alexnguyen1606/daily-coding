package com.datastucture.linkedlist;

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.next == head) {
            return slow.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node = ListNode.from(new int[]{1});
//        ListNode.print(node);
        node = removeNthFromEnd(node, 1);
        ListNode.print(node);
    }

}
