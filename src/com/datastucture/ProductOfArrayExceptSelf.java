package com.datastucture;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = nums[i] * prefix[i - 1];
            }
        }
        int[] postfix = new int[nums.length];
        int n = nums.length - 1;
        for (int i = n; i >= 0; i--) {
            if (i == n) {
                postfix[i] = nums[i];
                continue;
            }
            postfix[i] = nums[i] * postfix[i + 1];
        }
        int[] answers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prefixI = i == 0 ? 1 : prefix[i - 1];
            int postfixI = i == n ? 1 : postfix[i + 1];
            answers[i] = prefixI * postfixI;
        }
        return answers;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int[] rs = productExceptSelf(array);
    }

}
