package com.wizeek.leetcode.p1046;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }
        int larger = 0;
        int smaller = 0;
        while (queue.size() > 1) {
            larger = queue.poll();
            smaller = queue.poll();
            int diff = larger - smaller;
            if (diff > 0) {
                queue.add(diff);
            }
        }
        return queue.size() == 0 ? 0 : queue.poll();
    }
}
