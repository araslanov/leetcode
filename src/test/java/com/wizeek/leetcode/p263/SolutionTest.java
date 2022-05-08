package com.wizeek.leetcode.p263;

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
        assertEquals(true, solution.isUgly(6));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.isUgly(1));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isUgly(7));
    }

    @Test
    public void test4() {
        assertEquals(true, solution.isUgly(4));
    }

    @Test
    public void test5() {
        assertEquals(false, solution.isUgly(13));
    }
}
