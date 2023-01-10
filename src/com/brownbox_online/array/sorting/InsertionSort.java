package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:16 AM ,August 11,2021
 */
public class InsertionSort extends BaseSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        print(array);
        int value, j;
        for (int i = 1; i < n; i++) {
            value = array[i];
            j = i;
            while (j > 0 && array[j - 1] > value) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }
        print(array);
    }
}
