package com.wizeek.leetcode;

public class Solution79 {
    private char[][] board;
    private String word;
    private int m;
    private int n;
    private int w;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.m = board.length;
        this.n = board[0].length;
        this.w = word.length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean found = find(i, j, 0);
                    if (found) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean find(int i, int j, int k) {
        char c = word.charAt(k);
        if (board[i][j] != c) {
            return false;
        }
        if (k == w - 1) {
            return true;
        }
        board[i][j] = '-';
        if (i - 1 >= 0 && find(i - 1, j, k + 1)) {
            return true;
        }
        if (i + 1 < m && find(i + 1, j, k + 1)) {
            return true;
        }
        if (j - 1 >= 0 && find(i, j - 1, k + 1)) {
            return true;
        }
        if (j + 1 < n && find(i, j + 1, k + 1)) {
            return true;
        }
        board[i][j] = c;
        return false;
    }
}
