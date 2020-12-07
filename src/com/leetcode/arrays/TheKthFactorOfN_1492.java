package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:55 AM ,December 05,2020
 */
public class TheKthFactorOfN_1492 {
  public int kthFactor(int n, int k) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % (i + 1) == 0) {
        count++;
        if (count == k) {
          return i;
        }
      }
    }
    return -1;
  }
}
