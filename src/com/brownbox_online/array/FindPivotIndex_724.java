package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:35 PM ,November 21,2021
 */
public class FindPivotIndex_724 {
	
	public static int pivotIndex(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int rightSum = 0;
		int i;
		int n = nums.length;
		for (i = 1; i < n; i++) {
			rightSum += nums[i];
		}
		i = 0;
		int leftSum = 0;
		while (leftSum != rightSum && i < n - 1) {
			leftSum += nums[i];
			rightSum -= nums[i + 1];
			i++;
		}
		return leftSum == rightSum ? i : -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, -3, 9};
		System.out.println(pivotIndex(nums));
	}
	
}
