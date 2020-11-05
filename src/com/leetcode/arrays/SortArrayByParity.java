package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 10,2020
 */
public class SortArrayByParity {
  public int[] sortArrayByParity(int[] A) {
    int i = 0;
    int j = A.length - 1;
    while (i < j) {
      if (A[i] % 2 != 0) {
        if (A[j] % 2 == 0) {
          int temp = A[i];
          A[i] = A[j];
          A[j] = temp;
        } else {
          j--;
        }
      } else {
        i++;
      }
    }
    return A;
  }
}
