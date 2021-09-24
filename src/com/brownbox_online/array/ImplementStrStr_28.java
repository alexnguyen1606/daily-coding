package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:34 AM ,September 20,2021
 */
public class ImplementStrStr_28 {
  public int strStr(String haystack, String needle) {
    if (haystack.length() == 0 && needle.length() == 0) {
      return 0;
    }
    String temp;
    for (int i = 0; i < haystack.length() - needle.length()+1; i++) {
      temp = haystack.substring(i, i + needle.length() - 1);
      if (temp.equals(needle)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
	  String a= "abc";
    System.out.println(a.substring(0,1));
  }
}
