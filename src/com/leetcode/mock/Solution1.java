package com.leetcode.mock;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 07,2020
 */
public class Solution1 {
    public boolean checkRecord(String s) {
      boolean check = true;
      int countL = 0;
      int countA = 0;
      for (char item : s.toCharArray()){
          if (item=='L'){
              countL++;
          }else if (item=='A'){
              countA++;
          }
      }
      if (countL>=3){
          check = false;
      }
      if (countA>=2){
          check = false;
      }
      return check;
    }
}
