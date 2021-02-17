package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:40 PM ,February 11,2021
 */
public class ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int num) {
        int root = (int) squareRoot(num);
        return root * root == num;
    }
    
    public static double squareRoot(int number) {
        if (number == 1) {
            return 1;
        }
        double temp;
        
        double sr = number / 2;
        
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
        
        return sr;
    }
    
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}
