package com.wizeek.leetcode;

public class Solution246 {
    private static final char[] MAP = new char[]{'0', '1', 'x', 'x', 'x', 'x', '9', 'x', '8', '6'};

    public boolean isStrobogrammatic(String num) {
        int n = num.length();
        for (int i = 0; i <= n / 2; i++) {
            char left = num.charAt(i);
            char right = num.charAt(n - 1 - i);
            if (MAP[left - '0'] != right) {
                return false;
            }
        }
        return true;
    }
}
