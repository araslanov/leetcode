package com.wizeek.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> firstRow = new ArrayList<>(1);
        firstRow.add(1);
        result.add(firstRow);
        List<Integer> previousRow = firstRow;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            row.add(1);
            for (int j = 1; j < i - 1; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            row.add(1);
            result.add(row);
            previousRow = row;
        }
        return result;
    }
}
