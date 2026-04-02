package com.dsa_in_90_days.stack;


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    // worst case generate all case it can be match with parenthesis then check each them and add to List;
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(n * 2 - 1);
        backtrack(result, n, n, n, new StringBuilder());
        return result;
    }

    public static void backtrack(List<String> result, int n, int countOpen, int countClose, StringBuilder data) {
        if (countOpen == countClose && countClose == 0) {
            result.add(data.toString());
            return;
        }
        if (countOpen == countClose) {
            int temp = countOpen - 1;
            backtrack(result, n, temp, countClose, data.append("("));
            data.deleteCharAt(data.length() - 1);
            return;
        }
        if (countOpen > 0) {
            int temp = countOpen - 1;
            backtrack(result, n, temp, countClose, data.append("("));
            data.deleteCharAt(data.length() - 1);
        }

        if (countClose > 0) {
            int temp = countClose - 1;
            backtrack(result, n, countOpen, temp, data.append(")"));
            data.deleteCharAt(data.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }


}
