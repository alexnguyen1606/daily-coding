package com.brownbox_online.array.two_dimensions;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:48 PM ,August 07,2021
 */
public class RichestCustomerWealth_1672 {
  public int maximumWealth(int[][] accounts) {
    int max = 0;
    int sum = 0;
      for (int[] account : accounts) {
          for (int i : account) {
              sum += i;
          }
          if (sum >= max) {
              max = sum;
          }
          sum=0;
      }
    return max;
  }

  public static void main(String[] args) {
      for (int i = 0;i<200;i++){
      System.out.println(i +" ="+ (char)i);
      }
  }
}
