package com.leetcode.recursion;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 04,2020
 */
public class Fibonacci {
   int[] F = new int[31];

  public int fibonacciWithFor(int N) {
    if (F[N] != 0) {
      return F[N];
    }
    if (N <= 1) {
      F[N] = N;
      return N;
    }
    F[N] = fibonacciWithFor(N-1) + fibonacciWithFor(N-2);
    return F[N];
  }

  public static void main(String[] args) {}
}
