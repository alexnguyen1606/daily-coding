package com.leetcode.arrays;

import java.util.Arrays;

public class DestroyingAsteroids_2126 {

    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int i : asteroids) {
            if(sum < i) {
                return false;
            }
            sum += i;
        }
        return true;
    }

}
