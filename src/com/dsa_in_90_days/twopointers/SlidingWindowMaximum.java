package com.dsa_in_90_days.twopointers;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] rs = new int[nums.length - k + 1];
        int left = 0;
        int right = 0;
        int max = nums[left];
        int j = 0;
        while (right < nums.length) {
            if ((right - left) < k - 1) {
                max = Math.max(max, nums[right]);
                right++;
                continue;
            }
            max = Math.max(max, nums[right]);
            rs[j] = max;
            j++;
            if (nums[left] == max) {
                left++;
                right = left;
                if (left < nums.length) {
                    max = nums[left];
                }
                continue;
            }

            right++;
            left++;
        }
        return rs;
    }


    public static void main(String[] args) {
        int[] array = new int[]{-7, -8, 7, 5, 7, 1, 6, 0};
        System.out.println(maxSlidingWindow(array, 4));
    }

}
