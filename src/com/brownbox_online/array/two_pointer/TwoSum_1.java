package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:30 PM ,August 27,2021
 */
public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 1;i<nums.length;i++){
			for (int j = i;j<nums.length;j++){
				int value = nums[j]+nums[j-1];
				if (value==target){
					return new int[]{j,j-1};
				}
			}
		}
		return null;
	}
}
