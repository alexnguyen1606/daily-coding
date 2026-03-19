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
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        Map<Character, Integer> counter = new HashMap<>();
        int matched = 0;
        while (right < s.length()) {
            char charAtR = s.charAt(right);
            if (setT.containsKey(charAtR)) {
                addToMap(counter, charAtR);
                if (counter.get(charAtR).equals(setT.get(charAtR))) {
                    matched++;
                }
            }
            if (matched == setT.size()) {
                int window = right - left + 1;
                if (window < minLength) {
                    minLength = window;
                    start = left;
                }
                while (left < s.length()) {
                    char chartAtL = s.charAt(left);
                    if (left + 1 < s.length()) {
                        if (setT.containsKey(chartAtL)) {
                            if (setT.get(chartAtL).equals(counter.get(chartAtL))) {
                                matched--;
                            }
                            removeFromMap(counter, chartAtL);
                        }
                        if (matched == setT.size()) {
                            left++;
                            window = right - left + 1;
                            if (window < minLength) {
                                minLength = window;
                                start = left;
                            }
                        } else {
                            addToMap(counter, chartAtL);
                            if (counter.get(chartAtL).equals(setT.get(chartAtL))) {
                                matched++;
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    private static void addToMap(Map<Character, Integer> counter, char chartAtRight) {
        if (counter.containsKey(chartAtRight)) {
            counter.put(chartAtRight, counter.get(chartAtRight) + 1);
        } else {
            counter.put(chartAtRight, 1);
        }
    }

    private static void removeFromMap(Map<Character, Integer> counter, char chartAtRight) {
        if (counter.containsKey(chartAtRight)) {
            int updateValue = counter.get(chartAtRight) - 1;
            if (updateValue <= 0) {
                counter.remove(chartAtRight);
                return;
            }
            counter.put(chartAtRight, updateValue);
        }
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

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}

