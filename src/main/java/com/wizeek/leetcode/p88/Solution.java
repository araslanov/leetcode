package com.wizeek.leetcode.p88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (nums2[i] > nums1[j] && j < m + i) {
                j++;
            }
            for (int k = m - 1 + i; k >= j; k--) {
                nums1[k + 1] = nums1[k];
            }
            nums1[j] = nums2[i];
        }
    }
}
