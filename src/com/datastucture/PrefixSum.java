package com.datastucture;

public class PrefixSum {

    public static int[] constructPrefixSum(int[] sources) {
        int[] result = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            if (i == 0) {
                result[i] = sources[i];
                continue;
            }
            result[i] = sources[i] + result[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4 , 5};
        int[] result = constructPrefixSum(array);
        print(array);
        print(result);
    }

    private static void print(int[] array) {
        for (int j : array) {
            System.out.print(j + ",");
        }
        System.out.println("\n");
    }

}
