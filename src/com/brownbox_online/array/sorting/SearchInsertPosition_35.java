package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:04 PM ,September 16,2021
 */
public class SearchInsertPosition_35 {

  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      if (nums[middle] == target) {
        return middle;
      }
      if (nums[middle] > target) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return left;
  }
}
