package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/4/2023
 */

public class MaxSubarray_53 {

    public static int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }

        int result = sum[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sumIJ = sum[j] - sum[i] + nums[i];
                result = Math.max(result, sumIJ);
            }
        }
        return result;
    }

    public static int maxSubArrayOptimize(int[] nums) {
        int[] maxAtIndex = new int[nums.length];
        maxAtIndex[0] = nums[0];
        int result = maxAtIndex[0];
        for (int i = 1; i< maxAtIndex.length; i++) {
            maxAtIndex[i] = Math.max(nums[i], nums[i] + maxAtIndex[i-1]);
            result = Math.max(result, maxAtIndex[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5, 6};
        maxSubArray(x);
    }

}
