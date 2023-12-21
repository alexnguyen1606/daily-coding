package com.leetcode.arrays;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class CanPlaceFlowers_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) throws NoSuchFieldException, IllegalAccessException {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                break;
            }
            if (flowerbed[i] != 0) {
                i++;
                continue;
            }

            int nextIndex = i + 1;
            if (nextIndex < flowerbed.length && flowerbed[nextIndex] != 0) {
                continue;
            }
            i++;
            n--;
        }
        return n <= 0;
    }

}
