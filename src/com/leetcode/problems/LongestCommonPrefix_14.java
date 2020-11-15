package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 10,2020
 */
public class LongestCommonPrefix_14 {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    StringBuilder result = new StringBuilder();
    int min = 200;
    for (String str : strs) {
      if (str.length() < min) {
        min = str.length();
      }
    }
    if (min == 0) {
      return "";
    }
    int j = 0;
    while (j < min) {
      char first = strs[0].charAt(j);
      for (int i = 0; i < strs.length; i++) {
        if (first != strs[i].charAt(j)) {
          return result.toString();
        }
      }
      result.append(first);
      j++;
    }

    return result.toString();
  }
}
