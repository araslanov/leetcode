package com.wizeek.leetcode.p169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            int newCount = countMap.getOrDefault(num, 0) + 1;
            if (newCount > n / 2) {
                return num;
            }
            countMap.put(num, newCount);
        }
        return 0;
    }
}
