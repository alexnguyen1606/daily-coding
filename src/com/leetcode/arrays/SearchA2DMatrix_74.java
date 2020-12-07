package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:40 AM ,December 07,2020
 */
public class SearchA2DMatrix_74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length; // number of col
    if (n == 0) {
      return false;
    }
    int m = matrix[n - 1].length; // number of row
    for (int i = 0; i < n; i++) {
      int j = m - 1;
      int k = 0;
      while (k <= j) {
        if (matrix[i][j] == target) {
          return true;
        }
        if (matrix[i][k] == target) {
          return true;
        }
        j--;
        k++;
      }
    }
    return false;
  }
}
