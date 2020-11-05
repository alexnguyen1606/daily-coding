package com.leetcode.data_struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 15,2020
 */
public class ReverseLinkedList_206 {

  public static ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode currentNode = head;
    while (currentNode != null && currentNode.next != null) {
      ListNode nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
    }
    return head;
  }

  public static void print(ListNode node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(0);
    head.add(1);
    head.add(2);
    head.add(3);
    head.add(4);
    head.addLast(5);
    print(head);
    head = head.reverse();
    print(head);
    ListNode second = new ListNode(8);
    second.add(9);
    second.add(10);
    print(head);
    System.out.println(head.get(3));
    System.out.println(head.get(1));
    System.out.println(head.get(8));
    print(head);
    reverseList(head);
    print(head);
  }
}
