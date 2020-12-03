package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:22 AM ,December 02,2020
 */
public class RemoveDuplicateFromSortedII_82 {
  private boolean check = false;
  public ListNode deleteDuplicates(ListNode head) {
    ListNode currentNode = head;
    Integer target = null;
    while (currentNode != null) {
      if (target != null && target.equals(currentNode.val)) {
        head = checkAndRemove(head, target);
      }
      target = currentNode.val;
      currentNode = currentNode.next;
    }
    if (check){
      if (head!=null){
        head = head.next;
      }
    }
    return head;
  }

  private ListNode checkAndRemove(ListNode head, int target) {
    ListNode preNode = null;
    ListNode currentNode = head;
    while (currentNode != null && currentNode.val <= target) {
      if (currentNode.val == target) {
        if (preNode == null) {
          head = currentNode.next;
          currentNode = head;
          check = true;
        } else {
          preNode.next = currentNode.next;
          currentNode = preNode;
        }
      }
      preNode = currentNode;
      currentNode = currentNode.next;
    }
    return head;
  }

  public static void main(String[] args) {
    System.out.println("anbc");
  }
}
