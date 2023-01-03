package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 10/11/2022
 */

public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] hash = new int[n];
        hash[0] = 1;
        hash[1] = 2;
        for (int i = 2; i < n; i++) {
            hash[i] = hash[i - 1] + hash[i - 2];
        }
        return hash[n - 1];
    }

}
