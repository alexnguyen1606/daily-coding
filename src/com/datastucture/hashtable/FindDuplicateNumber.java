package com.datastucture.hashtable;
//https://leetcode.com/problems/find-the-duplicate-number
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int[] map = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 1) {
                return i;
            }
        }
        return -1;
    }

}
