package com.leetcode.data_struct.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/15/2022
 */

public class HappyNumber_202 {

    private Map<Integer, Integer> map = new HashMap<>();
    private Set<Integer> repeat = new HashSet<>();

    public boolean isHappy(int n) {
        int number = convert(n);
        return number == 1;
    }

    private int convert(int n) {
        Integer nextNumber = 0;
        while (n != 0) {
            int modN = n % 10;
            n = n /10;
            if (!map.containsKey(modN)) {
                map.put(modN, (int) Math.pow(modN, 2));
            }
            nextNumber += map.get(modN);
        }

        if (!repeat.contains(nextNumber)) {
            repeat.add(nextNumber);
            return convert(nextNumber);
        }
        if (nextNumber >= 10) {
            return convert(nextNumber);
        }

        return nextNumber;
    }

    public static void main(String[] args) {
        HappyNumber_202 happyNumber = new HappyNumber_202();
        System.out.println(happyNumber.isHappy(1111111));
    }

}
