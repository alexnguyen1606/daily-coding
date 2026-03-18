package com.dsa_in_90_days.slidingwindow;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-window-substring
public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        Map<Character, Integer> setT = buildSet(t);
        int left = 0;
        int right = 0;
        int minLength = 0;
        String rs = "";
        Map<Character, Integer> counter = new HashMap<>();
        while (right < s.length()) {
            char chartAtRight = s.charAt(right);
            char chartAtLeft = s.charAt(left);
            if (chartAtRight == chartAtLeft) {
                while (left < right) {
                    
                }
            }
            right++;
        }

        return rs;
    }

    private static boolean isAllContain(Map<Character, Integer> target, Map<Character, Integer> source) {
        for (Map.Entry<Character, Integer> entry : source.entrySet()) {
            if (!target.containsKey(entry.getKey())) {
                return false;
            }
            if (target.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> buildSet(String x) {
        char[] charArray = x.toCharArray();
        Map<Character, Integer> rs = new HashMap<>();
        for (char item : charArray) {
            if (rs.containsKey(item)) {
                rs.put(item, rs.get(item) + 1);
            } else {
                rs.put(item, 1);
            }
        }
        return rs;
    }
}
