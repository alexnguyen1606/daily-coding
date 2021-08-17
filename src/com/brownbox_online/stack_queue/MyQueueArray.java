package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:58 PM ,August 17,2021
 */
public class MyQueueArray implements IStackQueue {
  private int tailIndex;
  private int headIndex;
  private final int[] array;
  private final int SIZE;

  public MyQueueArray(int SIZE) {
    this.SIZE = SIZE;
    array = new int[SIZE];
    headIndex = -1;
    tailIndex = -1;
  }

  @Override
  public int pop() {
    if (isEmpty()){
        return 0;
    }
    int value = array[headIndex++];
    for (int i = headIndex;i<= tailIndex && i>=1;i++){
        array[i-1] = array[i];
    }
    headIndex--;
    tailIndex--;
    if (headIndex > tailIndex){
        headIndex = -1;
        tailIndex = -1;
    }
    return value;
  }

  @Override
  public boolean push(int value) {
    if (isFull()){
        return false;
    }
    if (isEmpty()){
        headIndex++;
    }
    array[++tailIndex] = value;
    return true;
  }

  @Override
  public boolean isFull() {
    return tailIndex == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {
    return (tailIndex == -1) && (headIndex == -1);
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public void print() {
    if (isEmpty()) {
      System.out.println("Stack is Empty");
      return;
    }
    for (int i = headIndex; i <= tailIndex; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
