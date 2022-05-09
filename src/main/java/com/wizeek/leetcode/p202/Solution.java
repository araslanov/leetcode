package com.wizeek.leetcode.p202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> previousSums = new HashSet<>();
        int sum = getSumOfSquares(n);
        while (sum != 1 && !previousSums.contains(sum)) {
            previousSums.add(sum);
            sum = getSumOfSquares(sum);
        }
        return sum == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
