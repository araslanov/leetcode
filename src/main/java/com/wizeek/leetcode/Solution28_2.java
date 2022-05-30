package com.wizeek.leetcode;

public class Solution28_2 {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if (n > h) {
            return -1;
        }
        for (int i = 0; i < h - n + 1; i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            boolean mismatch = false;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    mismatch = true;
                    break;
                }
            }
            if (!mismatch) {
                return i;
            }
        }
        return -1;
    }
}
