package com.dsa_in_90_days.array;

public class FogJump {

    public static int solution(int X, int Y, int D) {
        return (int) (double) ((Y - X) / D) + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }
}
