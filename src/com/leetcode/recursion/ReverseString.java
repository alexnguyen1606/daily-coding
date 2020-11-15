package com.leetcode.recursion;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 04,2020
 */
public class ReverseString {
  public static void reverseString(char[] s) {
    int n = s.length;
    int middle = n / 2;
    for (int i = 0; i < middle; i++) {
      swap(s, i, n - i - 1);
    }
    for (char c : s) {
      System.out.print(c + ",");
    }
    System.out.println();
  }

  public static void reverseStringSolution2(char[] s) {
    swap2(s,0,s.length-1);
  }
  public static void swap2(char[] s,int i,int j){
      if (i<j){
          swap(s,i,j);
          swap2(s,i+1,j-1);
      }
      
  }

  public static void swap(char[] s, int i, int j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }
  
  public static void reverse(char[] s){
    int start  = 0;
    int end = s.length;
    while (start<end){
      swap(s,start,end-1);
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    char[] array = {'1', '2', '3', '4'};
    reverse(array);
      for (char c : array) {
          System.out.print(c + ",");
      }
      System.out.println();
  }
}
