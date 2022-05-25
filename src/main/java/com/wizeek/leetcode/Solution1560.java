package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int m = rounds.length;
        int[] count = new int[n];
        count[rounds[0] - 1]++;
        int max = 1;
        for (int i = 1; i < m; i++) {
            int start = rounds[i - 1] % n;
            int end = rounds[i] - 1;
            while (start != end) {
                int newMax = ++count[start];
                max = Math.max(max, newMax);
                start = (start + 1) % n;
            }
            int newMax = ++count[start];
            max = Math.max(max, newMax);
        }
        List<Integer> result = new LinkedList();
        for (int i = 0; i < n; i++) {
            if (count[i] == max) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
