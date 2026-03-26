package com.dsa_in_90_days.twopointers;

//https://leetcode.com/problems/container-with-most-water
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = calculateArea(height, left, right);
            maxArea = Math.max(maxArea, area);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

    private int calculateArea(int[] height, int i, int j) {
        var minHeight = Math.min(height[i], height[j]);
        return Math.abs(j - i) * minHeight;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,8,6,2,5,4,8,3,7};
        int area = new ContainerWithMostWater().maxArea(array);
        System.out.println(area);
    }

}
