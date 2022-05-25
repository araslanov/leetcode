package com.wizeek.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution1560_2 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int last = rounds[rounds.length - 1];
        TreeSet<Integer> most = new TreeSet<>();
        most.add(start);
        while (last != start) {
            most.add(last);
            last--;
            if (last == 0) {
                last = n;
            }
        }
        return new ArrayList<>(most);
    }
}
