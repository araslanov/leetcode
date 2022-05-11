package com.wizeek.leetcode.p1710;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] boxes = new int[1000];
        int result = 0;
        int maxCapacity = 0;
        for (int[] boxType : boxTypes) {
            boxes[boxType[1] - 1] += boxType[0];
            if (maxCapacity < boxType[1]) {
                maxCapacity = boxType[1];
            }
        }
        for (int i = maxCapacity - 1; i >= 0; i--) {
            int maxOfThisType = Math.min(truckSize, boxes[i]);
            result += maxOfThisType * (i + 1);
            truckSize -= maxOfThisType;
            if (truckSize == 0) {
                break;
            }
        }
        return result;
    }
}
