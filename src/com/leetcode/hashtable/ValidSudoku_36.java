package com.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {

    Set<Character> validValues = new HashSet<>();

    private void init() {
        validValues.add('9');
        validValues.add('8');
        validValues.add('7');
        validValues.add('6');
        validValues.add('5');
        validValues.add('4');
        validValues.add('3');
        validValues.add('2');
        validValues.add('1');
    }

    public boolean isValidSudoku(char[][] board) {
        boolean isValidRow = validRow(board.length, board);
        if(!isValidRow) {
            return false;
        }
        boolean isValidColumn = validColumn(board[board.length - 1].length, board);
        if(!isValidColumn) {
            return false;
        }
        int sizeSubBox = 3;
        for(int i = 0; i < board.length; i += sizeSubBox ) {
            for(int j = 0; j < board[i].length; j += sizeSubBox ) {
                if(!validateSubBox(board, i, j, sizeSubBox)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validateSubBox(char[][] board, int i, int j, int sizeSubBox) {
        Set<Character> travel = new HashSet<>();
        for(int k = i; k < i + sizeSubBox; k++) {
            for(int z = j; z < j + sizeSubBox; z++) {
                char cellValue = board[k][z];
                if(isCellValueInvalid(cellValue)) {
                    continue;
                }
                if(travel.contains(cellValue)) {
                    return false;
                }
                travel.add(cellValue);
            }
        }
        return true;
    }

    private boolean validColumn(int numberColumn, char[][] board) {
        for(int i = 0; i < numberColumn; i++) {
            Set<Character> travel = new HashSet<>();
            for(int j = 0; j < numberColumn; j++) {
                char cellValue = board[j][i];
                System.out.println(cellValue);
                if(isCellValueInvalid(cellValue)) {
                    continue;
                }
                if(travel.contains(cellValue)) {
                    return false;
                }
                travel.add(cellValue);
            }
        }
        return true;
    }

    private boolean validRow(int numberRow, char[][] board) {
        Set<Character> travel = new HashSet<>();
        for(int i = 0; i < numberRow; i++) {
            travel.clear();
            for(int j = 0; j < board[i].length; j++) {
                if(isCellValueInvalid(board[i][j])) {
                    continue;
                }
                if(travel.contains(board[i][j])) {
                    return false;
                }
                travel.add(board[i][j]);
            }
        }
        return true;
    }

    private boolean isCellValueInvalid(char value) {
        return !validValues.contains(value);
    }

}
