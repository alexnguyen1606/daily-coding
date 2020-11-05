package com.leetcode.data_struct;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 30,2020
 */
public class PalindromeLinkedList_234 {
  public boolean isPalindrome(ListNode head) {
    int totalItem = count(head);
    int middle = totalItem/2;
    int i = 1;
    ListNode currentNode = head;
    ListNode preNode =null;
    while (currentNode!=null){
      if (totalItem==1){
        return true;
      }
      if (totalItem%2!=0){
        if (i==middle+1){
          preNode.next = currentNode.next;
          break;
        }
      }else {
        break;
      }
      i++;
      preNode = currentNode;
      currentNode = currentNode.next;
    }

    Integer[] total = new Integer[2*middle];
    i = 1;
    while (head!=null){
      total[i-1] = head.val;
      i++;
      head = head.next;
    }

    return checkArrayPalindrome(total);
  }
  
  public boolean secondSolution(ListNode head){
    int totalItem = count(head);
    int middle = totalItem/2;
    ListNode leftNode = head;
    int index = 1;
    while (leftNode!=null){
      if (index>middle){
        break;
      }
      index++;
      leftNode = leftNode.next;
    }
    ListNode reverseNode = reverse(leftNode);
    index = 1;
    while (head!=null){
      if (index>middle){
        break;
      }
      if (!reverseNode.val.equals(head.val)){
        return false;
      }
      index++;
      reverseNode = reverseNode.next;
      head = head.next;
    }
    return true;
  }

  public static void main(String[] args) {
    PalindromeLinkedList_234 palind = new PalindromeLinkedList_234();
    ListNode head = new ListNode(129);
    head.add(300);
    head.add(4);
//    head.add(5);
    head.add(4);
    head.add(300);
    head.add(129);
    Integer[] array = {1, 2, 4, 5, 5, 2, 1};
    System.out.println(palind.secondSolution(head));
  }

  public void print(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }

  public ListNode reverse(ListNode head) {
    ListNode currentNode = head;
    while (currentNode != null && currentNode.next != null) {
      ListNode nextNode = currentNode.next;
      currentNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
    }
    return head;
  }

  public int count(ListNode node) {
    int count = 0;
    ListNode currentNode = node;
    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }
    return count;
  }

  public boolean checkArrayPalindrome(Integer[] arrays) {
    int length = arrays.length;
    if (length == 1) {
      return true;
    }
    int middle = length / 2;
    for (int i = 0; i < length; i++) {
      if (i > middle) {
        break;
      }
      if (!arrays[i].equals(arrays[length - i - 1])) {
        return false;
      }
    }
    return true;
  }
}
