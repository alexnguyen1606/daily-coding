package com.brownbox_online.array;/**
 *
 *   @author:Nguyen Anh Tuan
 *
 *  9:28 PM ,November 22,2021
 *
*/
public class MaxConsecutiveOnes_485 {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int maxConsecutive = 0;
		int count = 0;
		for (int val : nums) {
			if (val == 1) {
				count++;
			} else {
				count = 0;
			}
			if (count > maxConsecutive) {
				maxConsecutive = count;
			}
		}
		return maxConsecutive;
	}

}
