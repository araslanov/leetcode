package com.wizeek.leetcode.p680;

public class Solution {
    public boolean validPalindrome(String s) {
        int size = s.length();
        if (size < 2) {
            return true;
        }
        int i = 0;
        int j = size - 1;
        boolean leftTry = false;
        boolean rightTry = false;
        int iStart = 0;
        int jStart = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            }
            if (leftTry && rightTry) {
                return false;
            }
            if (leftTry || rightTry) {
                i = iStart;
                j = jStart;
            }
            if (s.charAt(i + 1) == s.charAt(j) && !leftTry) {
                leftTry = true;
                iStart = i;
                jStart = j;
                i++;
                continue;
            }
            if (s.charAt(i) == s.charAt(j - 1) && !rightTry) {
                rightTry = true;
                iStart = i;
                jStart = j;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }
}
