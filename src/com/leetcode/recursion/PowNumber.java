package com.leetcode.recursion;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 05,2020
 */
public class PowNumber {

  public static double myPow(double number, int n) {
    if (n == 0) {
      return 1.0;
    }
    if (n < 0) {
      n = n * (-1);
      number = 1 / number;
    }
    return number * myPow(number, n - 1);
  }

  public  double pow(double number, int n) {
    if (n == 0) {
      return 1;
    }
    int n_2 = 0;
    if (n < 0) {
      n_2 = n % 2 == 0 ? -(n / 2) : (-n - 1) / 2;
      number = 1 / number;
    } else {
      n_2 = n % 2 == 0 ? n / 2 : (n - 1) / 2;
    }
    double half = pow(number, n_2);
    if (n % 2 == 0) {
      return half * half;
    } else {
      return half * half * number;
    }
  }

  public static void main(String[] args) {
   
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}
