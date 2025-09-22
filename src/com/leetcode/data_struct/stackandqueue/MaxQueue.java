package com.leetcode.data_struct.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {

    private Queue<Integer> queue;
    private Deque<Integer> maxQueue;

    public MaxQueue() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public void push(int val) {
        queue.add(val);
        addToMaxQueue(val);
    }

    public void pop() {
        int value = queue.poll();
        removeFromMaxQueueIfNeed(value);
    }

    //Add vào tail, nếu các phần tử ở tail lớn hơn thì loại bỏ khỏi maxQueue
    private void addToMaxQueue(int value) {
        while(!maxQueue.isEmpty() && maxQueue.getLast() < value) {
            maxQueue.removeLast();
        }
        maxQueue.add(value);
    }

    private void removeFromMaxQueueIfNeed(int value) {
        if (!maxQueue.isEmpty() && maxQueue.getFirst() == value) {
            maxQueue.removeFirst();
        }
    }

    public int top() {
        return queue.peek();
    }

    public int getMax() {
        return maxQueue.peek();
    }



}
