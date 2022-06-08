package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution921Test {

    private Solution921 solution;

    @Before
    public void setUp() {
        solution = new Solution921();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.minAddToMakeValid("((("));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.minAddToMakeValid("(()("));
    }
}
