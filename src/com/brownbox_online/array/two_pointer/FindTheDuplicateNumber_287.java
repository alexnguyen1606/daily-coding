package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:09 PM ,September 11,2021
 */
public class FindTheDuplicateNumber_287 {
	// Sử dụng kỹ thuật 2 con trỏ
	// thuật toán Floyed
	public int findDuplicate(int[] nums) {
		int fast = nums[0];
		int slow = nums[0];
		// xác định cycle
		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
			
		}while (fast!=slow);
		fast = nums[0];
		// xác định vị trí bắt đầu
		while (fast!=slow){
			fast = nums[fast];
			slow = nums[slow];
		}
		return fast;
	}
}
