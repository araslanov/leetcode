package com.wizeek.leetcode;

public class Solution1009_2 {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        String binary = Integer.toBinaryString(n);
        int l = binary.length();
        int result = 0;
        for (int i = 0; i < l; i++) {
            char c = binary.charAt(l - i - 1);
            if (c == '0') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}
