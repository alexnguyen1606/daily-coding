package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 02,2020
 */
public class MyCircularQueue_622 {
  /** Initialize your data structure here. Set the size of the queue to be k. */
  private int[] array;

  private int SIZE;
  int headIndex;
  int tailIndex;
  int count;

  public MyCircularQueue_622(int k) {
    array = new int[k];
    SIZE = k;
    headIndex = tailIndex = -1;
    count = 0;
  }

  public void print() {
    for (int i = headIndex; i <= tailIndex; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }
    tailIndex++;
    if (isEmpty()) {
      headIndex = tailIndex;
    }
    if (tailIndex == SIZE) {
      tailIndex = 0;
    }
    count++;
    array[tailIndex] = value;
    return true;
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    headIndex++;
    if (headIndex == SIZE) {
      headIndex = 0;
    }
    count--;
    return true;
  }

  /** Get the front item from the queue. */
  public int Front() {
    return isEmpty() ? -1 : array[headIndex];
  }

  /** Get the last item from the queue. */
  public int Rear() {
    return isEmpty() ? -1 : array[tailIndex];
  }

  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return count <= 0;
  }

  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return count >= SIZE;
  }

  public static void main(String[] args) {
    MyCircularQueue_622 myCircularQueue622 = new MyCircularQueue_622(3);
    myCircularQueue622.enQueue(1);
    myCircularQueue622.enQueue(2);
    myCircularQueue622.enQueue(3);
    myCircularQueue622.print();
    myCircularQueue622.deQueue();
    myCircularQueue622.print();
    myCircularQueue622.enQueue(4);
    myCircularQueue622.print();
    myCircularQueue622.enQueue(4);
  }
}
