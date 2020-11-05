package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 10,2020
 */
public class ReplaceDuplicateInArraySorted {
  public static void main(String[] args) {
    int[] a = {0,0,1,1,1,2,2,3,3,4};
  }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int currentIndex = 0;
        for (int i = 0;i<length-1;i++){
           if (nums[currentIndex] != nums[i]){
               currentIndex++;
               nums[currentIndex] = nums[i];
           }
        }
        return currentIndex+1;
    }
}
