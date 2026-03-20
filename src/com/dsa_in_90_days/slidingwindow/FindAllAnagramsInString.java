package com.dsa_in_90_days.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string
public class FindAllAnagramsInString {

    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        int[] windowArray = new int[26];
        int[] pArray = new int[26];
        for (char value : p.toCharArray()) {
            pArray[value - 'a']++;
        }
        while (right < p.length()) {
            windowArray[s.charAt(right) - 'a']++;

            right++;
        }
        right--;
        while (right < s.length()) {
            int i = 0;
            boolean isAnagram = true;
            while (i < pArray.length) {
                if (pArray[i] == 0) {
                    i++;
                    continue;
                }
                if (pArray[i] != windowArray[i]) {
                    isAnagram = false;
                    break;
                }
                i++;
            }
            if (isAnagram) {
                result.add(left);
            }
            char charAtL = s.charAt(left);
            windowArray[charAtL - 'a']--;
            left++;
            right++;
            if (right < s.length()) {
                char chartAtR = s.charAt(right);
                windowArray[chartAtR- 'a']++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }
}
