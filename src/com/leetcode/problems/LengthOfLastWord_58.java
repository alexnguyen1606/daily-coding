package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 11,2020
 */
public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' '){
                count++;
            }else {
                return count;
            }
        }
        return count;
    }
}
