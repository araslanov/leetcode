package com.wizeek.leetcode.p13;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    result--;
                } else {
                    result++;
                }
            }
            if (s.charAt(i) == 'V') {
                result += 5;
            }
            if (s.charAt(i) == 'X') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    result -= 10;
                } else {
                    result += 10;
                }
            }
            if (s.charAt(i) == 'L') {
                result += 50;
            }
            if (s.charAt(i) == 'C') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    result -= 100;
                } else {
                    result += 100;
                }
            }
            if (s.charAt(i) == 'D') {
                result += 500;
            }
            if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
