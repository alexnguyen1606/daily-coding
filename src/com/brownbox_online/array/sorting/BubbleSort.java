package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:36 AM ,August 08,2021
 */
public class BubbleSort extends BaseSort {

  public static void bubbleSort(int[] array) {
    int n = array.length;
    boolean isSorted = true;
    for (int i = 0; i < n; i++) {
      isSorted = true;
      for (int j = 0; j < n - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }

  public static void main(String[] args) {

    System.out.println(fibonacci(15));
  }

  public static int giaithu(int n) {
    if (n == 0) {
      return 1;
    }
    return n * giaithu(n - 1);
  }

  public static int fibonacci(int n) {
    if (n <= 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
