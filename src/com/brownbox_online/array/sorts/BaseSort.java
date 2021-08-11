package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:17 AM ,August 11,2021
 */
public abstract class BaseSort {
    public static void swap(int[] array,int indexSource,int indexDes){
        int temp = array[indexDes];
        array[indexDes] = array[indexSource];
        array[indexSource] = temp;
    }
    
    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
