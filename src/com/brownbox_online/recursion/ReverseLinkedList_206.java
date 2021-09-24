package com.brownbox_online.recursion;

import com.brownbox_online.list.ListNode;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:10 PM ,September 13,2021
 */
public class ReverseLinkedList_206 {
	//return new head
	//reverse linkedlist
	public static ListNode reverse(ListNode head){
		if (head==null ){
			return null;
		}
		ListNode nextNode = head.next;
		if (nextNode==null){
			return head;
		}
		ListNode newHead = reverse(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;
	}
}
