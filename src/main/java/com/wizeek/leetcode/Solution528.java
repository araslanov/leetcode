package com.wizeek.leetcode;

import java.util.Random;

public class Solution528 {
    private final int[] w;
    private int sum;

    public Solution528(int[] w) {
        this.w = w;
        for (int i : w) {
            sum += i;
        }
    }

    public int pickIndex() {
        int r = new Random().nextInt(sum);
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            if (sum > r) {
                return i;
            }
        }
        return w.length - 1;
    }
}
