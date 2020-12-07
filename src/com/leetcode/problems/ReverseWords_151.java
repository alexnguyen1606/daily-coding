package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:07 PM ,December 04,2020
 */
public class ReverseWords_151 {
  public String reverseWords(String s) {
    s = cleanSpace(s);
    String[] arrayString = s.split(" ");
    reverse(arrayString, 0, arrayString.length - 1);
    return String.join(" ", arrayString);
  }

  public void reverse(String[] arrayString, int i, int j) {
    while (i < j) {
      String temp = arrayString[i];
      arrayString[i] = arrayString[j];
      arrayString[j] = temp;
      i++;
      j--;
    }
  }

  private String cleanSpace(String source) {
    source = source.trim();
    char[] array = source.toCharArray();
    boolean checkSecond = true;
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : array) {
      if (c == ' ') {
        if (checkSecond) {
          stringBuilder.append(c);
          checkSecond = false;
        }
      } else {
        checkSecond = true;
        stringBuilder.append(c);
      }
    }
    return stringBuilder.toString();
  }
}
