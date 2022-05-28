package com.wizeek.leetcode;

public class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int i = 1;
        while (i <= n / 2) {
            if (arr[i] <= arr[i - 1]) {
                return i - 1;
            }
            if (arr[n - i - 2] <= arr[n - i - 1]) {
                return n - i - 1;
            }
            i++;
        }
        return -1;
    }
}
