package com.datastucture;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sArray.length; i++) {
            char value = sArray[i];
            if (map.containsKey(value)) {
                int count = map.get(value);
                map.put(value, count + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (int i = 0; i < tArray.length; i++) {
            char value = tArray[i];
            if (map.containsKey(value)) {
                int count = map.get(value);
                count--;
                if (count == 0) {
                    map.remove(value);
                    continue;
                }
                map.put(value, count);
            } else {
                return false;
            }
        }
        return true;
    }

}
