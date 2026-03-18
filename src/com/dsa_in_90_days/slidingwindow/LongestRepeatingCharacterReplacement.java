package com.dsa_in_90_days.slidingwindow;


//https://leetcode.com/problems/longest-repeating-character-replacement
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        if (s.length() <= 1) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        int longest = 0;
        int[] counter = new int[26];
        while (right < s.length()) {
            char charAtRight = s.charAt(right);
            if (left == right && left == 0) {
                right++;
                counter['Z' - charAtRight]++;
                longest = 1;
                continue;
            }
            counter['Z' - charAtRight]++;
            int windowLength = right - left + 1;
            int mostFrequency = mostFrequency(counter);
            boolean isValid = (windowLength - mostFrequency) <= k;
            if (isValid) {
                longest = Math.max(windowLength, longest);
                right++;
            } else {
                char chartAtLeft = s.charAt(left);
                counter['Z' - chartAtLeft]--;
                left++;
                right++;
            }
        }
        return longest;
    }

    private static int mostFrequency(int[] counter) {
        int rs = 0;
        for (int time : counter) {
            rs = Math.max(rs, time);
        }
        return rs;
    }


    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }


}
