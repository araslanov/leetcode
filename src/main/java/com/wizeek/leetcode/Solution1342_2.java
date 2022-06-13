package com.wizeek.leetcode;

public class Solution1342_2 {
    public int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            result++;
        }
        return result;
    }
}
