package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:15 AM ,August 26,2021
 */
public class SortArrayByParity_905 {
	
	public static int[] sortArrayByParity(int[] nums){
		int j = 0;
		for (int i = 0;i<nums.length;i++){
			if (nums[i]%2==0){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		return nums;
	}
}
