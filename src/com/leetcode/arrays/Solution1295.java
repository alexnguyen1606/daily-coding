package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * May 29,2020
 */
public class Solution1295 {
    public static void main(String[] args) {
        int[] nums = {1092, 122, 12313, 12212, 21203};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int number = nums[i];
            while (number > 0) {
                count++;
                number = number / 10;
            }
            if (count % 2 == 0) {
                total++;
            }
        }
        return total;
    }
}
