package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:01 AM ,February 08,2021
 */
public class ShortestDistanceToACharacter_821 {
    public int[] shortestToChar(String s, char c) {
        char[] arrayChar = s.toCharArray();
        int[] result = new int[s.length()];
        int pre = find(arrayChar, 0, c);
        int next = pre;
        for (int i = 0; i < s.length(); i++) {
            if (arrayChar[i] == c) {
                pre = next;
                next = find(arrayChar, pre + 1, c);
            } else {
                int x = next - i;
                int y = i - pre;
                x = x < 0 ? x * (-1) : x;
                y = y < 0 ? y * (-1) : y;
                result[i] = x > y ? y : x;
            }
        }
        return result;
    }
    
    private int find(char[] array, int startIndex, char x) {
        int i = startIndex;
        while (i < array.length) {
            if (array[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
