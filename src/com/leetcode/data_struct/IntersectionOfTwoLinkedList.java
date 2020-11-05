package com.leetcode.data_struct;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 15,2020
 */
public class IntersectionOfTwoLinkedList {


  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    while (headA != null && headB != null) {
      if (headA == headB) {
        return headA;
      }
      headA = headA.next;
      headB = headB.next;
    }
    return null;
  }

  private boolean isCommonNode(ListNode currentA, ListNode headB) {
    while (headB != null) {
      if (headB == currentA) {
        return true;
      }
      headB = headB.next;
    }
    return false;
  }

  public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
   ListNode pA = headA;
   ListNode pB = headB;
   while (pA!=pB){
       if (pA !=null){
           pA = pA.next;
       }else {
           pA = headB;
       }
       if (pB!=null){
           pB = pB.next;
       }else {
           pB = headA;
       }
   }
    return pA;
  }
}
