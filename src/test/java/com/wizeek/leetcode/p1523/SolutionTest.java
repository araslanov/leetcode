package com.wizeek.leetcode.p1523;

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
        assertEquals(3, solution.countOdds(3, 7));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.countOdds(8, 10));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.countOdds(1, 1));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.countOdds(2, 2));
    }
}
