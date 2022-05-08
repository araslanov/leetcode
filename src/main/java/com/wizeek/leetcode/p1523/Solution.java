package com.wizeek.leetcode.p1523;

public class Solution {
    public int countOdds(int low, int high) {
        int result = 0;
        int start = low;
        int end = high;
        if (low % 2 > 0) {
            result++;
            start = low + 1;
        }
        if (high % 2 == 0) {
            end--;
        }
        return result + (end - start + 1) / 2;
    }
}
