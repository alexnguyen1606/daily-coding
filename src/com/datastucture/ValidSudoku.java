package com.datastucture;

import java.util.*;

public class ValidSudoku {

    // board size 9 * 9
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, int[]> cols = new HashMap<>();
        Map<Integer, int[]> rows = new HashMap<>();
        Map<String, int[]> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            cols.put(i, new int[9]);
            rows.put(i, new int[9]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares.put(i + "-" + j, new int[9]);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if (value == '.') {
                    continue;
                }
                int index = value - '0';
                if (cols.get(i)[index] != 0) {
                    return false;
                }
                if (rows.get(j)[index] != 0) {
                    return false;
                }
                String key = squaresKey(i, j);
                if(squares.get(key)[index] != 0) {
                    return false;
                }
                cols.get(i)[index] = 1;
                rows.get(j)[index] = 1;
                squares.get(key)[index] = 1;
            }
        }

        return true;
    }

    private String squaresKey(Integer i, Integer j) {
        int x = i / 3;
        int y = j / 3;
        return x + "-" + y;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};

        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(board));
    }


}
