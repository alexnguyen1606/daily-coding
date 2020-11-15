package com.leetcode.data_struct.linkedlist;

import com.leetcode.data_struct.linkedlist.ListNode;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 06,2020
 */
public class AddTwoNumber_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack = new Stack<>();
        
        ListNode currentNode = l2;
        while (currentNode!=null){
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }
        return l2;
    }
}
