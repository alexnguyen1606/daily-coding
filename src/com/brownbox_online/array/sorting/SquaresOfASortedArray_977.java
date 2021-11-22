package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:37 PM ,November 21,2021
 */
public class SquaresOfASortedArray_977 {
	
	public int[] sortedSquares(int[] nums) {
		final int n = nums.length;
		int[] result = new int[n];
		int value;
		for (int num : nums) {
			value = num * num;
			int position = findPosition(result, value);
			reSort(result, position);
			result[position] = value;
		}
		return result;
	}
	
	private int findPosition(final int[] nums, int value) {
		int n = nums.length - 1;
		for (int i = n; i > 0; i--) {
			if (nums[i] > value && value >= nums[i - 1]) {
				return i - 1;
			}
		}
		return n;
	}
	
	public void reSort(final int[] nums, int index) {
		for (int i = 0; i < index; i++) {
			nums[i] = nums[i + 1];
		}
	}
}
