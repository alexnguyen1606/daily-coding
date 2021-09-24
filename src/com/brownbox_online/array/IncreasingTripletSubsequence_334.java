package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:12 PM ,September 19,2021
 */
public class IncreasingTripletSubsequence_334 {
  public boolean increasingTriplet(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] >= nums[i + 1]) {

      } else if (nums[i] < nums[i + 1]) {
		return true;
      }
    }
    return false;
  }
}
