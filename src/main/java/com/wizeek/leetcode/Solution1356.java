package com.wizeek.leetcode;

public class Solution1356 {
    private int[] arr;

    public int[] sortByBits(int[] arr) {
        this.arr = arr;
        quicksort(0, arr.length - 1);
        return arr;
    }

    private void quicksort(int left, int right) {
        if (left > right) {
            return;
        }
        int pivotIndex = partition(left, right);
        quicksort(left, pivotIndex - 1);
        quicksort(pivotIndex + 1, right);
    }

    private int partition(int left, int right) {
        int pivot = arr[left];
        int prev = right;
        for (int i = right; i >= left; i--) {
            if (compare(arr[i], pivot) > 0) {
                swap(arr, i, prev);
                prev--;
            }
        }
        swap(arr, left, prev);
        return prev;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private int compare(int a, int b) {
        int bitCompare = Integer.bitCount(a) - Integer.bitCount(b);
        return bitCompare == 0 ? a - b : bitCompare;
    }
}
