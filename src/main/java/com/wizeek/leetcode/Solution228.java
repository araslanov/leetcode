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
        for (int i = 1; i < n; i++) {
            long current = (long) nums[i];
            long previous = (long) nums[i - 1];
            if (current - previous > 1) {
                int range = (int) previous - start;
                if (range > 0) {
                    result.add(start + "->" + previous);
                } else {
                    result.add(start + "");
                }
                start = nums[i];
            }
        }
        result.add(nums[n - 1] - start > 0 ? start + "->" + nums[n - 1] : start + "");
        return result;
    }
}
