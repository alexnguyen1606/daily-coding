package com.leetcode.data_struct.stackandqueue;

import com.leetcode.data_struct.ListNode;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 05,2020
 */
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        ListNode currentNode = head;
        int count = 1;
        while (currentNode!=null && currentNode.next!=null){
            ListNode tempNode = currentNode.next;
            if (count==1){
                currentNode.next = tempNode.next;
                tempNode.next = currentNode;
                head = tempNode;
            }else {
                currentNode.next = tempNode.next;
                tempNode.next = currentNode;
            }
            
            currentNode = currentNode.next;
            
            count++;
        }
        return head;
    }
}
