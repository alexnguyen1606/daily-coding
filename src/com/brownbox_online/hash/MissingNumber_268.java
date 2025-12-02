package com.brownbox_online.hash;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:06 AM ,August 26,2021
 */
public class MissingNumber_268 {
	
	public int missingNumber(int[] nums) {
		int[] hash = new int[nums.length+1];
		for (int num : nums) {
			hash[num] = 1;
		}
		int missingNumber = 0;
		for (int i =0;i<hash.length;i++){
			if (hash[i]!=1){
				missingNumber = i;
				break;
			}
		}
		return missingNumber;
	}

}
