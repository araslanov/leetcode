package com.wizeek.leetcode.p217;

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
        assertEquals(true, solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
