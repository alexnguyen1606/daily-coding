package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 07,2020
 */
public class PalindromeNumber_9 {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    if (x == 0) {
      return true;
    }
    String s = String.valueOf(x);
    char[] array = s.toCharArray();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      if (array[i] != array[n - i - 1]) {
        return false;
      }
    }
    return true;
  }
}
