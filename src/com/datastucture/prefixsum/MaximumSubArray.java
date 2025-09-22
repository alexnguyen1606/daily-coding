package com.datastucture.prefixsum;


public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int max = nums[0];
        prefixSum[0] = max;
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = Math.max(nums[i], nums[i] + prefixSum[i - 1]);
            max = Math.max(prefixSum[i], max);
        }
        return max;
    }




    public static void main(String[] args) {
        int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.println(maximumSubArray.maxSubArray(array));
    }

}
