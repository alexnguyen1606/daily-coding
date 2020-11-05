package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 10,2020
 */
public class ReplaceElementGreatest {
  public static void main(String[] args) {
    //
  }

  public int[] replaceElements(int[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      if (i != arr.length - 1) {
        arr[i] = arr[i] >= arr[i + 1] ? arr[i] : arr[i + 1];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        arr[i] = -1;
      } else {
        arr[i] = arr[i + 1];
      }
    }
    return arr;
  }
}
