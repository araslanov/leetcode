package com.wizeek.leetcode.p1260;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> result = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                int shift = m * n - (k % (m * n));
                int newLinearIndex = (i * n + j + shift) % (m * n);
                int newI = newLinearIndex / n;
                int newJ = newLinearIndex % n;
                list.add(grid[newI][newJ]);
            }
            result.add(list);
        }
        return result;
    }
}
