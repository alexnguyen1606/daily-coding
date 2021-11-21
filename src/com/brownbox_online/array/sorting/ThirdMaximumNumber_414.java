package com.brownbox_online.array.sorting;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:09 PM ,August 18,2021
 */
public class ThirdMaximumNumber_414 {
	public int thirdMax(int[] nums) {
		int n = nums.length;
		long[] maxArray = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
		for (Integer value : nums){
			insertElement(maxArray,value);
		}
    System.out.println(Arrays.toString(maxArray));
		if (maxArray[2]== Long.MIN_VALUE){
			return (int) maxArray[0];
		}
		return (int) maxArray[2];
	}
	
	private void insertElement(long[] nums, Integer value) {
		int i = 0;
		while (i<nums.length){
			if (nums[i] == value ){
				return;
			}else if (value > nums[i]){
				break;
			}else {
				i++;
			}
		}
		if (i<nums.length){
			for (int j = nums.length-2;j>=i;j--){
				nums[j+1] = nums[j];
			}
			nums[i] = value;
		}
	}

  public static void main(String[] args) {
	  ThirdMaximumNumber_414 thirdMaximumNumber_414 = new ThirdMaximumNumber_414();
	  int[] array = {3,2,1};
    System.out.println(thirdMaximumNumber_414.thirdMax(array));
  }
}
