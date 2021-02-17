package com.leetcode.arrays;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:13 PM ,February 11,2021
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        sort(arrayS);
        sort(arrayT);
        return Arrays.equals(arrayS,arrayT);
    }
    public boolean equal(char[] array,char[] array2){
        int i = 0;
        int j = array2.length - 1;
        while (i<=j){
            if (array[i] != array2[i]){
                return false;
            }
            i++;
            
        }
        return true;
    }
    public void sort(char[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            char value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }
    public void swap(char[] chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
