package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 10,2020
 */
public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int[] a = {1, 1, 2};
    System.out.println(removeDuplicates(a));
  }

  public static int removeDuplicates(int[] nums) {
    int currentIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[currentIndex]) {
        ++currentIndex;
        nums[currentIndex] = nums[i];
      }
    }
    // Cộng 1 bỏi vì chiều dài bắt đầu từ 1 còn index bắt đầu từ 0
    // bài toán cần chiều giài
    return currentIndex + 1;
  }
}
