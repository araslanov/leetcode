package com.wizeek.leetcode.p48;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int depth = n / 2;
        for (int d = 0; d < depth; d++) {
            rotateBorder(matrix, d);
        }
    }

    private static void rotateBorder(int[][] matrix, int d) {
        int n = matrix.length;
        int max = n - 2 * d - 1;
        for (int i = 0; i < max; i++) {
            swapFourWay(matrix, d, d + i, d + i, d + max, d + max, d + max - i, d + max - i, d);
        }
    }

    private static void swapFourWay(int[][] matrix, int i1, int j1, int i2, int j2, int i3, int j3, int i4, int j4) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i4][j4];
        matrix[i4][j4] = matrix[i3][j3];
        matrix[i3][j3] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}
