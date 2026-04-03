package com.dsa_in_90_days.hashmap;

public class FindMissingElement {

    public static int solution(int[] A) {
        int[] temps = new int[A.length + 2];
        for (int i = 0; i < A.length; i++) {
            temps[A[i]] += 1;
        }

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] == 0) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] array  = new int[]{1,2,4,3};
        System.out.println(solution(array));
    }
}
