package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 11,2020
 */
public class ValidPalindromeString_125 {
  public static boolean isPalindrome(String s) {
    s = s.trim();
    s = s.toLowerCase();
    s = s.replaceAll("[^A-Za-z0-9]", "");
    int n = s.length();
    if (n==1){
        return false;
    }
    int middle = n/2;
    for (int i = 0;i<middle;i++){
        if (s.charAt(i)!= s.charAt(n-i-1)){
            return false;
        }
    }
    return true;
  }
    
    public static boolean isPalindrome2(String s) {
      s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            while ((i<j)&& (!Character.isLetterOrDigit(s.charAt(i))) ){
                i++;
            }
            while ((i<j)&& (!Character.isLetterOrDigit(s.charAt(j)))){
                j--;
            }
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

  public static void main(String[] args) {
    System.out.println(isPalindrome("xin chao . 18292 ; sjksks ; ||  "));
  }
}
