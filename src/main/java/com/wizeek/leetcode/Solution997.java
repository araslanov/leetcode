package com.wizeek.leetcode;

public class Solution997 {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }
        int[] trustCount = new int[n];
        boolean[] trustSomeone = new boolean[n];
        int trustOtherCount = 0;
        int candidates = 0;
        int judge = -1;
        for (int[] t : trust) {
            if (!trustSomeone[t[0] - 1]) {
                trustOtherCount++;
                if (trustOtherCount == n) {
                    return -1;
                }
                trustSomeone[t[0] - 1] = true;
            }
            int count = ++trustCount[t[1] - 1];
            if (count == n - 1) {
                judge = t[1];
                candidates++;
            }
        }
        return candidates == 1 && !trustSomeone[judge - 1] ? judge : -1;
    }
}
