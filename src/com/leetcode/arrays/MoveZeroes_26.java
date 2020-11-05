package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 10,2020
 */
public class MoveZeroes_26 {
  public void moveZeroes(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }
    }
    for (int i=index;i<nums.length;i++){
        nums[i] = 0;
    }
  }
}
