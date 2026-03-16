package com.dsa_in_90_days.twopointers;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
public class TwoSumII {
    // Đề bài cho 1 mảng tăng dần
    // tìm 2 index có tổng = target
    // Sử dụng 2 con trỏ left,right
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
        return null;
    }
}
