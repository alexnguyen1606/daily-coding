package com.datastucture.linkedlist;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode current = null;
        ListNode head = current;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                break;
            }
            if (list2 == null) {
                current.next = list1;
                break;
            }
            ListNode temp = null;
            if (list1.val > list2.val) {
                temp = list2;
                list2 = list2.next;
            } else {
                temp = list1;
                list1 = list1.next;
            }
            if (current == null) {
                current = temp;
                head = current;
            } else {
                current.next = temp;
                current = current.next;
            }
        }
        return head;
    }

}
