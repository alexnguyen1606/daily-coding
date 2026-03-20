package com.dsa_in_90_days.prefixsum;

//https://leetcode.com/problems/subarray-sum-equals-k/description
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] prefixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefixSum[i] = nums[i];
                if (prefixSum[i] == k) {
                    count++;
                }
                continue;
            }
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            if (prefixSum[i] == k) {
                count++;
            }
        }
        for (int i = prefixSum.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int delta = prefixSum[i] - prefixSum[j];
                if (delta == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }


}
