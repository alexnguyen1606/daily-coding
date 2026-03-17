package com.dsa_in_90_days.twopointers;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rs[i] = nums[i] * nums[i];
        }
        Arrays.sort(rs);
        return rs;
    }

}
