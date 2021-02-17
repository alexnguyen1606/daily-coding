package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:57 AM ,February 12,2021
 */
public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowNum = matrix.length; //row
        int colNum = matrix[rowNum - 1].length; // col
        for (int i = rowNum - 1; i >= 0; i--) {
            int tempRow = i;
            int j = 0;
            int tem = matrix[tempRow][j];
            while (tempRow < rowNum && j < colNum) {
                if (matrix[tempRow][j] != tem) {
                    return false;
                }
                j++;
                tempRow++;
            }
        }
        for (int i = 1; i < colNum; i++) {
            int j = 0;
            int temCol = i;
            int temp = matrix[j][temCol];
            while (temCol < colNum && j < rowNum) {
                if (matrix[j][temCol] != temp) {
                    return false;
                }
                j++;
                temCol++;
            }
        }
        return true;
    }
}
