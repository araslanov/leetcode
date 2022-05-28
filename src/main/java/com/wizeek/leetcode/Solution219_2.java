package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution219_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
