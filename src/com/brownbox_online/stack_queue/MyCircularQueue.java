package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:44 AM ,August 18,2021
 */
// Design Circle Queue
public class MyCircularQueue {
  private final int[] array;
  private final int SIZE;
  private int head;
  private int tail;
  private int count;

  public MyCircularQueue(int k) {
    this.SIZE = k;
    this.array = new int[SIZE];
    head = -1;
    tail = -1;
  }

  public boolean enQueue(int value) {
      if (isFull()){
          return false;
      }
      if (isEmpty()){
          head = 0;
          tail = 0;
      }else if (tail==SIZE-1){
          tail = 0;
      }else {
          tail++;
      }
      array[tail] = value;
      count++;
      return true;
  }

  // remove fist in element
  public boolean deQueue() {
      if (isEmpty()){
          return false;
      }
      if (tail == head){
          tail = -1;
          head = -1;
      }else {
          head++;
          if (head == SIZE){
              head =  0;
          }
      }
      count--;
      return true;
  }

  public int Front() {
      if (isEmpty()){
          return -1;
      }
      return array[head];
  }

  public int Rear() {
      if (isEmpty()){
          return -1;
      }
      return array[tail];
  }

  public boolean isEmpty() {
    return head == -1 && tail == -1;
  }

  public boolean isFull() {
    return count == SIZE ;
  }
  
}
