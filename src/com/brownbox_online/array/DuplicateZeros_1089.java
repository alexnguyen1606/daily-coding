package com.brownbox_online.array;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:41 PM ,August 19,2021
 */
public class DuplicateZeros_1089 {
	public static void duplicateZeros(int[] nums) {
		int i = 0;
		int n = nums.length;
		int k;
		while (i<n-1){
			if (nums[i] == 0){
				k = n-1;
				while (k>=i+2){
					nums[k] = nums[k-1];
					k--;
				}
				nums[i+1] = 0;
				i++;
			}
			i++;


		}
	}

	public static void main(String[] args) {
		int[] array = {0,1,0,1,2,1};
		duplicateZeros(array);
		System.out.println(Arrays.toString(array));
	}

}
