package com.wizeek.leetcode;

public class Solution1275 {
    public String tictactoe(int[][] moves) {
        String[][] board = new String[3][3];
        for (int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = i % 2 == 0 ? "A" : "B";
            if (i > 3) {
                String winner = checkBoard(board);
                if (winner != null) {
                    return winner;
                }
            }
        }
        if (moves.length < 9) {
            return "Pending";
        }
        return "Draw";
    }

    private static String checkBoard(String[][] b) {
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            return b[0][0];
        }
        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            return b[0][2];
        }
        if (b[0][0] == b[0][1] && b[0][1] == b[0][2]) {
            return b[0][0];
        }
        if (b[1][0] == b[1][1] && b[1][1] == b[1][2]) {
            return b[1][0];
        }
        if (b[2][0] == b[2][1] && b[2][1] == b[2][2]) {
            return b[2][0];
        }
        if (b[0][0] == b[1][0] && b[1][0] == b[2][0]) {
            return b[0][0];
        }
        if (b[0][1] == b[1][1] && b[1][1] == b[2][1]) {
            return b[0][1];
        }
        if (b[0][2] == b[1][2] && b[1][2] == b[2][2]) {
            return b[0][2];
        }
        return null;
    }
}
