package com.brownbox_online.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:09 AM ,October 03,2021
 */
public class ContainsDuplidate_217 {
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> hash = new HashSet<>();
		for (int num : nums){
			if (hash.contains(num)){
				return true;
			}
			hash.add(num);
		}
		return false;
	}
	
}
