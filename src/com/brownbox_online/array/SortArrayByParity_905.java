package com.brownbox_online.array;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:17 PM ,August 18,2021
 */
public class SortArrayByParity_905 {
//	Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

//	Return any array that satisfies this condition.
	public int[] sortArrayByParity(int[] nums) {
		int[] result = new int[nums.length];
		int i = 0;
		int j = 0;
		while (j<nums.length){
			if (nums[j]%2==0){
				result[i] = nums[j];
				i++;
			}
			j++;
		}
		j = 0;
		while (j<nums.length){
			if (nums[j]%2!=0){
				result[i] = nums[j];
				i++;
			}
			j++;
		}
		
		return result;
	}
	
	public static int[] sortArrayByParityTwoPointer(int[] nums){
		int j = 0;
		for (int i = 0;i<nums.length;i++){
			if (nums[i]%2==0){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		return nums;
	}

  public static void main(String[] args) {
	  int[] array = {19,2,3,2,4,5,0};
	  System.out.println(Arrays.toString(array));
	  sortArrayByParityTwoPointer(array);
    System.out.println(Arrays.toString(array));
  }
}
