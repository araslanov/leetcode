package com.wizeek.leetcode.p1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2018 {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        int i = 0;
        int j = 0;
        for (; i < sorted.length; i++) {
            if ((j = findMatch(target, sorted, i, i + 1, sorted.length)) > 0) {
                break;
            }
        }
        int[] indexes = findIndexes(nums, sorted[i], sorted[j]);
        Arrays.sort(indexes);
        return indexes;
    }

    int findMatch(int target, int[] sortedNums, int first, int start, int end) {
        if (start == end) {
            return 0;
        }
        int firstNumber = sortedNums[first];

        int probeIndex = (start + end) / 2;
        int secondNumber = sortedNums[probeIndex];

        int sum = firstNumber + secondNumber;
        if (sum == target) {
            return probeIndex;
        } else if (sum > target){
            return findMatch(target, sortedNums, first, start, probeIndex);
        } else {
            return findMatch(target, sortedNums, first, probeIndex + 1, end);
        }
    }

    int[] findIndexes(int[] nums, int lesser, int greater) {
        int i = 0;
        int j = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == lesser) {
                break;
            }
        }
        for (j = 0; j < nums.length; j++) {
            if (nums[j] == greater && j != i) {
                break;
            }
        }
        return new int[]{i, j};
    }
}