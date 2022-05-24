package com.wizeek.leetcode;

public class Solution1009_3 {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int l = Integer.toBinaryString(n).length();
        int mask = (1 << l) - 1;
        return n ^ mask;
    }
}
