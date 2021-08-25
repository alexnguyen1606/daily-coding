package com.brownbox_online.bit_manipulation;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:14 AM ,August 26,2021
 */
public class SingleNumber_136 {
	
	public int singleNumberWithBit(int[] nums) {
		int result = 0;
		for (int value : nums){
			result ^=value;
		}
		return result;
	}
	
}
