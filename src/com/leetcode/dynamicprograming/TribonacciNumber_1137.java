package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/9/2023
 */

public class TribonacciNumber_1137 {

    public int tribonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }

        int[] hash = new int[n];
        hash[0] = 0;
        hash[1] = 1;
        hash[2] = 1;

        for (int i = 3; i < n; i++) {
            hash[i] = hash[i] + hash[i - 1] + hash[i - 2];
        }
        return hash[n - 1];
    }

}
