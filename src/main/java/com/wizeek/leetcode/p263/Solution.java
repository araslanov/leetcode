package com.wizeek.leetcode.p263;

public class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] primeFactors = new int[]{2, 3, 5};
        int i = 0;
        while (i < primeFactors.length) {
            if (n % primeFactors[i] == 0) {
                n = n / primeFactors[i];
            } else {
                i++;
            }
        }
        return n == 1;
    }
}
