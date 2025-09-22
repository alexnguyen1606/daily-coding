package com.leetcode.data_struct.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MinQueue {

    private Queue<Integer> queue;
    private Deque<Integer> minQueue;

    MinQueue() {
        queue = new LinkedList<>();
        minQueue = new LinkedList<>();
    }

    public void push(int val) {
        queue.add(val);
        addToMinQueue(val);
    }

    public void pop() {
        int value = queue.poll();
        removeFromMinQueueIfNeed(value);
    }

    //Add vào tail, nếu các phần tử ở tail lớn hơn thì loại bỏ khỏi minQueue
    private void addToMinQueue(int value) {
        while(!minQueue.isEmpty() && minQueue.getLast() > value) {
            minQueue.removeLast();
        }
        minQueue.add(value);
    }

    private void removeFromMinQueueIfNeed(int value) {
        if (!minQueue.isEmpty() && minQueue.getFirst() == value) {
            minQueue.removeFirst();
        }
    }

    public int top() {
        return queue.peek();
    }

    public int getMin() {
        return minQueue.peek();
    }



}
