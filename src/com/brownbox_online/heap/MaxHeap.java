package com.brownbox_online.heap;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:58 PM ,August 30,2021
 */
public class MaxHeap {
	private final int MAX_SIZE;
	private final int[] array;
	private int size;
	
	public MaxHeap(int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
		this.array = new int[MAX_SIZE+1];
	}
}
