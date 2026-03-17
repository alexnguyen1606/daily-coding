package com.dsa_in_90_days.twopointers;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array
public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int[] rs = sort(nums);
        return rs;
    }

    private static int[] sort(int[] nums) {
        int minIndex = getMinValueIndex(nums);
        int i = minIndex;
        int j = minIndex + 1;
        int indexCounter = 0;
        int[] rs = new int[nums.length];
        while (i >= 0 || j < nums.length) {
            if (j == nums.length) {
                rs[indexCounter] = nums[i];
                i--;
                indexCounter++;
                continue;
            }
            if (i < 0) {
                rs[indexCounter] = nums[j];
                j++;
                indexCounter++;
                continue;
            }

            int valI = nums[i];
            int valJ = nums[j];
            if (valI > valJ) {
                rs[indexCounter] = valJ;
                j++;
            } else {
                rs[indexCounter] = valI;
                i--;
            }
            indexCounter++;
        }
        return rs;
    }

    private static int getMinValueIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            }
            var minValue = nums[minIndex];
            if (nums[i] < minValue) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10};
        int[] squareds = sortedSquares(array);
        System.out.println(squareds);
    }

}
