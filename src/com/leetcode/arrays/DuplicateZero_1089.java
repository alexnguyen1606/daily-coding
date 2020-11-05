package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 09,2020
 */
// Duplicate zero
public class DuplicateZero_1089 {
  public static void main(String[] args) {
    int[] a = {1,2,3};
    duplicateZero(a);
  }

  public static void duplicateZero(int[] array) {
    int length = array.length;
    for (int i = 0; i < length; i++) {
      if (array[i] == 0) {
        for (int j = length - 2; j >= i + 1; j--) {
          array[j + 1] = array[j];
        }
        array[i + 1] = 0;
        i++;
      }
    }
    for (int x : array) {
      System.out.println(x);
    }
  }
}
