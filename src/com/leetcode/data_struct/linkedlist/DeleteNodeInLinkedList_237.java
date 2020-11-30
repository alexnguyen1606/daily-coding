package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:09 PM ,November 26,2020
 */
public class DeleteNodeInLinkedList_237 {
  public static void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public static void print(ListNode node) {
    ListNode currentNode = node;
    while (currentNode != null) {
      System.out.print(currentNode.val + ",");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] a = {1, 11, 2, 7, 5, 2, 4, 9, 0};
    sort(a);
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int check = i;
      for (int j = i; j < n; j++) {
        if (array[j] > array[check]) {
          check = j;
        }
      }
      swap(array, i, check);
      print(array);
    }
  }

  public static void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
