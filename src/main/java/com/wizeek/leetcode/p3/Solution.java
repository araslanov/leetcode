package com.wizeek.leetcode.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        Map<Character, List<Integer>> charIndexMap = new HashMap<>(array.length);
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            List<Integer> indexes = charIndexMap.get(c);
            if (indexes == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(array.length);
                charIndexMap.put(c, list);
            } else {
                indexes.add(indexes.size() - 1, i);
            }
        }
        int max = 0;
        for (List<Integer> indexes : charIndexMap.values()) {
            for (int i = 0; i < indexes.size() - 1; i++) {
                int start = indexes.get(i);
                int end = indexes.get(i + 1);
                int j = start + 1;
                while (j < end) {
                    char c = array[j];
                    List<Integer> charIndexes = charIndexMap.get(c);
                    int cEnd = charIndexes.get(charIndexes.indexOf(j) + 1);
                    end = Math.min(end, cEnd);
                    j++;
                }
                max = Math.max(max, end - start);
            }
        }
        return max;
    }
}
