package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution973_2 {
    private int[][] points;

    public int[][] kClosest(int[][] points, int k) {
        this.points = points;
        quickSelect(k);
        return Arrays.copyOf(points, k);
    }

    private void quickSelect(int k) {
        int left = 0;
        int right = points.length - 1;
        int pivot = -1;
        while (pivot != k - 1) {
            pivot = partition(left, right);
            if (pivot < k - 1) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
    }

    private int partition(int left, int right) {
        int pivotIndex = left;
        int[] pivotValue = points[pivotIndex];
        int prev = right;
        for (int i = right; i >= left; i--) {
            if (distance(pivotValue) < distance(points[i])) {
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

    private int distance(int[] a) {
        return a[0] * a[0] + a[1] * a[1];
    }
}
