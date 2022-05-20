package com.wizeek.leetcode;

public class Solution509_2 {
    private final int[] cache = new int[30];

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = 0;
        if (cache[n - 1] > 0) {
            prev = cache[n - 1];
        } else {
            prev = fib(n - 1);
            cache[n - 1] = prev;
        }
        return prev + cache[n - 2];
    }
}
