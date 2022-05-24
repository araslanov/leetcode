package com.wizeek.leetcode;

public class Solution1009_3 {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int remaining = n;
        int mask = 1;
        while (remaining != 0) {
            n ^= mask;
            remaining >>= 1;
            mask <<= 1;
        }
        return n;
    }
}
