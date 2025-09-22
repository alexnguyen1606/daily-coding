package com.datastucture;
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int value = nums[i] + nums[j];
                if (value == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
