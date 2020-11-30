package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:48 PM ,November 27,2020
 */
public class AddElementInArraySorted {
    
    public int[] add(int[] array,int target){
        int[] newArray = new int[array.length+1];
        for (int i =0 ;i<array.length;i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = target;
        
        return newArray;
    }
}
