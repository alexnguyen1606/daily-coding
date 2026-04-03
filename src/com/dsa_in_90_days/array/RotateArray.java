package com.dsa_in_90_days.array;

public class RotateArray {
    public static int[] solution(int[] A, int K) {
        if (K == 0) {
            return A;
        }
        if (A.length == 0 || A.length == 1) {
            return A;
        }
        int rotation = K > A.length ? K / A.length : K;

        int[] temps = new int[rotation];
        int j = A.length - 1;
        int tempCount = rotation;
        while (tempCount > 0) {
            temps[tempCount - 1] = A[j];
            tempCount--;
            j--;
        }
        j = A.length - rotation - 1;
        int k = A.length - 1;
        while (j >= 0) {
            A[k] = A[j];
            j--;
            k--;
        }
        for (int i = 0; i < temps.length; i++) {
            A[i] = temps[i];
        }

        return A;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1};
        array = solution(array, 5);
        System.out.println(array);
    }
}
