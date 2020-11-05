package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 02,2020
 */
public class PlusOne_66 {
  public int[] plusOne(int[] digits) {
    int length = digits.length;
    digits[length - 1] = digits[length - 1] + 1;
    for (int i = length - 1; i >= 0; i--) {
      if (digits[i] >= 10) {
        if (i-1<0){
          digits = copyArray(digits);
          i++;
        }
        digits[i - 1] = digits[i - 1] + digits[i] / 10;
        digits[i] = digits[i] % 10;
      }
    }
    return digits;
  }
  public int[] copyArray(int[] array){
     int[] newArray = new int[array.length+1];
     newArray[0] = 0;
     for (int i =0;i<array.length;i++){
        newArray[i+1] = array[i];
     }
     return newArray;
  }
  public static void main(String[] args) {
    PlusOne_66 plusOne_66 = new PlusOne_66();
    int[] arrays = {900009,9,90000000,1000000000};
    arrays = plusOne_66.plusOne(arrays);
    for (int i = 0; i < arrays.length; i++) {
      System.out.print(arrays[i]);
    }
  }
}
