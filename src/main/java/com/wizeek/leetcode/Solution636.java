package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<int[]> stack = new LinkedList<>();
        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            int t = Integer.parseInt(parts[2]);
            String s = parts[1];
            int[] prev = stack.pollLast();
            if (s.equals("start")) {
                if (prev == null) {
                    stack.offerLast(new int[]{id, t});
                } else {
                    int prevId = prev[0];
                    result[prevId] += t - prev[1];
                    stack.offerLast(new int[]{prevId, -1});
                    stack.offerLast(new int[]{id, t});
                }
            } else {
                result[id] += t - prev[1] + 1;
                int[] prevprev = stack.pollLast();
                if (prevprev != null) {
                    prevprev[1] = t + 1;
                    stack.offerLast(prevprev);
                }
            }
        }
        return result;
    }
}
