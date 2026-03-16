package com.dsa_in_90_days.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class _3Sum {

    // x + y + z = 0;
    // x = -y -z
    // z = -y - x;
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int x = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + x;
                if (sum == 0) {
                    List<Integer> item = List.of(x, nums[left], nums[right]);
                    left++;
                    rs.add(item);
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
                if (sum > 0) {
                    right--;
                }
                if (sum < 0) {
                    left++;
                }

            }

        }
        return rs;
    }


    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        if (nums.length < 3) {
            return null;
        }
        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sumIJ = nums[i] + nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if ((sumIJ + nums[k]) == 0) {
                        rs.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> rs = new _3Sum().threeSum(array);

        System.out.println(rs);
    }
}
