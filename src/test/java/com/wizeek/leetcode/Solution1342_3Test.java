package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1342_3Test {

    private Solution1342_3 solution;

    @Before
    public void setUp() {
        solution = new Solution1342_3();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    public void test3() {
        assertEquals(12, solution.numberOfSteps(123));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.numberOfSteps(0));
    }
}
