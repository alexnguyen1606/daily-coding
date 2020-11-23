package com.leetcode.problems;

import java.util.LinkedList;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:38 AM ,November 16,2020
 */
public class NumberComplement_476 {
  public static int findComplement(int num) {
    LinkedList<Integer> queue = new LinkedList<>();
    while (num > 0) {
      queue.push(num % 2);
      num /= 2;
    }
    boolean check = false;
    int result = 0;
    int count = queue.size() - 1;
    while (!queue.isEmpty()) {
      int number = queue.pop();
      if (number == 1) {
        check = true;
      }
      if (check) {
        number = number == 0 ? 1 : 0;
        result += number * Math.pow(2, count);
        count--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(findComplement(1));
  }
}
