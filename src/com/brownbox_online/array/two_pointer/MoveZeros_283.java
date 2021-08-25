package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 *     <p>12:50 AM ,August 18,2021
 */
public class MoveZeros_283 {
  public void moveZeroes(int[] nums) {
    int n = nums.length;
    int k=0;
    for (int i = 0; i < n; i++) {
        if (nums[i]!=0){
            nums[k] = nums[i];
            k++;
        }
    }
    for (;k<n;k++){
        nums[k] = 0;
    }
  }
}
