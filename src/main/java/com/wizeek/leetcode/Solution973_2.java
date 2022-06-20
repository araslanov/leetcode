package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution973_2 {
    private int[][] points;

    public int[][] kClosest(int[][] points, int k) {
        this.points = points;
        quickSelect(0, points.length - 1, k);
        return Arrays.copyOf(points, k);
    }

    private void quickSelect(int left, int right, int k) {
        int pivot = partition(left, right);
        if (pivot == k - 1) {
            return;
        } else if (pivot < k - 1) {
            quickSelect(pivot + 1, right, k);
        } else {
            quickSelect(left, pivot - 1, k);
        }
    }

    private int partition(int left, int right) {
        int pivotIndex = left;
        int[] pivotValue = points[pivotIndex];
        int prev = right;
        for (int i = right; i >= left; i--) {
            if (compare(pivotValue, points[i]) < 0) {
                swap(prev, i);
                prev--;
            }
        }
        swap(pivotIndex, prev);
        return prev;
    }

    private void swap(int i, int j) {
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    private int compare(int[] a, int[] b) {
        return Integer.compare(a[0] * a[0] + a[1] * a[1], b[0] * b[0] + b[1] * b[1]);
    }
}
