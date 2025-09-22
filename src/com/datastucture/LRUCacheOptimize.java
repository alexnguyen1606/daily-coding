package com.datastucture;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LRUCacheOptimize implements ILRUCache {

    private final Integer capacity;
    private final Map<Integer, Integer> cache;
    private final PriorityQueue<Integer> priorityQueue;

    public LRUCacheOptimize(Integer capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        priorityQueue = new PriorityQueue<>(capacity);
    }

    @Override
    public int get(Integer key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        int value = cache.get(key);
        priorityQueue.remove(key);
        priorityQueue.add(key);
        return value;
    }

    @Override
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            priorityQueue.remove(key);
            priorityQueue.add(key);
            cache.put(key, value);
            return;
        }
        if (cache.size() == capacity) {
            int keyRemove = priorityQueue.remove();
            cache.remove(keyRemove);
        }
        priorityQueue.add(key);
        cache.put(key, value);
    }

    public static void main(String[] args) {
        System.out.println( 3 << 1);
    }
}
