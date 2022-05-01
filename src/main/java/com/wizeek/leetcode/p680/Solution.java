package com.wizeek.leetcode.p680;

public class Solution {
    public boolean validPalindrome(String s) {
        int size = s.length();
        if (size < 2) {
            return true;
        }
        int i = 0;
        int j = size - 1;
        boolean deleted = false;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            }
            if (deleted) {
                return false;
            }
            deleted = true;
            if (s.charAt(i + 1) == s.charAt(j)) {
                i++;
                continue;
            }
            if (s.charAt(i) == s.charAt(j - 1)) {
                j--;
                continue;
            }
            return false;
        }
        return true;
    }
}
