package com.dsa_in_90_days.stack;

import java.util.Stack;

public class GapZeroInBinary {

    // Return max number of zero between 0
    // Example
    // 1000100001 -> max = 4
    // 1000100000 -> max = 3
    // 10001001 -> max = 3
    // Important convert decimal to binary
    public static int solution(int N) {
        Stack<Integer> stack = new Stack<>();
        int n = N;
        int count = -1;
        int countMax = 0;
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value == 0 && count >= 0) {
                count++;
            } else {
                countMax = Math.max(count, countMax);
                count = 0;
            }
        }

        return countMax;
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

}
