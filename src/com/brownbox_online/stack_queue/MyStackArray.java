package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:44 PM ,August 17,2021
 */
public class MyStackArray implements IStackQueue {

  private final int[] array;
  private final int SIZE;
  private int index;

  public MyStackArray(int SIZE) {
    this.array = new int[SIZE];
    this.SIZE = SIZE;
    index = -1;
  }

  @Override
  public int pop() {
    if (isEmpty()){
        return -1;
    }
    return array[index--];
  }

  @Override
  public boolean push(int value) {
    if (isFull()){
        System.out.println("Stack is Full!");
        return false;
    }
    array[++index] = value;
    return true;
  }

  @Override
  public boolean isFull() {
    return index == (SIZE - 1);
  }

  @Override
  public boolean isEmpty() {
    return index < 0;
  }

  @Override
  public int size() {
    return index + 1;
  }

  @Override
  public void print() {
    if (isEmpty()) {
      System.out.println("Stack is Empty");
    } else {
      for (int i = 0; i <= index; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }
}
