package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:34 AM ,December 29,2020
 */
public class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        if (n == 1) {
            return mat[0][0];
        }
        int sum = 0;
        int m = mat[n - 1].length;
        // Sum in primary diagonal
        for (int i = 0; i < n ; i++) {
            sum += mat[i][i];
        }
        //Sum in second diagonal
        for (int i = 0, j = m - 1; i < n && j >= 0; j--, i++) {
            sum += mat[i][j];
        }
        // remove duplicate value of element between primary and second dìagonal
        if (n  % 2 != 0) {
            sum -= mat[(n - 1) / 2][(n - 1) / 2];
        }
        return sum;
    }
    
    public int diagonalSum2(int[][] mat) {
        int n = mat.length;
        if (n == 1) {
            return mat[0][0];
        }
        int sum = 0;
        int i = 0,p=0,k=n-1;
        while (i<n){
            sum+=mat[i][i];
            sum+=mat[k][i];
            k--;
            i++;
        }
        // remove duplicate value of element between primary and second dìagonal
        if (n  % 2 != 0) {
            sum -= mat[(n - 1) / 2][(n - 1) / 2];
        }
        return sum;
    }
    
}
