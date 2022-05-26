package com.wizeek.leetcode;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            int num1 = nums1[j];
            int i = 0;
            while (num1 != nums2[i]) {
                i++;
            }
            int greater = -1;
            while (i + 1 < m) {
                if (nums2[i + 1] > num1) {
                    greater = nums2[i + 1];
                    break;
                }
                i++;
            }
            result[j] = greater;
        }
        return result;
    }
}
