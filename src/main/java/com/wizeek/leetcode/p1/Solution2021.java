package com.wizeek.leetcode.p1;

import java.util.HashMap;
import java.util.Map;

public class Solution2021 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer existingIndex = indexMap.get(nums[i]);
            if (existingIndex == null) {
                indexMap.put(nums[i], i);
            } else {
                if (nums[i] * 2 == target) {
                    return new int[]{existingIndex, i};
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            Integer otherIndex = indexMap.get(other);
            if (otherIndex != null && otherIndex != i) {
                return new int[]{i, otherIndex};
            }
        }
        return new int[]{0, 0};
    }
}
