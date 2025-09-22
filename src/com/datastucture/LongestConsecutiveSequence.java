package com.datastucture;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int value : set) {
            if (!set.contains(value - 1)) {
                int currentNum = value;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(count, longest);
            }

        }

        return longest;

    }

    public static void main(String[] args) {
        int[] array = new int[] {100,4,200,1,3,2};
        int len = longestConsecutive(array);
        System.out.println(len);

    }

}
