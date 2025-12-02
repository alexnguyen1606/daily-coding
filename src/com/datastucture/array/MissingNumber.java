package com.datastucture.array;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int find = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            find += i + 1;
            sum += nums[i];
        }
        return find - sum;
    }
}
