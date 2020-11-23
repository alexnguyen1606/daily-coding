package com.leetcode.arrays;

import java.util.LinkedList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:02 PM ,November 23,2020
 */
public class AddtoArrayFormofInteger_989 {
  public List<Integer> addToArrayForm(int[] digits, int K) {
    int length = digits.length;
    digits[length - 1] = digits[length - 1] + K;
    List<Integer> linkedList = new LinkedList<>();
    int i = length - 1;
    while (i >= 0) {
      if (digits[i] >= 10) {
        if (i - 1 < 0) {
          digits = copyArray(digits);
          i++;
        }
        digits[i - 1] = digits[i - 1] + digits[i] / 10;
        digits[i] = digits[i] % 10;
      }
      i--;
    }
    for (int item : digits) {
      linkedList.add(item);
    }
    return linkedList;
  }

  private int[] copyArray(int[] array) {
    int[] newArray = new int[array.length + 1];
    newArray[0] = 0;
    System.arraycopy(array, 0, newArray, 1, array.length);
    return newArray;
  }
}
