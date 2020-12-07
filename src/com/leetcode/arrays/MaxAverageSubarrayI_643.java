package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>1:41 PM ,December 07,2020
 */
public class MaxAverageSubarrayI_643 {

  /**
   * Execute with 1071ms on leetcode , bad algorithm
   *
   * @param nums
   * @param k
   * @return
   */
  public static double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    int MAX = Integer.MIN_VALUE;
    int i = k - 1;
    int m = 0;
    while (i < n) {
      int temp = 0;
      int j = m;
      int h = i;
      while (j <= h) {
        if (j == h) {
          temp += nums[j];
        } else {
          temp += (nums[j] + nums[h]);
        }
        j++;
        h--;
      }
      MAX = Math.max(temp, MAX);
      i++;
      m++;
    }
    return MAX /1.0/ k;
  }

  /**
   * Best time Algorithm
   *
   * @param nums
   * @param k
   * @return
   */
  public static double findMaxAverage2(int[] nums, int k) {
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    long MAX = sum;
    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k];
      if (sum > MAX) {
        MAX = sum;
      }
    }
    return MAX/1.0/ k;
  }

  public static void main(String[] args) {
    int[] array = new int[] {1, 12, -5, -6, 50, 3};
    System.out.println(findMaxAverage(array, 4));
  }
}
