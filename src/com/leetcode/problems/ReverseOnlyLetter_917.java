package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:31 PM ,December 04,2020
 */
public class ReverseOnlyLetter_917 {
  public String reverseOnlyLetters(String source) {
    int i = 0;
    int j = source.length() - 1;
    char[] array = source.toCharArray();
    while (i < j) {
      boolean check1 = (array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122);
      boolean check2 = (array[j] >= 65 && array[j] <= 90) || (array[j] >= 97 && array[j] <= 122);
      if (check1 && check2) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
      if (check1 && check2) {
        i++;
        j--;
      } else if (check1) {
        j--;
      } else {
        i++;
      }
    }
    return new String(array);
  }
}
