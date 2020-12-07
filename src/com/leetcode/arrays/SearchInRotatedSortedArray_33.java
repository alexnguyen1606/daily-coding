package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:16 PM ,December 07,2020
 */
public class SearchInRotatedSortedArray_33 {
  public int search(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      if (nums[i] == target) {
        return i;
      }
      if (nums[j] == target) {
        return j;
      }
      i++;
      j--;
    }
    return -1;
  }
}
