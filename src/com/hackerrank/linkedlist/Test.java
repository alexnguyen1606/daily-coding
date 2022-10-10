package com.hackerrank.linkedlist;

import java.util.*;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/28/2022
 */

public class Test {

    private static final Map<String, Integer> countUnique = new HashMap<>();

    public static String KUniqueCharacters(String str) {
        int k =  str.charAt(0);
        List<String> map = new LinkedList<>();
        String buffer = new String();
        for(int i = 1; i < str.length(); i++) {
            Character item = str.charAt(i);
            buffer = buffer + item;
            int uniqueChar = numberUniqueChar(buffer);
            if( uniqueChar == k) {
                map.add(buffer);
            } else if (uniqueChar > k) {
                buffer = new String();
                i -= 2;
            }
        }
        if(map.isEmpty()) {
            return "";
        }

        int maxIndex = 0;
        for(int i = 0; i< map.size();i++) {
            if(map.get(i).length() > map.get(maxIndex).length()) {
                maxIndex = i;
            }
        }

        return map.get(maxIndex);
    }

    private static int numberUniqueChar(String input) {
        if(countUnique.containsKey(input)) {
            return countUnique.get(input);
        }

        Set<Character> set = new HashSet<>();
        for(Character item : input.toCharArray()) {
            set.add(item);
        }
        countUnique.put(input, set.size());
        return set.size();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KUniqueCharacters(s.nextLine()));
    }

}
