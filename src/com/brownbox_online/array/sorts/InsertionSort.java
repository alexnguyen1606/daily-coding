package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:16 AM ,August 11,2021
 */
public class InsertionSort extends AbsSort {
    public static void insertionSort(int[] array){
        int n = array.length;
        print(array);
        System.out.println("before");
        int value,j;
        int count = 0;
        for (int i = 1;i<n;i++){
            value = array[i];
            j = i;
            count++;
            while (j>0 && array[j-1] > value){
                array[j] = array[j-1];
                j--;
                count++;
            }
            array[j] = value;
        }
        System.out.println("Time:"+count);
        print(array);
    }
}
