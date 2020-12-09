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
    boolean check  = false;
    int k;
    int m = matrix[n - 1].length; // number of row
    for (int i = 0; i < n; i++) {
      int j = m - 1;
      k = 0;
      check = search(matrix,i,k,j,target);
      if (check){
        return check;
      }
    }
    return false;
  }
  public boolean search(int[][] matrix,int fix,int start,int end,int target){
    if (start>end){
      return false;
    }
    int middle = (start+end)/2;
    if (matrix[fix][middle]==target){
      return true;
    }
    if (matrix[fix][middle] < target){
      return search(matrix,fix,middle+1,end,target);
    }else {
      return search(matrix,fix,start,middle-1,target);
    }
  }
}
