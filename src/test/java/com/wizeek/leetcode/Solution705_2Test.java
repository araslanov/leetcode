package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution705_2Test {

    private Solution705_2 solution;

    @Before
    public void setUp() {
        solution = new Solution705_2();
    }

    @Test
    public void test1() {
        solution.add(1);
        solution.add(2);
        assertEquals(true, solution.contains(1));
        assertEquals(false, solution.contains(3));
        solution.add(2);
        assertEquals(true, solution.contains(2));
        solution.remove(2);
        assertEquals(false, solution.contains(2));
    }
}
