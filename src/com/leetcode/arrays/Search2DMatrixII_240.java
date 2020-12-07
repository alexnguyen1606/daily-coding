package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:01 PM ,December 04,2020
 */
public class Search2DMatrixII_240 {
  public static boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length; // number of col
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

  public static void main(String[] args) {
    int[][] array = new int[10][8];
    array[9][0] = 1;
    array[9][1] = 2;
    array[9][2] = 3;
    array[9][3] = 4;
    array[9][4] = 5;
    array[9][5] = 6;
    array[9][6] = 7;
    array[9][7] = 8;
    System.out.println(  searchMatrix(array, 7));
  }
}
