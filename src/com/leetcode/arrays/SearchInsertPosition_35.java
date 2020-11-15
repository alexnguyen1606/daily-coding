package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 06,2020
 */
public class SearchInsertPosition_35 {
  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int index = searchBinary(nums, 0, n, target);
    if (index == -1) {
      for (int i = 0; i < n - 1; i++) {
        if (nums[i] < target && nums[i + 1] > target) {
          return i + 1;
        }
      }
      if (nums[0] > target) {
        return 0;
      }
      return n;
    }
    return index;
  }

  public int searchBinary(int[] nums, int L, int R, int target) {
    if (L > R) {
      return -1;
    }
    int middle = (L + R) / 2;
    if (nums[middle] == target) {
      return middle;
    }
    if (nums[middle] > target) {
      return searchBinary(nums, L, middle - 1, target);
    }
    return searchBinary(nums, middle + 1, R, target);
  }
}
