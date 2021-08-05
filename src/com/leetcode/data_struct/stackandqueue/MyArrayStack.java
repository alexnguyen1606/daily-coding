package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:06 PM ,August 05,2021
 */
public class MyArrayStack implements IStackAndQueue {

	private int[] array;
	private int SIZE;
	private int topIndex;

	public MyArrayStack(int SIZE) {
		this.SIZE = SIZE;
		array = new int[SIZE];
		topIndex = -1;
	}

	@Override
	public boolean isFull() {
		return topIndex == SIZE - 1;
	}

	@Override
	public boolean isEmpty() {
		return topIndex < 0;
	}

	@Override
	public boolean push(int value) {
		if (!isFull()){
			topIndex++;
			array[topIndex] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() throws Exception {
		if (isEmpty()){
			throw new Exception("Không có phần tủ nào");
		}
		return array[--topIndex];
	}

	@Override
	public void show() {
		for (int i = topIndex;i>0;i--){
			System.out.println(array[i]);
		}
	}
}
