package com.dsa_in_90_days.hashmap;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String sortedS = sort(s);
            if (map.containsKey(sortedS)) {
                map.get(sortedS).add(s);
            } else {
                map.put(sortedS, new ArrayList<>());
                map.get(sortedS).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }

    public String sort(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return String.copyValueOf(array);
    }

}
