package com.brownbox_online.list;

import java.util.HashSet;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:14 PM ,September 10,2021
 */
//
public class LinkedListCycle_141 {
	//easy
	public boolean hasCycle(ListNode head) {
		if (head==null){
			return false;
		}
		ListNode currentNode = head;
		ListNode quickNode = head.next;
		int count ;
		int STEP_MAX = 2;
		while (currentNode!=null){
			count = 0;
			while (quickNode!=null){
				if (quickNode==currentNode){
					return true;
				}
				quickNode = quickNode.next;
				count++;
				if (count==STEP_MAX){
					break;
				}
			}
			currentNode = currentNode.next;
			
		}
		return false;
	}
	
	public boolean hasCycle2(ListNode head) {
		if (head==null){
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next!=null && fast.next.next!=null ){
			fast = fast.next.next;
			slow = slow.next;
			if (fast==slow){
				return true;
			}
		}
		return false;
	}
}
