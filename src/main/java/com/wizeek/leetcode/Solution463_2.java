package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution463_2 {
    public int islandPerimeter(int[][] grid) {
        int[] firstCell = getFirstIslandCell(grid);
        Queue<int[]> islandCells = new LinkedList<>();
        islandCells.add(firstCell);
        int result = 0;
        while (islandCells.size() > 0) {
            int[] cell = islandCells.poll();
            int i = cell[0];
            int j = cell[1];
            result += getPerimeter(grid, i, j);
            grid[i][j] = 3; // mark as visited
            addNeighbors(grid, i, j, islandCells);
        }
        return result;
    }

    private int[] getFirstIslandCell(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    private int getPerimeter(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
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
        return result;
    }

    private void addNeighbors(int[][] grid, int i, int j, Queue<int[]> islandCells) {
        int n = grid.length;
        int m = grid[0].length;
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            islandCells.add(new int[]{i - 1, j});
            grid[i - 1][j] = 2; // mark as added
        }
        if (j + 1 < m && grid[i][j + 1] == 1) {
            islandCells.add(new int[]{i, j + 1});
            grid[i][j + 1] = 2;
        }
        if (i + 1 < n && grid[i + 1][j] == 1) {
            islandCells.add(new int[]{i + 1, j});
            grid[i + 1][j] = 2;
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            islandCells.add(new int[]{i, j - 1});
            grid[i][j - 1] = 2;
        }
    }
}
