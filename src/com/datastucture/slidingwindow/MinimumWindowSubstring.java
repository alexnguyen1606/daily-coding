package com.datastucture.slidingwindow;

public class MinimumWindowSubstring {

    // mininum sub string in s contain t
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] set = new int[56];
        return "";
    }

    private int hash(char value) {
        if (value > 'Z') {
            return value - 'A';
        }
        return value - 'a' + 26;
    }

}
