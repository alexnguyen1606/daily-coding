package com.dsa_in_90_days.binarysearch;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int max = matrix[i][matrix[i].length - 1];
            if (target >= min && max <= target) {
                boolean search = search(matrix, target, 0, matrix[i].length - 1, i);
                if (search) {
                    return true;
                }
            }

        }

        return false;
    }

    private static boolean search(int[][] matrix, int target, int i, int j, int fixedIndex) {
        while (i <= j) {
            int valueI = matrix[fixedIndex][i];
            if (valueI == target) {
                return true;
            }
            int valueJ = matrix[fixedIndex][j];
            if (valueJ == target) {
                return true;
            }
            int mid = (j + i) / 2;
            if (matrix[fixedIndex][mid] == target) {
                return true;
            }
            if (matrix[fixedIndex][mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }

}
