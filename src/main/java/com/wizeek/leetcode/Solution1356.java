package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Comparator.comparingInt(Integer::bitCount).thenComparingInt(a -> a));
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}
