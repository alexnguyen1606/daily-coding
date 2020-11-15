package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 06,2020
 */
public class CombinationSum_39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int candidate : candidates) {
      if (candidate % target == 0) {
        int count = candidate / target;
        List<Integer> list = multi(count, candidate);
        result.add(list);
      }
    }
    return result;
  }

  private List<Integer> multi(int count, int target) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= count; i++) {
      list.add(target);
    }
    return list;
  }
}
