package com.leetcode.data_struct.linkedlist;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author:Nguyen Anh Tuan
 *     <p>7:56 AM ,December 03,2020
 */
public class LinkedListRandomNode_382 {
  private ListNode head;
  private int[] array;
  private int size;

  public LinkedListRandomNode_382(ListNode head) {
    this.head = head;
    size = 0;
  }
  

  /** Returns a random node's value. */
  public final int getRandom() {
    int count = 0;
    ListNode currentNode = head;
    if (array == null) {
      array = new int[10];
      while (currentNode != null) {
        if (array.length <= count) {
          copyArray(array);
        }
        size++;
        array[count] = currentNode.val;
        count++;
        currentNode = currentNode.next;
      }
    }
    int randDomIndex = ThreadLocalRandom.current().nextInt(0, size);
    return array[randDomIndex];
  }

  public int getRandom2() {
    int count = 0;
    ListNode currentNode = head;
    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }
    int randDomIndex = ThreadLocalRandom.current().nextInt(0, count);
    int count2 = 0;
    currentNode = head;
    while (currentNode != null) {
      if (count2 == randDomIndex) {
        return currentNode.val;
      }
      count2++;
      currentNode = currentNode.next;
    }
    return head.val;
  }

  private void copyArray(int[] oldArray) {
    int oldLength = oldArray.length;
    int newLength = oldLength + (oldLength >> 1);
    int[] newArray = new int[newLength];
    System.arraycopy(oldArray, 0, newArray, 0, oldLength);
    this.array = newArray;
  }
}
