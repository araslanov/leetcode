package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution1560_2 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int last = rounds[rounds.length - 1];
        boolean[] visits = new boolean[n];
        visits[start - 1] = true;
        while (last != start) {
            visits[last - 1] = true;
            last--;
            if (last == 0) {
                last = n;
            }
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (visits[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
