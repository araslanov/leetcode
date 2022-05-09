package com.wizeek.leetcode.p349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstArrayUniqueElements = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1) {
            firstArrayUniqueElements.add(i);
        }
        for (int j : nums2) {
            if (firstArrayUniqueElements.contains(j)) {
                result.add(j);
            }
        }
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
