package com.wizeek.leetcode;

public class Solution1010_2 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] modulo = new int[60];
        for (int t : time) {
            modulo[t % 60]++;
        }
        int result = 0;
        for (int i = 1; i < 30; i++) {
            result += modulo[i] * modulo[60 - i];
        }
        result += (int) ((long) modulo[0] * (modulo[0] - 1) / 2);
        result += (int) ((long) modulo[30] * (modulo[30] - 1) / 2);
        return result;
    }
}
