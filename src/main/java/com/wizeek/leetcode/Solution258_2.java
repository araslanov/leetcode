package com.wizeek.leetcode;

public class Solution258_2 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        String s = Integer.toString(num);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return addDigits(sum);
    }
}
