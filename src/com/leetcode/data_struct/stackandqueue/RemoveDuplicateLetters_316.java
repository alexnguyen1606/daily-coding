package com.leetcode.data_struct.stackandqueue;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>10:32 AM ,December 08,2020
 */
public class RemoveDuplicateLetters_316 {
    public String removeDuplicateLetters(String s) {
        char[] arrayLetter = s.toCharArray();
        sort(arrayLetter);
        
        Set<Character> set = new HashSet<>();
        for (int i = arrayLetter.length - 1; i >= 0; i--) {
            set.add(arrayLetter[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character item : set) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
    public static void sort(char[] array) {
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
}

