package com.dsa_in_90_days.stack;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            int temperature = temperatures[i];
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty()) {
                int index = stack.peek();
                if (temperatures[index] > temperature) {
                    result[i] = index - i;
                    break;
                }
                stack.pop();
            }
            stack.push(i);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] temps = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] rs = dailyTemperatures(temps);
        System.out.println(rs);
    }

}
