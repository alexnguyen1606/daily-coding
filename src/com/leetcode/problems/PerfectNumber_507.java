package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:37 PM ,January 20,2021
 */
public class PerfectNumber_507 {
    public boolean checkPerfectNumber(int num) {
        int temp = num;
        int sum = 0;
        while (temp % 2 == 0) {
            temp = temp / 2;
            sum += temp;
        }
        temp -= 1;
        while (temp != 0) {
            if (num % temp == 0) {
                sum += temp;
            }
            temp--;
        }
        return sum == num;
    }
}
