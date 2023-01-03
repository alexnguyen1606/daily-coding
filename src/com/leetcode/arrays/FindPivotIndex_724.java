package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>October 30,2020
 */
public class FindPivotIndex_724 {
    // is pivot index when total value left equal to total value right
    // if number pivot > 1 , choose left index
    // if no privot return -1
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.printf(String.valueOf(pivotIndex(array)));
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.println();
    }

    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int pivotIndex = (nums.length - 1) / 2;
        int totalLeftPivot = 0;
        int totalRightPivot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < pivotIndex) {
                totalLeftPivot += nums[i];
            } else if (i > pivotIndex) {
                totalRightPivot += nums[i];
            }
        }
        while (totalLeftPivot != totalRightPivot) {
            if(pivotIndex == 0 || pivotIndex == nums.length - 1) {
                return -1;
            }
            if (totalLeftPivot > totalRightPivot) {
                totalLeftPivot -= nums[pivotIndex - 1];
                totalRightPivot += nums[pivotIndex];
                pivotIndex--;
            } else {
                totalLeftPivot += nums[pivotIndex];
                totalRightPivot -= nums[pivotIndex + 1];
                pivotIndex++;
            }
        }
        return totalLeftPivot == totalRightPivot ? pivotIndex : -1;
    }
}
