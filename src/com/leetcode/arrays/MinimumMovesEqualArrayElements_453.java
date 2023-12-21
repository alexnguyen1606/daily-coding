package com.leetcode.arrays;

public class MinimumMovesEqualArrayElements_453 {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int val : nums) {
            if (val < min) {
                min = val;
            }
        }

        int count = 0;
        for(int val : nums) {
            count += val - min;
        }
        return count;
    }

}
