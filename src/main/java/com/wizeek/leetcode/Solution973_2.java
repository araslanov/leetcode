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
        int pivot = points.length;
        while (pivot != k) {
            pivot = partition(left, right);
            if (pivot < k) {
                left = pivot;
            } else {
                right = pivot - 1;
            }
        }
    }

    private int partition(int left, int right) {
        int pivotIndex = left + (right - left) / 2;
        int[] pivotValue = points[pivotIndex];
        int pivotDist = distance(pivotValue);
        while (left < right) {
            if (distance(points[left]) >= pivotDist) {
                swap(left, right);
                right--;
            } else {
                left++;
            }
        }
        if (distance(points[left]) < pivotDist) {
            left++;
        }
        return left;
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
