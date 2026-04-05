package com.dsa_in_90_days.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {

    // Perm is 1 -> N and only appear once
    public static int solution(int[] A) {
        Map<Integer, Integer> counter = new HashMap<>();
        int min = 1;
        int max = A.length;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min || A[i] > max) {
                return 0;
            }
            if (counter.containsKey(A[i])) {
                return 0;
            }
            counter.put(A[i], 1);
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 3, 2};
        System.out.println(solution(array));
    }
}
