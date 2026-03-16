package com.dsa_in_90_days.twopointers;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int left = 0;
        int right = left + 1;
        while (left < right && right < nums.length) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            if (rightVal != 0 && leftVal == 0) {
                nums[left] = rightVal;
                nums[right] = 0;
                left++;
                right++;
                continue;
            }
            right++;
            if(leftVal != 0) {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(array);
        System.out.println(array.toString());
    }


}
