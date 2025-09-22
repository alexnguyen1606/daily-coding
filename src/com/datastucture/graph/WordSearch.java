package com.datastucture.graph;
//https://leetcode.com/problems/word-search/description/
// xử dụng đồ thị để tìm kiếm
public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        char[] word_array = word.toCharArray();
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char value = board[i][j];
                if ( value != word_array[0]) {
                    continue;
                }
                if (check(board, word_array, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean check(char[][] board, char[] wordArray, int i, int j) {
        int n = board.length;
        int m = board[n - 1].length;
        int k = 0;
        while(i >= 0 && i < n && j >= 0 && j < m && k < wordArray.length) {
            char value = wordArray[k];
            boolean check1 = match(value, ++i, ++j, board);
            boolean check2 = match(value, ++i, --j, board);
            boolean check3 = match(value, --i, ++j, board);
            boolean check4 = match(value, --i, --j, board);
            k++;
        }

        return true;
    }

    private static boolean match(char value, int i, int j, char[][] board) {
        if (i < 0 || j < 0 ) {
            return false;
        }
        int n = board.length;
        int m = board[n - 1].length;
        if (i >= n || j >=n ) {
            return false;
        }
        return board[i][j] == value;
    }

    public static void main(String[] args) {
        char[][] x = {
                {'C', 'B', 'C'},
                {'A', 'B', 'C'},
                {'A', 'B', 'C'}
        };
        System.out.println(exist(x, "ABC"));

    }

}
