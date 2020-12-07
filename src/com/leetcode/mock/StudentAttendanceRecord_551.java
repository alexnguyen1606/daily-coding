package com.leetcode.mock;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 07,2020
 */
public class StudentAttendanceRecord_551 {
  public boolean checkRecord(String s) {
    int countL = 0;
    int countA = 0;
    for (char item : s.toCharArray()) {
      if (item == 'L') {
        countL++;
      } else if (item == 'A') {
        countA++;
        countL = 0;
      } else {
        countL = 0;
      }
      if (countL > 2 || countA > 1) {
        return false;
      }
    }
    return true;
  }
}
