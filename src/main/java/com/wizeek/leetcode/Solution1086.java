package com.wizeek.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution1086 {
    public int[][] highFive(int[][] items) {
        Queue<Integer>[] students = new PriorityQueue[1000];
        int studentCount = 0;
        for (int[] pair : items) {
            int id = pair[0] - 1;
            int score = pair[1];
            if (students[id] == null) {
                students[id] = new PriorityQueue<>();
                studentCount++;
            }
            if (students[id].size() < 5) {
                students[id].offer(score);
            } else {
                if (score > students[id].peek()) {
                    students[id].poll();
                    students[id].offer(score);
                }
            }
        }
        int[][] result = new int[studentCount][2];
        int i = 0;
        int k = 0;
        while (i < 1000 && k < studentCount) {
            Queue<Integer> scores = students[i];
            if (scores != null) {
                int sum = 0;
                for (int j = 0; j < 5; j++) {
                    sum += scores.poll();
                }
                result[k][0] = i + 1;
                result[k][1] = sum / 5;
                k++;
            }
            i++;
        }
        return result;
    }
}
