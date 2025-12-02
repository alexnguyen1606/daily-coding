package com.datastucture.binarysearch;

public class FindMinimumRotatedSorted {

    public int findMin(int[] nums) {
        return find(0, nums.length - 1, nums);
    }


    public int find(int L, int R, int[] nums) {
        if (L == R) {
            return nums[L];
        }
        int middle = (L + R) / 2;
        if (nums[middle] >= nums[R]) {
            return find(middle + 1, R, nums);
        }
        return find(L, middle, nums);

    }

}
