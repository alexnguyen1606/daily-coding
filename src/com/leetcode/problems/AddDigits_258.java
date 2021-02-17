package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:13 AM ,February 12,2021
 */
public class AddDigits_258 {
    public  int addDigits(int num) {
      while (num>=10){
          int temp = num%10;
          int k = num/10;
          num = k+temp;
      }
      return num;
    }
    public static void main(String[] args) {
        AddDigits_258 addDigits = new AddDigits_258();
        System.out.println(addDigits.addDigits(357));
    }
}
