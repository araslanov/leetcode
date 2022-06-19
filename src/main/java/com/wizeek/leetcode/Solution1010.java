package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution1010 {
    public int numPairsDivisibleBy60(int[] time) {
        if (time.length == 1) {
            return 0;
        }
        int n = time.length;
        for (int i = 0; i < n; i++) {
            time[i] %= 60;
        }
        Arrays.sort(time);
        int left = 0;
        int right = n - 1;
        int result = 0;
        while (left < right) {
            int sum = time[left] + time[right];
            if (sum % 60 == 0) {
                if (time[left] == time[right]) {
                    result += (int) (((long) (right - left + 1)) * ((long) (right - left)) / 2);
                    break;
                }
                int leftSame = 1;
                int rightSame = 1;
                while (time[left] == time[left + 1]) {
                    left++;
                    leftSame++;
                }
                while (time[right] == time[right - 1]) {
                    right--;
                    rightSame++;
                }
                result += leftSame * rightSame;
                left++;
                right--;
            } else if (sum < 60) {
                if (time[left] == 0) {
                    long zeros = 1;
                    while (time[left + 1] == 0) {
                        zeros++;
                        left++;
                    }
                    result += (int) (zeros * (zeros - 1) / 2);
                }
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
