package com.wizeek.leetcode;

public class Solution69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        return binarySearch(x);
    }

    private int binarySearch(int x) {
        int left = 1;
        int right = x / 2;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle == x / middle) {
                return middle;
            } else if (middle < x / middle) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return right;
    }
}
