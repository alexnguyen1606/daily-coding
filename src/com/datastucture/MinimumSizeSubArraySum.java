package com.datastucture;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class MinimumSizeSubArraySum {

    // sử dụng kỹ thuật sliding window
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        int L = 0;
        int R = 0;
        int n = nums.length;
        int sum = nums[R];
        while (R < n) {
            if (sum < target) {
                R++;
                if (R < n)
                    sum += nums[R];
            } else {
                if (minLength == 0) {
                    minLength = R - L +1;
                }
                minLength = Math.min(minLength, R - L + 1);
                sum -= nums[L];
                L++;
            }

        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

}
