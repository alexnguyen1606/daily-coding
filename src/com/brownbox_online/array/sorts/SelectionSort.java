package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:18 AM ,August 11,2021
 */
public class SelectionSort extends AbsSort{
    public static void selectionSort(int[] array,boolean check){
        int n = array.length;
        for (int i = 0;i<n-1;i++){
            int index = i;
            for (int j = i;j<n;j++){
                if (check && array[j] < array[index] ){
                    index = j;
                }else if (!check && array[j] > array[index]){
                    index = j;
                }
            }
            if (index != i){
                swap(array,i,index);
            }
        }
        
    }
    
 
}
