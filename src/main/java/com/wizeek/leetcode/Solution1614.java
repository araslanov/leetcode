package com.wizeek.leetcode;

public class Solution1614 {
    public int maxDepth(String s) {
        int n = s.length();
        int score = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                score++;
                max = Math.max(max, score);
            } else if (c == ')') {
                score--;
            }
        }
        return max;
    }
}
