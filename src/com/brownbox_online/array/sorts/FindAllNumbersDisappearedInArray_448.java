package com.brownbox_online.array.sorts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:33 AM ,August 26,2021
 */
public class FindAllNumbersDisappearedInArray_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> numbersDisappeared = new ArrayList<>();
		nums = mergeSort(nums,0,nums.length-1);
		for (int i = 1;i<=nums.length;i++){
			if (!binarySearch(nums,0,nums.length-1,i)){
				numbersDisappeared.add(i);
			}
		}
		return numbersDisappeared;
	}
	
	private boolean binarySearch(int[] nums,int L,int R,int key){
		if (L>R){
			return false;
		}
		int middle = (L+R)/2;
		if (nums[middle]==key){
			return true;
		}
		if (nums[middle]>key){
			return binarySearch(nums,L,middle-1,key);
		}else {
			return binarySearch(nums,middle+1,R,key);
		}
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
