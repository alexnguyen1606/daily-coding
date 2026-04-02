package com.dsa_in_90_days.binarysearch;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArray = mergeSortedArray(nums1, nums2);
        int mid = (mergeArray.length - 1) / 2;
        if (mergeArray.length % 2 == 0) {
            return (mergeArray[mid] + mergeArray[mid + 1]) / 2.0;
        }
        return mergeArray[mid];
    }

    public int[] mergeSortedArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] rs = new int[nums1.length + nums2.length];
        while (k < rs.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    rs[k] = nums2[j];
                    j++;
                } else {
                    rs[k] = nums1[i];
                    i++;
                }

            } else if (i < nums1.length) {
                rs[k] = nums1[i];
                i++;
            } else {
                rs[k] = nums2[j];
                j++;
            }
            k++;
        }
        return rs;
    }

}
