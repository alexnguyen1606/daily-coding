package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/9/2023
 */

public class LongestIncreasingSubsequence_300 {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] longestIncre = new int[nums.length];
        longestIncre[0] = 1;
        int max = longestIncre[0];
        for (int i = 1; i < nums.length; i++) {
            longestIncre[i] = longestIncre[i - 1];
            if (nums[i] > nums[i - 1]) {
                longestIncre[i] = longestIncre[i - 1] + 1;
            } else if (nums[i] < nums[i - 1]) {
                longestIncre[i] = 1;
            }
            max = Math.max(longestIncre[i], max);
        }

        return max;
    }

}
