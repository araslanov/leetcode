package com.wizeek.leetcode.p88;

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m - 1;
        int k = m + n - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && nums2[i] < nums1[j]) {
                nums1[k--] = nums1[j];
                j--;
            }
            nums1[k] = nums2[i];
            k--;
        }
    }
}
