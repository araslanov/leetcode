package com.wizeek.leetcode;

import java.util.Random;

public class Solution528 {
    private final int[] sums;
    private int sum;

    public Solution528(int[] w) {
        int n = w.length;
        sums = new int[n];
        for (int i = 0; i < n; i++) {
            sum += w[i];
            sums[i] = sum;
        }
    }

    public int pickIndex() {
        int r = new Random().nextInt(sum);
        return binarySearch(r);
    }

    private int binarySearch(int r) {
        int left = 0;
        int right = sums.length;
        while (left < right) {
            int pivot = left + (right - left) / 2;
            int value = sums[pivot];
            if (value == r) {
                return pivot + 1;
            } else if (value < r) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }
        return right;
    }
}
