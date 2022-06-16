package com.wizeek.leetcode;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quicksort(int[] arr, int left, int right) {
        int pivotIndex = partition(arr, left, right);
        if (pivotIndex > left) {
            quicksort(arr, left, pivotIndex - 1);
        }
        if (pivotIndex < right) {
            quicksort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
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
