package com.brownbox_online.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:53 AM ,August 26,2021
 */
public class FindAllNumbersDisappearedInArray_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int indexNext;
		for (int i = 0;i<nums.length;i++){
			indexNext = Math.abs(nums[i])-1;
			if (nums[indexNext]>0){
				nums[indexNext]*=-1;
			}
		}
		List<Integer> numbersDisappeared = new LinkedList<>();
		for (int i = 0;i<nums.length;i++){
			if (nums[i]>0){
				numbersDisappeared.add(i+1);
			}
		}
		return numbersDisappeared;
		
	}
}

