package com.brownbox_online.hash;

/**
 * @author:Nguyen Anh Tuan
 * @created: 8/7/2022 - 11:07 PM
 */
public class HowManyNumbersSmaller_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int count = 0;
            for (int j = 0; j<nums.length ; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
