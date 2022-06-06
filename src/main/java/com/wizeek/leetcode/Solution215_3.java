package com.wizeek.leetcode;

public class Solution215_3 {
    private int[] nums;

    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;
        return selectQuick(0, n - 1, n - k);
    }

    private int selectQuick(int left, int right, int k) {
        int pivotI = partition(left, right);
        if (k == pivotI) {
            return nums[k];
        } else if (k > pivotI) {
            return selectQuick(pivotI + 1, right, k);
        } else {
            return selectQuick(left, pivotI - 1, k);
        }
    }

    private int partition(int left, int right) {
        int pivot = nums[left];
        int prevI = right;
        for (int i = right; i >= left; i--) {
            if (nums[i] > pivot) {
                swap(i, prevI);
                prevI--;
            }
        }
        swap(left, prevI);
        return prevI;
    }

    private void swap(int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
