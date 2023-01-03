package com.leetcode.data_struct.hash;

/**
 * @author: Nguyen Anh Tuan
 * @created: 11/08/2022
 */

public class IntToRoman_12 {

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            if (num - 1000 >= 0) {
                result.append("M");
                num = num - 1000;
            } else if (num - 500 >= 0) {
                result.append("D");
                num = num - 500;
            } else if (num - 100 >= 0) {
                result.append("C");
                num -= 100;
            } else if (num - 50 >= 0) {
                result.append("L");
                num -=50;
            } else if (num - 10 >= 0) {
                result.append("X");
                num -= 10;
            } else if (num - 5 >= 0) {
                num -= 5;
                result.append("V");
            } else {
                num -= 1;
                result.append("I");
            }
        }

        return result.toString();
    }

}
