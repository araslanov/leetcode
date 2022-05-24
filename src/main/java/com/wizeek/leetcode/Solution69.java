package com.wizeek.leetcode;

public class Solution69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int n = 1;
        while (n <= x / n) {
            if (n == x / n) {
                return n;
            }
            n *= 2;
        }
        return binarySearch(x, n);
    }

    private int binarySearch(int x, int n) {
        int left = n / 2;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (middle == x / middle) {
                return middle;
            } else if (middle < x / middle) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left - 1;
    }
}
