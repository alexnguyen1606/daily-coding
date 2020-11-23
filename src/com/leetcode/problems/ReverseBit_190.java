package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>1:51 PM ,November 16,2020
 */
public class ReverseBit_190 {
  public static int reverseBits(int n) {
    System.out.println(Integer.toBinaryString(n));
    char[] array = Integer.toBinaryString(n).toCharArray();
//    Integer[] arrayInt = new Integer[array.length];
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 48) {
//        arrayInt[i] = 0;
        result += 0 * Math.pow(2, i);
      } else if (array[i] == 49){
//        arrayInt[i] = 1;
        result += 1 * Math.pow(2, i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
//    reverseBits(    );
    System.out.println(Integer.MAX_VALUE);
  }
}
