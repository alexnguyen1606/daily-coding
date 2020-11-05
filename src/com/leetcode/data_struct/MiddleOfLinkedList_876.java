package com.leetcode.data_struct;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 17,2020
 */
public class MiddleOfLinkedList_876 {
  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.add(2);
    listNode.add(3);
    listNode.add(4);
    listNode.add(5);
    listNode = middleNode(listNode);
    print(listNode);
  }
  public static void print(ListNode listNode){
    while (listNode!=null){
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }

  public static ListNode middleNode(ListNode head) {
    int count = 0;
    ListNode currentNode = head;
    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }
    int position = (int) Math.round((float) count / 2);
    currentNode = head;
    int count2 = 0;
    while (currentNode != null) {
      count2++;
      if (position == count2) {
        if ( count%2==0){
          return currentNode.next;
        }else {
          return currentNode;
        }
      }

      currentNode = currentNode.next;

    }
    return head;
  }
}
