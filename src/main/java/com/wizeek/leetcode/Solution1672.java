package com.wizeek.leetcode;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int max = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = 0;
            for (int j = 0; j < m; j++) {
                current += accounts[i][j];
            }
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}
