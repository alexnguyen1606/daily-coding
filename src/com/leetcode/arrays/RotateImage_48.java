package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:30 PM ,December 30,2020
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return;
        }
        // Hoán vị
        int j;
        int temp;
        for (int i = 0; i < n; i++) {
            for ( j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // đỗi chỗ cột
        int k;
        for (int i = 0; i < n; i++) {
            j = 0;
            k = n-1;
            while (j < k) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
