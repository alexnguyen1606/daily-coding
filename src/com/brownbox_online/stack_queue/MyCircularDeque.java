package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:50 PM ,August 18,2021
 */
public class MyCircularDeque {

  private final int[] array;
  private final int SIZE;
  private int count;
  private int head;
  private int tail;

  /** Initialize your data structure here. Set the size of the deque to be k. */
  public MyCircularDeque(int k) {
    SIZE = k;
    array = new int[SIZE];
    head = -1;
    tail = -1;
    count = 0;
  }

  /** Adds an item at the front of Deque. Return true if the operation is successful. */
  public boolean insertFront(int value) {
    if (isFull()) {
      return false;
    }
    if (isEmpty()) {
      tail = 0;
      head = 0;
    } else {
      head--;
      if (head == -1) {
        head = SIZE - 1;
      }
    }
    count++;
    array[head] = value;
    return true;
  }

  /** Adds an item at the rear of Deque. Return true if the operation is successful. */
  public boolean insertLast(int value) {
    if (isFull()) {
      return false;
    }
    if (isEmpty()) {
      tail = 0;
      head = 0;
    } else {
      tail++;
      if (tail == SIZE ) {
        tail = 0;
      }
    }
    count++;
    array[tail] = value;
    return true;
  }

  /** Deletes an item from the front of Deque. Return true if the operation is successful. */
  public boolean deleteFront() {
    if (isEmpty()) {
      return false;
    }
    if (tail == head) {
      tail = -1;
      head = -1;
    } else {
      head++;
      if (head == SIZE) {
        head = 0;
      }
    }
    count--;
    return true;
  }

  /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
  public boolean deleteLast() {
    if (isEmpty()) {
      return false;
    }
    if (tail == head) {
      tail = -1;
      head = -1;
    } else {
      tail--;
      if (tail == -1) {
        tail = SIZE - 1;
      }
    }
    count--;
    return true;
  }

  /** Get the front item from the deque. */
  public int getFront() {
    if (isEmpty()) {
      return -1;
    }
    return array[head];
  }

  /** Get the last item from the deque. */
  public int getRear() {
    if (isEmpty()) {
      return -1;
    }
    return array[tail];
  }

  /** Checks whether the circular deque is empty or not. */
  public boolean isEmpty() {
    return head == -1 && tail == -1;
  }

  /** Checks whether the circular deque is full or not. */
  public boolean isFull() {
    return count == SIZE;
  }
}
