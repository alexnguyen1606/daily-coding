package com.datastucture;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

    // using sort
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String size = makeKey(strs[i]);
            if (map.containsKey(size)) {
                List<String> rs = map.get(size);
                rs.add(strs[i]);
            } else {
                List<String> rs = new LinkedList<>();
                rs.add(strs[i]);
                map.put(size, rs);
            }
        }
        return new ArrayList<>(map.values());
    }

    // using hashing

    public List<List<String>> groupAnagramsByHashing(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String value = strs[i];
            int[] array = new int[26];
            for (char c : value.toCharArray()) {
                array[c - 'a'] += 1;
            }
            String key = Arrays.toString(array);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(value);
        }
        return new ArrayList<>(map.values());
    }

    private String makeKey(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        Arrays.toString(new int[]{});
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }

}
