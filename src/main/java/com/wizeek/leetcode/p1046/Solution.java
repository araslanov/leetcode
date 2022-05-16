package com.wizeek.leetcode.p1046;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length < 2) {
            return stones[0];
        }
        TreeMap<Integer, Integer> stoneToCount = new TreeMap<>();
        for (int stone : stones) {
            stoneToCount.put(stone, stoneToCount.getOrDefault(stone, 0) + 1);
        }
        Integer smaller;
        Integer larger;
        while (stoneToCount.size() > 1) {
            Map.Entry<Integer, Integer> lastEntry = stoneToCount.pollLastEntry();
            larger = lastEntry.getKey();
            if (lastEntry.getValue() == 1) {
                Map.Entry<Integer, Integer> secondToLastEntry = stoneToCount.pollLastEntry();
                smaller = secondToLastEntry.getKey();
                if (secondToLastEntry.getValue() > 1) {
                    stoneToCount.put(secondToLastEntry.getKey(), secondToLastEntry.getValue() - 1);
                }
            } else if (lastEntry.getValue() == 2) {
                smaller = larger;
            } else {
                smaller = larger;
                stoneToCount.put(lastEntry.getKey(), lastEntry.getValue() - 2);
            }
            int diff = larger - smaller;
            if (diff > 0) {
                stoneToCount.put(diff, stoneToCount.getOrDefault(diff, 0) + 1);
            }
        }
        if (stoneToCount.size() == 0) {
            return 0;
        }
        Map.Entry<Integer, Integer> lastEntry = stoneToCount.pollLastEntry();
        return lastEntry.getValue() % 2 == 0 ? 0 : lastEntry.getKey();
    }
}
