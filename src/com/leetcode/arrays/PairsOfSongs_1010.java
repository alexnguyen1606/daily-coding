package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:17 PM ,December 08,2020
 */
public class PairsOfSongs_1010 {
  public static int numPairsDivisibleBy60(int[] time) {
    int count = 0;
    int i;
    int j;
    for (i = 1; i < time.length; i++) {
      j = 0;
      int k = i - 1;
      while (j <= k) {
        if (j == k) {
          if ((time[i] + time[j]) % 60 == 0) {
            count--;
          }
        }
        if ((time[i] + time[j]) % 60 == 0) {
          count++;
        }
  
        if ((time[i] + time[k]) % 60 == 0) {
          count++;
        }
        j++;
        k--;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] array = new int[] {20, 40};
    System.out.println(numPairsDivisibleBy60(array));
  }
}
