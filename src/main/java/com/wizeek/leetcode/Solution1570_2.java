package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1570_2 {
    final Map<Integer, Integer> map = new HashMap<>();

    Solution1570_2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                map.put(i, nums[i]);
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(Solution1570_2 vec) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            Integer other = vec.map.get(key);
            if (other != null) {
                sum += entry.getValue() * other;
            }
        }
        return sum;
    }
}
