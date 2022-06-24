package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1614Test {

    private Solution1614 solution;

    @Before
    public void setUp() {
        solution = new Solution1614();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.maxDepth("(1)+((2))+(((3)))"));
    }
}
