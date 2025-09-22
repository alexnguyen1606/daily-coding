package com.datastucture.slidingwindow;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    public static int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int L = 0;
        int R = 0;
        int longest = 0;

        while (R < s.length()) {
            if (L == R) {
                longest = Math.max(longest, 1);
                unique.add(s.charAt(R));
                R++;
                continue;
            }
            Character value = s.charAt(R);
            if (!unique.contains(value)) {
                longest = Math.max(longest, R - L + 1);
                unique.add(value);
                R++;
                continue;
            }
            unique.remove(s.charAt(L));
            L++;
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
