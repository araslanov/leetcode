package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution146Test {

    private Solution146 solution;

    @Test
    public void test1() {
        solution = new Solution146(2);
        solution.put(1, 1);
        solution.put(2, 2);
        assertEquals(1, solution.get(1));
        solution.put(3, 3);
        assertEquals(-1, solution.get(2));
        solution.put(4, 4);
        assertEquals(-1, solution.get(1));
        assertEquals(3, solution.get(3));
        assertEquals(4, solution.get(4));
    }
}
