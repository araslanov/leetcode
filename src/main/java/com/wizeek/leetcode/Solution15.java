package com.wizeek.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
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
        Set<Triplet> draft = new HashSet<>();
        for (int i = 0; i < n; i++) {
            List<int[]> pairs = map.get(-nums[i]);
            if (pairs == null) {
                continue;
            }
            for (int[] pair : pairs) {
                if (pair[0] == i || pair[1] == i) {
                    continue;
                }
                draft.add(new Triplet(nums[i], nums[pair[0]], nums[pair[1]]));
            }
        }
        return draft.stream().map(triplet -> {
            List<Integer> list = new ArrayList<>(3);
            list.add(triplet.a);
            list.add(triplet.b);
            list.add(triplet.c);
            return list;
        }).collect(Collectors.toList());
    }

    private static class Triplet implements Comparable<Triplet> {
        int a;
        int b;
        int c;

        Triplet(int a, int b, int c) {
            this.a = Math.min(a, Math.min(b, c));
            this.c = Math.max(a, Math.max(b, c));
            this.b = a + b + c - this.a - this.c;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Triplet)) {
                return false;
            }
            return a == ((Triplet) other).a && b == ((Triplet) other).b && c == ((Triplet) other).c;
        }

        @Override
        public int hashCode() {
            return (a + b + c) % 2089;
        }

        @Override
        public int compareTo(Triplet other) {
            int diff = Integer.compare(a, other.a);
            if (diff != 0) {
                return diff;
            }
            diff = Integer.compare(b, other.b);
            if (diff != 0) {
                return diff;
            }
            return Integer.compare(c, other.c);
        }
    }
}
