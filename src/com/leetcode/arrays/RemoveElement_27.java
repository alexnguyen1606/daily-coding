package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 10,2020
 */
public class RemoveElement_27 {
  public static void main(String[] args) {
      int[] a = {1,2,3};
    System.out.println(removeElement(a,2));
  }

    public static int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }
}
