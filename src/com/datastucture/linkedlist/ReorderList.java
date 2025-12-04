package com.datastucture.linkedlist;

//https://leetcode.com/problems/reorder-list/description/
public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        trim(head, middle);
        ListNode newNode = reverse(middle);
        ListNode current = head;

        while (newNode != null) {
            ListNode temp = current.next;
            ListNode temp2 = newNode.next;

            current.next = newNode;
            current.next.next = temp;
            
            current = temp;
            newNode = temp2;
        }
        head.print();
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = slow;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return slow;
    }

    private ListNode reverse(ListNode node) {
        ListNode slow = null;
        ListNode fast = node;
        while (fast != null) {
            ListNode temp = fast;
            fast = fast.next;
            temp.next = slow;
            slow = temp;
        }
        return slow;
    }

    private void trim(ListNode head, ListNode middle) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (fast == middle) {
                slow.next = null;
                break;
            }
            slow = fast;
            fast = fast.next;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        ListNode head = ListNode.from(array);
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(head);
    }

}
