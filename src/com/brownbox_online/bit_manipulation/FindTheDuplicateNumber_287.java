package com.brownbox_online.bit_manipulation;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:30 AM ,September 11,2021
 */
public class FindTheDuplicateNumber_287 {

	public int findDuplicate(int[] nums) {
		int[] map = new int[nums.length + 1];
		System.arraycopy(nums, 0, map, 1, map.length - 1);
		for (int i = 1; i < map[i] ;i++){
			if (i == map[i]){
				return i;
			}
		}
		return -1;
	}
}
