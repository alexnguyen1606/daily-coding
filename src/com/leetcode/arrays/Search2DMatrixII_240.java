package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:01 PM ,December 04,2020
 */
public class Search2DMatrixII_240 {
  public  boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length; // number of col
    int m = matrix[n - 1].length; // number of row
    boolean check;
    for (int i = 0; i < n; i++) {
      int j = m - 1;
      int k = 0;
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
    int middle =start+(end-start)/2;
    if (matrix[fix][middle]==target){
      return true;
    }
    if (matrix[fix][middle] < target){
      return search(matrix,fix,middle+1,end,target);
    }else {
     return search(matrix,fix,start,middle-1,target);
    }
  }
  
  public  boolean searchMatrix2(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[row-1].length;
    return false;
  }

  
}
