package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:37 PM ,December 16,2020
 */
public class TwoSumII_167 {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int j = nums.length - 1;
      while (j >= i) {
        if ((nums[i] + nums[j]) == target) {
          return new int[] {i + 1, j + 1};
        }
        j--;
      }
    }
    return nums;
  }
}
