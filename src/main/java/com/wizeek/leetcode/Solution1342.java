package com.wizeek.leetcode;

public class Solution1342 {
    public int numberOfSteps(int num) {
        String binary = Integer.toBinaryString(num);
        int n = binary.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += 1 + (binary.charAt(i) - '0');
        }
        return result - 1;
    }
}
