package com.wizeek.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution496_2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(nums2.length);
        Deque<Integer> stack = new LinkedList<>();
        for (int num : nums2) {
            if (stack.isEmpty()) {
                stack.addFirst(num);
                continue;
            }
            while (stack.peekFirst() != null && stack.peekFirst() < num) {
                int prev = stack.pollFirst();
                map.put(prev, num);
            }
            stack.addFirst(num);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pollFirst(), -1);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
