package com.dsa_in_90_days.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {


    // 100,4,200,1,3,2
    public static int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        Map<Integer, Integer> lengthStore = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++) {
             map.add(nums[i]);
        }
        int longestConsecutive = 0;
        for (int i = 0 ; i < nums.length; i++) {
            int value = nums[i];
            if (lengthStore.containsKey(value)) {
                longestConsecutive = Math.max(longestConsecutive, lengthStore.get(value));
                continue;
            }
            int temp = 1;
            map.add(value);
            while (map.contains(value - 1)) {
                map.add(value - 1);
                lengthStore.put(value - 1, temp);
                temp++;
                value = value - 1;
            }
            longestConsecutive = Math.max(longestConsecutive, temp);
            lengthStore.put(nums[i], temp);
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(array));
    }
}
