package com.datastucture.slidingwindow;

import java.util.Arrays;

public class LongestSubArraySameValue {

    public static int[] longestSubArray(int[] numbs) {
        int longestLength = 0;
        int L = 0;
        int R = 0;
        int i = 0;
        int j = 0;
        while (R < numbs.length) {
            if (numbs[L] == numbs[R]) {
                if (longestLength < (R - L + 1)) {
                    longestLength = R - L + 1;
                    i = L;
                    j = R;
                }
                R++;
                continue;
            }
            if (numbs[L] != numbs[R]) {
                L = R;
            }
        }
        int[] rs = new int[longestLength];
        int k = 0;
        while (i <= j) {
            rs[k] = numbs[i];
            k++;
            i++;
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] numbs = new int[]{1, 1, 1, 2, 2, 3,3, 3,3, 3,4, 4};
        System.out.println(Arrays.toString(longestSubArray(numbs)));
    }

}
