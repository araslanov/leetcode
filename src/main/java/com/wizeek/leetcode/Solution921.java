package com.wizeek.leetcode;

public class Solution921 {
    public int minAddToMakeValid(String s) {
        int result = 0;
        int score = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                score++;
            } else {
                score--;
                if (score < 0) {
                    result++;
                    score++;
                }
            }
        }
        return result + score;
    }
}
