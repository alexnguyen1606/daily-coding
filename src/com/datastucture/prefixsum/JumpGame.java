package com.datastucture.prefixsum;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                break;
            }
            if (nums.length - 1 - i <= nums[i]) {
                return true;
            }
            int max = -1;
            int iNext = -1;
            for (int j = i + 1; j <= i + nums[i]; j++) {
                if (j >= nums.length) {
                    continue;
                }
                if (nums[j] >= max) {
                    iNext = j;
                    max = nums[j];
                }
            }
            i = iNext;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] x = new int[] {4,2,0,0,1,1,4,4,4,0,4,0};
        System.out.println(canJump(x));
    }
}
