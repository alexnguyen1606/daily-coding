package com.brownbox_online.heap;

import java.util.Scanner;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:28 PM ,August 30,2021
 */
public class MinHeap {

  private final int MAX_SIZE;
  private final int[] array;
  private int size;

  public MinHeap(int MAX_SIZE) {
    this.MAX_SIZE = MAX_SIZE;
    this.array = new int[MAX_SIZE + 1];
    this.size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Heap is empty");
      return -1;
    }
    return array[1];
  }

  public int poll() {
    if (isEmpty()) {
      System.out.println("Heap is empty");
      return -1;
    }
    int result = array[1];
    swap(1, size);
    size--;
    heapifyDown(1);
    return result;
  }

  public void heapifyDown(int currentIndex) {
    int iLeft;
    int iRight;
    int smallerValueIndex;
    while ((currentIndex * 2) <= size) {
      iLeft = currentIndex * 2;
      smallerValueIndex = iLeft;
      iRight = iLeft + 1;
      if (iRight <= size && array[iRight] < array[iLeft]) {
        smallerValueIndex = iRight;
      }
      if (array[smallerValueIndex] < array[currentIndex]) {
        swap(smallerValueIndex, currentIndex);
        currentIndex = smallerValueIndex;
      } else {
        break;
      }
    }
  }

  public void add(int val) {
    size++;
    array[size] = val;
    heapifyUp(size / 2, size);
  }

  public void heapifyUp(int iParent, int iChild) {
    if (iParent == 0) {
      return;
    }
    if (array[iParent] > array[iChild]) {
      swap(iParent, iChild);
      heapifyUp(iParent / 2, iParent);
    }
  }

  private void swap(int iParent, int iChild) {
    int temp = array[iParent];
    array[iParent] = array[iChild];
    array[iChild] = temp;
  }

  public void remove(int val) {
    if (isEmpty()) {
      System.out.println("Heap is empty");
      return;
    }
    int currentIndex = -1;
    for (int i = 1; i <= size; i++) {
      if (array[i] == val) {
        currentIndex = i;
        break;
      }
    }
    if (currentIndex == -1) {
      System.out.println("Element not found");
      return;
    }
    swap(currentIndex, size);
    size--;
    heapifyDown(currentIndex);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int operation;
    MinHeap minHeap = new MinHeap(10000);
    int value;
    while (n > 0) {
      operation = scanner.nextInt();
      if (operation == 1) {
        System.out.println("Add");
        value = scanner.nextInt();
        minHeap.add(value);
      } else if (operation == 2) {
        System.out.println("Remove element");
        value = scanner.nextInt();
        minHeap.remove(value);
      } else if (operation == 3) {
        System.out.println("Min:");
        System.out.println(minHeap.peek());
      }
      n--;
    }
  }
}
