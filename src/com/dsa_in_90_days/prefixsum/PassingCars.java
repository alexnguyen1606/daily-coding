package com.dsa_in_90_days.prefixsum;

public class PassingCars {
    public static int solution(int[] A) {
        if (A.length == 1) {
            return -1;
        }
        int[] east = new int[A.length];
        int[] west = new int[A.length];
        for (int i = 0 ; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = i + 1; j < A.length; j++) {
                    east[j] = east[j - 1];
                    if (A[j] == 1) {
                        east[j] += 1;
                    }
                }
                break;
            }
        }

        for (int i = A.length - 1 ; i >= 0; i--) {
            if (A[i] == 1) {
                for (int j = i - 1; j >= 0; j--) {

                    if (A[j] == 0) {
                        west[j] = west[j + 1];
                        west[j] += 1;
                    } else {
                        west[j] = west[j + 1];
                    }
                }
                break;
            }
        }
        int count = east[A.length - 1] + west[0];
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 1, 1};
        System.out.println(solution(array));
    }
}
