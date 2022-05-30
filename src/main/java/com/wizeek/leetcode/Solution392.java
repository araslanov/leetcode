package com.wizeek.leetcode;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n > m) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (t.charAt(j) != s.charAt(i)) {
                j++;
                continue;
            }
            i++;
            j++;
        }
        return i >= n;
    }
}
