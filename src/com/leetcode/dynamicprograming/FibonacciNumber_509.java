package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/6/2023
 */

public class FibonacciNumber_509 {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

}
