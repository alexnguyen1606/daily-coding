package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 10,2020
 */
public class HappyNumber_202 {

  Set<Integer> sets = new HashSet<>();

  public boolean isHappy(int n) {
    sets.add(n);
    int value = check(n);
    if (value == 1) {
      return true;
    } else {
      if (!sets.contains(value)) {
        return isHappy(value);
      } else {
        return false;
      }
    }
  }

  public int check(int n) {
    if (n <= 9) {
      return (int) Math.pow(n, 2);
    }
    int result = 0;
    while (n > 0) {
      result += Math.pow(n % 10, 2);
      n = n / 10;
    }
    return result;
  }

  public static void main(String[] args) {
    HappyNumber_202 happyNumber = new HappyNumber_202();
    System.out.println(happyNumber.isHappy(2));
  }
}
