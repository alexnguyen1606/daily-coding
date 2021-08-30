package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 6:08 PM ,August 27,2021
 */
public class RemoveDuplicatesFromSortedArray_26 {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 1;i<nums.length;i++){
			if (nums[count] != nums[i]){
				count++;
				nums[count] = nums[i];
			}
		}
		return count;
	}
}
