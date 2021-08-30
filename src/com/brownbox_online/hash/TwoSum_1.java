package com.brownbox_online.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:46 PM ,August 27,2021
 */
public class TwoSum_1 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hashSet = new HashMap();
    int[] result = null;
    for (int i = 0; i < nums.length; i++) {
      if (hashSet.containsKey(target - nums[i])) {
        result = new int[2];
        result[0] = i;
        result[1] = hashSet.get(target - nums[i]);
        break;
      }
      if (!hashSet.containsKey(nums[i])) {
        hashSet.put(nums[i], i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TwoSum_1 twoSum = new TwoSum_1();
    int[] array = {3, 2, 4};
    System.out.println(Arrays.toString(twoSum.twoSum(array, 6)));
  }
}
