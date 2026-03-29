package com.dsa_in_90_days.binarysearch;

public class SearchRotatedSortedArray {


    // Tìm điểm index bị đảo
    // -> 2 nửa sẽ là 2 mảng tăng dần -> dùng binary search trên 2 mảng
    public static int search(int[] nums, int target) {
        int minIndex = minRotatedIndex(nums);
        if (nums[minIndex] == target) {
            return minIndex;
        }
        if (minIndex == 0) {
            return search(nums, 0, nums.length - 1, target);
        }
        int findLeft = search(nums, minIndex + 1, nums.length - 1, target);
        if (findLeft != -1) {
            return findLeft;
        }
        return search(nums, 0, minIndex, target);

    }

    public static int search(int[] matrix, int i, int j, int target) {
        while (i <= j) {
            int valueI = matrix[i];
            if (valueI == target) {
                return i;
            }
            int valueJ = matrix[j];
            if (valueJ == target) {
                return j;
            }
            int mid = (j + i) / 2;
            if (matrix[mid] == target) {
                return mid;
            }
            if (matrix[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static int minRotatedIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3, 1}, 3));
    }

}
