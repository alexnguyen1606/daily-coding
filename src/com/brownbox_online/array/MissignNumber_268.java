package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:39 PM ,August 25,2021
 */
public class MissignNumber_268 {
	// độ phức tạp O(n)
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int total = sum(n);
		for (int num : nums) {
			total -= num;
		}
		return total;
	}
	
	private int sum(int n){
		if (n==0){
			return 0;
		}
		return sum(n-1)+n;
	}
	
	
	
	
}
