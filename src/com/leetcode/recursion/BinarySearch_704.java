package com.leetcode.recursion;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 05,2020
 */
public class BinarySearch_704 {
  public int search(int[] nums, int target) {
    return search(nums, 0, nums.length - 1, target);
  }

  public int search(int[] nums, int L, int R, int target) {
    if (L > R) {
      return -1;
    }
    int k = (L + R) / 2;
    if (target == nums[k]) {
      return k;
    }
    if (nums[k] > target) {
      return search(nums, L, k - 1, target);
    }
    return search(nums, k + 1, R, target);
  }
}
