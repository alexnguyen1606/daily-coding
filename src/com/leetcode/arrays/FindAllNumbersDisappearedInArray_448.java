package com.leetcode.arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * The type Find all numbers disappeared in array 448.
 *
 * @author:Nguyen Anh Tuan
 *     <p>November 11,2020
 */
public class FindAllNumbersDisappearedInArray_448 {
  /**
   * Find disappeared numbers list.
   *
   * @param nums the nums
   * @return the list element not exit in nums 1 ≤ a[i] ≤ n (n = size of array)
   */
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new LinkedList<>();
    int n = nums.length;
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[nums[i] - 1] += 1;
    }
    for (int i = 0; i < n; i++) {
       if (array[i]==0){
           result.add(i+1);
       }
    }

    return result;
  }
}
