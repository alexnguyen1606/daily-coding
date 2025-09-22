package com.datastucture;

public interface ILRUCache {

    int get(Integer key);

    void put(int key, int value);
}
