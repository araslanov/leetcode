package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int c) {
        int b = image[sr][sc];
        if (b == c) {
            return image;
        }
        int n = image.length;
        int m = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] ij = queue.poll();
            int i = ij[0];
            int j = ij[1];
            image[i][j] = c;
            if (i - 1 >= 0 && image[i - 1][j] == b) {
                image[i - 1][j] = -1;
                queue.offer(new int[]{i - 1, j});
            }
            if (i + 1 < n && image[i + 1][j] == b) {
                image[i + 1][j] = -1;
                queue.offer(new int[]{i + 1, j});
            }
            if (j - 1 >= 0 && image[i][j - 1] == b) {
                image[i][j - 1] = -1;
                queue.offer(new int[]{i, j - 1});
            }
            if (j + 1 < m && image[i][j + 1] == b) {
                image[i][j + 1] = -1;
                queue.offer(new int[]{i, j + 1});
            }
        }
        return image;
    }
}
