package com.wizeek.leetcode.p217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                return true;
            } else {
                numMap.put(num, true);
            }
        }
        return false;
    }
}
