package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 02,2020
 */
public class Test
{
  public static void main(String[] args) {
   ValidParenttheses_20 validParenttheses_20 = new ValidParenttheses_20();
   String a = "[[{{}}]]({})}";
    System.out.println(validParenttheses_20.isValid(a));
  }
}
