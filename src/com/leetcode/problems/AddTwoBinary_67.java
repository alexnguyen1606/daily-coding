package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:21 PM ,November 23,2020
 */
public class AddTwoBinary_67 {
  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int temp = 0;
    while (i >= 0 || j >= 0) {
      int num1 = i >= 0 ? a.charAt(i) - '0' : 0;
      int num2 = j >= 0 ? b.charAt(j) - '0' : 0;
      int value = num1 + num2 + temp;
      result.append(value % 2);
      temp = value/2;
      i--;
      j--;
    }
    if (temp!=0){
        result.append(temp);
    }
    return result.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(1 % 2);
  }
}
