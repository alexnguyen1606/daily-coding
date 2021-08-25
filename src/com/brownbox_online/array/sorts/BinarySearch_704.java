package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:20 AM ,August 18,2021
 */
public class BinarySearch_704 {
  public int search(int[] nums, int target) {
    return search(nums, 0, nums.length - 1, target);
  }

  public int search(int[] nums, int L, int R, int target) {
    if (L > R) {
      return -1;
    }
    int middle = (L + R) / 2;
    if (nums[middle] == target) {
      return middle;
    }
    if (nums[middle] > target) {
      return search(nums, L, middle - 1, target);
    } else {
      return search(nums, middle + 1, R, target);
    }
  }
}
