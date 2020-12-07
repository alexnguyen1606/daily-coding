package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:25 AM ,December 07,2020
 */
public class StringWithout3aAnd3b_984 {
    public String strWithout3a3b(int A, int B) {
      StringBuilder a = new StringBuilder();
      StringBuilder b = new StringBuilder();
      
      if (A > B){
          for (int i = 1;i<=B;i++){
              b.append('b');
          }
      }else {
          for (int i = 1;i<=A;i++){
              a.append('a');
          }
      }
     StringBuilder stringBuilder = new StringBuilder();
     
     return stringBuilder.toString();
    }
}
