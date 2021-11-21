package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:54 PM ,August 25,2021
 */
public class MissingNumber_268 {
	
	public int missingNumber(int[] nums) {
		nums = mergeSort(nums,0,nums.length-1);
		int missing = 0;
		// Check missing n
		if (nums[nums.length-1]!=nums.length){
			return nums.length;
		}
		for (int i = 0;i<nums.length-1;i++){
			if (nums[i+1] - nums[i] > 1){
				missing = nums[i]+1;
				break;
			}
		}
		return missing;
	}
	
	private int[] mergeSort(int[] nums,int L,int R){
		if (L==R){
			return new int[]{nums[L]};
		}
		int middle = (L+R)/2;
		int[] left = mergeSort(nums,L,middle);
		int[] right = mergeSort(nums,middle+1,R);
		int[] merged = new int[left.length+right.length];
		int i,j,k;
		i=j=k=0;
		while (k<merged.length){
			if (i<left.length&&j<right.length){
				if (left[i]<right[j]){
					merged[k] = left[i];
					i++;
				}else {
					merged[k] = right[j];
					j++;
				}
			}else if (i<left.length){
				merged[k] = left[i];
				i++;
			}else {
				merged[k] = right[j];
				j++;
			}
			k++;
		}
		return merged;
	}
}
