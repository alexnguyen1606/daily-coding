package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:27 AM ,November 14,2020
 */
public class ReverseWordString_557 {
  public String reverseWords(String s) {
    String[] arrayString = s.trim().split(" ");
    List<String> listString = new ArrayList<>(arrayString.length);
    for (int i = 0; i < arrayString.length; i++) {
      String current = arrayString[i];
      char[] array = current.toCharArray();
      int n = array.length;
      int middle = n / 2;
      for (int j = 0; j < middle; j++) {
        char temp = array[j];
        array[j] = array[n - j - 1];
        array[n - j - 1] = temp;
      }
      StringBuilder result = new StringBuilder();
      for (int j = 0; j < n; j++) {
        result.append(array[j]);
      }
      listString.add(result.toString());
    }

    return String.join(" ", listString);
  }

  public String reverseWordsInString(String s) {
    char[] arrayChar = s.toCharArray();
    int i = 0;
    int n = arrayChar.length;
    int start = 0;
    while (i < n) {
      if (arrayChar[i] == ' ') {
        reverse(arrayChar, start, i);
        start = i + 1;
      }
      if (i == n - 1) {
        reverse(arrayChar, start, n);
      }
      i++;
    }
    return new String(arrayChar);
  }

  private void reverse(char[] arrayChar, int start, int end) {
    while (start < end) {
      char temp = arrayChar[start];
      arrayChar[start] = arrayChar[end - 1];
      arrayChar[end - 1] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    ReverseWordString_557 reverseWordString = new ReverseWordString_557();
    System.out.println(reverseWordString.reverseWordsInString("Let's take LeetCode contest"));
  }
}
