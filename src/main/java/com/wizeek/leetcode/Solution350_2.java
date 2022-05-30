package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution350_2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        Map<Integer, Integer> first = new HashMap<>();
        for (int num : nums1) {
            first.put(num, first.getOrDefault(num, 0) + 1);
        }
        LinkedList<Integer> common = new LinkedList<>();
        int count = 0;
        for (int num : nums2) {
            Integer existing = first.get(num);
            if (existing != null && existing > 0) {
                common.add(num);
                first.put(num, existing - 1);
                if (++count == nums1.length) {
                    break;
                }
            }
        }
        int[] result = new int[common.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = common.pollFirst();
        }
        return result;
    }
}
