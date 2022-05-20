package com.wizeek.leetcode;

public class Solution509_3 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result = 0;
        int prevprev = 0;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            result = prev + prevprev;
            prevprev = prev;
            prev = result;
        }
        return result;
    }
}
