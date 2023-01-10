package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>8:11 AM ,December 08,2020
 */
public class SpiralMatrixII_59 {

    //   Used for pointer top, bottom, left and right.
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][];
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        int count = 1;
        int i;
        while (top <= bottom && left <= right) {

            // fill top
            for (i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;
            // fill right
            for (i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;
            // fill bottom
            for (i = right; i >= left; i--) {
                matrix[bottom][i] = count++;
            }
            bottom--;
            // fill left
            for (i = bottom; i >= top; i--) {
                matrix[i][left] = count++;
            }
            left++;
        }


        return matrix;
    }
}
