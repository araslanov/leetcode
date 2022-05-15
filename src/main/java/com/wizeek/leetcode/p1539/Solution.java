package com.wizeek.leetcode.p1539;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingNumberCount = 0;
        int previousNumber = 0;
        for (int number : arr) {
            if (number - previousNumber > 1) {
                int missingNumbers = number - previousNumber - 1;
                if (missingNumbers + missingNumberCount >= k) {
                    return previousNumber + k - missingNumberCount;
                } else {
                    missingNumberCount += missingNumbers;
                }
            }
            previousNumber = number;
        }
        return arr[arr.length - 1] + k - missingNumberCount;
    }
}
