package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n = aliceSizes.length;
        int m = bobSizes.length;
        int[] small = aliceSizes;
        int[] big = bobSizes;
        boolean swap = n > m;
        if (swap) {
            small = bobSizes;
            big = aliceSizes;
        }
        int smallSum = 0;
        int bigSum = 0;
        for (int i : small) {
            smallSum += i;
        }
        Set<Integer> bigNumbers = new HashSet<>();
        for (int i : big) {
            bigSum += i;
            bigNumbers.add(i);
        }
        int halfDiff = (bigSum - smallSum) / 2;
        for (int i : small) {
            int match = i + halfDiff;
            if (bigNumbers.contains(match)) {
                return swap ? new int[]{match, i} : new int[]{i, match};
            }
        }
        return new int[]{};
    }
}
