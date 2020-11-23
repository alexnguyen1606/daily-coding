package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:49 AM ,November 23,2020
 */
public class AddStrings {
  public String addStrings(String num1, String num2) {
    int[] array1 = toArrayInt(num1.toCharArray());
    int[] array2 = toArrayInt(num2.toCharArray());
    if (array1.length >= array2.length) {
      return add(array1, array2);
    } else {
      return add(array2, array1);
    }
  }

  public String addStrings2(String num1, String num2) {
    StringBuilder stringBuilder = new StringBuilder("");
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int temp = 0;
    while (i >= 0 || j >= 0) {
      int number1 = i >= 0 ? num1.charAt(i) - '0' : 0;
      int number2 = j >= 0 ? num2.charAt(j) - '0' : 0;

      int value = number1 + number2 + temp;
      stringBuilder.append(value % 10);
      temp = value / 10;
      i--;
      j--;
    }
    if (temp > 0) {
      stringBuilder.append(temp);
    }
    return stringBuilder.reverse().toString();
  }

  public String add(int[] array1, int[] array2) {
    int i = array1.length - 1;
    int j = array2.length - 1;
    while (i >= 0) {
      if (j >= 0) {
        array1[i] += array2[j];
      }
      if (array1[i] > 9) {
        array1[i] %= 10;
        if (i == 0) {
          i++;
          array1 = copyArray(array1);
        }
        array1[i - 1] += 1;
      }
      i--;
      j--;
    }
    StringBuilder result = new StringBuilder();
    for (int item : array1) {
      result.append(item);
    }
    return result.toString();
  }

  private int[] copyArray(int[] array) {
    int[] newArray = new int[array.length + 1];
    newArray[0] = 0;
    System.arraycopy(array, 0, newArray, 1, array.length);
    return newArray;
  }

  private int[] toArrayInt(char[] chars) {
    int[] integers = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
      integers[i] = Integer.parseInt(String.valueOf(chars[i]));
    }
    return integers;
  }

  public static void main(String[] args) {
    AddStrings addStrings = new AddStrings();
    System.out.println(addStrings.addStrings("9", "99"));
  }
}
