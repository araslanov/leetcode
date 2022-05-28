package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            Integer existing = map.get(num);
            if (existing == null) {
                map.put(num, i);
            } else {
                if (i - existing <= k) {
                    return true;
                } else {
                    map.put(num, i);
                }
            }
        }
        return false;
    }
}
