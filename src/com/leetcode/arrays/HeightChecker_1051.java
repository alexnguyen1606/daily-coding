package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class HeightChecker_1051 {
  public static void main(String[] args) {
      int[] array  = {1,2,45,78,2,3,6,0};
    System.out.println(heightChecker(array));
  }

  public static int heightChecker(int[] heights) {
    int[] copy = new int[heights.length];
    for (int i = 0; i < heights.length; i++) {
      copy[i] = heights[i];
    }
    sort(copy);
    int count = 0 ;
    for (int i=0;i<heights.length;i++ ){
        if (heights[i]!=copy[i]){
            count++;
        }
    }
    return count;
  }

  public void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
    }
  }

  public static void sort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int value = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > value) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = value;
    }
  }
}
