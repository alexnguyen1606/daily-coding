package com.brownbox_online.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:23 AM ,August 26,2021
 */
public class FindAllNumbersDisappearedInArray_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> numbersDisappeared = new ArrayList<>();
		int[] hash = new int[nums.length+1];
		for (int num : nums) {
			hash[num] = 1;
		}
		for (int i = 1;i<hash.length;i++){
			if (hash[i]==0){
				numbersDisappeared.add(i);
			}
		}
		return numbersDisappeared;
	}
}
