package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:37 PM ,August 14,2021
 */
public class ListNode {
  public int val;
  public ListNode next;
  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
