package com.dsa_in_90_days.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i< nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return false;
    }



}
