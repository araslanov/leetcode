package com.wizeek.leetcode;

public class Solution278 {
    private final int badVersion;

    Solution278(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            boolean isBad = isBadVersion(middle);
            if (isBad) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return version == badVersion;
    }
}
