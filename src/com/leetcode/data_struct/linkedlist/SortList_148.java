package com.leetcode.data_struct.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:07 AM ,December 04,2020
 */
public class SortList_148 {
  public ListNode sortList(ListNode head) {
    ListNode current = head;
    List<Integer> list = new ArrayList<>();
    while (current != null) {
      list.add(current.val);
      current = current.next;
    }
    Collections.sort(list);
    current = head;
    int i = 0;
    while (current != null) {
      current.val = list.get(i);
      i++;
      current = current.next;
    }
    return head;
  }

  public ListNode sortList2(ListNode head) {

    ListNode current = head;
    ListNode pre = null;
    while (current != null) {
      ListNode secondCurrent = head;
      ListNode preNode = null;
      while (secondCurrent != current) {
        if (preNode != null) {
          if (preNode.val > secondCurrent.val) {}
        }

        preNode = secondCurrent;
        secondCurrent = secondCurrent.next;
      }
      pre = current;
      current = current.next;
    }
    return head;
  }
}
