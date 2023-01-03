package com.leetcode.arrays;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 11/07/2022
 */

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String minStr = getMinString(strs);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minStr.length(); i++) {
            char charAtIndex = minStr.charAt(i);
            for (String str : strs) {
                if (charAtIndex != str.charAt(i)) {
                    return result.toString();
                }
            }
            result.append(charAtIndex);
        }
        return result.toString();
    }

    public String getMinString(String[] strs) {
        String minStr = null;
        for (String str : strs) {
            if (minStr == null) {
                minStr = str;
                continue;
            }

            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }
        return minStr;
    }

}
