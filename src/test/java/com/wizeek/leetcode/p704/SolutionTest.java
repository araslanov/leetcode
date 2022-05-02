package com.wizeek.leetcode.p704;

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
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.search(new int[]{1}, 1));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution.search(new int[]{1}, 2));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.search(new int[]{1, 2}, 2));
    }
}
