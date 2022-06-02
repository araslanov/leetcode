package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    markIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    private void markIsland(char[][] grid, int i0, int j0) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> same = new LinkedList<>();
        same.offer(new int[]{i0, j0});
        while (!same.isEmpty()) {
            int[] ij = same.poll();
            int i = ij[0];
            int j = ij[1];
            grid[i][j] = '3';
            if (i - 1 >= 0 && grid[i - 1][j] == '1') {
                grid[i - 1][j] = '2';
                same.offer(new int[]{i - 1, j});
            }
            if (i + 1 < n && grid[i + 1][j] == '1') {
                grid[i + 1][j] = '2';
                same.offer(new int[]{i + 1, j});
            }
            if (j - 1 >= 0 && grid[i][j - 1] == '1') {
                grid[i][j - 1] = '2';
                same.offer(new int[]{i, j - 1});
            }
            if (j + 1 < m && grid[i][j + 1] == '1') {
                grid[i][j + 1] = '2';
                same.offer(new int[]{i, j + 1});
            }
        }
    }
}
