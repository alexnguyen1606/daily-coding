package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:49 PM ,February 11,2021
 */
public class ValidBoomerang_1037 {
    public boolean isBoomerang(int[][] points) {
        if (points[0][0] == points[1][0] && points[1][0] == points[2][0]) {
            return false;
        }
        if (points[0][1] == points[1][1] && points[1][1] == points[2][1]) {
            return false;
        }
        int cut1 = points[0][0] - points[1][0];
        int cut2 = points[0][1] - points[1][1];
        boolean check = cut1 == cut2;
        int cut3 = points[1][0] - points[2][0];
        int cut4 = points[1][1] - points[2][1];
        boolean check2 = cut3 == cut4;
        
        if (check && check2) {
            return false;
        }
        return true;
    }
    
    public void print(int[][] points) {
        int i = points.length;
        int j = points[i - 1].length;
        for (int x = 0; x < points.length; x++) {
            for (int k = 0; k < j; k++) {
                System.out.println(points[x][k]);
            }
        }
    }
}
