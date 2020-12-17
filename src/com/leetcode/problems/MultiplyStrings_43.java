package com.leetcode.problems;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:Nguyen Anh Tuan
 *     <p>6:31 PM ,November 23,2020
 */
public class MultiplyStrings_43 {
  private int temp = 0;

  public String multiply(String num1, String num2) {
    Long value1 = Long.valueOf(num1);
    Long value2 = Long.valueOf(num2);
    if (value1 > value2) {
      String tempString = num1;
      num1 = num2;
      num2 = tempString;
    }
    int length1 = num1.length();
    int length2 = num2.length();
    num1 = reverseString(num1);
    num2 = reverseString(num2);
    String result = "";
    int i = 0;
    while (i < length1) {
      int j = 0;
      int i2 = i;
      int number1 = num1.charAt(i2) - '0';
      while (j < length2) {
        int number2 = num2.charAt(j) - '0';
        int value = number1 * number2 + temp;
        result = addAtIndex(result, i2 + j, value);
        j++;
      }
      temp = 0;
      i++;
    }

    return new StringBuilder(result).reverse().toString();
  }

  public String addAtIndex(final String source, int index, final int value) {
    char[] array = source.toCharArray();
    int lastIndex = source.length() - 1;
    StringBuilder stringBuilder = new StringBuilder();
    boolean check = true;
    for (int i = 0; i <= lastIndex; i++) {
      if (i == index) {
        check = false;
        int numberCurrent = array[i] - '0';
        numberCurrent += value;
        stringBuilder.append(numberCurrent % 10);
        temp = numberCurrent / 10;
      } else {
        stringBuilder.append(array[i]);
      }
    }
    if (check) {
      stringBuilder.append(value % 10);
      temp = value / 10;
    }
    return stringBuilder.toString();
  }

  public String reverseString(String source) {
    char[] array = source.toCharArray();
    int i = 0;
    int j = source.length() - 1;
    while (i < j) {
      char temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      i++;
      j--;
    }
    return new String(array);
  }

  public static void main(String[] args) {
    System.out.println(new Date(7259375009792L));
  }
}
