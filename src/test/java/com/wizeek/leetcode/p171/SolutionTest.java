package com.wizeek.leetcode.p171;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.titleToNumber("A"));
    }

    @Test
    public void test2() {
        assertEquals(28, solution.titleToNumber("AB"));
    }

    @Test
    public void test3() {
        assertEquals(701, solution.titleToNumber("ZY"));
    }
}
