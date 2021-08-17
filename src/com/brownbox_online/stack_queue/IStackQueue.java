package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:43 PM ,August 17,2021
 */
public interface IStackQueue {
    
    int pop();
    boolean push(int value);
    boolean isFull();
    boolean isEmpty();
    int size();
    void print();
    
}
