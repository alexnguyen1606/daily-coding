package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:45 PM ,November 12,2020
 */

public class FizzBuzz_412 {
  public static List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>(n);
    int i = 1;
    while (i <= n) {
      if (i % 3 != 0 && i % 5 != 0) {
        result.add(String.valueOf(i));
      } else if (i%3==0 && i%5!=0){
        result.add("Fizz");
      }else if (i%3!=0 && i%5==0){
        result.add("Buzz");
      }else {
        result.add("FizzBuzz");
      }
      i++;
    }
    return result;
  }

  public static void main(String[] args) {
      fizzBuzz(3);
  }
}
