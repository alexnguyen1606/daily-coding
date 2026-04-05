package com.dsa_in_90_days.array;

public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        int[] rs = new int[N];
        int max = N + 1;
        int currentMax = 0;
        int tempMax = 0;
        for (int i = 0; i < A.length; i++) {
            int index = A[i] - 1;
            if (A[i] == max) {
                tempMax = currentMax;
            } else {
                if (rs[index] < tempMax) {
                    rs[index] = tempMax;
                }
                rs[index]++;
                currentMax = Math.max(rs[index], currentMax);
            }
        }
        for (int i = 0; i < rs.length; i++) {
            if (rs[i] < tempMax) {
                rs[i] = tempMax;
            }

        }
        return rs;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 4, 6, 1, 4, 4};
        System.out.println(solution(5, array));
    }

}
