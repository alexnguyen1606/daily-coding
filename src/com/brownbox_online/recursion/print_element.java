package com.brownbox_online.recursion;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:48 AM ,August 11,2021
 */
public class print_element {
  public static void printElement(int[] array, int index) {
    if (index < 0 || index >= array.length) {
      return;
    }
      printElement(array, index + 1);
    System.out.println(array[index]);
  }

  public static void main(String[] args) {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    printElement(array, 0);
  }
}
