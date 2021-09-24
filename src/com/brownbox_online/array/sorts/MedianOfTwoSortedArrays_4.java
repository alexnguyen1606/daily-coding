package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 *     <p>6:20 PM ,August 27,2021
 */
//Hard
public class MedianOfTwoSortedArrays_4 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] merged = mergeSortedArray(nums1, nums2);
    int i = 0;
    int j = merged.length - 1;
    int k = (j + i) / 2;
    if (merged.length % 2 == 0) {
      return (double) (merged[k] + merged[k + 1]) / 2;
    }
    return merged[k];
  }

  public int[] mergeSortedArray(int[] num1, int[] num2) {
    int n = num1.length;
    int m = num2.length;
    int i = 0, j = 0, k = 0;
    int[] merged = new int[n + m];
    while (k < merged.length) {
      if (i < num1.length && j < num2.length) {
        if (num1[i] < num2[j]) {
          merged[k] = num1[i];
          i++;
        } else {
          merged[k] = num2[j];
          j++;
        }
      } else if (i < num1.length) {
        merged[k] = num1[i];
        i++;
      } else {
        merged[k] = num2[j];
        j++;
      }

      k++;
    }
    return merged;
  }
}
