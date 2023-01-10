package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:18 AM ,August 11,2021
 */
public class SelectionSort extends BaseSort {

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, i, index);
            }
        }

    }


}
