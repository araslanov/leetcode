package com.wizeek.leetcode.p3;

import java.util.*;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        char[] array = s.toCharArray();
        if (array.length == 1) {
            return 1;
        }
        // build map <character -> indexes where it occurs in the source array>
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
        // build descending ordered list of potential max lengths and corresponding char info in Tryam class
        List<Tryam> sortedList = new ArrayList<>();
        charIndexMap.forEach((character, indexes) -> {
            for (int i = 0; i < indexes.size() - 1; i++) {
                sortedList.add(new Tryam(character, indexes.get(i), indexes.get(i + 1)));
            }
        });
        sortedList.sort((Tryam t1, Tryam t2) -> t2.getLength() - t1.getLength());
        // find the maximum length
        int max = 0;
        int i = 0;
        while (sortedList.get(i).getLength() > max) {
            int start = sortedList.get(i).start;
            int end = sortedList.get(i).end;
            int j = start + 1;
            while (j < end) {
                char c = array[j];
                List<Integer> charIndexes = charIndexMap.get(c);
                int cEnd = charIndexes.get(charIndexes.indexOf(j) + 1);
                end = Math.min(end, cEnd);
                j++;
            }
            max = Math.max(max, end - start);
            i++;
        }
        return max;
    }

    static class Tryam {
        char c;
        int start;
        int end;

        Tryam(char c, int start, int end) {
            this.c = c;
            this.start = start;
            this.end = end;
        }

        int getLength() {
            return end - start;
        }
    }
}
