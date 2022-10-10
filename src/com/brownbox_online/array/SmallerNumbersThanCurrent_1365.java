package com.brownbox_online.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:20 PM ,August 11,2021
 */
public class SmallerNumbersThanCurrent_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int value;
        int count;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            value = nums[i];
            if (map.containsKey(value)){
                result[i] = map.get(value);
                continue;
            }
            count = 0;
            for (int num : nums) {
                if (value > num) {
                    count++;
                }
            }
            result[i] = count;
            map.put(value,count);
        }
        return result;
    }
    
    public static void quickSort(int[] array, int L,int R){
        if (L==R){
            return;
        }
        int key = array[(R-L)/2];
        int pivot = pivot(array,L,R,key);
        quickSort(array,L,pivot-1);
        quickSort(array,pivot,R);
    }
    
    public static int pivot(int[] array,int L,int R,int key){
        int iL = L;
        int iR = R;
        while (iL<=iR){
            while (array[iL] < key){
                iL++;
            }
            while (array[iR] > key){
                iR--;
            }
            if (iL<=iR){
                int temp = array[iL];
                array[iL] = array[iR];
                array[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }
    
    public static int[] mergeSort(int[] array, int L, int R){
        if (L==R){
            return new int[]{array[L]};
        }
        int mid = (R-L)/2;
        int[] leftArray = mergeSort(array,L,mid);
        int[] rightArray = mergeSort(array,mid+1,R);
        int[] result = new int[leftArray.length+rightArray.length];
        int i =0,j = 0,k=0;
        while (i<result.length){
            if ( j < leftArray.length && k<rightArray.length){
                if (leftArray[j] > rightArray[k]){
                    result[i] = rightArray[k];
                    k++;
                }else {
                    result[i] = leftArray[j];
                    j++;
                }
            }else if (j<leftArray.length){
                result[i] = leftArray[j];
                j++;
            }else {
                result[i] = rightArray[k];
                k++;
            }
            i++;
        }
        return result;
    }


    
}
