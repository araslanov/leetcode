package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        int count = 0;
        for (int num : nums) {
            total += num;
        }
        if (total == k) {
            count++;
        }
        Map<Sub, Integer> sums = new HashMap<>();
        sums.put(new Sub(0, n - 1), total);
        for (int del = 1; del < n; del++) {
            for (int i = 0; i <= del; i++) {
                if (i == 0) {
                    int prevSum = sums.get(new Sub(i, n - del));
                    int sum = prevSum - nums[n - del];
                    sums.put(new Sub(i, n - del - 1), sum);
                    if (sum == k) {
                        count++;
                    }
                } else {
                    int prevSum = sums.get(new Sub(i - 1, n - 1 - del + i));
                    int sum = prevSum - nums[i - 1];
                    sums.put(new Sub(i, n - 1 - del + i), sum);
                    if (sum == k) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static class Sub {
        int start;
        int end;

        Sub(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Sub)) {
                return false;
            }
            return start == ((Sub) o).start && end == ((Sub) o).end;
        }

        @Override
        public int hashCode() {
            return (start + end) % 2089;
        }
    }
}
