package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:49 AM ,December 26,2020
 */
public class DiagonalTraverse_498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) {
            return new int[0];
        }
        int m = matrix[n - 1].length;
        int[] result = new int[m * n];
        int count = 0;
        boolean check = true;
        int start,j,k;
        for (int i = 0; i < m; i++) {
             j = i;
             k = 0;
            if (check) {
                start = count;
                for (; j >= 0 && k < n; j--, k++) {
                    result[count++]=matrix[k][j];
                }
                reverse(result,start,count-1);
                check = false;
                
            } else {
                for (; j >= 0 && k < n; j--, k++) {
                    result[count++] = matrix[k][j];
                }
                check = true;
            }
        }
        check = !check;
        for (int i = 1; i < n; i++) {
            j = i;
            k = m - 1;
            if (check) {
                for (; j < n && k >= 0; j++, k--) {
                    result[count++] = matrix[j][k];
                }
                check = false;
            } else {
                start = count;
                for (; j < n && k >= 0; j++, k--) {
                    result[count++]=matrix[j][k];
                }
                reverse(result,start,count-1);
                check = true;
            }
        }
        
        return result;
    }
    
    public void reverse(int[] array,int start,int end){
        int temp;
        while (start<end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
