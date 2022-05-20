package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution1656 {
    private final String[] values;
    int current = 0;

    public Solution1656(int n) {
        values = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        values[idKey - 1] = value;
        List<String> result = new LinkedList<>();
        if (idKey - 1 == current) {
            while (current < values.length && values[current] != null) {
                result.add(values[current]);
                current++;
            }
        }
        return result;
    }
}
