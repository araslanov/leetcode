package com.wizeek.leetcode.p1;

import java.util.Arrays;

public class Solution2019 {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);

        int[] pair = findThePair(sorted, target);
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pair[0] || nums[i] == pair[1]) {
                result[j++] = i;
                if (j > 1) {
                    return result;
                }
            }
        }
        return new int[]{0, 0};
    }

    private int[] findThePair(int[] sorted, int target) {
        for (int i = 0; i < sorted.length; i++) {
            int current = sorted[i];
            int start = i + 1;
            int end = sorted.length - 1;
            while (end - start >= 0) {
                int probeIndex = (end + start) / 2;
                int probeValue = sorted[probeIndex];
                if (current + probeValue == target) {
                    return new int[]{current, probeValue};
                } else if (current + probeValue > target) {
                    end = probeIndex - 1;
                } else {
                    start = probeIndex + 1;
                }
            }
        }
        return new int[]{0, 0}; // should never get here
    }
}
