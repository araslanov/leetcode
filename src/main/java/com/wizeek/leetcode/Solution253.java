package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
        Map<Integer, Integer> rooms = new HashMap<>();
        int maxRoom = 0;
        for (int[] in : intervals) {
            boolean found = false;
            for (int i = 0; i < maxRoom && !found; i++) {
                int end = rooms.get(i);
                if (in[0] >= end) {
                    rooms.put(i, in[1]);
                    found = true;
                }
            }
            if (!found) {
                rooms.put(maxRoom, in[1]);
                maxRoom++;
            }
        }
        return maxRoom;
    }
}
