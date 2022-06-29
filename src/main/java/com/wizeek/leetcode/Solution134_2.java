package com.wizeek.leetcode;

public class Solution134_2 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int current = 0;
        int diff = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            diff = gas[i] - cost[i];
            total += diff;
            current += diff;
            if (current < 0) {
                current = 0;
                start = i + 1;
            }
        }
        return total < 0 ? -1 : start;
    }
}
