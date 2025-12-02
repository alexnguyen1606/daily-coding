package com.datastucture.hashtable;


import java.util.HashMap;

import java.util.LinkedList;
import java.util.Map;

public class LRUCache implements ILRUCache {

    private final int capacity;
    private final Map<Integer, Integer> map;
    private final LinkedList<Integer> priorties;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
        priorties = new LinkedList<>();
    }

    public int get(Integer key) {
        if (map.containsKey(key)) {
            moveToFirst(key);
        }
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            moveToFirst(key);
            return;
        }
        if (map.size() == capacity) {
            map.remove(priorties.removeLast());
        }
        priorties.addFirst(key);
        map.put(key, value);
    }

    private void moveToFirst(Integer key) {
        priorties.remove(key);
        priorties.addFirst(key);
    }

}
