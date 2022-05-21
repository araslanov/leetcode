package com.wizeek.leetcode;

public class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int result = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }
}
