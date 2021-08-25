package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:03 AM ,August 13,2021
 */
public class RemoveDuplicateFromSortedArray_26  {

	// return number element unique
	// Sử dụng kỹ thuật 2 con trỏ
	public int removeDuplicates(int[] nums) {
		if (nums.length <= 1) {
			return nums.length;
		}
		int k = 0;
		for (int i = 1;i<nums.length;i++){
			if (nums[i] != nums[k]){
				nums[k+1]=nums[i];
				k++;
			}
		}
		return k+1;
	}



}
