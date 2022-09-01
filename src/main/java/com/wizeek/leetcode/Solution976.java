package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution976 {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        nums = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        for (int i = 0; i < n - 2; i++) {
            if (nums[i + 1] + nums[i + 2] > nums[i]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }
}
