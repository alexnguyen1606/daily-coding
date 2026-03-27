package com.dsa_in_90_days.binarysearch;

public class BinarySearch {
    public static int search(int[] matrix, int target) {
        int i = 0;
        int j = matrix.length - 1;
        while (i <= j) {
            int valueI = matrix[i];
            if (valueI == target) {
                return i;
            }
            int valueJ = matrix[j];
            if (valueJ == target) {
                return j;
            }
            int mid = (j + i) / 2;
            if (matrix[mid] == target) {
                return mid;
            }
            if (matrix[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
