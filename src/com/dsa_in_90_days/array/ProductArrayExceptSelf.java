package com.dsa_in_90_days.array;

public class ProductArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] rs = new int[nums.length];
        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
                continue;
            }
            prefix[i] = nums[i] * prefix[i - 1];
        }
        int[] suffix = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suffix[i] = nums[i];
                continue;
            }
            suffix[i] = nums[i] * suffix[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int prefixValue = i > 0 ? prefix[i - 1] : 1;
            int suffixValue = i < nums.length - 1 ? suffix[i + 1] : 1;
            rs[i] = prefixValue * suffixValue;
        }

        return rs;
    }

    // 1 2 3 4
    // 1 2 6 24
    // 24 24 12  4

    // 24 12 8 6
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        productExceptSelf(array);
    }
}
