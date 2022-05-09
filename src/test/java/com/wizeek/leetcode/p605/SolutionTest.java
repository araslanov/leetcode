package com.wizeek.leetcode.p605;

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
        assertEquals(true, solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 1));
    }

    @Test
    public void test4() {
        assertEquals(false, solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }
}
