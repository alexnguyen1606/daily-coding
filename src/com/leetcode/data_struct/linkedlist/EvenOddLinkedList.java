package com.leetcode.data_struct.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * The type Even odd linked list. Sort for Even and Odd index
 *
 * @author:Nguyen Anh Tuan
 *     <p>October 27,2020
 */
public class EvenOddLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.add(2);
    head.add(3);
    head.add(4);
    head.add(5);
    head.add(6);
    head.add(7);
    head.add(8);
    head.add(9);
    head.add(10);
    head.add(11);
    head.add(12);
    print(head);
    head = evenOddList(head);
    print(head);
  }

  public static void print(ListNode node) {
    ListNode currentNode = node;
    List<Integer> values = new LinkedList<>();
    int count = 0;
    while (currentNode != null) {
      if (count>=15){
        break;
      }
      count++;
      values.add(currentNode.val);
      currentNode = currentNode.next;
    }
    System.out.println(values.toString());
  }

  public static ListNode evenOddList(ListNode head) {

    ListNode currentNode = head;
    ListNode LO = null; // last node odd linked list
    ListNode LE = null; // last node even linked list
    int index = 1; // start first element, init index  = 1
    while (currentNode != null) {
      ListNode nextNode = currentNode.next;
      if (index == 1) {
        LO = currentNode; // init LO
      } else if (index == 2) {
        LE = currentNode; // init LE
        currentNode.next = LO;
        LO.next = nextNode;
        head = currentNode;
      } else if (index == 3) {
        LO = LO.next;
      } else {
        if (index % 2 == 0) {
          currentNode.next = LE.next;
          LE.next = currentNode;
          LO.next = nextNode;
        } else {
          LO = LO.next;
          LE = LE.next;
        }
      }
      index++;
      currentNode = nextNode;
    }

    return head;
  }
}
