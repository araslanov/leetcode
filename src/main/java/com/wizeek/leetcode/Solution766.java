package com.wizeek.leetcode;

public class Solution766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 1 || n == 1) {
            return true;
        }
        for (int k = 0; k < m; k++) {
            int i = k;
            int j = 0;
            int base = matrix[i][j];
            while (++i < m && ++j < n) {
                if (matrix[i][j] != base) {
                    return false;
                }
            }
        }
        for (int k = 1; k < n; k++) {
            int i = 0;
            int j = k;
            int base = matrix[i][j];
            while (++i < m && ++j < n) {
                if (matrix[i][j] != base) {
                    return false;
                }
            }
        }
        return true;
    }
}
