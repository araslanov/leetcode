package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution253_2 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
        int maxRoom = 0;
        PriorityQueue<int[]> times = new PriorityQueue<>((int[] a, int[] b) -> Integer.compare(a[1], b[1]));
        for (int[] in : intervals) {
            if (times.isEmpty()) {
                times.offer(new int[]{maxRoom, in[1]});
                maxRoom++;
                continue;
            }
            int[] earliest = times.poll();
            if (in[0] >= earliest[1]) {
                earliest[1] = in[1];
                times.offer(earliest);
            } else {
                times.offer(earliest);
                times.offer(new int[]{maxRoom, in[1]});
                maxRoom++;
            }
        }
        return maxRoom;
    }
}
