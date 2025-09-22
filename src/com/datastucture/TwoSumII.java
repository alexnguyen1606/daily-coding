package com.datastucture;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    // - Input Array Is Sorted
    // assume size min = 2
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = 1;
        int sum = numbers[i] + numbers[j];
        while (i < j && j < numbers.length) {
            if (sum == target) {
                break;
            }
            if (sum < target) {
                j++;
                sum += numbers[j];
                continue;
            }
            i++;
            sum -= numbers[i];
        }
        return new int[] {i + 1, j + 1};
    }
}
