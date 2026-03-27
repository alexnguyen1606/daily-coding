package com.dsa_in_90_days.twopointers;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int totalTrap = 0;
        int left = 0;
        int right = 0;
        while (right < height.length) {
            int delta = right - left;
            if (delta <= 1) {
                right++;
                continue;
            }
            if (height[right] == 0) {
                right++;
                continue;
            }
            if (height[left] == 0) {
                left++;
                continue;
            }
            int maxTrap = 0;
            int tempRight = right;
            while (tempRight < height.length) {
                int trap = trap(left, tempRight, height);
                if (maxTrap == trap) {
                    break;
                }
                maxTrap = Math.max(trap, maxTrap);

                tempRight++;
            }
            totalTrap += maxTrap;
            if (maxTrap > 0) {
                left = right;
                right = tempRight;
            } else {
                right++;
                left++;
            }

        }
        return totalTrap;
    }

    private static int trap(int i, int j, int[] height) {
        int width = Math.abs(i - j) - 1;
        int maxTrap = Math.min(height[i], height[j]) * width;
        int k = i + 1;
        while (k < j && k < height.length) {
            if (height[k] > height[i] || height[k] > height[j]) {
                maxTrap -= Math.min(height[i], height[j]);
            } else {
                maxTrap -= height[k];
            }
            k++;
        }
        return maxTrap;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,2,1,2,1,5};
        System.out.println(trap(array));
    }

}
