package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 07,2020
 */
public class ReverseInteger_7 {
  public int reverse(int x) {
    if (x == Integer.MIN_VALUE) {
      return 0;
    }
    String a = String.valueOf(x);
    if (a.length() == 1) {
      return x;
    }
    char[] arrayChar = a.toCharArray();
    StringBuilder stringBuilder = new StringBuilder("");
    boolean checkBreak = true;
    if (arrayChar[0] == '-') {
      stringBuilder.append(arrayChar[0]);
      for (int i = arrayChar.length - 1; i > 0; i--) {
        if (checkBreak) {
          if (arrayChar[i] != '0') {
            stringBuilder.append(arrayChar[i]);
            checkBreak = false;
          }
        } else {
          stringBuilder.append(arrayChar[i]);
        }
      }
    } else {
      for (int i = arrayChar.length - 1; i >= 0; i--) {
        if (checkBreak) {
          if (arrayChar[i] != '0') {
            stringBuilder.append(arrayChar[i]);
            checkBreak = false;
          }
        } else {
          stringBuilder.append(arrayChar[i]);
        }
      }
    }
   
    int value = 0;
    try {
      value = Integer.parseInt(stringBuilder.toString());
    } catch (Exception e) {
      return 0;
    }
    return value;
  }

  public static void main(String[] args) {
    ReverseInteger_7 reverseInteger = new ReverseInteger_7();
    System.out.println(reverseInteger.reverse(-000));
  }
}
