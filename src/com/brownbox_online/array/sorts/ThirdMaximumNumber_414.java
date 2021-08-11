package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:33 PM ,August 09,2021
 */
public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        for (int i = 0;i< n ;i++){
            for (int j = 0;j<n-1;j++){
                if (nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums.length>=3 ? nums[2] : nums[0];
    }
}
