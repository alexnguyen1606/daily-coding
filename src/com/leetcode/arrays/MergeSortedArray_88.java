package com.leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author:Nguyen Anh Tuan
 * <p>September 09,2020
 */
// Merge Sort Arrary
public class MergeSortedArray_88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length - m;
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n - 1; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        for (int x : nums1) {
            System.out.println(x);
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (j >= 0 && i >= 0) { // i and j available
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            } else if (i >= 0) { // i available
                nums1[k] = nums1[i];
                i--;
            } else { // rest of condition j available
                nums1[k] = nums1[j];
                j--;
            }
            k--;
        }
        for (int x : nums1) {
            System.out.print(x);
            System.out.print(",");
        }
    }
}
