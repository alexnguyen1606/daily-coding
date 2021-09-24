package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 6:06 PM ,September 14,2021
 */
public class ReverseLinkedList_92 {
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (left==right){
			return head;
		}
		int count = 0;
		ListNode leftNode = head;
		while (count<left){
			count++;
			leftNode = leftNode.next;
		}
		return head;
	}
	
	
}
