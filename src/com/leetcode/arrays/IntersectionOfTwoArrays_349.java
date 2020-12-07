package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:33 PM ,December 04,2020
 */
public class IntersectionOfTwoArrays_349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    if (n == 0 || m == 0) {
      return new int[0];
    }
    int[] result = new int[0];
    for (int i = 0; i < n; i++) {
      if (exitsInArray(nums2, nums1[i])) {
        if (!exitsInArray(result, nums1[i])) {
          result = add(result, nums1[i]);
        }
      }
    }
    return result;
  }

  public int[] add(int[] array, int target) {
    int[] newArray = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    newArray[array.length] = target;
    return newArray;
  }

  private boolean exitsInArray(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      if (nums[i] == target) {
        return true;
      }
      if (nums[j] == target) {
        return true;
      }
      i++;
      j--;
    }
    return false;
  }
}
