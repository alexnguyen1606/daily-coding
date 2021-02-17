package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:36 PM ,December 31,2020
 */
public class PeakIndexInMountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length-1;
        while (i < n) {
            if (i - 1 >= 0 && i + 1 < n) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}
