package com.datastucture.slidingwindow;

import com.leetcode.data_struct.stackandqueue.MaxQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow2(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int max = getMax(nums, left, right);
        int n = nums.length;
        int[] rs = new int[n - k + 1];
        int i = 0;
        rs[i] = max;
        while (right < n) {
            int oldRightVal = nums[right];
            right++;
            if (right >= n) {
                continue;
            }

            int removeValue = nums[left];
            left++;
            if (removeValue == max) {
                max = getMax(nums, left, right);
            } else {
                max = Math.max(nums[right], max);
            }
            i++;
            rs[i] = max;

        }
        return rs;
    }

    private static int getMax(int[] array, int left, int right) {
        int max = Integer.MIN_VALUE;
        while (left <= right) {
            max = Math.max(array[left], max);
            left++;
        }
        return max;
    }


    // using maxQueue
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == k && k == 1) {
            return nums;
        }
        MaxQueue maxStack = new MaxQueue();
        int[] rs = new int[nums.length - k + 1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (i >= k - 1) {
                maxStack.push(val);
                rs[j] = maxStack.getMax();
                maxStack.pop();
                j++;
            }  else {
                maxStack.push(val);
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, -1};
        System.out.println(Arrays.toString(maxSlidingWindow(array, 1)));
    }

}
