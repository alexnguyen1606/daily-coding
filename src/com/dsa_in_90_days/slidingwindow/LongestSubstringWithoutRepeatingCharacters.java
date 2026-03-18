package com.dsa_in_90_days.slidingwindow;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        int longest = 0;
        Set<Character> checkers = new HashSet<>();
        while (right < s.length()) {
            char charAtRight = s.charAt(right);
            if (checkers.contains(charAtRight)) {
                checkers.remove(s.charAt(left));
                left++;
                continue;
            }
            longest = Math.max(longest, right - left + 1);
            right++;
            checkers.add(charAtRight);
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
