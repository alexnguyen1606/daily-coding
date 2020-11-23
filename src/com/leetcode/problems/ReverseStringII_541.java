package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:08 PM ,November 15,2020
 */
public class ReverseStringII_541 {
  public String reverseStr(String s, int k) {
    char[] array = s.toCharArray();
    int n = array.length;
    if (n < k) {
      reverse(array, 0, n - 1);
      return new String(array);
    }
    int total = n / k;
    for (int i = 1; i <= total; i++) {
      if (i % 2 != 0) {
        reverse(array, (i - 1) * k, i * k - 1);
      }
    }
    if (total % 2 == 0) {
      if ((total * k) < n) {
        reverse(array, total * k, n - 1);
      }
    }

    return new String(array);
  }

  private String reverse(String s, int start, int end) {
    char[] array = s.toCharArray();
    while (start < end) {
      char temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
    return new String(array);
  }

  private void reverse(char[] array, int start, int end) {
    while (start < end) {
      char temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    String test =
        "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
    ReverseStringII_541 reverseStringII = new ReverseStringII_541();
    System.out.println(test);
    System.out.println(reverseStringII.reverseStr(test, 34));
  }
}
