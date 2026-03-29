package com.dsa_in_90_days.binarysearch;

public class FindMinInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,1,2}));
    }


}
