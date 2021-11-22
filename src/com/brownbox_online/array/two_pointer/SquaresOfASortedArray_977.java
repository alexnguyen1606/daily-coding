package com.brownbox_online.array.two_pointer;/**
 *
 *   @author:Nguyen Anh Tuan
 *
 *  9:15 PM ,November 22,2021
 *
*/
public class SquaresOfASortedArray_977 {
	public int[] sortedSquares(int[] nums) {
		final int n = nums.length;
		int[] result = new int[n];
		int i = 0, j = n - 1;
		int k = n - 1;
		while (k >= 0) {
			if (Math.abs(nums[i]) > Math.abs(nums[j])) {
				result[k] = (int) Math.pow(nums[i], 2);
				i++;
			} else {
				result[k] = (int) Math.pow(nums[j], 2);
				j--;
			}
			k--;
		}
		return result;
	}
}
