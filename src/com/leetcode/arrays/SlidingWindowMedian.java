package com.leetcode.arrays;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/sliding-window-median/description/
public class SlidingWindowMedian {

    public double[] medianSlidingWindow(int[] nums, int k) {
        boolean isEven = (k & 1) == 0;
        Queue<Double> result = new LinkedList<>();
        int start = 0;
        int end = k - 1;
        while (end < nums.length) {
            if (isEven) {
                int index = (start + end) / 2;
                double value = (double) (nums[index] + nums[index + 1]) /2;
                result.add(value);
            } else {
                int index = (start + end) / 2;
                int value = nums[index];
                result.add((double) value);
            }
            start++;
            end++;
        }


        double[] results = new double[result.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = result.poll();
        }
        return results;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,3,-1,-3,5,3,6,7};
        SlidingWindowMedian median = new SlidingWindowMedian();
        double[] rs = median.medianSlidingWindow(array, 3);
        System.out.println(rs);
    }

}
