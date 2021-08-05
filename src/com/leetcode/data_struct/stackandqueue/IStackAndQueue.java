package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:05 PM ,August 05,2021
 */
public interface IStackAndQueue {

	boolean isFull();
	boolean isEmpty();
	boolean push(int value);
	int pop() throws Exception;
	void show();

}
