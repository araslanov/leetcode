package com.wizeek.leetcode.p6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (s.equals("")) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        List<LinkedList<Character>> rows = new ArrayList<>(numRows);
        for (int i = 0; i < s.length(); i++) {
            int newBase = (2 * numRows - 2);
            int subIndex = i % newBase;
            int rowsIndex;
            if (subIndex < numRows) {
                rowsIndex = subIndex;
            } else {
                rowsIndex = newBase - subIndex;
            }
            if (rows.size() < numRows) {
                rows.add(new LinkedList<>());
            }
            rows.get(rowsIndex).add(s.charAt(i));
        }
        char[] result = new char[s.length()];
        int j = 0;
        for (LinkedList<Character> row : rows) {
            while (row.size() > 0) {
                result[j++] = row.removeFirst();
            }
        }
        return new String(result);
    }
}
