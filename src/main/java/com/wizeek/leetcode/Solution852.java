package com.wizeek.leetcode;

public class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                return i - 1;
            }
        }
        return -1;
    }
}
