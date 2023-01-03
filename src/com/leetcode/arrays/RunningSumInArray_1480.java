package com.leetcode.arrays;

/**
 * @author: Nguyen Anh Tuan
 * @created: 10/10/2022
 */

public class RunningSumInArray_1480 {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4};
        System.out.printf(runningSum(array).toString());
    }


}
