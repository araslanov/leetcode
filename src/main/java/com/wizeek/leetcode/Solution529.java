package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int n = board.length;
        int m = board[0].length;
        int i = click[0];
        int j = click[1];
        if (board[i][j] == 'M') {
            board[i][j] = 'X';
            return board;
        }
        int[] iShift = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int[] jShift = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(click);
        while (!queue.isEmpty()) {
            int[] ij = queue.poll();
            i = ij[0];
            j = ij[1];
            int mines = 0;
            List<int[]> neighbors = new LinkedList<>();
            for (int k = 0; k < 8; k++) {
                int i1 = i + iShift[k];
                int j1 = j + jShift[k];
                if (i1 < 0 || i1 == n || j1 < 0 || j1 == m) {
                    continue;
                }
                char c = board[i1][j1];
                if (c == 'M') {
                    mines++;
                } else if (c == 'E') {
                    neighbors.add(new int[]{i1, j1});
                }
            }
            board[i][j] = mines == 0 ? 'B' : (char) ('0' + mines);
            if (board[i][j] == 'B') {
                for (int[] xy : neighbors) {
                    board[xy[0]][xy[1]] = 'T';
                    queue.offer(xy);
                }
            }
        }
        return board;
    }
}
