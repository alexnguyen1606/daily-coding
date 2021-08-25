package com.brownbox_online.bit_manipulation;

/**
 * @author:Nguyen Anh Tuan
 *     <p>12:14 AM ,August 26,2021
 */
public class MissingNumber_236 {
  public int missingNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result ^= i;
    }
    for (int value : nums) {
      result ^= value;
    }
    return result;
  }
}
