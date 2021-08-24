package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 05,2020
 */
public class MergeSortedLinkedList_21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    // Lấy 1 phần tử L1
    if (l1.val <= l2.val) {
      ListNode nextElement = mergeTwoLists(l1.next, l2);
      l1.next = nextElement;
      return l1;
    } else { // lấy 1 phần tử của l2
      mergeTwoLists(l2, l1);
      return l2;
    }
  }
}
