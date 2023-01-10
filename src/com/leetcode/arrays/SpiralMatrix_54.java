package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>8:36 AM ,December 08,2020
 */
public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[n - 1].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int count = 0;
        int i;
        List<Integer> result = new ArrayList<>(m * n);
        while (count < m * n) {
            // get top
            // go left -> right
            if (count >= m * n) {
                break;
            }
            for (i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                count++;
            }
            top++;
            // get right
            // got top -> bottom
            if (count >= m * n) {
                break;
            }
            for (i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;
            // get bottom
            // go right -> left
            if (count >= m * n) {
                break;
            }
            for (i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            // get left
            // go bottom -> top
            if (count >= m * n) {
                break;
            }
            for (i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }

        return result;
    }
}
