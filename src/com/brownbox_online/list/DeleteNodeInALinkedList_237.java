package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:28 PM ,August 23,2021
 */
public class DeleteNodeInALinkedList_237 {
	public void deleteNode(ListNode node) {
		ListNode currentNode = node;
		ListNode preNode = null;
		while (currentNode.next!=null){
			if (preNode!=null){
				preNode.val = currentNode.val;
			}
			preNode = currentNode;
			currentNode = currentNode.next;
		}
		if (preNode!=null){
			preNode.val = currentNode.val;
			preNode.next = null;
		}
	}
}
