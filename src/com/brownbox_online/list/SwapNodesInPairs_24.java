package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:44 AM ,August 20,2021
 */
public class SwapNodesInPairs_24 {
	public ListNode swapPairs(ListNode head) {
		if (head==null || head.next==null){
			return head;
		}
		ListNode nextNode = head.next;
		head.next = nextNode.next;
		nextNode.next = head;
		ListNode newNode = swapPairs(head.next);
		head.next = newNode;
		return nextNode;
	}
}
