package com.dsa_in_90_days.slidingwindow;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/?envType=problem-list-v2&envId=wtb84rq6
public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i) - 'a']++;
            s2Array[s2.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = s1.length() - 1;
        while (right < s2.length()) {
            if (equal(s1Array, s2Array)) {
                return true;
            }

            s2Array[s2.charAt(left) - 'a']--;
            left++;
            right++;
            if (right < s2.length()) {
                s2Array[s2.charAt(right) - 'a']++;
            }
        }
        return false;
    }

    private static boolean equal(int[] s1Array, int[] s2Array) {
        boolean isAnagram = true;
        int i = 0;
        while (i < s1Array.length) {
            if (s1Array[i] == 0) {
                i++;
                continue;
            }
            if (s1Array[i] != s2Array[i]) {
                isAnagram = false;
                break;
            }
            i++;
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

}
