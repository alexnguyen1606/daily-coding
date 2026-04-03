package com.dsa_in_90_days.array;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        int minValue = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
                minValue = Math.min(minValue, A[i]);
            }
        }
        while (set.contains(minValue)) {
            minValue++;
        }

        return minValue;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 2, 3, 7}));
    }

}
