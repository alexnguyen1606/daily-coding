package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>May 29,2020
 */
public class SquareSortedArray_977 {
  public static void main(String[] args) {
    int[] A = {-4, -1, 0, 3, 10};
    int[] resutl = new int[A.length];
    resutl = sortedSquares(A);
    for (int i = 0; i < A.length; i++) {
      System.out.println(resutl[i]);
    }
  }

  public static int[] sortedSquares(int[] A) {
    int lenght = A.length;
    int i = -1;
    int j = lenght;
    int[] result = new int[lenght];
    while ((i + 1) < lenght && (A[i + 1] < 0)) { // find index i
      i++;
    }
    while ((j - 1) >= 0 && (A[j - 1] >= 0)) { // find index j
      j--;
    }
    int k = 0;
    while (i >= 0 || j < lenght) {
      if (i >= 0 && j < lenght) { // both i and j are valid
        int ii = A[i] * A[i];
        int jj = A[j] * A[j];
        if (ii <= jj) {
          result[k] = ii;
          i--;
        } else {
          result[k] = jj;
          j++;
        }
      } else if (i >= 0) {
        result[k] = A[i] * A[i];
        i--;

      } else {
        result[k] = A[j] * A[j];
        j++;
      }
      k++;
    }
    return result;
  }
}
