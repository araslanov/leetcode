package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1570_3 {
    Queue<int[]> q = new LinkedList<>();

    Solution1570_3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                q.offer(new int[]{i, nums[i]});
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(Solution1570_3 vec) {
        int sum = 0;
        while (!q.isEmpty() && !vec.q.isEmpty()) {
            int[] left = q.peek();
            int[] right = vec.q.peek();
            if (left[0] == right[0]) {
                sum += left[1] * right[1];
                q.poll();
                vec.q.poll();
            } else if (left[0] < right[0]) {
                q.poll();
            } else {
                vec.q.poll();
            }
        }
        return sum;
    }
}
