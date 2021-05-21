package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:19 AM ,February 17,2021
 */
public class LetterCasePermutation_784 {
    public List<String> letterCasePermutation(String S) {
        char[] arrayChar = S.toCharArray();
        int n = arrayChar.length;
        Set<String> strings = new HashSet<>();
        
        List<String> result = new ArrayList<>(strings);
        return result;
    }
}
