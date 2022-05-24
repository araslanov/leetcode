package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution706Test {

    private Solution706 solution;

    @Before
    public void setUp() {
        solution = new Solution706();
    }

    @Test
    public void test1() {
        solution.put(1, 1);
        solution.put(2, 2);
        assertEquals(1, solution.get(1));
        assertEquals(-1, solution.get(3));
        solution.put(2, 1);
        assertEquals(1, solution.get(2));
        solution.remove(2);
        assertEquals(-1, solution.get(2));
    }
}
