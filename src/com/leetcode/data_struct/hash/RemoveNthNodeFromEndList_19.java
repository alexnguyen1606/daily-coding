package com.leetcode.data_struct.hash;

import com.leetcode.data_struct.linkedlist.ListNode;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/12/2022
 */

public class RemoveNthNodeFromEndList_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode[] list = new ListNode[30];
        int i = 0;
        ListNode nextNode = head;
        while (nextNode != null) {
            list[i] = nextNode;
            i++;
            nextNode = nextNode.next;
        }

        int removeIndex = i - n;
        if (removeIndex == 0) {
            return list[removeIndex + 1];
        }
        list[removeIndex - 1].next = list[removeIndex + 1];
        return head;
    }

}
