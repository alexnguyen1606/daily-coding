package com.hackerrank.linkedlist;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 11/02/2022
 */

public class LeftRotate {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int rotates = d % arr.size();
        while (rotates > 0) {
            int temp = arr.get(0);
            for (int i = 0; i < arr.size() - 1 ; i++) {
                arr.set(i, arr.get(i + 1));
            }
            arr.set(arr.size() - 1, temp);
            rotates--;
        }
        return arr;
    }

}
