package com.wizeek.leetcode;

import java.util.*;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        int n = nums.length;
        if (n < 3) {
            return result;
        }
        int[][] sums = new int[n][n];
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j] = nums[i] + nums[j];
                if (i != j) {
                    int key = sums[i][j];
                    List<int[]> pairs = map.get(key);
                    if (pairs == null) {
                        pairs = new LinkedList<>();
                    }
                    pairs.add(new int[]{i, j});
                    map.put(key, pairs);
                }
            }
        }
        LinkedList<List<Integer>> draft = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            List<int[]> pairs = map.get(-nums[i]);
            if (pairs == null) {
                continue;
            }
            for (int[] pair : pairs) {
                if (pair[0] == i || pair[1] == i) {
                    continue;
                }
                List<Integer> list = new ArrayList<>(3);
                list.add(nums[i]);
                list.add(nums[pair[0]]);
                list.add(nums[pair[1]]);
                Collections.sort(list);
                draft.add(list);
            }
        }
        if (draft.isEmpty()) {
            return draft;
        }
        Collections.sort(draft, Comparator.comparingInt((List<Integer> list) -> list.get(0)).thenComparingInt(
                list -> list.get(1)).thenComparingInt(list -> list.get(2)));
        result.add(draft.pollFirst());
        while (!draft.isEmpty()) {
            List<Integer> list = draft.pollFirst();
            List<Integer> prev = result.peekLast();
            for (int i = 0; i < 3; i++) {
                if (list.get(i) != prev.get(i)) {
                    result.add(list);
                    break;
                }
            }
        }
        return result;
    }
}
