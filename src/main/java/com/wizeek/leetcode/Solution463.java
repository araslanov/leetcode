package com.wizeek.leetcode;

public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                if (i - 1 < 0 || grid[i - 1][j] == 0) {
                    result++;
                }
                if (j + 1 > m - 1 || grid[i][j + 1] == 0) {
                    result++;
                }
                if (i + 1 > n - 1 || grid[i + 1][j] == 0) {
                    result++;
                }
                if (j - 1 < 0 || grid[i][j - 1] == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
