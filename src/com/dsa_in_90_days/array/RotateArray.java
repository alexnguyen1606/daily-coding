package com.dsa_in_90_days.array;

public class RotateArray {
    public int[] solution(int[] A, int K) {
        int rotation = K > A.length ? K / A.length : K;

        int[] temps = new int[rotation];
        int j = A.length - 1;
        int tempCount = rotation;
        while (tempCount > 0) {
            temps[tempCount - 1] = A[j];
            tempCount--;
            j--;
        }
        int inverst = A.length - rotation;
        j = 0;
        while (inverst > 0) {
            A[A.length - inverst] = A[j];
            j++;
            inverst--;
        }
        for (int i = 0; i < temps.length; i++) {
            A[i] = temps[i];
        }

        return A;
    }
}
