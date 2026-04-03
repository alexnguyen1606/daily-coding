package com.dsa_in_90_days.hashmap;

import java.util.HashMap;
import java.util.Map;

public class OddNumbers {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1) {
                return pair.getKey();
            }
        }
        return 0;
    }

}
