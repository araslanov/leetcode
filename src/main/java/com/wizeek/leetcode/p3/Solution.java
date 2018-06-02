package com.wizeek.leetcode.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artur on 6/2/2018.
 * n^3
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        List<Character> temp = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            temp.clear();
            temp.add(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                if (!temp.contains(array[j])) {
                    temp.add(array[j]);
                } else {
                    break;
                }
            }
            max = Math.max(max, temp.size());
        }
        return max;
    }
}
