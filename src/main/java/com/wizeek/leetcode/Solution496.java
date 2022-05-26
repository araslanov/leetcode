package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> pos2 = new HashMap<>(nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            pos2.put(nums2[i], i);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int pos = pos2.get(nums1[i]);
            int greater = -1;
            int j = pos + 1;
            while (j < nums2.length) {
                if (nums2[j] > nums1[i]) {
                    greater = nums2[j];
                    break;
                }
                j++;
            }
            result[i] = greater;
        }
        return result;
    }
}
