package com.wizeek.leetcode;

public class Solution733_2 {
    private int[][] image;
    int c;
    int b;

    public int[][] floodFill(int[][] image, int sr, int sc, int c) {
        this.image = image;
        this.c = c;
        b = image[sr][sc];
        if (b == c) {
            return image;
        }
        dfs(sr, sc);
        return image;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length) {
            return;
        }
        if (image[i][j] != b) {
            return;
        }
        image[i][j] = c;
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}
