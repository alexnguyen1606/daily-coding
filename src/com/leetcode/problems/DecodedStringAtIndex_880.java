package com.leetcode.problems;

import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 * <p>11:08 AM ,December 23,2020
 */
public class DecodedStringAtIndex_880 {
    public static String decodeAtIndex(String S, int K) {
        char[] chars = S.toCharArray();
        Stack<Character> stacks = new Stack<>();
        Stack<Character> nums = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char item = chars[i];
            if (!Character.isDigit(item)) {
                if (!nums.isEmpty()) {
                    StringBuilder number = new StringBuilder();
                    while (!nums.isEmpty()) {
                        number.append(nums.pop());
                    }
                    Long multi = Long.valueOf(number.reverse().toString());
                    StringBuilder stringBuilder = new StringBuilder();
                    while (!stacks.isEmpty()) {
                        stringBuilder.append(stacks.pop());
                    }
                    StringBuilder a = stringBuilder.reverse();
                    String b = a.toString();
                    for (int j = 1; j < multi; j++) {
                        a.append(b);
                    }
                    char[] chars1 = a.toString().toCharArray();
                    for (int j = 0; j < chars1.length; j++) {
                        stacks.push(chars1[j]);
                    }
                }
                stacks.push(item);
            } else {
                nums.push(item);
            }
        }
        if (!nums.isEmpty()) {
            StringBuilder number = new StringBuilder();
            while (!nums.isEmpty()) {
                number.append(nums.pop());
            }
            Long multi = Long.valueOf(number.reverse().toString());
            
            StringBuilder stringBuilder = new StringBuilder();
            while (!stacks.isEmpty()) {
                stringBuilder.append(stacks.pop());
            }
            StringBuilder a = stringBuilder.reverse();
            String b = a.toString();
            for (int j = 1; j < multi; j++) {
                a.append(b);
            }
            char[] chars1 = a.toString().toCharArray();
            for (int j = 0; j < chars1.length; j++) {
                stacks.push(chars1[j]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stacks.isEmpty()) {
            stringBuilder.append(stacks.pop());
        }
        System.out.println(stringBuilder.reverse().toString());
        return String.valueOf(stringBuilder.reverse().toString().charAt(K));
    }
    
    
    public static void main(String[] args) {
        System.out.println(decodeAtIndex("a2345678999999999999999",1));
    }
}
