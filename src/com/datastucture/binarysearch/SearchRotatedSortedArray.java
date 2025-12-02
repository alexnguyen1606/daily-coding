package com.datastucture.binarysearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchRotatedSortedArray {

    //[4,5,6,7,0,1,2]
    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length, target);
    }

    public static int search(int[] nums, int left, int right, int target) {
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        if (left == right && nums[left] != target) {
            return -1;
        }
        int middle = (left + right) / 2;
//        if ()
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(array, 5));
    }

}
