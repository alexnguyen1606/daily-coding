package com.dsa_in_90_days.twopointers;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/4sum
public class _4Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> rs = new ArrayList<>();
        Set<String> cache = new HashSet<>();
        for (int i = 0 ; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                long sumIJ = nums[i] + nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long fourSum = sumIJ + nums[left] + nums[right];
                    if (fourSum == target) {
                        List<Integer> item = List.of(nums[i], nums[j], nums[left], nums[right]);
                        var key = normalize(item);
                        if (!cache.contains(key)) {
                            rs.add(item);
                            cache.add(key);
                        }
                        left++;
                    }
                    if (fourSum > target) {
                        right--;
                    }
                    if (fourSum < target) {
                        left++;
                    }
                }
            }
        }
        return rs;
    }

    private static String normalize(List<Integer> strings) {
        return strings.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(":"));
    }

    public static void main(String[] args) {
        int[] array = new int[]{1000000000,1000000000,1000000000,1000000000};
        System.out.println(Integer.MIN_VALUE);
        List<List<Integer>> rs = fourSum(array, -294_967_296);
        System.out.println(rs);
    }
}
