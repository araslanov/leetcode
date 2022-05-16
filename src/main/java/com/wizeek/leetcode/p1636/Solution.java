package com.wizeek.leetcode.p1636;

import java.util.TreeSet;

public class Solution {
    public int[] frequencySort(int[] nums) {
        TreeSet[] numberByReps = new TreeSet[101];
        int[] repsByNumber = new int[201];
        for (int num : nums) {
            int reps = ++repsByNumber[num + 100];
            if (numberByReps[reps] == null) {
                numberByReps[reps] = new TreeSet<>();
            }
            numberByReps[reps].add(num);
            if (reps - 1 > 0) {
                numberByReps[reps - 1].remove(num);
            }
        }
        int k = 0;
        for (int i = 1; i < numberByReps.length; i++) {
            TreeSet<Integer> numbers = numberByReps[i];
            if (numbers != null && numbers.size() > 0) {
                while (numbers.size() > 0) {
                    int number = numbers.pollLast();
                    for (int j = 0; j < i; j++) {
                        nums[k++] = number;
                    }
                }
            }
            if (k == nums.length) {
                break;
            }
        }
        return nums;
    }
}
