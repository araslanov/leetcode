package com.wizeek.leetcode.p1260;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (k == 0) {
            return convertArrayToList(grid);
        }
        Queue<Integer> buffer = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = grid[i][j];
                int nextLinearIndex = (i * n + j + k) % (m * n);
                int newI = nextLinearIndex / n;
                int newJ = nextLinearIndex % n;
                if (buffer.size() == k % (m * n)) {
                    buffer.offer(grid[newI][newJ]);
                    int newValue = buffer.poll();
                    grid[newI][newJ] = newValue;
                } else {
                    buffer.offer(grid[newI][newJ]);
                    grid[newI][newJ] = currentValue;
                }
            }
        }
        return convertArrayToList(grid);
    }

    private static List<List<Integer>> convertArrayToList(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> result = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<Integer>(n);
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
            result.add(list);
        }
        return result;
    }
}
