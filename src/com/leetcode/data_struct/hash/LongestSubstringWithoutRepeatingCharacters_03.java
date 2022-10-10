package com.leetcode.data_struct.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/15/2022
 */

public class LongestSubstringWithoutRepeatingCharacters_03 {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> cache = new HashSet<>();
        for (int i = 0; i < s.length() ; i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                Character nextItem = s.charAt(j);
                if (cache.contains(nextItem)) {
                    break;
                }

                count++;
                cache.add(nextItem);
            }

            if (count > maxLength) {
                maxLength = count;
            }

            cache.clear();
        }
        return maxLength;
    }

}
