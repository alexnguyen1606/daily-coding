package com.leetcode.arrays;

import com.leetcode.data_struct.stackandqueue.MaxQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://leetcode.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == k && k == 1) {
            return nums;
        }
        MaxQueue maxStack = new MaxQueue();
        Queue<Integer> queueResult = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (i >= k - 1) {
                maxStack.push(val);
                queueResult.add(maxStack.getMax());
                maxStack.pop();
            }  else {
                maxStack.push(val);
            }
        }
        int[] result = new int[queueResult.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = queueResult.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7,2,4};
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] result = slidingWindowMaximum.maxSlidingWindow(array, 2);
        System.out.println(result);
    }

}
