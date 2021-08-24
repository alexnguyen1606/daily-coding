package com.brownbox_online.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:44 PM ,August 23,2021
 */
public class SingleNumber_136 {
  public int singleNumber(int[] nums) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.get(nums[i]).add(i);
      } else {
        List<Integer> count = new ArrayList<>();
        count.add(i);
        map.put(nums[i], count);
      }
    }
    for (Map.Entry<Integer, List<Integer>> pairs : map.entrySet()) {
      if (pairs.getValue().size() == 1) {
        return pairs.getKey();
      }
    }
    return -1;
  }
	
	public int singleNumberWithBit(int[] nums) {
  	    int result = 0;
  	    for (int value : nums){
  	    	result ^=value;
        }
  	    return result;
	}
}
