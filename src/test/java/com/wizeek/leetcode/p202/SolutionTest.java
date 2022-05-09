package com.wizeek.leetcode.p202;

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
        assertEquals(true, solution.isHappy(19));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isHappy(2));
    }
}
