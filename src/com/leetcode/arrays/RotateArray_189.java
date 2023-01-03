package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>2:22 PM ,December 03,2020
 */
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }
        // vì k/n đổi chỗ không làm thay đổi vị trí của các phần tử trong mảng
        k = k % n;
        reverseArray(nums, 0, n - k - 1); // reverse left
        reverseArray(nums, n - k, n - 1); // reverse right
        reverseArray(nums, 0, n - 1); // revrerse All;
    }

    private void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
