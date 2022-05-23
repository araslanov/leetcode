package com.wizeek.leetcode;

public class Solution1009 {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 0;
        int i = 0;
        while (n > 0) {
            result += (1 - n % 2) * Math.pow(2, i++);
            n /= 2;
        }
        return result;
    }
}
