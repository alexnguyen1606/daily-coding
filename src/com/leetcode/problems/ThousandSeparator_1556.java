package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:17 AM ,December 14,2020
 */
public class ThousandSeparator_1556 {
  public String thousandSeparator(int n) {
    if (n == 0) {
      return "0";
    }
    int count = 0;
    StringBuilder stringBuilder = new StringBuilder();
    while (n > 0) {
      stringBuilder.append(n % 10);
      n = n / 10;
      count++;
      if (n > 0 && count == 3) {
        stringBuilder.append(".");
        count = 0;
      }
    }
    return stringBuilder.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(2 % 3);
  }
}
