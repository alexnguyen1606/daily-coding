package com.brownbox_online.heap;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:58 PM ,August 30,2021
 */
public interface IHeap {
	default boolean isEmpty(){
		return false;
	}
	
	int peek();
	int poll();
	void add(int val);
	void remove(int val);
	
}
