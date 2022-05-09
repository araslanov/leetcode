package com.wizeek.leetcode.p1304;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{-1, 1, -2, 2, 0}, solution.sumZero(5));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{-1, 1, 0}, solution.sumZero(3));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0}, solution.sumZero(1));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{-1, 1}, solution.sumZero(2));
    }
}
