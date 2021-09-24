package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>1:05 AM ,September 15,2021
 */
public class RotateToLeft {
  public ListNode rotateLeft(ListNode head, int k) {
    int size = 0;
    ListNode lastNode = head;
    while (lastNode.next != null) {
      size++;
      lastNode = lastNode.next;
    }
    int rotateTime = k % size;
    int count = 0;
    while (count<rotateTime){
    	count++;
    	lastNode.next = head;
    	lastNode = lastNode.next;
    	head = lastNode.next;
    	lastNode.next = null;
    }
    return head;
  }
	
	public static void main(String[] args) {
		RotateToLeft rotateList = new RotateToLeft();
		ListNode listNode = new ListNode(0);
		ListNode node1 = new ListNode(1);
		listNode.next = node1;
		ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
		ListNode node4 = new ListNode(4);
        node3.next = node4;
		ListNode rotate = rotateList.rotateLeft(listNode, 3);
	}
}
