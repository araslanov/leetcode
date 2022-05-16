package com.wizeek.leetcode.p1046;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        int[] weights = new int[1000];
        for (int stone : stones) {
            weights[stone - 1]++;
        }
        int larger = 0;
        int smaller = 0;
        int i = 999;
        int j = 0;
        while (i >= 0) {
            if (weights[i] == 0) {
                i--;
            } else {
                larger = i + 1;
                weights[i]--;
                j = i;
                while (j >= 0) {
                    if (weights[j] == 0) {
                        j--;
                    } else {
                        smaller = j + 1;
                        weights[j]--;
                        break;
                    }
                }
                if (j < 0) {
                    return i + 1;
                }
                int diff = larger - smaller;
                if (diff > 0) {
                    weights[diff - 1]++;
                }
            }
        }
        return 0;
    }
}
