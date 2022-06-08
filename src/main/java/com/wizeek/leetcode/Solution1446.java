package com.wizeek.leetcode;

public class Solution1446 {
    public int maxPower(String s) {
        int max = 1;
        int n = s.length();
        int current = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }
        return max;
    }
}
