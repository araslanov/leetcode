package com.wizeek.leetcode;

public class Solution921 {
    public int minAddToMakeValid(String s) {
        int result = 0;
        int score = 0;
        if (s.charAt(0) == '(') {
            score++;
        } else {
            result++;
        }
        int n = s.length();
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (c == '(') {
                if (prev == ')') {
                    score = score > 0 ? score + 1 : 1;
                } else {
                    score++;
                }
            } else {
                score--;
                if (score < 0) {
                    result++;
                }
            }
        }
        if (score > 0) {
            result += score;
        }
        return result;
    }
}
