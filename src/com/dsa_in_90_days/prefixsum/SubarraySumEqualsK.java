package com.dsa_in_90_days.prefixsum;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sum-equals-k/description
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remove = prefixSum - k;
            if (frequencyMap.containsKey(remove)) {
                count += frequencyMap.get(remove);
            }
            if (frequencyMap.containsKey(prefixSum)) {
                frequencyMap.put(prefixSum, frequencyMap.get(prefixSum) + 1);
            } else {
                frequencyMap.put(prefixSum, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 1, 2, 1}, 3));
    }


}
