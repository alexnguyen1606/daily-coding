package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 30,2020
 */
public class FindPivotIndex_724 {
  // is pivot index when total value left equal to total value right
  // if number pivot > 1 , choose left index
  // if no privot return -1
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    pivotIndex(array);
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ,");
    }
    System.out.println();
  }

  public static int pivotIndex(int[] nums) {
    int n = nums.length;
    if (n == 1) {
      return 0;
    }
    if (n == 0) {
      return -1;
    }
    int[] left = new int[n];
    int[] right = new int[n];
    for (int i = 0; i < n; i++) {
      left[i] = (i == 0) ? nums[i] : (left[i - 1] + nums[i]);
      int j = n - 1 - i;
      right[j] = (j == n - 1) ? nums[j] : (left[j + 1] + nums[j]);
    }
    for (int i = n - 1; i >= 0; i--) {
      if (i == n - 1) {
        right[i] = nums[i];
      } else {
        right[i] = right[i + 1] + nums[i];
      }
    }
    for (int i = 0; i < n; i++) {
      if (right[i] == left[i]) {
                return i;
      }
    }

    return -1;
  }
}
