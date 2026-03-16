package com.dsa_in_90_days.hashmap;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
public class TwoSumII {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (map.containsKey(y)) {
                return new int[] {map.get(y) + 1, i + 1};
            }
            map.put(x, i);
        }
        return null;
    }


}
