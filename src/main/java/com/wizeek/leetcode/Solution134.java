package com.wizeek.leetcode;

public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int diff = gas[i] - cost[i];
            if (diff < 0) {
                i++;
                continue;
            }
            boolean fail = false;
            for (int j = i + 1; j < i + n; j++) {
                int k = j % n;
                diff += gas[k] - cost[k];
                if (diff < 0) {
                    fail = true;
                    i = j;
                    break;
                }
            }
            if (!fail) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
