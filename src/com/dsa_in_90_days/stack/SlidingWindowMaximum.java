package com.dsa_in_90_days.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] rs = new int[nums.length - k + 1];
        MaxStack maxStack = new MaxStack();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (i < k - 1) {
                maxStack.push(value);
            } else {
                maxStack.push(value);
                int maxValue = maxStack.getMax();
                maxStack.pop();
                rs[j] = maxValue;
                j++;
            }
        }
        return rs;
    }


    public static class MaxStack {
        private Deque<Integer> maxStack;
        private Queue<Integer> queue;

        public MaxStack() {
            this.maxStack = new LinkedList<>();
            this.queue = new LinkedList<>();
        }

        public void push(Integer value) {
            while (!maxStack.isEmpty() && maxStack.getFirst() < value) {
                maxStack.removeFirst();
            }
            maxStack.push(value);
            queue.add(value);
        }

        public Integer getMax() {
            return maxStack.getLast();
        }

        public void pop() {
            int value = queue.poll();
            if (!maxStack.isEmpty() && maxStack.getLast() == value) {
                maxStack.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{-7,-8,7,5,7,1,6,0};
        System.out.println(maxSlidingWindow(array, 4));
    }

}
