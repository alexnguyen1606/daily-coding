package com.leetcode.data_struct.stackandqueue;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:17 PM ,August 05,2021
 */
public class MyArrayQueue implements IStackAndQueue {

	private final int[] array;
	private final int SIZE;
	private int lastIndex;

	public MyArrayQueue(int SIZE) {
		this.SIZE = SIZE;
		array= new int[SIZE];
		lastIndex = -1;
	}

	@Override
	public boolean isFull() {
		return lastIndex==SIZE-1;
	}

	@Override
	public boolean isEmpty() {
		return lastIndex<0;
	}

	@Override
	public boolean push(int value) {
		if(!isFull()){
			lastIndex++;
			array[lastIndex] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() throws Exception {
		if (isEmpty()){
			throw new Exception("Không có phần tử");
		}
		int value = array[0];
		if (lastIndex >= 0) System.arraycopy(array, 1, array, 0, lastIndex);
		lastIndex--;
		return value;
	}

	@Override
	public void show() {
		for (int i = 0;i<=lastIndex;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		MyArrayQueue queue = new MyArrayQueue(5);
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.show();
		System.out.println("Pop:"+queue.pop());
		queue.show();


	}
}
