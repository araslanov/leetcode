package com.wizeek.leetcode.p169;

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
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
