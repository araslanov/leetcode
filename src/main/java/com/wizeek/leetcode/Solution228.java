package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        int n = nums.length;
        if (n == 0) {
            return result;
        }
        int start = nums[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int current = nums[i];
            int previous = nums[i - 1];
            if (current > previous + 1) {
                if (previous > start) {
                    sb = new StringBuilder();
                    sb.append(start);
                    sb.append("->");
                    sb.append(previous);
                    result.add(sb.toString());
                } else {
                    result.add(String.valueOf(start));
                }
                start = nums[i];
            }
        }
        sb = new StringBuilder();
        sb.append(start);
        if (nums[n - 1] > start) {
            sb.append("->");
            sb.append(nums[n - 1]);
        }
        result.add(sb.toString());
        return result;
    }
}
