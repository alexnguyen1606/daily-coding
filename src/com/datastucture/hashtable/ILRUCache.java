package com.datastucture.hashtable;

public interface ILRUCache {

    int get(Integer key);

    void put(int key, int value);
}
