package com.leetcode.hashtable;

import java.util.*;

/**
 * @author: Nguyen Anh Tuan
 * @created: 11/08/2022
 */

public class IntToRoman_12 {
    List<Pair<Integer, String>> romanNumbers = new ArrayList<>();
    public void init() {
        romanNumbers.add(new Pair<>(1000, "M"));
        romanNumbers.add(new Pair<>(900, "CM"));
        romanNumbers.add(new Pair<>(500, "D"));
        romanNumbers.add(new Pair<>(400, "CD"));
        romanNumbers.add(new Pair<>(100, "C"));
        romanNumbers.add(new Pair<>(90, "XC"));
        romanNumbers.add(new Pair<>(50, "L"));
        romanNumbers.add(new Pair<>(40, "XL"));
        romanNumbers.add(new Pair<>(10, "X"));
        romanNumbers.add(new Pair<>(9, "IX"));
        romanNumbers.add(new Pair<>(5, "V"));
        romanNumbers.add(new Pair<>(4, "IV"));
        romanNumbers.add(new Pair<>(1, "I"));
    }

    public String intToRoman(int num) {
        init();
        StringBuilder result = new StringBuilder();
        int pivot = num;
        while(pivot > 0) {
            for(int i = 0; i< romanNumbers.size() ; i++) {
                Pair<Integer, String> entry = romanNumbers.get(i);
                int minus = pivot - entry.getKey();
                if(minus >= 0) {
                    result.append(entry.getValue());
                    pivot -= entry.getKey();
                    break;
                }

            }
        }


        return result.toString();
    }

    static class Pair<K, V> {
        K key;
        V value;

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


}
