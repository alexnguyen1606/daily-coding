package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>9:52 AM ,December 04,2020
 */
public class SortAnArray_912 {
    public int[] sortArray(int[] nums) {
        insertionSort(nums);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {
    }

    private void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int MAX = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > MAX) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = MAX;
            print(nums);
        }
    }

    private void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    private void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ,");
        }
    }


    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
