package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:27 PM ,September 13,2021
 */
public class RotateList_61 {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null) {
      return head;
    }
    ListNode currentNode = head;
    int size = 0;
    while (currentNode != null) {
      size++;
      currentNode = currentNode.next;
    }
    int rotateTime = k % size;
    return rotate(head, rotateTime);
  }
  
  //Algorithem Floyd
  // Use two pointer
  private ListNode rotate(ListNode head, int rotateTime) {
    if (head == null || rotateTime == 0) {
		  return head;
	  }
	  ListNode lastNode = head;
	  ListNode slowNode = head;
	  int count = 0;
	  while (lastNode.next != null) {
		  count++;
		  if (count > rotateTime) {
			  slowNode = slowNode.next;
		  }
		  lastNode = lastNode.next;
	  }
	  lastNode.next = head;
	  head = slowNode.next;
	  slowNode.next = null;
	  return head;
  }

  public static void main(String[] args) {
    RotateList_61 rotateList = new RotateList_61();
    ListNode listNode = new ListNode(0);
    ListNode node1 = new ListNode(1);
    listNode.next = node1;
    ListNode node2 = new ListNode(2);
//    node1.next = node2;
    ListNode node3 = new ListNode(3);
//        node2.next = node3;
    ListNode node4 = new ListNode(4);
//        node3.next = node4;
    ListNode rotate = rotateList.rotateRight(listNode, 5);
  }
}
