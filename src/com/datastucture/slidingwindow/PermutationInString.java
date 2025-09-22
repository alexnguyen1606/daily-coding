package com.datastucture.slidingwindow;

import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] set = new int[26];
        for (char value : s1.toCharArray()) {
            int index = value - 'a';
            set[index]++;
        }
        int L = 0;
        int R = s1.length();
        int[] temp = new int[26];
        int s2Length = s2.length();
        for (int i = L; i <= R; i++) {
            int index = s2.charAt(i) - 'a';
            temp[index]++;
        }
        while (R < s2Length) {
            if (Arrays.equals(temp, set)) {
                return true;
            }
            R++;
            if (R < s2Length) {
                int indexR = s2.charAt(R) - 'a';
                temp[indexR]++;

                int indexL = s2.charAt(L) - 'a';
                temp[indexL] -= 1;
                L++;
            }
        }
        return Arrays.equals(temp, set);
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }



}
