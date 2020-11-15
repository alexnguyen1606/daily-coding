package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 06,2020
 */
public class MaxSubArrray_53 {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j >= i; j--) {
        int temp = incremental(nums, i, j);
        if (temp > max) {
          max = temp;
        }
      }
    }
    return max;
  }

  private int incremental(int[] nums, int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      result += nums[i];
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(1/5); //
  }
}
