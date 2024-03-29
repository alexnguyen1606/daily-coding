package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:38 PM ,August 14,2021
 */
public class ReverseLinkedList_206{



  public static ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode currentNode = head;
    ListNode nextNode = null;
    while (currentNode.next!=null){
      nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
    }
   return head;
  }

  
  
  public ListNode reverseList(ListNode head, ListNode currentNode){
      if (currentNode==null || currentNode.next==null){
          return head;
      }
      ListNode nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
      return reverseList(head,currentNode);
  }

  public static void main(String[] args) {
      ListNode nodes = new ListNode(0);
      nodes.next = new ListNode(1);
      nodes.next = new ListNode(2);
      nodes.next = new ListNode(3);
      reverseList(nodes);

  }
}
