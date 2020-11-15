package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 09,2020
 */
public class CheckLinkedListCircle {

  public Boolean checkHasCircle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (slow != null && fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  public Boolean hasCircle(SignlyLinkedList head) {
    if (head == null || head.next == null) {
      return false;
    }
    int STEP_MAX = 2;
    SignlyLinkedList slow = head;
    SignlyLinkedList fast = head.next;
    while (slow != null) {
      int count = 0;

      while (fast != null) {
        if (fast == slow) {
          return true;
        }
        fast = fast.next;
        count++;
        if (count == STEP_MAX) {
          break;
        }
      }
      slow = slow.next;
    }
    return false;
  }
}
